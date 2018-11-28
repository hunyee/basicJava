package E_OOP;

public class RecursiveCall {
	public static void main(String[] args) {
		int fac = 1;
		for (int i = 4; i > 1; i--) {
			fac *= i;
		}
		System.out.println(fac);
//		long a = factorial(4);
//		System.out.println(a);
	}
	
	static long factorial(int num) {
		long result = 0L;
		if(num==1) {
			result = 1;
		} else {
			result = num * factorial(num-1);
		}
		return result;
	}
}
