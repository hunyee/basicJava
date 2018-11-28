package D_array;

import java.util.Arrays;

public class Array_03 {
	public static void main(String[] args) {
	/*
	1. 다차원 배열
		- 자바에서는 1차원 배열뿐만 아니라 2차원 이상의 다차원 배열도 허용한다.
		- 2차원 배열의 선언
			선언방법
				변수타입[][] 변수명;
				변수타입[] 변수명[];
				변수타입 변수명[][];
		- 2차원 배열의 생성
			new 변수타입[][];
				
	*/
	int[][] a = new int[3][]; //작은배열에는 값이 안들어가도됨, 값이 없을때는 null로 채워짐
//	{
//		null,
//		null,
//		null
//	}
	a[0] = new int[2];
	a[1] = new int[3];
	a[2] = new int[4];
	
	int[][] b = new int[][] {
			 					{1,2},
			 					{3,4,5},
			 					{6,7,8,9}
							};
//	System.out.println(b[0][0]);
//	System.out.println(b[0][1]);
//	System.out.println(b[1][0]);
//	System.out.println(b[1][1]);
//	System.out.println(b[1][2]);
//	System.out.println(b[2][0]);
//	System.out.println(b[2][1]);
//	System.out.println(b[2][2]);
//	System.out.println(b[2][3]);
	
//	for (int i = 0; i < b.length; i++) {
//		for (int j = 0; j < b[i].length; j++) {
//			System.out.print(b[i][j]);
//		}
//		System.out.println();
//	}
	
	//변수 a의 각방에 10, 20, 30, 40, ...,90까지 입력해주세요
	a[0][0] = 10;
	a[0][1] = 20;
//	int sum = 0;
//	for(int j=0; j<a[0].length; j++) {
//		sum += 10;
//		a[0][j]= sum; 
//	}
	a[1][0] = 30;
	a[1][1] = 40;
	a[1][2] = 50;
//	int sum = 0;
//	for(int j=0; j<a[1].length; j++) {
//		sum += 10;
//		a[0][j]= sum; 
//	}
	a[2][0] = 60;
	a[2][1] = 70;
	a[2][2] = 80;
	a[2][3] = 90;
//	int sum = 0;
//	for(int j=0; j<a[2].length; j++) {
//		sum += 10;
//		a[0][j]= sum; 
//	}
	
	int sum = 0;
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			sum += 10;
			b[i][j] = sum;
		}
	}
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
//	int hap=0;
//	for (int i = 0; i < b.length; i++) {
//		for (int j = 0; j < b[i].length; j++) {
//			hap += b[i][j];
//			System.out.println(hap);
//		}
//	}
//	System.out.println(hap);
	
	}
}
