package A_variableBasic;

/**
 * doc주석
 * @author pc15
 * @since 2018.10.30
 */
public class VariableBasic { //class명
	/**
	 * 메인이다!
	 * @param args
	 */
	public static void main(String[] args) { //method명
		//한줄 주석
		/*
		 여러줄 주석		
		 */
//		int a = 10; //변수명
		
		/*
		 1. 변수란?
		 	- 단 하나의 값을 저장할 수 있는 공간이다.
		 	
		 	변수의 선언
		 	- 기본형, 참조형
		 	[변수타입] [변수명];		 
		 */
			int a;
			int A;
			a = 10;
			A = 15;
			System.out.println(A);
		
		//명명규칙
		//1. 대소문자 구분을 하며 길이 제한이 없다.
			int asd;
			int aSd;
		//2. 예약어(key word, reserved word)는 사용할 수 없다.
//			int class;
		//3. 숫자로 시작해서는 안된다.
//			int 10top;
			int top10;
		//4. 특수문자 '_', '$'만 사용가능하다.
			int $a;
			int a_;
			a_ = 22;
			System.out.println(a_);
			
		//필수는 아니지만 자바프로그래머의 암묵적 약속(가독적 상향)
		//1. 클래스명은 대문자로 새작해야 된다.
		//2. 여러단어로 이루어진 경우 첫번째 이후 단어의 첫글자는 대문자로 쓴다.
			int lastIndexOf;
		//3. 상수의 명칭은 모두 대문자로 써야한다. 두단어가 합쳐질때는 _로 구분. ctrl + shift + x 대문자, ctrl + shift + y 는 소문자
			//MAX_VALUE
		//4. 한글은 사용하지 않는다.
	}
}
