package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TopicRepository extends JpaRepository<Topic, String>{

	
	@Query(value = "select * from Subject where name like  concat('%',:query,'%')",nativeQuery = true)
	List<Topic> searchTopicByNative(String query);
	
	@Query("select p from Topic p where p.name like  concat('%',:query,'%')")
	List<Topic> searchTopic(String query);
	
	

}
