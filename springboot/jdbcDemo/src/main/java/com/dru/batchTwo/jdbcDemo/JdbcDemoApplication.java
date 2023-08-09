package com.dru.batchTwo.jdbcDemo;

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
		System.out.println("-------get particular----------");
		System.out.println(dao.getCourse(4));
		System.out.println("-------insert----------");
		Course c1 = new Course(4551,"japanese","spoken","www.google.com");
		dao.create(c1);
		System.out.println("-------update----------");
		Course c2 = new Course(2,"updgroovy","upd","www.fb.com");
		dao.update(c2, 2);
		System.out.println("-------delete----------");
		dao.delete(5);
		
	}

}
