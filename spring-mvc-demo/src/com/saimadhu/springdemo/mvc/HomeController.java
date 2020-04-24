package com.saimadhu.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	//Define a Controller method
	//Add Request mapping annotation
	
	
	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}

}
