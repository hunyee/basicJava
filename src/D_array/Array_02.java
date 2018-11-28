package D_array;

import java.util.Arrays;

public class Array_02 {
	public static void main(String[] args) {
		/*
		1. 정렬
			- 어떤 데이터를 빠르고 쉽게 찾기 위해 순서대로 데이터들을 가지런히 나열하는 작업
			- 버블정렬, 삽입정렬, 선택정렬
			
		2. 버블정렬(bubble sort)
			- 인접한 데이터 간에 교환이 계속적으로 일어나면서 정렬이 이루어진다.
			- 회전이 진행됨에 따라 가장 큰값이 뒤로 보내진다.
		3. 선택정렬(Select sort)
			- 정렬의 대상에서 최소값을 찾아서 맨앞의 내용과 교체하는 방식이다.
			- 회전이 진행됨에 따라 가장 작은값이 앞에 확정된다.
		*/
		
		//1. 다섯개 숫자를 배열에 넣는다 (5,2,3,1,4)
		int[] bubble = {5,2,3,1,4};
		for (int i = 0; i < bubble.length; i++) {
			System.out.print(bubble[i]);
		}
		System.out.println();
		//2. 1회전 진행한다
	
//		for (int i = 0; i < bubble.length; i++) {
////				if(i<4) {
////					System.out.printf("%d회전 ", i+1);
////				}
//			for (int j = 0; j < bubble.length-1; j++) {
//				
//				if(bubble[j] > bubble[j+1]) {
//					int temp = 0;
//					temp = bubble[j];
//					bubble[j] = bubble[j+1];
//					bubble[j+1] = temp;
//					for (int t = 0; t < bubble.length; t++) {
//						System.out.print(bubble[t] + " ");
////							System.out.print(" ");
//					}
////					System.out.print(" ");
//				} else {
//					for (int t = 0; t < bubble.length; t++) {
//						System.out.print(bubble[t] + " ");
////							System.out.print(" ");
//					}
////					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
//		//버블정렬
//		for (int i = 0; i < bubble.length-1; i++) { //회전
//			System.out.println(i+1+"회전");
//			for (int j = 0; j < bubble.length-1-i; j++) { //변경횟수
//				if(bubble[j] > bubble[j+1]) {
//					int temp = bubble[j];
//					bubble[j] = bubble[j+1];
//					bubble[j+1] = temp;
//				}
//				for (int t = 0; t < bubble.length; t++) {
//					System.out.print(bubble[t] + " ");
//				}
//				System.out.println();
//				
//			}
//		}
		
////		1회전
//		int min = bubble[0];
//		int minBang  = 0;
//		for (int j = 1; j < bubble.length; j++) {
//			if(min > bubble[j]) {
//				min = bubble[j];
//				minBang = j;
//			}
//		}
//		int temp = bubble[0];
//		bubble[0] = bubble[minBang];
//		bubble[minBang] = temp;
//		System.out.println(Arrays.toString(bubble));
//		
////		2회전
//		int min = bubble[1];
//		int minBang  = 1;
//		for (int j = 1; j < bubble.length; j++) {
//			if(min > bubble[j]) {
//				min = bubble[j];
//				minBang = j;
//			}
//		}
//		int temp = bubble[1];
//		bubble[1] = bubble[minBang];
//		bubble[minBang] = temp;
//		System.out.println(Arrays.toString(bubble));
//		
////		3회전
//		int min = bubble[2];
//		int minBang  = 2;
//		for (int j = 1; j < bubble.length; j++) {
//			if(min > bubble[j]) {
//				min = bubble[j];
//				minBang = j;
//			}
//		}
//		int temp = bubble[2];
//		bubble[2] = bubble[minBang];
//		bubble[minBang] = temp;
//		System.out.println(Arrays.toString(bubble));
//		
////		4회전
//		int min = bubble[3];
//		int minBang  = 3;
//		for (int j = 1; j < bubble.length; j++) {
//			if(min > bubble[j]) {
//				min = bubble[j];
//				minBang = j;
//			}
//		}
//		int temp = bubble[3];
//		bubble[3] = bubble[minBang];
//		bubble[minBang] = temp;
//		System.out.println(Arrays.toString(bubble));
		
		for (int i = 0; i < bubble.length-1; i++) {
			int min = bubble[i];
			int minBang  = i;
			for (int j = i+1; j < bubble.length; j++) {
				if(min > bubble[j]) {
					min = bubble[j];
					minBang = j;
				}
			}
			int temp = bubble[i];
			bubble[i] = bubble[minBang];
			bubble[minBang] = temp;
			System.out.println(Arrays.toString(bubble)); //bubble에 있는 배열값을 문자열로 바꿔줌
		}
		
		
		
		
		
		
		
		
	}
}
