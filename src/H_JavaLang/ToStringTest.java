package H_JavaLang;

public class ToStringTest {
	public static void main(String[] args) {
		//3. Card 객체를 만드세요 c
		Card c = new Card();
		//4. c를 출력해주세요
		//단 kind와 number출력되도록 만들어주세요
		System.out.println(c);
	}
}


class Card {
	String kind;
	int number;
	
	//1. 매개변수가 두개인 생성자를 만들어주세요
	Card(String kind, int number) {
		this.kind=kind;
		this.number=number;
	}
	//2. 기본생성자를 만들어주세요
	//단 매개변수가 두개인 생성자를 이용하여 SPADE,1의 값을 가지도록 해주세요
	Card() {
		this.kind = "SPADE";
		this.number = 1;
	}
	//toStirng()오버라이딩
	@Override
	public String toString() {
		return kind + "," + number;
	}
	
}