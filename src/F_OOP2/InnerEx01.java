package F_OOP2;

public class InnerEx01 {
	//인스턴스클래스
	class InstanceInner{
		int iv = 100; //인스턴스변수사용가능
//		static int cv = 100; //사용불가
		final static int CONST = 200;
	}
	//스태틱클래스
	static class StaticClass {
		static int cv = 500;
		int iv = 200;
	}
	
	void method() {
		//지역클래스
		class LocalClass { //클래스가 static이더라도 static이 붙을수 없음, 
			int iv = 200;
//			static int cv = 500; //사용불가
			final static int LC = 500;
		}
	}
	
	
	
	
}
