package F_OOP2;

import F_OOP2.Outer.Inner;


public class InnerEx02 {
	public static void main(String[] args) {
		
		//method()호출
		Outer o = new Outer();
		Outer.Inner in = o.new Inner();
		in.method();
	}
	
}

class Outer { //Outer 인스턴스화
	int value = 10;
	
	class Inner { 
		int value = 20;
		
		void method() { //Inner안의 인스턴스메서드
			int value = 30;
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer.this.value);
		}
	}
}