package com.baizhi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/login")
	public String login(User user){
		User queryById = userService.queryById(user);
		System.out.println(user);
		System.out.println(queryById);
		if(queryById!=null){
			return "redirect:/dept/queryAll";
		}else{
			return "user/login";
		}
	}
	@RequestMapping("/regist")
	public String regist(User user){
		userService.insert(user);
		return "user/login";
	}
}
