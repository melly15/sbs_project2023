package com.lsh.exam.demo.controller;

import org.springframework.stereotype.Controller;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsrHomeController {
<<<<<<< HEAD
	
	@RequestMapping("/usr/home/main")
=======
	@RequestMapping("/usr/home/main")
=======
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsrHomeController {
	
	
	
	@GetMapping("/usr/home/main")
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
	public String showMain() {
		return "usr/home/main";
	}
	
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
	@RequestMapping("/")
	public String showRoot() {
		return "redirect:/usr/home/main";
	}
<<<<<<< HEAD
	
	
	  
=======
=======
	
	@GetMapping("/")
	public String showRoot() {
		return "redirect:/usr/home/main";
	}
	
	
	  
>>>>>>> 211ab5f59412c5ac91da322a910b1597ad81fd20
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
}
