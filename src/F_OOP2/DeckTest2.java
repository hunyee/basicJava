package F_OOP2;

import java.util.Arrays;

public class DeckTest2 {
	public static void main(String[] args) {
		Deck2 d = new Deck2();
		System.out.println(Arrays.toString(d.c));
		
		System.out.println(d.pick(5));
		System.out.println(d.pick());
		d.shuffle();
		System.out.println("섞어줄게");
		System.out.println(Arrays.toString(d.c));
		d.shuffle(20);
		System.out.println("너가 원하는 만큼 섞었어");
		System.out.println(Arrays.toString(d.c));
	}
}

class Card2 {
	static final int KIND_MAX = 4; //카드 무늬수
	static final int NUM_MAX = 13; //무늬별 카드수
	
	static final int SPADE = 1;
	static final int DIAMOND = 2;
	static final int HEART = 3;
	static final int CLOVER = 4;
	
	int kind;
	int number;
	
	Card2(int kind, int number) { //동일하게 가는게 나중에 인스턴스 메서드 부를때 값을 알기 쉽기 때문에 좋음
		this.kind = kind;
		this.number = number;
	}
	
	Card2() {
		this(1,1);
	}
	
	public String toString() {
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


class Deck2{
	static final int CARD_NUM = Card2.KIND_MAX * Card2.NUM_MAX;
	
	Card2[] c = new Card2[CARD_NUM];
	
	Deck2() {
		int k=0;
		for (int i = 1; i < Card2.KIND_MAX+1; i++) {
			for (int j = 1; j < Card2.NUM_MAX+1; j++) {
				this.c[k] = new Card2(i,j);
				k++;
			}
		}
	}
	
	Card2 pick(int a) {
		return c[a];
	}
	
	Card2 pick() {
		System.out.println("랜덤방이야");
		return this.pick((int)(Math.random()*CARD_NUM+0));
	}
	
	void shuffle() {
		for (int i = 0; i < c.length; i++) {
			int j = (int)(Math.random()*CARD_NUM+0);
			Card2 tmp ;

			tmp = this.c[i];
			this.c[i] = this.c[j];
			this.c[j] = tmp;
		}
	}
	
	void shuffle(int a) {
		for (int i = 0; i < a; i++) {
			int j = (int)(Math.random()*CARD_NUM+0);
			int k = (int)(Math.random()*CARD_NUM+0);
			Card2 tmp ;

			tmp = this.c[j];
			this.c[j] = this.c[k];
			this.c[k] = tmp;
		}
	}
	
	
}









