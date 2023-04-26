package com.lsh.exam.demo.controller;

import org.springframework.stereotype.Controller;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsrHomeController {
	@RequestMapping("/usr/home/main")
=======
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsrHomeController {
	
	
	
	@GetMapping("/usr/home/main")
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
	public String showMain() {
		return "usr/home/main";
	}
	
<<<<<<< HEAD
	@RequestMapping("/")
	public String showRoot() {
		return "redirect:/usr/home/main";
	}
=======
	
	@GetMapping("/")
	public String showRoot() {
		return "redirect:/usr/home/main";
	}
	
	
	  
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
}
