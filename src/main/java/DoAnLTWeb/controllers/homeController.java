package DoAnLTWeb.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import DoAnLTWeb.entities.Menu;
import DoAnLTWeb.services.menuServices;
import DoAnLTWeb.services.userServices;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/restaurant")
public class homeController {
    private final menuServices menuService;
    
    @GetMapping("/menu")
    public String login(Model model) {
        {
            List<Menu> menuList = menuService.findAll();
            model.addAttribute("menuList", menuList);
            return "user/menu-list";
        }
    }

}
