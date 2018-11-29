package G_Exception;

public class ExceptionEx02 {
	public static void main(String[] args) {
		int a = 3;
		int b = 0;
		
		try{
			//1. 문장을 수행한다
			System.out.println(a);
			//2. 예외가 발생할 수 있는 상황
			System.out.println(a/b);
			//3. 실행가능한 문장을 만든다
			System.out.println(b);
			//4. 일치하는 예외를 찾는다.
		} catch(ArithmeticException e) {
			//예외 발생시 처리할 문장을 만든다
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch(Exception asdasd) {
			System.out.println("0으로 나누지마 제발");
		}
		
		System.out.println(6);
	}
}
