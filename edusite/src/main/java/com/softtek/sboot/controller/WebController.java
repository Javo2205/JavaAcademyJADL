package com.softtek.sboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.softtek.sboot.entity.Course;
import com.softtek.sboot.service.CourseService;

@Controller
public class WebController {

	@Autowired
	CourseService courseService;

	@GetMapping("/index")
	public String goHome(Model model) {
		List<Course> courseList = courseService.getAllCourses();
		model.addAttribute("courses", courseList);
		return "index";
	}

	@RequestMapping("/index")
	public String home() {
		return "index";
	}

	@RequestMapping("/blog")
	public String blog() {
		return "blog";
	}

	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}
}
