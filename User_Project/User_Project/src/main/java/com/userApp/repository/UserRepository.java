package com.userApp.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.userApp.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	 User findByUsername(String username);
	 User findByEmail(String email);
	 
}
