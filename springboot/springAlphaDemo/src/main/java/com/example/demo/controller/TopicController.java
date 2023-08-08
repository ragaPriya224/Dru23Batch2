package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Topic;
import com.example.demo.service.TopicService;

@RestController
public class TopicController {

	@Autowired
	TopicService topicService;
	
	@GetMapping("/topic/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	@GetMapping("/topics")
	public List<Topic> getAllTopic() {
		return topicService.getAllTopic();
	}
	
	@DeleteMapping("/topic/{id}")
	public void deleteTopic(@PathVariable String id) {
		 topicService.deleteTopic(id);
	}
	@PostMapping("/topic")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	@PutMapping("/topic/{topicID}")
	public void updateTopic(@RequestBody Topic topic,
			@PathVariable String topicId) {
		topicService.updateTopic(topic,topicId);
	}
	//localhost:8080/topic/page?pageNo=0&sort=subTopic
	@GetMapping("/topic/page")
	public Page<Topic> getTopicsByPage(@RequestParam("pageNo") Optional<Integer> pageParam,
			@RequestParam("sort") Optional<String> sortBy){
		return topicService.getTopicByPage(pageParam,sortBy);
	}
	
	@GetMapping("/topic/search")
	public  List<Topic>   searchTopic(@RequestParam("query") String query) {
		return topicService.searchTopic(query);
	}

	
	
}
