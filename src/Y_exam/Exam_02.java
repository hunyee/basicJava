package Y_exam;

public class Exam_02 {
	
	char c;
	boolean b;
	int i;
	float f;
	long l;
	String s;
	
	public static void main(String[] args) {
		
		//리터럴 = 값
		
		/*
		[2-1] 다음 표의 빈 칸에 8개의 기본형(primitive type)을 알맞은 자리에 넣으시오.
		
			   크 기	1 byte 		2 byte 		4 byte 		8 byte
			종 류		
			--------------------------------------------------------
			논리형	boolean
			--------------------------------------------------------	
			문자형				char
			--------------------------------------------------------
			정수형	byte		short 		int 		long
			--------------------------------------------------------
			실수형							float 		double
			--------------------------------------------------------
		*/
		
		/*
		[2-2] 주민등록번호를 숫자로 저장하고자 한다. 이 값을 저장하기 위해서는 어떤 자료형 (data type)을 선택해야 할까?
		regNo라는 이름의 변수를 선언하고 자신의 주민등록번호로 초기화 하는 한 줄의 코드를 적으시오.
			
		답:	long regNO = 9302191234567L;
			*/
			long regNO = 9302191234567L;
			System.out.println(regNO);
		
		/*
		[2-3] 다음의 문장에서 리터럴, 변수, 상수, 키워드를 적으시오.
			int i = 100;
			long l =100L;
			final float PI = 3.14f;
			
			- 리터럴 : 100, 100, 3.14
			- 변수 : i, l
			- 키워드 : int, long, final, float
			- 상수 : PI
		 */
		
			int i = 100;
			long l = 100L;
			final float PI = 3.14f;
			
			System.out.println(i);
			System.out.println(l);
			System.out.println(PI);
		
		/*
		[2-4] 다음 중 기본형(primitive type)이 아닌 것은?  답: b
			a. int
			b. Byte
			c. double
			d. boolean
		
		기본형에는 8가지가 있다. boolean, char, byte, short, int, long, float, double
		모두가 소문자이므로 b. Byte가 답이다.
		 */
		
		/*
		[2-5] 다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 경우, 괄호 안에 ‘오류’라고 적으시오.
			System.out.println(“1” + “2”) → ( 12 ) Stirng + String => String => String "12"
			System.out.println(true + “”) → ( ture ) boolean + String => String + String => String "true"
			System.out.println(‘A' + 'B') → ( 131 ) char + char => int + int => 65 + 66 => int 131
			System.out.println('1' + 2) → ( 51 ) char + int => int + int => ((char='1') = 49) + int 2 => int 51
			System.out.println('1' + '2') → ( 50 ) char + char =>char는 2글자를 저장하지 못함 int로 변환 -> int + int => ((char='1') = 49) + ((char='2') = 50) = int 50
			System.out.println('J' + “ava”) → ( Java ) char + String => String => String "Java"
			System.out.println(true + null) → ( 오류 )  
		*/
		
		
		/*
		[2-6] 다음 중 키워드가 아닌 것은?(모두 고르시오)  답: b, c, d, e
			a. if
			b. True
			c. NULL
			d. Class
			e. System
			
			자바의 예약어는 소문자로 이루어져 있고, 대소문자를 구분하므로 b. True, c. NULL, d. Class, e.System 이 답이다.
		*/
		
		/*
		[2-7] 다음 중 변수의 이름으로 사용할 수 있는 것은? (모두 고르시오)  답: a, d, e, g
			a. $ystem
			b. channel#5
			c. 7eleven
			d. If
			e. 자바
			f. new
			g. $MAX_NUM
			h. hello@com
			
			변수 명명규칙
			1. 대소문자를 구분하며, 길이의 제한이 없다.
			2. 예약어는 사용할 수 없다.
			3. 숫자로 시작해서는 안된다.
			4. 특수문자는 '$' 와 '_'만 사용할 수 있다.
			
			b. channel#5 => 특수문자를 사용함
			c. 7eleven => 숫자로 시작함
			h. hello@com => 특수문자를 사용함
		 */
			
		/*
		[2-8] 참조형 변수(reference type)와 같은 크기의 기본형(primitive type)은? (모두 고르시오)  답: a, b
			a. int
			b. long
			c. short
			d. float
			e. double
			
			참조형 변수(reference type)는 주소를 저장를 저장하고 4byte이다.
			기본형 4byte는 a. int 와 b. float가 있다.
		*/
		
		/*
		[2-9] 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)  답: a, b, c
			byte b = 10;
			char ch = 'A';
			int i = 100;
			long l = 1000L;
			
			a. b = (byte)i;
			b. ch = (char)b;
			c. short s = (short)ch;
			d. float f = (float)l;
			e. i = (int)ch;
			
			형변환 순서는 - byte -> short -> int -> long -> float -> double
								        |
								  char -┛
			a. i는 int, b는 byte => int형이 더 큰 타입으로 형변환이 필요하다.
			b. b는 byte, ch는 char => char형이 더 큰 타입으로 형변환이 필요하다.
			c. s는 short, ch는 char => char형이 더 큰 타입으로 형변환이 필요하다.
			d. f는 float, l은 long => float형이 더 큰 타입으로 형변환이 필요하지 않다.
			d. i는 int, ch는 char => int형이 더 큰 타입으로 형변환이 필요하지 않다.
		 */
			
		/*
		[2-10] char타입의 변수에 저장될 수 있는 정수 값의 범위는? (10진수로 적으시오)
			char는 2byte로 16bit 이다.
			2의 16승 -1 까지 저장할수 있으므로 2 16승 -1은  65535
			
			답: 0 ~ 65535
		 */
			
		/*
		[2-11] 다음중 변수를 잘못 초기화 한 것은? (모두 고르시오)  답: a, b, c, d
			a. byte b = 256;
			b. char c = '';
			c. char answer = 'no';
			d. float f = 3.14
			e. double d = 1.4e3f;
			
			a. byte의 범위는 -128 ~ 127까지이다. 127를 넘어가므로 잘못 초기화
			b. char는 무조건 한글자만 들어갈 수 있다. ''공백이므로 잘못 초기화
			c. char는 무조건 한글자만 들어갈 수 있다. 'no' 두 글자이므로 잘못 초기화
			d. float는 실수형이므로 실수가 들어갈 수 있다. 3.14는 실수이지만 세미콜론이 빠졌으므로 잘못 초기화
			e. double은 실수형이므로 실수가 들어간다. float는 double안에 들어가므로 초기화 맞음
		 */
		
		
		/*
		[2-13] 다음 중 타입과 기본값이 잘못 연결된 것은? (모두 고르시오)  답: f
			a. boolean - false
			b. char - '\u0000'
			c. float - 0.0
			d. int - 0
			e. long - 0
			f. String - ""
			
			boolean 기본값은 false, char의 기본값은 '\u0000', float의 기본값은 0.0, int의 기본값은 0, long의 기본값은 0, String의 기본값은 null이다
		*/
		
		Exam_02 e = new Exam_02();
			
		boolean b1 = false;
		System.out.println(e.b);
		System.out.println(b1);
		System.out.println(e.b == b1);
		
		
		char c1 = '\u0000';
		System.out.println(e.c);
		System.out.println(c1);
		System.out.println(e.c == c1);
		
		float f1 = 0.0f;
		System.out.println(e.f);
		System.out.println(f1);
		System.out.println(e.f == f1);
		
		int i1 = 0;
		System.out.println(e.i);
		System.out.println(i1);
		System.out.println(e.i == i1);
		
		long l1 = 0;
		System.out.println(e.l);
		System.out.println(l1);
		System.out.println(e.l == l1);
		
		String s1= "";
		System.out.println(e.s);
		System.out.println(s1);
		System.out.println(e.s == s1);
		
		boolean b3 = false;
		System.out.println(b3 == false);
	}
}
