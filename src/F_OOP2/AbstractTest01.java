package F_OOP2;

public class AbstractTest01 {
	public static void main(String[] args) {
		
	}
}

abstract class Unit {
	int x;
	int y;
	
	abstract void move(int x, int y);
	
	void stop() {
	}
}

abstract class Marine extends Unit{
	void stimpack() {
	}
}

class Tank extends Unit{
	void changeMode() {
	}

	@Override
	void move(int x, int y) {
	
	}
	
}

class DropShip extends Unit{
	void load() {
		
	}
	
	void unload() {
		
	}
	
	@Override
	void move(int x, int y) {
		
	}
}



