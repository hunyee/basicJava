package C_sentence;

public class Sentence_03 {
	public static void main(String[] args) {
		
//		System.out.println(2 + "*" + 1 + "=" + 2*1);
//		System.out.println(2 + "*" + 2 + "=" + 2*2);
//		System.out.println(2 + "*" + 3 + "=" + 2*3);
//		System.out.println(2 + "*" + 4 + "=" + 2*4);
//		System.out.println(2 + "*" + 5 + "=" + 2*5);
//		System.out.println(2 + "*" + 6 + "=" + 2*6);
//		System.out.println(2 + "*" + 7 + "=" + 2*7);
//		System.out.println(2 + "*" + 8 + "=" + 2*8);
//		System.out.println(2 + "*" + 9 + "=" + 2*9);
//		
//		for(int i=1; i<10; i++) {
//			System.out.println(2 + "*" + i + "=" + 2*i);
//		}
		
		for(int i=2; i<10; i++) {
			for(int c=1; c<10; c++) {
						System.out.println(i + "*" + c + "=" + i*c);
			}
		} 
		
		//짝수단 구구단
//		for(int i=2; i<10; i++) {
//			if(i%2==0){
//				for(int c=1; c<10; c++) {
//						System.out.println(i + "*" + c + "=" + i*c);
//			}
//		} 
		
		//짝수단 * 홀수곱 구구단
		for(int i=2; i<10; i++) {
			for(int c=1; c<10; c++) {
				if(i%2==0 && c%2==1) {
					System.out.println(i + "*" + c + "=" + i*c);
				} 
			}
		}

		
	}
}
