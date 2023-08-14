package com.practice.simple.MovieCatalogueService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class MovieCatalogueServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogueServiceApplication.class, args);
	}
//	@Bean
//	public RestTemplate getRestTemplate() {
//		return new RestTemplate();
//
//	}
	@Bean
	public WebClient.Builder getWebClientBuilder() {
		return WebClient.builder();
	}
}
