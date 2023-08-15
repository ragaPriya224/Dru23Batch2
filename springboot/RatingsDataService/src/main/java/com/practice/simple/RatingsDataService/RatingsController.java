package com.practice.simple.RatingsDataService;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RatingsController {
	@GetMapping("/ratingsdata/{movieId}")
	public Rating getRating(@PathVariable String movieId){
		return new Rating(movieId,3);
		//return? movie details along with ratings
	}
	
	@GetMapping("/users/{usersId}")
	public UserRating getUserRating(@PathVariable("usersId") String id){
		System.out.println("*******************");
		List<Rating> ratingsList = Arrays.asList(new Rating("222",4),
				new Rating("41",5));
		UserRating  ur= new UserRating();
		ur.setUserRating(ratingsList);
		return ur;
	}
}
