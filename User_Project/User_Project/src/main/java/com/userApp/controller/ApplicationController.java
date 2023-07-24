package com.userApp.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class ApplicationController {
	
	
	

	@GetMapping("/public")
    public String publicEndpoint() {
        return "Public endpoint - accessible by anyone";
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('ROLE_USER')")
    public String userEndpoint() {
        return "User endpoint - accessible only by users with ROLE_USER";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
   
    public String adminEndpoint() {
        return "Admin endpoint - accessible only by users with ROLE_ADMIN";
    }
    
    @GetMapping("/manager")
    @PreAuthorize("hasRole('ROLE_MANAGER')")
    public String managerEndpoint() {
        return "Manager endpoint - accessible only by users with ROLE_MANAGER";
    }
    
    @GetMapping("/employee")
    @PreAuthorize("hasRole('ROLE_EMPLOYEE')")
    public String employeeEndpoint() {
        return "Employee endpoint - accessible only by users with ROLE_EMPLOYEE";
    }
}
