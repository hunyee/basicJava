package Y_exam;


public class SutdaCardTest {
	public static void main(String[] args) {
		
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());
		System.out.println(card2.info());
		

		
		
	}
	
}
class SutdaCard {
	int num;
	boolean isKwang;
	SutdaCard() {
		this.num=1;
		this.isKwang = true;
	}
	
	SutdaCard(int a, boolean b) {
		this.num = a;
		this.isKwang = b;
	}
	
	String info() {
		String result;
		if(isKwang==true) {
			result = num + "k"
					
					
					
					
					;
		} 
		result = num + " ";
	
		return result;
	}
}
