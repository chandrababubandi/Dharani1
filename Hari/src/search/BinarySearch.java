package search;
import java.util.Scanner;

import sort.BubbleSort;
import sort.QuickSort;
import sort.iSort;

public class BinarySearch {

	public static void main(String args[]) {
		int intArr[] = {10,20,30};
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter no");
		int a = ip.nextInt();
		iSort sortingImpl;
		sortingImpl = new BubbleSort();
		FindNum fn = new FindNum();
		System.out.println("Doing bubblse search");
		int res = fn.searchInt(intArr,a,sortingImpl);
		System.out.println("found the value att===bubble : "+res);

		System.out.println("Doing quick search");
		sortingImpl = new QuickSort();
		int res1 = fn.searchInt(intArr,a,sortingImpl);
		System.out.println("found the value att==quick : "+res1);

	}
	

}

