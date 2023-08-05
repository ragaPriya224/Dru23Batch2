package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	TopicService topicService;
	
	@GetMapping("/topic")
	public Topic getTopic() {
		return topicService.getTopic();
	}
	@GetMapping("/topics")
	public List<Topic> getAllTopic() {
		return topicService.getAllTopic();
	}
}
