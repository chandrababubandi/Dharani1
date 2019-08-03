package sort;

import java.util.Arrays;

public class QuickSort implements iSort{
	
	public int sort(int intArr[], int input) {
		
		System.out.println(" in quick sort");
		int res = Arrays.binarySearch(intArr, input);
		return res;
	}

}
