package E_OOP;

import java.util.Scanner;

public class OOPCalc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=========================================================");
		boolean end = false;
		Calc ca = new Calc();
		System.out.print("숫자입력");
		int x = sc.nextInt();
		int result = x;
		while(end==false) {
			System.out.print("연산입력");
			String op = sc.next();
			if(op == "c") { 
				result = 0;
				System.out.println("초기화");
				continue;
			}
			System.out.print("숫자입력");
			int y = sc.nextInt();
			
			switch(op) {
			case "+" :
				result = ca.sum(result,y);
				break;
			case "-" : 
				result = ca.sub(result,y);
				break;
			case "*" :
				result = (int) ca.mul(result,y);
				break;
			case "/" :
				result = (int) ca.div(result,y);
				break;
			case "c" :
				result = 0;
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.print("숫자입력");
				int xClear = sc.nextInt();
				result = xClear;
				break;
			case "x" :
				end = true;
				System.out.println("종료되었습니다");
				break;
			}
		}
	}
	
	
}

class Calc{
	int sum(int a, int b) {
		int result = a+b;
		System.out.println(result);
		return result;
	}
	
	int sub(int a, int b) {
		int result = a-b;
		System.out.println(result);
		return result;
	}
	
	long mul(int a, int b) {
		long result = (long)a*b;
		System.out.println(result);
		return result;
	}
	
	float div(int a, int b) {
		float result = (int)((float)a/b*100+0.5)/100f;
		System.out.println(result);
		return result;
	}
}