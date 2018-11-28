package C_sentence;

import java.util.Scanner;

public class re {
	public static void main(String[] args) {
		int sum = 0;
		int end = 0;
		float sum1 ;
		for(;end<1;){
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자를 넣어주세요");
			int num1 = sc.nextInt();
			System.out.println("수행할 연산을 넣어주세요");
			String op = sc.next();
			if(op.equals("x")||op.equals("X")) {
				System.out.println("종료되었습니다");
				end++;
			} else {
				System.out.println("숫자를 넣어주세요");
				int num2 = sc.nextInt();				
			
				switch (op) {
				case "+" :
					sum = num1 + num2;
					System.out.println(num1 + op + num2 + "=" + sum);
					break;
				case "-" :
					sum = num1 - num2;
					System.out.println(num1 + op + num2 + "=" + sum);
					break;
				case "*" :
					sum = num1 * num2;
					System.out.println(num1 + op + num2 + "=" + sum);
					break;
				case "/" :
					if(num2==0){
						System.out.println("0으로는 나눌수가 없습니다");
					} else {
						sum1 = (float)num1 / (float)num2;
						System.out.println(num1 + op + num2 + "=" + sum1);
						break;
					}
				}
			}
		}
	}
}
