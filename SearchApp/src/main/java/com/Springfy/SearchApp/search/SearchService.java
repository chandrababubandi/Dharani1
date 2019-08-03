package com.Springfy.SearchApp.search;
//import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Springfy.SearchApp.sort.BubbleSort;
import com.Springfy.SearchApp.sort.QuickSort;
import com.Springfy.SearchApp.sort.iSort;

@Service
public class SearchService {

	@Autowired
	BinarySearchImpl bubbleSortSearchImpl = null;
	
	@Autowired
	BinarySearchImpl quickSortSearchImpl = null;
	//iSort bubbleSort = new BubbleSort();
	//iSort quickSort = new QuickSort();
	
	/*public SearchService() {
		bubbleSortSearchImpl = new BinarySearchImpl();
		bubbleSortSearchImpl.setSortAlgoritm(new BubbleSort());
		
		quickSortSearchImpl = new BinarySearchImpl();
		quickSortSearchImpl.setSortAlgoritm(new QuickSort());
	}
	*/
/*	public static void main(String args[]) {
		SearchService bn = new SearchService();
		bn.search();

	}*/
	
	public void search() {
		int intArr[] = {10,20,30};
		System.out.println("Enter no");
		int a = 10;
		performBinarySearch(intArr, a);
		performQuickSearch(intArr, a);
		
	}

	public void performBinarySearch(int intArr1[],int b) {
		

		System.out.println("Doing bubblse search");
		int res = bubbleSortSearchImpl.searchInt(intArr1,b);
		System.out.println("found the value att===bubble : "+res);
	}
	
	public void performQuickSearch(int intArr1[],int b) {

		System.out.println("Doing bubblse search");
		int res = quickSortSearchImpl.searchInt(intArr1,b);
		System.out.println("found the value att===bubble : "+res);
	}

/*	public BinarySearchImpl getBubbleSortSearchImpl() {
		return bubbleSortSearchImpl;
	}

	public void setBubbleSortSearchImpl(BinarySearchImpl bubbleSortSearchImpl) {
		this.bubbleSortSearchImpl = bubbleSortSearchImpl;
	}

	public BinarySearchImpl getQuickSortSearchImpl() {
		return quickSortSearchImpl;
	}

	public void setQuickSortSearchImpl(BinarySearchImpl quickSortSearchImpl) {
		this.quickSortSearchImpl = quickSortSearchImpl;
	}
*/
	
	
}

