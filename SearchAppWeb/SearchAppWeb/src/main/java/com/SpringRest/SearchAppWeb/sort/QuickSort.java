package com.SpringRest.SearchAppWeb.sort;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class QuickSort implements iSort{
	
	@Override
	
	public int sort(int intArr[], int input) {
		
		System.out.println(" in quick sort");
		int res = Arrays.binarySearch(intArr, input);
		return res;
	}

}
