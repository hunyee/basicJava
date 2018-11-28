package E_OOP;

public class initTest {
	public static void main(String[] args) {
		
	
		System.out.println(Init.action); //0 => 55
										 //명시적 초기화 => 클래스초기화 블럭
		
		Init it = new Init(); //   15    =>    20 
		                      // 명시적초기화 => 생성자를 이용한 초기화
						//인스턴스는 명시적초기화 => 인스턴스 초기화 블럭 => 생성자를 이용한 초기화
						//인스턴스 초기화블럭이 많을시 제일 위에 초기화블럭부터 시작해서 순차적으로 진행후 => 생성자를 이용한 초기화
		System.out.println(it.action2); // 20
		System.out.println(it.action3);
	
	
	
	

		
	}
}

class Init { //이니
	static int action;
	int action2 = 15; //명시적 초기화
	int action3; //명시적 초기화
	
	Init() { //기본생성자
//		action2 = 20;
//		action3 = 40;
	}
	
	
	static { //초기화블럭
		//많은 수식
		action = 55;
	}
	
	{ //인스턴스블럭
		//많은 수식
		//action
		action2 = 100;
	}
	{
		//많은수식
		action3 = 150;
	}
}