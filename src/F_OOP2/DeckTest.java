package F_OOP2;

import java.util.Arrays;
import java.util.Scanner;

public class DeckTest {
	public static void main(String[] args) {
//		Card c = new Card();
//		Card c2 = new Card(2,5);
//		System.out.println(c.toString());  // SPADE , 1
//		System.out.println(c2.toString()); //DIAMOND, 5
		
		// Deck객체를 만들어주세요.
		Deck d = new Deck();
		System.out.println(Arrays.toString(d.c));
		// 4,5,6,7번에서 만들어진 메서드 호출, 출력
		System.out.println(d.pick(5));
		System.out.println(d.pick());
		d.shuffle();
		System.out.println("섞어줄게");
		System.out.println(Arrays.toString(d.c));
		d.shuffle(20);
		System.out.println("너가 원하는 만큼 섞었어");
		System.out.println(Arrays.toString(d.c));
		
		// 그려
		
	}
}

class Card {
	static final int KIND_MAX = 4; //카드 무늬수
	static final int NUM_MAX = 13; //무늬별 카드수
	
	static final int SPADE = 1;
	static final int DIAMOND = 2;
	static final int HEART = 3;
	static final int CLOVER = 4;
	
	int kind;
	int number;
	
	//1. 매개변수가 두개인 생성자를 만들어주세요
	Card(int kind, int number) { //동일하게 가는게 나중에 인스턴스 메서드 부를때 값을 알기 쉽기 때문에 좋음
		this.kind = kind;
		this.number = number;
	}
	
	//2. 기본생성자를 만들어주세요.
	//단 매개변수가 두개인 생성자를 이용하여 1,1로 만들어주세요
	Card() {
		this(1,1);
	}
	
	@Override
	public String toString() { //삼각형이 오버라이딩 표시
		String kind = "";
		String number = "";
		
		switch (this.kind) {
		case 1:
			kind = "SPADE";
			break;
		case 2:
			kind = "DIAMOND";
			break;
		case 3:
			kind = "HEART";
			break;
		default :
			kind = "CLOVER";
			break;
		}
		
		switch (this.number) {
		case 1:
			number = "A";
			break;
		case 11:
			number = "J";
			break;
		case 12:
			number = "Q";
			break;
		case 13:
			number = "K";
			break;
		default:
			number += this.number;
			break;
		}
		return kind + "," +number;
	}
}


class Deck{
	//1. 카드 52장을 저장할 수 있는 변수 CARD_NUM 선언 및 초기화 해주세요
	//   단, 초기화시 Card클래스의 상수를 이용해주세요.
	static final int CARD_NUM = Card.KIND_MAX * Card.NUM_MAX;
	int tmp;
	//2. 카드 52장을 저장할 수 있는 변수 c를 선언 및 생성해주세요.
	//   단, CARD_NUM을 이용해주세요 
	Card[] c = new Card[CARD_NUM];
	
	
	//3. 기본생성자를 만들어주세요.
	//   c의 각방을 카드로 채워주세요.
	Deck() {
		int k=0;
		for (int i = 1; i < Card.KIND_MAX+1; i++) {
			for (int j = 1; j < Card.NUM_MAX+1; j++) {
				this.c[k] = new Card(i,j);
				k++;
			}
		}
//		c[0] = new Card(1,1);
//		c[1] = new Card(1,2);
//		c[2] = new Card(1,3);
//		c[3] = new Card(1,4);
//		c[4] = new Card(1,5);
//		c[5] = new Card(1,6);
//		c[6] = new Card(1,7);
//		c[7] = new Card(1,8);
//		c[8] = new Card(1,9);
//		c[9] = new Card(1,10);
	}
	
	//4. 입력받은 방번호의 카드를 반환하는 메서들 만드세요. 메서드명 pick()  *1차원배열
	Card pick(int a) {
		return c[a];
	}
	
	//5. 랜덤한 방의 카드 한장을 반환하는 메서드를 만들어주세요  pick()
	//   단 4번에서 만든 pick메서드를 이용하세요
	Card pick() {
		System.out.println("랜덤방이야");
//		int a = (int)(Math.random()*52+0);
		return this.pick((int)(Math.random()*CARD_NUM+0));
//		return c[(int)(Math.random()*CARD_NUM+0)];
	}
	
	//6. 카드를 섞어주세요. shuffle\
	
	
	
	//   단. 연습문제 5-5의 형태로 만들어주세요
	void shuffle() {
		for (int i = 0; i < c.length; i++) {
			int j = (int)(Math.random()*CARD_NUM+0);
			Card tmp ;

			tmp = this.c[i];
			this.c[i] = this.c[j];
			this.c[j] = tmp;
		}
	}
	
	//7. 카드를 섞어주세요. shuffle
	//   단, 랜덤방 두개를 교환하는 방식으로 사용자로부터 입력받은 수만큼 반복해주세요.
	void shuffle(int a) {
		
		
		for (int i = 0; i < a; i++) {
			int j = (int)(Math.random()*CARD_NUM+0);
			int k = (int)(Math.random()*CARD_NUM+0);
			Card tmp ;

			tmp = this.c[j];
			this.c[j] = this.c[k];
			this.c[k] = tmp;
		}
	}
	
	
}









