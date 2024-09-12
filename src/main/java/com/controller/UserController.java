package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.UserEntity;


@Controller
public class UserController {

	
	@GetMapping("/newuser")
	public String newUser() {
		return "NewUser";
	}
	
	@PostMapping("/saveuser")
	public String saveUser(UserEntity userEntity) {
		System.out.println(userEntity);
		return "sucess";
	}
}
