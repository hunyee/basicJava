package G_Exception;

public class ExceptionBasic {
	public static void main(String[] args) {
		/*
		1. 프로그램 오류
			- 프로그램이 실행 중 어떤 원이에 의해서 오작동을 하거나 비정상적으로 종료되는 경우
			- 컴파일 에러 : 컴파일 할때 발생하는 에러
			- 런타임 에러 : 실행중에 발생하는 에러
			- 에러 : 프로그램 코드에 의해서 수습될 수 없는 심각한 오류 
			- 예외 : 프로그램 코드에 의해서 수습될 수 있는 경미한 오류
			
			Exception - RuntimeException(프로그래머 실수)
					  - 그외 Exception(다른이유)
			
		2. RuntimeException클래스와 그 외 클래스들
			- 모든 예외의 최고조상은 Exception이다.
			- RuntimeException클래스들은 주로 프로그래머의 실수에 의해 발생할 수 있는 예외
			  ex) IndexOutOfBoundsException, NullPointException
			- Exception클래스들은 주로 외부의 영향으로 발생할 수있다.
			  ex) FileNotFoundException, ClassNotFoundException
		
		3. 예외처리(try-catch)
			- 프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성한다
			
			try{
				//예외가 발생할 가능성이 있는 문장
			} catch(Exception1 e1) {
				//먼저 선언된 catch를 수행하고 예외처리를 종료, 가장 중요한 예외처리를 위로
			} catch(Exception2 e2) {
			
			}
			- 발생한 예외의 종류와 일치하는 단 하나의 catch블럭만 수행한다.
		
		4. 예외발생시키기
			- 연산자 new를 이용해서 발생시키려는 예외클래스의 객체를 만든다.
				Exception e = new Exception();
			- 키워드 throw를 이용해서 발생시키면 된다.
				throw e;
				throw new Exception();
				
		5. 예외던지기
			- 메서드 예외 선언하기
				: 메서드의 선언부에 throw를 사용해서 메서드 내에서 발생할 수 있는 예외를 적어주기만 하면 된다.
				  => 처리는 그메서들 호출한 곳에서 처리한다.
		
		6. finally
			- try-catch블럭의 예외발생에 상관없이 실행되어야 할 코드를 포함한다.
			
			try {
				예외발생 가능성이 있는 문장
			} catch() {
				예외를 처리하기 위한 문장
			} finally {
				예외 발생에 상관없이 마지막에 수행
			}
			
			try - finally
			try - catch - finally
		*/
		
	}
}
