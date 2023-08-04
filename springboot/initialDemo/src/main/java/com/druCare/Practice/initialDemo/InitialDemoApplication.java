package com.druCare.Practice.initialDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class InitialDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(InitialDemoApplication.class, args);
		Home h = context.getBean(Home.class);
		h.connect();
		Home h2 = context.getBean(Home.class);
		h2.connect();
	}
//singleton project
}
