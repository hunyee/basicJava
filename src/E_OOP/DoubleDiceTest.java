package E_OOP;

public class DoubleDiceTest {
	public static void main(String[] args) {
		
		//throwDice 메서드 호출하여라
		DoubleDice dd = new DoubleDice();
		dd.throwDice();
		
	}
}

class DoubleDice {
	int a;
	int b;
	int result = 0;
	//인스턴스메서드 throwDice
	//주사 위 2개를 던진다. 2개의 주사위 합을 return
	int throwDice(){
		a = (int)(Math.random()*6+1);
		b = (int)(Math.random()*6+1);
		System.out.println("주사위1: " + a  + "   주사위2: " + b);
		if(a==b) {
//			System.out.println(a+b);
			result = (a+b) + throwDice();
			System.out.println(result+"칸 이동");
		} 
		result = a+b;
		return result; 
	}
}