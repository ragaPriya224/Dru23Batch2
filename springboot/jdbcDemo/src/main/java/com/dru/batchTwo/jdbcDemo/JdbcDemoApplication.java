package com.dru.batchTwo.jdbcDemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcDemoApplication {
	@Autowired
	static JdbcDao dao;
	public JdbcDemoApplication(JdbcDao dao){
		this.dao = dao;

	}
	public static void main(String[] args) {
		SpringApplication.run(JdbcDemoApplication.class, args);
		System.out.println("-----------------");
		System.out.println(dao.getAllCourses());
//		System.out.println("-------get particular----------");
//		System.out.println(dao.getCourse(4));
//		System.out.println("-------insert----------");
////		Course c1 = new Course(9951,"japanese","spoken","www.google.com");
////		dao.create(c1);
//		System.out.println("-------update----------");
//		Course c2 = new Course(2,"updgroovy","upd","www.fb.com");
//		dao.update(c2, 2);
//		System.out.println("-------delete----------");
//		dao.delete(5);
		System.out.println("------------batch-------");
		List<Course> courseList = new ArrayList<>();
//		Course c5 = new Course(666,"german","spoken","www.google.com");
		Course c6 = new Course(2251,"turkish","spoken","www.google.com");
		Course c7 = new Course(3351,"dutch","spoken","www.google.com");
		Course c8 = new Course(4451,"korean","spoken","www.google.com");
		Course c9 = new Course(5551,"kannada","spoken","www.google.com");
		courseList.add(c9);
		courseList.add(c8);
		courseList.add(c7);
		courseList.add(c6);
//		courseList.add(c5);
		System.out.println(dao.batchUpdateUsingJdbcTemplate(courseList));
	}

}
