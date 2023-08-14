package com.practice.simple.MovieCatalogueService;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieCatalogController {

	@GetMapping("/catalog/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable String userId){
		//1 -> get all rated movie id's
		List<Rating> ratings = Arrays.asList(new Rating("222",4),
				new Rating("41",5));
		RestTemplate rt = new RestTemplate();
		return ratings.stream().map(rating ->{
			Movie movie =rt.getForObject("https://localhost:8082/movie/"+rating.getMoveiId(), Movie.class);
			return new CatalogItem(movie.getName(),"test",rating.getRating());
		}).collect(Collectors.toList());
	}
}

//1 -> get all rated movie id's
//2 -> for each movie id, call movieinfoservice and get details
//3 -> put them all together
