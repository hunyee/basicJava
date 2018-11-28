package E_OOP;

public class MyMathTest {
	public static void main(String[] args) {
		
		MyMath.add();
		MyMath a1 = new MyMath(); //인스턴스메서드를 부르기 위한 인스턴스생성
		a1.add2(10);  //인스턴스 메서드 호출, 10= 인자값  
		
		MyMath.add3(3, 4.4f); //클래스메서드 호출
		a1.add4(4, 10, 'd');
//		System.out.println('d'-0);
		
//		MyMath.add5(7);
		int result = MyMath.add5(7);
		System.out.println(result);
		
		int result2 = a1.add6(10, 5);
		System.out.println(result2);
		
		long result3 = a1.multiply(300000000, 3000);
		System.out.println(result3);
		
		float result4= a1.divide(14, 9);
		System.out.println(result4);
	}
}

class MyMath {
	static int number = 50;
	
	static void add(){
		System.out.println(number * 2);
	}

	void add2(int a) { //(int a)매개변수
		System.out.println(number*a);
	}
	
	static void add3(int a, float c) { //클래스메서드
		System.out.println(a*c);
	}
	
	void add4(int c, int d, char e) {
		System.out.println(c+d+e);  //c+d 값 + e를 인트형으로 캐스팅된 값 
	}
	
	//클래스 매서드명은 add5
	//매개변수는 int 하나
	//수행내용 매개변수와 number의 합을 반환
	static int add5(int a) {
		int result  = a + number;
		return result;
	}
	
	int add7(int a, int b) {
		int result = a+b;
		return result;
	}
	
	//메서드명 add6
	//매개변수 int 두개
	//앞에 받은 값에서 뒤에 받은 값을 뺀 결과를 반환하는 메서드를 만드세요
	int add6(int a, int b) {
		int result = a - b;
		return result;
	}
	
	//multiply
	//int 값 2개
	//두개의 수를 곱해서 반환
	//단. overflow 고려해주세요.
	long multiply(int a, int b) {
		long result = (long)a*b;
		return result;
	}
	
	//인스턴스매서드 divide
	//int 값 2개
	//앞의 값을 뒤의 값으로 나눈 결과를 반환해주세요
	//단. 소숫점 셋째자리에서 반올림하여 두번째 자리까지 표현해주세요
	float divide(int a, int b) {
		float result = (int)(a/(float)b*100+0.5)/100f;
		return result;
	}
	
}
