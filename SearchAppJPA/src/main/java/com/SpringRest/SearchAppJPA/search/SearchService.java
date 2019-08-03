package com.SpringRest.SearchAppJPA.search;
//import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringRest.SearchAppJPA.SearchSetRepository;
import com.SpringRest.SearchAppJPA.entity.SearchSet;

@Service
public class SearchService {

	@Autowired
	SearchSetRepository searchSetRepository;
	@Autowired
	BinarySearchImpl bubbleSortSearchImpl;
	
	@Autowired
	BinarySearchImpl quickSortSearchImpl;
	
	public int search(int a) {
		int intArr[] = {10,20,30};
		System.out.println("Enter no");
		//int a = 10;
		int res = performBinarySearch(intArr, a);
		int res1 = performQuickSearch(intArr, a);
		return res;
		
	}

	public int performBinarySearch(int intArr1[],int b) {
		

		System.out.println("Doing bubblse search");
		int res = bubbleSortSearchImpl.searchInt(intArr1,b);
		System.out.println("found the value att===bubble : "+res);
		return res;
		
	}
	
	public int performQuickSearch(int intArr1[],int b) {

		System.out.println("Doing bubblse search");
		int res = quickSortSearchImpl.searchInt(intArr1,b);
		System.out.println("found the value att===bubble : "+res);
		return res;
	}
public SearchSet saveSearchSet(SearchSet newSearchSet) {
	return searchSetRepository.save(newSearchSet);
}
	
}

