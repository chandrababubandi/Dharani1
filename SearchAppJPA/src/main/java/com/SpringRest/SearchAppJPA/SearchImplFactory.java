package com.SpringRest.SearchAppJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.SpringRest.SearchAppJPA.search.BinarySearchImpl;
import com.SpringRest.SearchAppJPA.sort.BubbleSort;
import com.SpringRest.SearchAppJPA.sort.QuickSort;

//@Configuration
public class SearchImplFactory {

	@Autowired
	BubbleSort bubbleSort;
	
	@Autowired
	QuickSort quickSort;
	
	@Bean
	public BinarySearchImpl bubbleSortSearchImpl() {
		return new BinarySearchImpl(bubbleSort);
	}
	
	@Bean
	public BinarySearchImpl quickSortSearchImpl() {
		return new BinarySearchImpl(quickSort);
	}
}
