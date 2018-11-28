package E_OOP;

public class MemberCall {
	
	int iv = 10;
	static int cv = 100;
	
	int iv2 = iv;
	int iv3 = cv;
	
	static int cv2 = cv;
//	static int cv3 = iv3;
	
	static void method() {	
		cv = 500;
//		iv = 500;
	}
	
	void method2() {
		cv = 1000;
		iv = 1000;
	}
	
	static void method3() {
//		MemberCall.method();
		method(); 
//		method2();
	}
	
	void method4() {
		method();
		method2();
	}
}
