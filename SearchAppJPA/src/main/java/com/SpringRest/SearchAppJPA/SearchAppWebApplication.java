 package com.SpringRest.SearchAppJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.SpringRest.SearchAppJPA.search.SearchService;

@SpringBootApplication
@EnableJpaRepositories("com.SpringRest.SearchAppJPA")
@EntityScan("com.SpringRest.SearchAppJPA.entity")
public class SearchAppWebApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SearchAppWebApplication.class, args);
		
		ApplicationContext applicationContext = SpringApplication.run(SearchAppWebApplication.class, args);
		//SearchService searchService = applicationContext.getBean(SearchService.class);
		//searchService.search(a);
		
	}

}
