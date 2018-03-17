package ex01_understandOfAlgoAndStruct;

//이진 탐색 알고리즘
//최악의 경우에 대한 시간 복잡도 함수 	=> T(n) = k + 1
//=> n * (1/2)^k = 1		=> n = 2^k		=>k = log2(n)
//=> T(n) = log2(n) + 1
//그렇지만 1은 생략해준다. 이유는 +1이 있고 없고는 그렇게 큰 차이가 없다.
//혹은 +1 이 아니라 +200인 경우는 빅오를 통해 이해해야 한다.
//결국 
//=>		T(n) = log2(n) 
public class BinarySearch {
	
	public static void main(String[] args) {
		int[] arr = new int[] {1, 3, 5, 7, 9};
		int idx = BSearch(arr, 7);
		
		if(idx == -1) {
			System.out.printf("Search False\n");
		} else {
			System.out.printf("Target Save Index: %d\n", idx);
		}
		
		idx = BSearch(arr, 4);
		if(idx == -1) {
			System.out.printf("Search False\n");
		} else {
			System.out.printf("Target Save Index: %d\n", idx);
		}
	}
	
	static int BSearch(int arr[], int target) {
		int first = 0;
		int last = arr.length - 1;
		int mid;
		
		while(first <= last) {
			mid = (first + last) / 2;
			
			if(target == arr[mid]) {
				return mid;
			} else if(target < arr[mid]) {
				last = mid - 1;
			} else {
				first = mid + 1;
			}
		}
		
		return -1;
	}

}
