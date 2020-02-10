package com.cts.training.spring.web;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.training.spring.web.model.Student;
@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/dashboard")
	public String home() {
		return "student-home";
	}
	
	@RequestMapping("/profile")
	public String profile(Model model) {
		
		Student student = new Student();
		student.setUname("Dummy");
		
		model.addAttribute("student", student);
		return "student-profile";
	}
	
	@RequestMapping("/save")
	public String save(@ModelAttribute Student student) {
		
		System.out.println("NAME : " + student.getUname());
		System.out.println("EMAIL : " + student.getEmail());
		
		
		return "student-confirm";
	}
	

}
