package com.softtek.sboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.softtek.sboot.entity.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {

}
