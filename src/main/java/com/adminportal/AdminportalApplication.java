package com.adminportal;

import com.adminportal.domain.User;
import com.adminportal.domain.security.Role;
import com.adminportal.domain.security.UserRole;
import com.adminportal.service.UserService;
import com.adminportal.utility.SecurityUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class AdminportalApplication implements CommandLineRunner {

    @Autowired
    UserService userService;
    public static void main(String[] args) {
        SpringApplication.run(AdminportalApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
//		User user1 = new User();
//		user1.setFirstName("NhiPhat");
//		user1.setLastName("Nguyen");
//		user1.setUsername("nifa");
//		user1.setPassword(SecurityUtility.passwordEncoder().encode("admin"));
//		user1.setEmail("admin@gmail.com");
//		Set<UserRole> userRoles = new HashSet<>();
//		Role role1= new Role();
//		role1.setRoleId(1);
//		role1.setName("ROLE_ADMIN");
//		userRoles.add(new UserRole(user1, role1));
//        user1 = userService.findByUsername("nifa");
//
//		userService.addRole(user1, "ROLE_USER");
    }
}
