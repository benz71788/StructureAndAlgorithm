package ex02_Recursion;

public class FibonacciFunc {
	
	public static void main(String[] args) {
		
		for(int i = 1; i < 15; i++) {
			System.out.printf("%d ", Fibo(i));
		}
	}
	
	static int Fibo(int num) {
		if(num == 1) {
			return 0;
		} else if(num == 2) {
			return 1;
		} else {
			return Fibo(num - 1) + Fibo(num - 2);
		}
	}

}
