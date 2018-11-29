package G_Exception;

public class ExceptionEx03 {
	public static void main(String[] args) {
		
		Exception e = new Exception("일부로 발생시킴");
		
		try {
			throw e;
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
		
		try {
			throw new RuntimeException();
		} catch (RuntimeException e2) {
			e2.printStackTrace();
		}
		
		System.out.println();
		
		//RuntimeException과 그 자손클래스에 해당하는 예외는 프로그래머의 실수이기 때문에 예외를 강제하지 않음
		
		//컴파일러가 예외처리를 강제하지 않는 경우
		//1. RuntimeException클래스와 그 자손 클래스들
		//2. Error와 그 자손 (강제해봐야 소용없음)
		//이런것들을 'unchecked예외'라 부른다. (그 외는 checked예외)
	}
}
