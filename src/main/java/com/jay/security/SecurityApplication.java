package com.jay.security;

import com.jay.security.user.Role;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecurityApplication {

	public static void main(String[] args) {
		Role role = Role.ADMIN;
		System.out.println(role.name());
		SpringApplication.run(SecurityApplication.class, args);
	}

}
