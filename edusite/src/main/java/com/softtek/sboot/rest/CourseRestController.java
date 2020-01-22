package com.softtek.sboot.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.sboot.entity.Course;
import com.softtek.sboot.service.CourseService;

@RestController
public class CourseRestController {

	@Autowired
	CourseService courseService;
	
	@GetMapping("/allCourses")
	public List<Course> getAllUsers(){
		return courseService.getAllCourses();
	}
}
