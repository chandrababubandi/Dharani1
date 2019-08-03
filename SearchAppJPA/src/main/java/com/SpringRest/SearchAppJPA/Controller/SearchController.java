package com.SpringRest.SearchAppJPA.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringRest.SearchAppJPA.entity.SearchSet;
import com.SpringRest.SearchAppJPA.search.SearchService;

@RestController
public class SearchController {

	@Autowired
	SearchService searchService;
	
	@GetMapping("/search/{numberToBeSearched}")
	public int search(@PathVariable int numberToBeSearched) {
		return searchService.search(numberToBeSearched);
	}

@PostMapping("/search")
public String addSearchSet(@RequestBody SearchSet newSearchSet) {
	String responseText = "Successfully Added";
	System.out.println(newSearchSet);
	SearchSet createSearchset=  searchService.saveSearchSet(newSearchSet);
	System.out.println("Data Got Persisted");
	return  responseText;
}

}