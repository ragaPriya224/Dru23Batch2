package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	List<Topic> topicList  = Arrays.asList(
			new Topic("11","basic english",4),
			new Topic("14","basic japanese",5),
			new Topic("100","basic telugu",1)
			);
	
	public Topic getTopic(String topicId) {
		return topicList.stream().filter(t -> t.getId().equals(topicId))
		.findFirst().get();
	}
	
	public List<Topic> getAllTopic() {
		return topicList;
	}

	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		topicList.removeIf(t -> t.getId().equals(id));
	}


}
