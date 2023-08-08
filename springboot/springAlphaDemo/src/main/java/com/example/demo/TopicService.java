package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	TopicRepository topicRepository;
	//	List<Topic> topicList  = new ArrayList<>(Arrays.asList(
	//			new Topic("11","basic english",4),
	//			new Topic("14","basic japanese",5),
	//			new Topic("100","basic telugu",1)
	//			));

	public Topic getTopic(String topicId) {
		//		return topicList.stream().filter(t -> t.getId().equals(topicId))
		//		.findFirst().get();
		return topicRepository.findById(topicId).get();
	}

	public List<Topic> getAllTopic() {
		List<Topic> topicsList = new ArrayList<>();
		topicRepository.findAll().forEach(topicsList::add);
		return topicsList;
		//		topicRepository.findAll().

		//		return topicList;
	}

	public void deleteTopic(String id) {
		//		topicList.removeIf(t -> t.getId().equals(id));
		topicRepository.deleteById(id);
	}

	public void addTopic(Topic topic) {
		//		topicList.add(topic);
		topicRepository.save(topic);
	}

	public void updateTopic(Topic topic, String topicId) {
		//
		topicRepository.save(topic);
	}

	public Page<Topic> getTopicByPage(Optional<Integer> pageParam, Optional<String> sortBy) {
		// TODO Auto-generated method stub

		return 	topicRepository.findAll(PageRequest.of(
				pageParam.orElse(0),//page number
				3, //number of records per page
				Direction.DESC,//desc
				sortBy.orElse("id")));//based on column 
	}
	
public List<Topic> searchTopic(String query){
	return topicRepository.searchTopic(query);
}

}
