package com.example.jdbcNamedDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class JdbcNamedDemoApplication {
	@Autowired
	static JdbcNamedDao dao;
	public JdbcNamedDemoApplication(JdbcNamedDao dao){
		this.dao = dao;

	}
	public static void main(String[] args) {
		SpringApplication.run(JdbcNamedDemoApplication.class, args);
		System.out.println(dao.getByTitleTemplate());
		
	}
	
}
