package C_sentence;

import java.util.Scanner;

public class Sentence_05 {
	public static void main(String[] args) {
		/*
		1. while문
			- 반복횟수를 모를 때 사용한다.
			- 조건식과 수행해야 될 블럭{}으로 구성되어 있다.
		 	- 구조
		 		while(조건식) {
		 		
		 		}
		 */
//		int i = 0;
//		while(i<11) {
//			System.out.println(i);
//			i++;
//		}
		
		//1. 3~33까지의 합계를 구하세요
		int a = 3;
		int sum = 0;
		while(a<34) {
			if (a%2==0) { 
				sum += a;
			}
			a++;
		}
		System.out.println(sum);
		
//		//2.for문 while문 99단
//		for (int i=2; i<10; i++) {
//			for (int b=1; b<10; b++) {
//				System.out.println(i +"*"+ b + "=" + i*b);
//			}
//		}
		
		//while 99단 간단한게 
//		int x =2;
//		while(x<10) {
//			int y=1;
//			while(y<10) {
//				System.out.println(x +"*"+ y + "=" + x*y);
//				y++;
//			}
//			x++;
//		}
		
		
		//내가한거
		int i = 2;   //선언해서 새로 초기화 해줘야됨 그래서 코드 길어짐
		while(i<10) {
			int j=1;
			if(i%2==0) {
				while(j<10){
					if(j%2==1) {
						System.out.println(i +"*"+ j + "=" + i*j);
						j++;
					}
					j++;
				}
			}
			i++;	
		}
		
		int x = 2;
		while (x<10) {
			int y = 1;
			while(y < 10) {
				if(x%2==0 && y%2==1) {
					System.out.println(x +"*"+ y + "=" + x*y);
				}
				y++;
			}
			x++;
		}
		
		//3. 1~? 더했을때 합계가 100이상이 되는가?
		int aa = 0;
		int sum1 = 0;
		while (sum1 < 100) { //sum>=100 반대이므로 미만일때
			aa++;
			sum1 += aa;			
			System.out.println("더하는값: " + aa + " 합계 :" +sum1);
		}
		System.out.println("1부터" + aa + "까지 더해야 " + "합계가 " + sum1 + "값이 나오고 100이상 됩니다");
		
		
		
		//4. 사용자로부터 시작하는 숫자와 끝나는 숫자를 입력받으세요
		//   시작하는 숫자부터 끝나는 숫자중 5의 배수의 합계를 구하세요. 단 while문
		Scanner sc = new Scanner(System.in);
		System.out.println("시작 숫자를 입력해주세요");
		int num1 = sc.nextInt();
		System.out.println("끝나는 숫자를 입력해주세요");
		int num2 = sc.nextInt();
		int sum10 = 0;
		
		while (num1<num2+1) {
			if(num1%5==0) {
				sum10 += num1;
			}
			num1++;
		}
		System.out.println(sum10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		1 + (-2) + 3 + (-4) ... 일때 몇번째 숫자에서 합이 100이 되는가
//		int sum4 = 0;
//		for (int q=1; sum4<101; q++) {
//			int sw =1;
//			int bbb = q*sw;
//			sum4 = sum4 + bbb;
//			System.out.println(bbb);
//			sw = -sw;
//		}
		
	}
}
