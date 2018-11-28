package F_OOP2;

public class PolyTest {
	public static void main(String[] args) {
		
		//1. 스마트 티비 3대 저장하세요
		Tv[] st = new SmartTv[3];
		Tv st1 = new SmartTv();
		st[0] = st1;
		
		st[0] = new SmartTv();
		st[1] = new SmartTv();
		st[2] = new SmartTv();
		
		//2. ThreeDTv 2대 저장하세요
		ThreeDTv[] tt = new ThreeDTv[2];
		tt[0] = new ThreeDTv();
		tt[1] = new ThreeDTv();
		
		//3. AfreecaTv 4대 저장하세요
		AfreecaTv[] at = new AfreecaTv[4];
		at[0] = new AfreecaTv();
		at[1] = new AfreecaTv();
		at[2] = new AfreecaTv();
		at[3] = new AfreecaTv();
		
		Tv[] t = new Tv[9];
		t[0] = (Tv)new SmartTv(); //up-casting
		t[1] = new SmartTv();
		t[2] = new SmartTv();
		t[3] = new ThreeDTv();
		t[4] = new ThreeDTv();
		t[5] = new AfreecaTv();
		t[6] = new AfreecaTv();
		t[7] = new AfreecaTv();
		t[8] = new AfreecaTv();
		
		SmartTv st4 = (SmartTv)t[2]; //down-casting;
		// SmartTv ttt = (SmartTv)new Tv(); 문법적으로는 맞지만 자식클래스의 참조변수로 부모타입의 인스턴스를 참조할 수 없음
		
	}
}

class Tv {
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	
	void channelUp(){
		channel++;
	}
}

class SmartTv extends Tv {
	void internet() {
		
	}
}

class ThreeDTv extends Tv {
	void threeD() {
		
	}
}

class AfreecaTv extends Tv {
	void starBallon() {
		
	}
}