package D_array;

import java.util.Arrays;

public class Lotto {
	public static void main(String[] args) {
		//로또 6자리방 생성
		int[] lotto = new int[6];
		//로또값 입력
		int a = 0;
		
		boolean bb = true;
//		System.out.print("로또번호는 : ");
		for (int i = 0; i < lotto.length; i++) {
			a = (int)(Math.random()*45+1);
				int j=0;
				while(j<i) {
					if(a==lotto[j]) { //a의 값이 lotto방에 있으면 이 반복문을 나가라
						bb = false;
						break;
					} else {
						j++;
					}
				}
//			근데 나가면 얘를 찍음 나갔을때 얘를 안찍고 다시 반복을 어떻게?
			if (bb==true) {
				lotto[i] = a;
				System.out.print(" " + lotto[i]);
			} else if (bb==false) {
				bb=true;
				i--;
			}
		}
		
		
		
//		2중 for문
//		for (int i = 0; i < lotto.length; i++) {
//			a = (int)(Math.random()*7+20);
//			
//				for(int j=0; j<i;) {
//					if(a==lotto[j]) { 
//						bb = false;
//						break;
//					} else {
//						j++;
//					}
//				}
//			if(bb==true) {
//				lotto[i] = a;
//				System.out.print(" " + lotto[i]);
//			} else if(bb==false) {
//				bb=true;
//				i--;
//			}
//		}
		System.out.println();
		
		int[][] lotto1 = new int[5][6];
		for (int k = 0; k < lotto1.length; k++) {
			
		
			for (int i = 0; i < lotto1[k].length; i++) {
				int random = (int)(Math.random()*45+1);
				for (int j = 0; j < lotto1.length; j++) {
					if(random == lotto1[k][j]) {
						i--;
						break;
					}
				}
				lotto1[k][i] = random;
				
			}
			for (int i = 0; i < lotto1.length; i++) {
				System.out.println(Arrays.toString(lotto1[i]));
				
			}
		}
	}
}
