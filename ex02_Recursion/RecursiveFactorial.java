package ex02_Recursion;

public class RecursiveFactorial {
	
	public static void main(String[] args) {
		System.out.printf("1! = %d \n", Factorial(1));
		System.out.printf("2! = %d \n", Factorial(2));
		System.out.printf("3! = %d \n", Factorial(3));
		System.out.printf("4! = %d \n", Factorial(4));
		System.out.printf("9! = %d \n", Factorial(9));
	}
	
	static int Factorial(int num) {
		if(num == 0) {
			return 1;
		} else {
			return num * Factorial(num - 1);
		}
	}

}
