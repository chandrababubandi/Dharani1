package com.Springfy.SearchApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Springfy.SearchApp.search.BinarySearchImpl;
import com.Springfy.SearchApp.sort.BubbleSort;
import com.Springfy.SearchApp.sort.QuickSort;

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
