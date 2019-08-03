package com.SpringRest.SearchAppJPA.sort;

import java.util.Arrays;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSort implements iSort{
	
	@Override
	public int sort(int intArr[], int input) {
		
		System.out.println(" in bubble sort");
		int res = Arrays.binarySearch(intArr, input);
		return res;
	}

}
