package E_OOP;

public class CartPractice {
	public static void main(String[] args) {
		System.out.println(Card1.width);
		System.out.println(Card1.height);
		
		Card1 cd1 = new Card1();
		Card1 cd2 = new Card1();
		cd1.kind = "SPADE";
		cd1.number = 7;
		cd2.kind = "HEART";
		cd2.number = 3;
		
		System.out.println("cd1 : "+cd1.kind +"\t"+ cd1.number +"\t"+ Card1.width +"\t"+ Card1.height);
		System.out.println("cd2 : "+cd2.kind +"\t"+ cd2.number +"\t"+ Card1.width +"\t"+ Card1.height);
		
		Card1.width = 50;
		Card1.height = 80;
		
		System.out.println("cd1 : "+cd1.kind +"\t"+ cd1.number +"\t"+ Card1.width +"\t"+ Card1.height);
		System.out.println("cd2 : "+cd2.kind +"\t"+ cd2.number +"\t"+ Card1.width +"\t"+ Card1.height);
	}
}

class Card1 {
	static int width = 100;
	static int height = 250;
	static void method2() {
		
	}
	
	String kind;
	int number;
	void method() {
		
	}
}