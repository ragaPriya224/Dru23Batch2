package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {


	@GetMapping("/topic")
	public Topic getTopic() {
		Topic t = new Topic("11","basic english",4);
		return t;
	}
	@GetMapping("/topics")
	public List<Topic> getAllTopic() {
		Topic t = new Topic("11","basic english",4);
		Topic t2 = new Topic("14","basic japanese",5);
		List<Topic> topicList  = new ArrayList<>();
		topicList.add(t);
		topicList.add(t2);
		return topicList;
	}
}
