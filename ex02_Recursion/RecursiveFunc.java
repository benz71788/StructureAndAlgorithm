package ex02_Recursion;

public class RecursiveFunc {
	
	public static void main(String[] args) {
		
		Recursive(3);

	}
	
	static void Recursive(int num) {
		if(num <= 0) {
			return;
		}
		System.out.printf("Recursive call! %d \n", num);
		Recursive(num - 1);
	}

}
