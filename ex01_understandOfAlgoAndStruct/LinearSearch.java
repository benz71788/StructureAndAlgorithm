package ex01_understandOfAlgoAndStruct;

//순차 탐색 알고리즘

public class LinearSearch {
	
	public static void main(String[] args) {
		int[] arr = new int[] {3, 5, 2, 4, 9};
		
		int idx = LSearch(arr, 4);
		if(idx == -1) {
			System.out.printf("Search False \n");
		} else {
			System.out.printf("Target Save Index: %d", idx);
		}
		
		System.out.println();
		
		idx = LSearch(arr, 7);
		if(idx == -1) {
			System.out.printf("Search False \n");
		} else {
			System.out.printf("Target Save Index: %d", idx);
		}
		
	}
	
	static int LSearch(int arr[], int target) {
		int i;
		for(i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		
		return -1;
	}

}
