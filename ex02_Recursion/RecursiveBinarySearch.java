package ex02_Recursion;

public class RecursiveBinarySearch {
	
	public static void main(String[] args) {
		int[] arr = new int[] {1, 3, 5, 7, 9};
		int idx;
		
		idx = BSearchRecur(arr, 0, arr.length -1, 7);
		if(idx == -1) {
			System.out.printf("Search False \n");
		} else {
			System.out.printf("Target Save Index: %d \n", idx);
		}
		
		System.out.println();
		
		idx = BSearchRecur(arr, 0, arr.length - 1, 4);
		if(idx == -1) {
			System.out.printf("Search False \n");
		} else {
			System.out.printf("Target Save Index: %d \n", idx);
		}
	}
	
	static int BSearchRecur(int[] arr, int first, int last, int target) {
		int mid;
		if(first > last) {
			return -1;
		}
		
		mid = (first + last) / 2;
		
		if(target == arr[mid]) {
			return mid;
		} else if(target > arr[mid]) {
			return BSearchRecur(arr, mid + 1, last, target);
		} else {
			return BSearchRecur(arr, first, mid - 1, target);
		}
	}

}
