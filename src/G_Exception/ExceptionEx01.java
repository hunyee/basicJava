package G_Exception;

public class ExceptionEx01 {
	public static void main(String[] args) {
		
//		for (int i = 0; i < 10; i++) {
//			int result = 100/(int)(Math.random()*5);
//			System.out.println(result);
//			//java.lang.ArithmeticException: / by zero 
//			// Exception 종류                          /  이유
//		}
		
		for (int i = 0; i < 10; i++) {
			try{
				int result = 100/(int)(Math.random()*5);
				System.out.println(result);
			} catch(ArithmeticException e) {
				System.out.println("0으로나누지마");
			}
		}
		
		
	}
}
