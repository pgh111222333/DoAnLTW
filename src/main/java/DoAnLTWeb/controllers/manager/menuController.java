package DoAnLTWeb.controllers.manager;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import DoAnLTWeb.entities.Menu;
import DoAnLTWeb.entities.TableList;
import DoAnLTWeb.services.menuServices;
import DoAnLTWeb.services.tableListServices;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/manager/restaurant")
public class menuController {
	
	private final menuServices menuService;
	private final tableListServices tableService;

	
    @GetMapping("/menu")
    public String listMenu(Model model)
    {
        List<Menu> menuList = menuService.findAll();
        model.addAttribute("menuList", menuList);
        return "manager/menu-list";
    }
    @GetMapping("/add")
    public String categoryAdd(Model model)
    {
        return "manager/menu-add";
    }
    
    
    @PostMapping("/insert")
    public String insertMenu(@RequestParam(value = "image") String image,
                                 @RequestParam("itemName") String itemName,
                                 @RequestParam("price") int price,
                                 @RequestParam("type") String type,
                                 @RequestParam("description") String description,
                                 @RequestParam("available") int available,
                                 RedirectAttributes redirectAttributes)
    {
        Menu menuModel = Menu.builder()
        		.image(image)
                .itemName(itemName)
                .price(price)
                .type(type)
                .description(description)
                .available(available)
                .build();

        menuService.save(menuModel);
        
        return "redirect:/manager/restaurant/menu";
    }
    
    
    @GetMapping("/edit/{id}")
    public String showEditCategory(@PathVariable("id") int itemId, Model model)
    {
    	Menu menu = menuService.findById(itemId).orElse(null);
        if (menu == null)
        {
            return "error/404";
        }
        model.addAttribute("menu", menu);
        return "manager/menu-edit";
    }
    
    @PostMapping("/save")
    public String saveMenu(@RequestParam(value = "itemId") int itemId,
                           @RequestParam(value = "image") String image,
                           @RequestParam("itemName") String itemName,
                           @RequestParam("price") int price,
                           @RequestParam("type") String type,
                           @RequestParam("description") String description,
                           @RequestParam("available") int available,
                           RedirectAttributes redirectAttributes) {

        Menu menuModel = menuService.findById(itemId).orElse(new Menu());
        
        menuModel.setImage(image);
        menuModel.setItemName(itemName);
        menuModel.setPrice(price);
        menuModel.setType(type);
        menuModel.setDescription(description);
        menuModel.setAvailable(available);

        menuService.save(menuModel);

        return "redirect:/manager/restaurant/menu";
    }

    
    
    @GetMapping("/delete/{id}")
    public ModelAndView delete(ModelMap model, @PathVariable("id") int itemId) {
        menuService.deleteById(itemId);
        model.addAttribute("message", "Category is deleted!!!");
        return new ModelAndView("redirect:/manager/restaurant/menu", model); 
    }
    @GetMapping("/table")
    public String listTable(Model model)
    {
    	List<TableList> tableList = tableService.findAll();
        model.addAttribute("tableList", tableList);
        return "manager/table-list";
    }

}
