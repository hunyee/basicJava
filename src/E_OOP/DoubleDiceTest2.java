package E_OOP;

public class DoubleDiceTest2 {
	public static void main(String[] args) {
		DoubleDice2 dd = new DoubleDice2(); 
		int result = dd.throwDice();
		System.out.println(result);
	}
}

class DoubleDice2 {
	int throwDice() {
		int firstDice = (int)(Math.random()*6+1);
		int secondDice = (int)(Math.random()*6+1);
		System.out.println(firstDice + "," + secondDice);
		
		int result = firstDice + secondDice;

		if(firstDice == secondDice) {
			result += throwDice();
		}
		
		return result;
	}
}