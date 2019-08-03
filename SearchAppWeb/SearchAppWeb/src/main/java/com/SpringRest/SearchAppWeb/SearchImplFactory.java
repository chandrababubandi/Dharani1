package com.SpringRest.SearchAppWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.SpringRest.SearchAppWeb.search.BinarySearchImpl;
import com.SpringRest.SearchAppWeb.sort.BubbleSort;
import com.SpringRest.SearchAppWeb.sort.QuickSort;

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
