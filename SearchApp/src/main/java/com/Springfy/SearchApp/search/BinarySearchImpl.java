package com.Springfy.SearchApp.search;

import com.Springfy.SearchApp.sort.iSort;

//@Component
public class BinarySearchImpl{

	
	iSort sortAlgoritm =null;

	public BinarySearchImpl(iSort sortAlgoritm) {
		super();
		this.sortAlgoritm = sortAlgoritm;
		// TODO Auto-generated constructor stub
	}

	
	/*	
	public iSort getSortAlgoritm() {
		System.out.println("called getter ================================");
		return sortAlgoritm;
	}

	public void setSortAlgoritm(iSort sortAlgoritm) {
		this.sortAlgoritm = sortAlgoritm;
	}*/

	public int searchInt(int intArr[],int input) {
		System.out.println("inside Find number method");
		System.out.println("Searching for inputted number "+input);

		int res = sortAlgoritm.sort(intArr, input);
		return res;
	}

}
