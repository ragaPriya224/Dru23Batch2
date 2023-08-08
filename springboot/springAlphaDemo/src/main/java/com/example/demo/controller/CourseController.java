package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Course;
import com.example.demo.entity.Topic;
import com.example.demo.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	CourseService courseService;//object dependency

	/**
	 * get all the courses
	 */
	@GetMapping("/topic/{id}/courses")
	public List<Course> getAllCourses(@PathVariable String id){
		return  courseService.getAllCourses(id);
	}
	@DeleteMapping("/topic/{topicId}/courses/{id}")
	public void deleteCourse(@PathVariable String id) {
		courseService.deleteCourse(id);
	}
	@GetMapping("/topic/{topicId}/courses/{id}")
	public Course getParticularCourse(@PathVariable String id) {
		return courseService.getParticularCourse(id);
	}
	@PostMapping("/topic/{id}/course")
	public void addCourse(@RequestBody Course course,@PathVariable String id) {
		course.setTopic(new Topic(id,"",0));
		courseService.addCourse(course);
	}
	@PutMapping("/topic/{id}/course/{courseId}")
	public void updateCourse(@RequestBody Course course,@PathVariable String id) {
		course.setTopic(new Topic(id,"",0));
		courseService.updateCourse(course);
	}

}
