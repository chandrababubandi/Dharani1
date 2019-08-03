package com.SpringRest.SearchAppJPA.search;

import org.springframework.stereotype.Component;

import com.SpringRest.SearchAppJPA.sort.iSort;

@Component
public class BinarySearchImpl{

	
	iSort sortAlgoritm =null;

	public BinarySearchImpl(iSort sortAlgoritm) {
		super();
		this.sortAlgoritm = sortAlgoritm;
		// TODO Auto-generated constructor stub
	}


	public int searchInt(int intArr[],int input) {
		System.out.println("inside Find number method");
		System.out.println("Searching for inputted number "+input);

		int res = sortAlgoritm.sort(intArr, input);
		return res;
	}

}
