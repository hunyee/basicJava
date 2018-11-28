package E_OOP;

public class CardTest {
	public static void main(String[] args) {
		//1. Card클래스의 너비를 출력하세요
		System.out.println(Card.width); //100
		//2. Card클래스의 높이를 출력하세요
		System.out.println(Card.height); //250
		//3. Card클래스의 객체를 만들어주세요 변수명 : cd1
		Card cd1 = new Card();
		//4. cd1의 문양을 SPADE로 변경해주세요
		cd1.kind = "SPADE";
		//5. cd1의 숫자를 7로 변경해주세요
		cd1.number = 7;
		//6. Card클래스의 객체를 만들어주세요 변수명 : cd2
		Card cd2 = new Card();
		//7. cd2의 문양을 HEART로 변경해주세요
		cd2.kind = "HEART";
		//8. cd2의 숫자를 3로 변경해주세요
		cd2.number = 3;
		//9. 아래와 같이 출력해주세요
		// cd1의 모양: 숫자 : 너비 : 높이 :
		// cd2의 모양: 숫자 : 너비 : 높이 :
		System.out.println("cd1의 모양 : "+cd1.kind+ " 숫자 : "+cd1.number+ " 너비 : "+cd1.width+ " 높이 : "+ cd1.height); //SPADE, 7, 100, 250
		System.out.println("cd2의 모양 : "+cd2.kind+ " 숫자 : "+cd2.number+ " 너비 : "+cd2.width+ " 높이 : "+ cd2.height); //HEART, 3, 100, 250
		//10. cd1의 너비를 50으로 변경해주세요
		cd1.width = 50;
		//11. cd1의 높이를 80으로 변경해주세요
		cd1.height = 80;
		//12. 아래와 같이 출력해주세요
		// cd1의 모양: 숫자 : 너비 : 높이 :
		// cd2의 모양: 숫자 : 너비 : 높이 :
		System.out.println("cd1의 모양 : "+cd1.kind+ " 숫자 : "+cd1.number+ " 너비 : "+cd1.width+ " 높이 : "+ cd1.height); //SPADE, 7, 50, 80
		System.out.println("cd2의 모양 : "+cd2.kind+ " 숫자 : "+cd2.number+ " 너비 : "+cd2.width+ " 높이 : "+ cd2.height);	//HEART, 3, 50, 80	
	}
}



class Card{
	//인스턴스변수
	String kind;
	int number;
	
	//클래스변수
	static int width = 100;
	static int height = 250;
	
	void method() {
		int v = 3; //지역변수
	}
	
	static void method2() {
		
	}
}