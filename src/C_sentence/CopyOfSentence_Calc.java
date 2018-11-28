package C_sentence;

import java.util.Scanner;

public class CopyOfSentence_Calc {
	public static void main(String[] args) {
		//String 문자열 == => .equals() 이용
//		ex)
//		if(abc.equals("*")){
//			
//		}
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int power = 0;
		float result_div ;
		for (;power<1;) {
			//1. 숫자를 입력받는다.
			System.out.println("숫자를 입력해주세요");
			int num1 = sc.nextInt();
			//2. 사칙연산을 입력받는다. (+, -, *, /)
			System.out.println("연산을 입력해주세요");
			String op1 = sc.next();
			//3. 숫자를 입력받는다.
			//4. 1번 2번 3번 = 출력
			//5. 단 2번에서 x를 입력시 종료하세요.
			if(op1.equals("x")||op1.equals("X")) {
				++power;
				System.out.println("종료되었습니다");
				
			} else {
				System.out.println("숫자를 입력해주세요");
				int num2 = sc.nextInt();
				
				switch (op1) {
				case "+":
					result = num1 + num2;
					System.out.println(num1 + op1 + num2 + "=" + result);
					break;
				case "-":
					result = num1 - num2;
					System.out.println(num1 + op1 + num2 + "=" + result);
					break;
				case "*":
					result = num1 * num2;
					System.out.println(num1 + op1 + num2 + "=" + result);
					break;
				case "/":
					result_div = (float)num1 / (float)num2;
					System.out.println(num1 + op1 + num2 + "=" + result_div);
					break;
				}
			}
		}
			
	}
}
