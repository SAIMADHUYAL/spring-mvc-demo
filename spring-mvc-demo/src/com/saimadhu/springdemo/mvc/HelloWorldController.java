package com.saimadhu.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	
	//need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	
	//Need a controller method to read from data and add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String makeCaps(HttpServletRequest request, Model model) {
		//Read the request parameter from the html - form
		String theName = request.getParameter("studentName");
		String theID = request.getParameter("uid");
		
		//Convert the data to all upper case 
		theName = theName.toUpperCase();
		
		//create the message
		String result = "My Friend from Version Three is:  "+ theName;
	
		//add message to the model
		model.addAttribute("message",result);
		model.addAttribute("uid",theID);
		
		return "helloworld";
	}

	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName,@RequestParam("uid") String Uid ,Model model) {
		
		//Convert the data to all upper case 
		theName = theName.toUpperCase();
		
		//create the message
		String result = "My Friend from Version Three is:  "+ theName;
	
		//add message to the model
		model.addAttribute("message",result);
		model.addAttribute("uid",Uid);
		
		return "helloworld";
	}

}
