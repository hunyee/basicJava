package G_Exception;

public class ExceptionEx04 {
	public static void main(String[] args) {
		method1();
	}
	
	static void method1() {
		try {
			method2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void method2() throws Exception{
		
		throw new Exception("method2에서 발생함.");
	}
}
