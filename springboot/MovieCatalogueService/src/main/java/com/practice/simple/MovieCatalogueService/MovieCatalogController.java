package com.practice.simple.MovieCatalogueService;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieCatalogController {

	@GetMapping("/catalog/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable String userId){
		return Collections.singletonList(
				new CatalogItem("spiderman","saving galaxt",4));
	}
}

//1 -> get all rated movie id's
//2 -> for each movie id, call movieinfoservice and get details
//3 -> put them all together
