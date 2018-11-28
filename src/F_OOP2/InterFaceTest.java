package F_OOP2;

public class InterFaceTest {
	public static void main(String[] args) {
		
		Fight f = new Fight();
		
		if(f instanceof Unit2) {
			System.out.println("f는 Unit2의 인스턴스이다.");
			Unit2 u2 = f;
		}
		
		if(f instanceof Fightable) {
			System.out.println("f는 Fightable인터페이스를 구현했다."); //인터페이스 다형성
			Fightable u2 = f;
		}
		//인터페이스타입의 참조변수로 그를 구현한 구현체에 인스턴스를 참조할 수 있다.
		
		if(f instanceof Movable) {
			System.out.println("f는 Movable인터페이스를 구현했다."); //인터페이스 다형성
			Movable u2 = f;
		}
		
		
		
		
	}
}

class Unit2 {
	int x;
	int y;
	int currentHp; //current 현재의 , 현재체력
}

interface Movable{
	void move(int x, int y); 
}

interface Attackable{
	void attack(Unit2 u);
}

interface Fightable extends Movable, Attackable {
	
}

class Fight extends Unit2 implements Fightable{

	@Override
	public void move(int x, int y) {
		
	}

	@Override
	public void attack(Unit2 u) {
		
	}
	
}