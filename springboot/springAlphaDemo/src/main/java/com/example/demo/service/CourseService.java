package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;

@Service
public class CourseService {


	@Autowired
	CourseRepository courseRepository;
	
	// get all the courses belonging to a particular topic id
	public List<Course> getAllCourses(String id) {
		List<Course>  courseList = new ArrayList<>();
		courseRepository.findByTopicId(id).forEach(courseList::add);
		return courseList;
	}
	
	// delete a particular course
	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
	
	// get a particular course
	public  Course getParticularCourse(String id) {
		return courseRepository.findById(id).get();
	}
	
	// add a new course
	public void addCourse(Course course) {
		courseRepository.save(course);
	}
	
	//update an existing course
	public void updateCourse(Course course) {
		courseRepository.save(course);
	}
}
