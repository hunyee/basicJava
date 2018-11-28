package D_array;

import java.util.Scanner;

public class Array_01 {
	public static void main(String[] args) {
		/*
		1. 배열(array)이란?
			- 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것.
			ex) 5명의 점수
				int score1 = 100;
				int score2 = 50;
				int score3 = 30;
				int score4 = 70;
				int score5 = 63;
		
		2. 배열의 선언
			- 원하는 타입의 변수를 선언하고 변수 또는 타입에 배열임을 의미하는 []를 붙여준다.
			int[] a1; //인트형 배열
			int a2[]; //형이 어떤거지 바로 알기 힘듬, 사용자제 
		*/
		
		/*
		3. 배열의 생성  //기본형은 초기화, 배열은 참조형이기때문에 생성
			- 배열을 선언한 다음에는 배열을 생성해야 한다.
			- 배열생성을 위해서는 'new'와 함께 배열의 타입과 크기를 지정해 주면 된다.
			- 자바는 index개념, 그래서 방의 시작은 0
			int[] a = new int[5];
		*/
		
		
		/*
		//초기화 방법 3가지
		int[] a = new int[3];
//		int[] a2 = new int[]{3,4,5}; //new로 인해 분할가능
		int[] a2;
		a2 = new int[]{3,4,5};
		
		int[] a3 = {3,4,5}; //new부재로 인해 분할이 안됨
		
		int[] score = new int[4];
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		
//		for(int i=0; i<4; i++) {
//			System.out.println(" "+ score[i]);
//		}
		
//		//1. score의 0번째 방에 10을 저장해주세요.
//		score[0] = 10;
//		//1. score의 1번째 방에 20을 저장해주세요.
//		score[1] = 20;
//		//1. score의 2번째 방에 30을 저장해주세요.
//		score[2] = 30;
//		//1. score의 3번째 방에 40을 저장해주세요.
//		score[3] = 40;
		for (int i = 0; i < score.length; i++) {
			score[i] = (i+1)*10;
			System.out.println(score[i]);
		}
		*/
		
		
		//1. 207호의 자바초급 점수를 저장할 수 있는 변수를 선언 및 생성해주세요.
		int[] a207 = new int[17];
		//2. 각사람의 점수를 0~100점사이의 랜덤한 정수값으로 저장해주세요.
//		a207[0] = (int)(Math.random()*101+0);
//		a207[1] = (int)(Math.random()*101+0);
//		a207[2] = (int)(Math.random()*101+0);
//		a207[3] = (int)(Math.random()*101+0);
//		a207[4] = (int)(Math.random()*101+0);
//		a207[5] = (int)(Math.random()*101+0);
//		a207[6] = (int)(Math.random()*101+0);
//		a207[7] = (int)(Math.random()*101+0);
//		a207[8] = (int)(Math.random()*101+0);
//		a207[9] = (int)(Math.random()*101+0);
//		a207[10] = (int)(Math.random()*101+0);
//		a207[11] = (int)(Math.random()*101+0);
//		a207[12] = (int)(Math.random()*101+0);
//		a207[13] = (int)(Math.random()*101+0);
//		a207[14] = (int)(Math.random()*101+0);
//		a207[15] = (int)(Math.random()*101+0);
//		a207[16] = (int)(Math.random()*101+0);
		//2.5 각사람의 점수를 출력해주세요.
//		for (int i = 0; i < a207.length; i++) {
//			System.out.println(a207[i]);
//		}
		int sum = 0;
		//3. 모든사람의 합계를 구해주세요. 0번방에서 꺼내오고 1번방에서 꺼내오고
		for (int i = 0; i < a207.length; i++) { 
			a207[i] = (int)(Math.random()*101+0);
			System.out.println(a207[i]+"점");
			sum += a207[i];
		}
		System.out.println("모든사람의 합계는 " + sum + " 입니다");
		
		
		//1. 7개의 숫자를 입력받아서 저장할 수 있는 변수 input을 선언 및 생성해주세요.
		int[] input = new int[7];
		//2. input변수의 각각의 방을 사용자로부터 입력받아 저장해주세요
		Scanner sc = new Scanner(System.in);
//		System.out.println("첫번째 숫자를 입력해주세요");
//		input[0] = sc.nextInt();
//		System.out.println("두번째 숫자를 입력해주세요");
//		input[1] = sc.nextInt();
//		System.out.println("세번째 숫자를 입력해주세요");
//		input[2] = sc.nextInt();
//		System.out.println("네번째 숫자를 입력해주세요");
//		input[3] = sc.nextInt();
//		System.out.println("다섯번째 숫자를 입력해주세요");
//		input[4] = sc.nextInt();
//		System.out.println("여섯번째 숫자를 입력해주세요");
//		input[5] = sc.nextInt();
//		System.out.println("일곱번째 숫자를 입력해주세요");
//		input[6] = sc.nextInt();
		for (int i = 0; i < input.length; i++) {
			System.out.println((i+1)+"번째 숫자를 입력해주세요");
			input[i] = sc.nextInt();
		}
		//3. input변수에 있는 값을 출력 
		
		for (int i = 0; i < input.length; i++) {
			System.out.println((i+1)+ "번째 숫자를 입력해주세요" + input[i]);
		}
//		
		//4. input변수의 합계
		int sum2= 0;
		for (int i = 0; i < input.length; i++) {
			sum2 += input[i];
		} System.out.println("합계는 " + sum2 + " 입니다");
		
		//5. 평균구하기
		float avr = (int)((float)sum2/input.length * 100 + 0.5)/100f;
		System.out.println("평균은 " + avr + " 입니다");
		
		//6. 최댓값출력
		int high = input[0];
		for (int i = 0; i < input.length; i++) {
			if(high < input[i]) {
				high = input[i];
			}
		}
		System.out.println("최댓값은 " + high + " 입니다");
		
		//7. 최솟값출력
		int low = input[0];
		for (int i = 0; i < input.length; i++) {
			if(low > input[i]) {
				low = input[i];
			}
		}
		System.out.println("최솟값은 " + low +" 입니다");
	}
}

