package Y_exam;

public class Exam_06 {
	public static void main(String[] args) {
		/*
		[연습문제 6-1] 다음과 같은 멤버변수를 갖는 클래스를 정의하시오 SutdaCard .
		타 입  	변수명 	설 명
		int 	num 	카드의 숫자 사이의 정수 .(1~10 )
		boolean isKwang 광 이면 true 아니면 false
		*/
//		class SutdaCard {
//			int num = 0;
//			boolean isKwang = false;
//		}
		
		/*
		[연습문제 6-2] 문제 에서 정의한 클래스에 두 개의 생성자와 를 추가해서 실행 6-1 SutdaCard info()
		결과와 같은 결과를 얻도록 하시오.
		[연습문제] /ch6/Exercise6_2.java
		class Exercise6_2 {
		public static void main(String args[]) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());
		System.out.println(card2.info());
		}
		}
		class SutdaCard {
		
		(1) 알맞은 코드를 넣어 완성하시오
		
		}
		[ ] 실행결과
		3
		1K
		*/
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());
		System.out.println(card2.info());
		

//		class SutdaCard {
//			int num=1;
//			boolean isKwang=true;
//			SutdaCard() {
//				
//			}
//			
//			SutdaCard(int a, boolean b) {
//				this.num = a;
//				this.isKwang = b;
//			}
//			
//			String info() {
//				String result;
//				if(isKwang==true) {
//					result = num +"k";
//				}
//				return result;
//			}
//			
//		}
		
		
	}
}
