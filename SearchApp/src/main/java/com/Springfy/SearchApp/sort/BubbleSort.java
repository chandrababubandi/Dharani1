package com.Springfy.SearchApp.sort;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BubbleSort implements iSort{
	
	@Override
	public int sort(int intArr[], int input) {
		
		System.out.println(" in bubble sort");
		int res = Arrays.binarySearch(intArr, input);
		return res;
	}

}
