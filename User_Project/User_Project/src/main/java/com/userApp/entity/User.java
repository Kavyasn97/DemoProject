package com.userApp.entity;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long user_id; 
    
    private String username;  
    private String password;
    private String email;
    private String userType;
    
    
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private Set<Role> roles;

	   @JoinTable(name = "user_roles",
				 joinColumns = @JoinColumn(name = "user_id", referencedColumnName
				= "user_id"),
				 inverseJoinColumns = @JoinColumn(name = "role_id",
				referencedColumnName = "role_id"))

	 
	public Long getUser_id() {
		return user_id;
	}
	
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

    
   
   
}