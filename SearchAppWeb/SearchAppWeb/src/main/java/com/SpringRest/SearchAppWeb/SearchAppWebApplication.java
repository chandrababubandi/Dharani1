 package com.SpringRest.SearchAppWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.SpringRest.SearchAppWeb.search.SearchService;

@SpringBootApplication
public class SearchAppWebApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SearchAppWebApplication.class, args);
		
		ApplicationContext applicationContext = SpringApplication.run(SearchAppWebApplication.class, args);
		//SearchService searchService = applicationContext.getBean(SearchService.class);
		//searchService.search(a);
		
	}

}
