package H_JavaLang;

public class JavaLangBasic {
	/*
	1. java.lang 패키지
		- java.lang패키지는 자바프로그래밍에 기본이 되는 클래스들을 포함하고 있다.
	
	2. Object클래스
		- Object클래스는 멤버변수 없이 11개의 메서드로 이루어져 있다.
		
		- equals(Object obj) //==과 같은의미, equals는 주소비교
			: 매개변수로 객체의 참조변수를 받아서 비교하여 그 결과를 boolean값을 알려준다.
			: 참조변수에 저장된 주소값이 같은지를 판단할 수 밖에 없다.
			: 주소값이 아닌 멤버변수의 값을 비교하기 위해서는 equals() 오버라이드 해야한다.
				equals()오버라이드 되어있는 클래스들
				ex) String, Date, File, wrapper클래스(기본형 8가지 클래스 명칭)...
	
		- hashCode() - 10진수로 이루어져 있다.
			: 객체의 주소값을 이용해서 해시코드를 만들어 반환한다.
			: String클래스는 문자열의 내용이 같으면 동일한 해시코드를 반환한다.
	
		- toString() 
			: 인스턴스에 대한 정보를 문자열로 제공할 목적으로 작성
			
			                  패키지명.클래스명
			return getClass().getName() + "@" + Integer.toHexString(hashCode());
			: 객체를 toString할때는 클래스명@1f352형태로 나타나게 된다.
	
	
	
	
	
	
	
	
	*/
}
