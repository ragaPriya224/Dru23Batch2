package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
//	@RequestMapping("/hello")
	@GetMapping("/hello")
	public String sayHello() {
		return "hai user";
	}
	@GetMapping("/name")
	public List<String> getNameList() {
		List<String> nameList = Arrays.asList("aa","bb","cc");
		return nameList;
	}
//	@RequestMapping(method = RequestMethod.POST)
}
