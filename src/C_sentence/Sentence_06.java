package C_sentence;

import java.util.Scanner;

public class Sentence_06 {
	public static void main(String[] args) {
		
		/*
		1. do-while
			- while문의 변형으로 기본구조는 while 비슷하다.
			- 최소 1회는 블럭{}을 수행한다.
			- 구조
				do {
					수행될 문장;
				} while(조건식);
		*/
		
//		int i = 0;
//		int sum = 0;
//		
//		do{
//			i++;
//			sum += i;
//		}while(sum < 100);
//		System.out.println(sum);
		
		//1. 문자를 입력받는다.
		//2. 문자를 출력한다.
		//3. 문자에 x를 입력하면 종료한다.
//		Scanner sc = new Scanner(System.in);
//		String str = "";
//		do{
//			System.out.println("문자를 입력해주세요");
//			str = sc.next();
//			System.out.println(str);
//		}while(!str.equals("x"));
		
		/*
		2. continue
			- 반복문 내에서만 사용 가능하다.
			- 반복문의 끝으로 이동하여 다음 반복문으로 넘어간다.
		*/
		for (int i=1; i<11; i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		
		for (int i=1; i<11; i++) {
			if(i%2==0) {
				continue; //반복문의 끝으로 이동하여 다음 반복문으로 넘어간다.
			}
			System.out.println(i);
		}
		
		
		
	
		//3. 1~? 더했을때 합계가 100이상이 되는가?
//		int aa = 0;
//		int sum1 = 0;
//		while (sum1 < 100) { //sum>=100 반대이므로 미만일때
//			aa++;
//			sum1 += aa;			
//			System.out.println("더하는값: " + aa + " 합계 :" +sum1);
//		}
//		System.out.println("1부터" + aa + "까지 더해야 " + "합계가 " + sum1 + "값이 나오고 100이상 됩니다");
		
		int aa = 1;
		int sum = 0;
		while(true) { //무제한으로 돌아라
			sum += aa;
			if(sum>=100) {
				break; //반복문이 더이상 필요하지 않을때
			}
			aa++;
		}
		
		
	}
}
