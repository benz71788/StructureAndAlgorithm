package ex01_understandOfAlgoAndStruct;

//이진 탐색 알고리즘을 통해 빅-오 판단하
public class BSWorstOpCount {
	
	public static void main(String[] args) {
		int[][] arr = new int[3][];
		arr[0] = new int[500];
		arr[1] = new int[5000];
		arr[2] = new int[50000];
		int idx;
		
		//배열 arr을 대상으로, 저장되지 않은 정수 1을 찾으라고 명령
		for(int i = 0; i < arr.length; i++) {
			idx = BSearch(arr[i], 3);
			if(idx == -1) {
				System.out.println("Search False \n");
			} else {
				System.out.printf("Target Save Index: %d\n", idx);
			}
		}
	}
		
	
	static int BSearch(int[] arr, int target) {
		int first = 0;
		int last = arr.length - 1;
		int mid;
		int opCount = 0;		//비교연산의 횟수를 기록
		
		while(first <= last) {
			mid = (first + last) / 2;
			
			if(target == arr[mid]) {
				return mid;
			} else if(target < arr[mid]) {
				last = mid - 1;
			} else {
				first = mid + 1;
			}
			
			opCount += 1;
		}
		System.out.printf("비교연산횟수: %d \n", opCount);
		return -1;
		
	}

}
