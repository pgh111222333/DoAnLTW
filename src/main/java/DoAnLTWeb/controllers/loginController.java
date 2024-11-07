package DoAnLTWeb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import DoAnLTWeb.entities.User;
import DoAnLTWeb.services.userServices;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/restaurant")
public class loginController {

    private final userServices userService;

    @GetMapping("login")
    public String login() {
        return "loginuser"; 
    }

    @PostMapping("/login") // Xử lý yêu cầu POST đến /loginUser
    public String loginUser(@RequestParam("username") String username, @RequestParam("password") String password) {
    	
        User user = userService.findByusername(username);

        // Kiểm tra xem người dùng có tồn tại không
        if (user != null && user.getPassword().equals(password) ) {
            System.out.print("Đăng nhập thành công");
            return "redirect:/restaurant/trangchu"; // Redirect đến trang thành công
        } else {
            System.out.print("Đăng nhập thất bại");
            return "redirect:/restaurant/login"; // Redirect lại trang đăng nhập nếu thất bại
        }
    }
    
    
    @GetMapping("register")
    public String register() {
        return "registeruser";
    }
    
    @PostMapping("/registerUser") // Xử lý yêu cầu POST đến /loginUser
    public String registerUser(@RequestParam("username") String username,@RequestParam("password") String password, @RequestParam("email") String email, @RequestParam("age") int age, @RequestParam("phone") String phone, @RequestParam("name") String name) {


    	   User user = User.builder() // Sử dụng Builder
    	            .username(username)
    	            .password(password) // Nên mã hóa mật khẩu trước khi lưu
    	            .name(name)
    	            .email(email)
    	            .age(age)
    	            .phone(phone)
    	            .build();

    	    // Lưu đối tượng user vào cơ sở dữ liệu
    	    userService.save(user);
            System.out.print("Đăng kí thành công");
            return "redirect:/restaurant/login";
    }
    @GetMapping("/trangchu")
    public String Home() {
        return "trangchu"; 
    }

}