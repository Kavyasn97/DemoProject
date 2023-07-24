package com.userApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.userApp.entity.Role;
import com.userApp.service.RoleService;


@SpringBootApplication(exclude = { 
	    org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
	})
public class UserProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserProjectApplication.class, args);
	}
	
	
	@Component
	class RoleTest implements CommandLineRunner {

	    private final RoleService roleService;

	    @Autowired
	    public RoleTest(RoleService roleService) {
	        this.roleService = roleService;
	    }

	    @Override
	    public void run(String... args) throws Exception {
	        Role adminRole = new Role();
	        adminRole.setName("ROLE_ADMIN");
	        roleService.saveRole(adminRole);

	        Role userRole = new Role();
	        userRole.setName("ROLE_USER");
	        roleService.saveRole(userRole);
	        
	        Role managerRole = new Role();
	        managerRole.setName("ROLE_MANAGER");
	        roleService.saveRole(managerRole);
	    }

	}
}
