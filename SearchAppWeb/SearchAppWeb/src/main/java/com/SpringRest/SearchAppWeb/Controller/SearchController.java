package com.SpringRest.SearchAppWeb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.SpringRest.SearchAppWeb.search.SearchService;

@RestController
public class SearchController {

	@Autowired
	SearchService searchService;
	
	@GetMapping("/search/{numberToBeSearched}")
	public int search(@PathVariable int numberToBeSearched) {
		return searchService.search(numberToBeSearched);
	}
}
