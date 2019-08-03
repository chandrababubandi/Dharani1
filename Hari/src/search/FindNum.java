package search;

import sort.iSort;

class FindNum{

	
	public int searchInt(int intArr[],int input,iSort sortAlgoritm) {
		System.out.println("inside Find number method");
		System.out.println("Searching for inputted number "+input);
		//iSort iSortSearch;
		/*if(BUBBLE_SORT.equals(sortAlgoritm)) {
			System.out.println("Doing bubble search");
			iSortSearch = new BubbleSort();
			int res = iSortSearch.sort(intArr, input);
			//int res = Arrays.binarySearch(intArr, input);
		}else if(QUICK_SORT.equals(sortAlgoritm)) {
			System.out.println("Doing quick search");
			iSortSearch = new QuickSort();
			int res = iSortSearch.sort(intArr, input);
		}*/
		//Arrays.sort(intArr);
		int res = sortAlgoritm.sort(intArr, input);
		return res;
	}

}
