package com.softtek.sboot.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.sboot.entity.Course;
import com.softtek.sboot.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseRepository courseRepository;

	public static final Logger LOGGER = LoggerFactory.getLogger(CourseService.class);

	@Override
	public List<Course> getAllCourses() {
		List<Course> courseList = (List<Course>) this.courseRepository.findAll();
		LOGGER.info("## Course Obtained: {}", courseList);
		return courseList;
	}

}
