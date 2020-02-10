package com.cts.training.spring.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("/student")
public class StudentController {
	@RequestMapping("/dashboard")
	public String home() {
		return "student-home";
	}
	
	@RequestMapping("/profile")
	public String profile() {
		return "student-profile";
	}
	@RequestMapping("/save") 
	public String saveData( ) {
		System.out.println("\nName : " + student.getUname());
		System.out.println("Email : " + student.getEmail());
		return "student-confirm";
	}
	
	@RequestMapping() 
	public String defaultMethod() {
		return "student-home";
	}
	
	
	@RequestMapping("*")
	public String fallbackMethod() {
		return "student-error";
	}
	
	
}
