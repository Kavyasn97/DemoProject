package com.userApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.userApp.entity.User;
import com.userApp.repository.UserRepository;
import com.userApp.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//https//:localhost:8080/signup
	@GetMapping("/signup")
    public String showSignupForm(Model model) {
        model.addAttribute("user", new User());
        return "signup";
    }
	
    @PostMapping("/signup")
    public String signup(@RequestParam("username") String username,
            @RequestParam("password") String password,
            @RequestParam("email") String email) {
    	User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
      
        userService.signup(user);
        return "redirect:/signin";
    }
    
  //https//:localhost:8080/signin
    @GetMapping("/signin")
    public String showSigninPage() {
        return "signin"; 
    }

    @PostMapping("/signin")
    public String signin(@RequestParam("username") String username,
                         @RequestParam("password") String password,Model model) {
      
    	if (!username.isEmpty() && !password.isEmpty()) {
            return "redirect:/dashboard"; 
        } else {
           
            model.addAttribute("error", "Invalid username or password");
           return "signin";
       
      }
    	
    }
    
    //https//:localhost:8080/dashboard
    @GetMapping("/dashboard")
    public String showDashboard() {
        return "dashboard"; // This will map to dashboard.jsp in the views folder
    }
    
    //https//:localhost:8080/forgotpassword
    @GetMapping("/forgotpassword")
    public String showForgotPasswordPage() {
        return "forgotpassword";
    }

    @PostMapping("/forgotpassword")
    public String forgotPassword(@RequestParam("email") String email,
                                @RequestParam("newPassword") String newPassword,
                                @RequestParam("confirmPassword") String confirmPassword,
                                Model model) {
        // Verify if the newPassword and confirmPassword match
        if (!newPassword.equals(confirmPassword)) {
            model.addAttribute("error", "Passwords do not match");
            return "forgotpassword";
        }
        if (newPassword.equals(confirmPassword)) {
            model.addAttribute("error", "reset password done");
            return "forgotpassword";
        }

        // Call the UserService to handle the password reset functionality
        boolean resetSuccessful = userService.forgotPassword(email, newPassword);

        if (resetSuccessful) {
            model.addAttribute("successMessage", "Your password has been reset successfully!");
            return "signin";
        } else {
            model.addAttribute("error", "Invalid email or password reset failed");
            return "forgotpassword";
        }
    }
    
    
    
}
