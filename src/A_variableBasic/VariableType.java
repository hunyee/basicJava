package A_variableBasic;

public class VariableType {
	public static void main(String[] args) {
		/*
		 변수의 타입
		 1. 기본형타입(primitive type) - 값을 저장
		 -boolean, char, byte, short, int, long, float, double
		 2. 참조형타입(reference type) - 주소를 저장(4byte)
		 
		 3. 종류
		 	- 논리형 : boolean (true와 false만 값으로 갖는다. 조건식과 논리식에 많이 사용)
		 	- 문자형 : char (문자를 하나 저장하는데 사용된다)
		 	- 정수형 : byte, short, int, long (정수값을 저장) 
		 	- 실수형 : float, double (실수값 저장)
		 
		 4. 크기 (1byte = 8bit)
		 	- 1byte : boolean, byte 
		 	- 2byte : char, shot
		 	- 4byte : int, float
		 	- 8byte : long, double
		 
		 5. 논리형 - boolean(기본값 false)
		 	- boolean형 변수는 true와 false중 하나의 값을 저장할 수 있다.
		 	- 대답 (YES, NO), 스위치(ON/OFF)등의 논리구현에 주로 사용한다.
		 	- 1byte의 크기를 가진다.
		 */
		
		//true의 값을 저장할 수 있는 변수 power를 선언 및 초기화 해주세요.
		boolean power = true;
		boolean a = false;
//		System.out.println(power);
//		System.out.println(a);
		
		/*
		 6. 문자형 - char('\u0000' = Unicode, '' = single quotation?)
		 	- 문자 하나를 저장하는 용도로 사용된다.
		 	- java는 Unicode문자 체계를 이용한다.
		 */
	
		char code = 'A';
		char code2 = '\u0041';
		char code3 = 65;
		
		int result = '가';
		char code4 = 44032;
		System.out.println(result);
		System.out.println(code4);
		
		/*
		 7. 정수형 - byte, short, int, long
		 	- 기본자료형은 int형이다.
		 	- 변수에 저장하고자 하는 정수값의 범위에 따라 4개중 하나를 선택히야 한다.
		 */
		//byte 타읩이 변수 b1에 150의 값을 저장해주세요.
		byte b1 = 100;
		long b2 = 950831211111L; //long은 4byte내에 수를 처리, 4byte를 넘어갈시 숫자뒤에 L,l을 붙여줘야 long으로 인식
		
		/*
		 8. 실수형 - float, double
		  	- 기본형은 double
		  	- 실수형 값을 저장하는데 사용된다.
		  	- float: 1+8+23
		  	- double: 1+11+52
		  
		 */
		
		float f1 = 3.141592459678153915f;
		double d1 = 3.141592459678153915; 
		
		double d2 = 0.125; //double은 2의 -n승으로 표현 , 0.1은 다름 
		float f2 = 0.125f;
		
		System.out.println(0.5 == 0.5f);
		
		/*
		 9. 문자열 - String (문자열로 쓸 수 있는 class, 기본형처럼 쓰는 참조형)
		 */
		
		String str = "========\n---------"; //문자가 없어도 됨, 특수문자도 다 됨, \만 못씀
		System.out.println(str);
		
		/*
		 10. overflow
		 	- 자신이 표현할 수 있는 값을 넘었을 때 최소값으로 돌아가는 현상
		 */
		
		byte b3 = 126;
		System.out.println(b3);
		b3++;
		System.out.println(b3);
		b3++;
		System.out.println(b3);
		b3++;
		System.out.println(b3);
		b3++;
		System.out.println(b3);
		
		/*
		 11. 형변환(casting) ex)_게임에서 파이어볼! (자연의 기운을 받아 casting을 해서 불의형태로 변환!)
		 	- 기본형 간에는 다른 타입으로 변환이 가능하다. overflow가 발생하지 않으면 casting없이 가능
		 	- byte -> short -> int -> long -> float -> double
		 */
		int a2 = 40000;
		byte b4 = (byte) a2;
		
		int a3 = 65;
		char c3 = (char) a3;
		System.out.println(c3);
		
		char c4 = 'B';
		int i4 = c4;  //표현할 수 있는 범위, char= 2byte, int= 4byte로 int는 overflow없이 char를 처리가능, 
		System.out.println(i4);
		
		//byte -> short -> int -> long -> float -> double -> String
		               //  |
		        //char ----┙
		
		long aa = 180;
		short ff = (short) aa;
		
		/*
		 12. 문자열 결합
		 */
		System.out.println(55 + 10);
		System.out.println("하이"+55); //"하이" + 문자열"55" => 하이55
		System.out.println("45" + 20);
		System.out.println("56" + "32");
		System.out.println("" + 45);
		System.out.println(true + "34");
		System.out.println('T' + "G" + 45); //(('T' + "G") + 45) =  ((TG) + 45)
		System.out.println('A' + 4 + "44"); //(('A' + 4) + "44") =  ((65 + 4) + "44")
	}

}
