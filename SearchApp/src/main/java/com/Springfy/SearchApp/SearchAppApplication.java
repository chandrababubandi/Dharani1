package com.Springfy.SearchApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.Springfy.SearchApp.search.BinarySearchImpl;
import com.Springfy.SearchApp.search.SearchService;
import com.Springfy.SearchApp.sort.iSort;

@SpringBootApplication
public class SearchAppApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SearchAppApplication.class);
	public static void main(String[] args) {
		LOGGER.debug("Before calling run");
		ApplicationContext applicationContext = SpringApplication.run(SearchAppApplication.class, args);
		SearchService searchService = applicationContext.getBean(SearchService.class);
		searchService.search();
		LOGGER.info("After calling run");
	}

	

	@Autowired
	@Qualifier("bubbleSort")
	iSort bubbleSortInt;
	
	
	@Autowired
	iSort quickSort;
	
	@Bean
	public BinarySearchImpl bubbleSortSearchImpl() {
		return new BinarySearchImpl(bubbleSortInt);
	}
	
	@Bean
	public BinarySearchImpl quickSortSearchImpl() {
		return new BinarySearchImpl(quickSort);
	}
}
