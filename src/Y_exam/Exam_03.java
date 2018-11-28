package Y_exam;

public class Exam_03 {
	public static void main(String[] args) {
		/*
		[3-1 연습문제]
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		System.out.println(1 + x << 33);
		(1 + 2)<<33 => 3<<33 =>  3*2^33 => 2^8은 제자리값 =>  3*2^1 = 답: 6
		System.out.println(y >= 5 || x < 0 && x > 2);
		&&연산이 우선이므로 (y >= 5 || (x < 0 && x > 2)) => (x < 0 && x > 2)=> false =>  (y >= 5 || false) => ||연산은 한쪽의 값이 1이면 1 => 답: true
		System.out.println(y += 10 - x++);
		((y= y+10) - x++) => 15 -2++ => 답: 13(x=3)
		System.out.println(x+=2);
		위에서 x=3이므로 x = x+2  => 답: 5
		System.out.println( !('A' <= c && c <='Z') );
		'A' <= c => true , c <='Z' => true  true && true = !(true) => 답: false   
		System.out.println('C'-c);
		피 연산자의 타입이 int보다 작은경우 int로 변환 => 'C'-c => 'C'=>67, c=99  =>67 - 99 => 답: 2
		System.out.println('5'-'0');
		피 연산자의 타입이 int보다 작은경우 int로 변환 => '5'= 53 ,'0'=>48,  53-48 => 답: 5 
		System.out.println(c+1);
		피 연산자의 타입이 int보다 작은경우 int로 변환 => c=65 , 65+1 => 답: 66 
		System.out.println(++c);
		c = 65 => ++c = 답: 66 = B
		System.out.println(c++);
		c = 65 => c++ = 답: 66 = B
		System.out.println(c);
		위에 c++이기 때문에 답: 67 = C
		*/
	
		/*
		[3-2연습문제]
		아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다. 만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 
		13개의 바구니가 필요할 것이다. (1)에 알맞은 코드를 넣으시오.
			int numOfApples = 123; // 사과의 개수
			int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
			int numOfBucket = (  (1)  ); // 모든 사과를 담는데 필요한 바구니의 수      답: numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket>0? 1 : 0)
			System.out.println("필요한 바구니의 수 :"+numOfBucket);
		*/
		
		int numOfApples = 120; // 사과의 개수
		int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = ( numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket>0? 1 : 0)); 
		System.out.println("필요한 바구니의 수 :"+numOfBucket);
		
		/*
		[3-3 연습문제]
		아래는 변수 num의 값에 따라 ‘양수’, ‘음수’, ‘0’을 출력하는 코드이다. 삼항 연산자를 이용해서 (1)에 알맞은 코드를 넣으시오.
		[Hint] 삼항 연산자를 두 번 사용하라.
		[연습문제]/ch3/Exercise3_3.java
			class Exercise3_3 {
				public static void main(String[] args) {
					int num = 10;
					System.out.println( (1) ); 답: num>0? 
					"양수": (num==0? 0: "음수")
				}
			}
		*/
		
		int num = -20;
		System.out.println(num>0? "양수": (num==0 ? 0: "음수"));
		
		/*
		[3-4 연습문제] 아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다. 만일 변수 num의 값이 ‘456’이라면 ‘400’이 되고, ‘111’이라면 ‘100’이 된다. 
		(1)에 알맞은 코드를 넣으시오.
		[연습문제]/ch3/Exercise3_4.java
			class Exercise3_4 {
				public static void main(String[] args) {
					int num = 456;
					System.out.println( (1) );  답: num/100*100
				}
			}
		*/
		
		int num2 = 456;
		System.out.println(num2/100*100);
		
		/*
		[3-5 연습문제] 아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다. 만일 변수 num의 값이 333이라면 331이 되고, 777이라면 771이 된다. (1)에 알맞은 코드를 넣으시오.
			[연습문제]/ch3/Exercise3_5.java
			class Exercise3_5 {
				public static void main(String[] args) {
					int num = 333;
					System.out.println( (1) );   답(num/10*10+1)
				}
			}
		*/
		int num3 = 777;
		System.out.println(num3/10*10+1 );
		
		/*
		[3-6] 아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을 뺀 나머지를 구하는 코드이다. 예를 들어, 24의 크면서도 가장 가까운 10의 배수는 30이다. 
		19의 경우 20이고, 81의 경우 90이 된다. 30에서 24를 뺀 나머지는 6이기 때문에 변수 num의 값이 24라면 6을 결과로 얻어야 한다. (1)에 알맞은 코드를 넣으시오.
			[Hint] 나머지 연산자를 사용하라.
			[연습문제]/ch3/Exercise3_6.java
			class Exercise3_6 {
			public static void main(String[] args) {
				int num = 24;
				System.out.println( (1) );   답: (num/10*10+10)%num
				
				답:
				(num/10 + 1) * 10 - num;
				10-(num4%10)
				(num4/10*10+10)%num4
				
				}
			}
		 */
		
		int num4 = 24;
//		System.out.println((num4/10*10+10)%num4);
		System.out.println(10-(num4%10));
		
		/*
		[3-7] 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다. 변환공식이 'C =5/9 ×(F - 32)'라고 할 때, (1)에 알맞은 코드를 넣으시오.
		단, 변환 결과값은 소수점 셋째자리에서 반올림해야한다.(Math.round()를 사용하지 않고 처리할 것)
			[연습문제]/ch3/Exercise3_7.java
			class Exercise3_7 {
				public static void main(String[] args) {
					int fahrenheit = 100;
					float celcius = ( (1)  );
					System.out.println("Fahrenheit:"+fahrenheit);
					System.out.println("Celcius:"+celcius);
					
					c = 5/9f * (f - 32)
					c=  5/9f * 68
					소수점 셋째자리에서 반올림해야하니
					c = 37.777 * 100 + 0.5  => 3777.7 + 0.5 = 3778.2
					둘째자리까지 필요하니 정수형으로 변환
					c = (int)3778.2 =>3778
					이제 소수점 둘째자리까지 맞춰줌
					c = 3778 / 100f
					System.out.println(c); = 37.78
				}
			}
		 */
		
		int fahrenheit = 100;
		float celcius = (int)( 5/9f * (fahrenheit -32) * 100 + 0.5 ) / 100f;
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
		
		/*
		[3-8] 아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오.
		[연습문제]/ch3/Exercise3_8.java
		class Exercise3_8 {
			public static void main(String[] args) {
				byte a = 10;
				byte b = 20;
				byte c = a + b;  = int로 형변환되어 계산 , 계산결과를 byte로 다시 형변환 시켜줘야함
				char ch = 'A';
				ch = ch + 2;  = int로 형변환되어 계산 , 계산결과를 char로 다시 형변환 시켜줘야함
				float f = 3 / 2; =int/int이므로 int값이 저장, 뒤에 나눠주는 수를 실수로 만들어줘야한다& float으로 형변환
				long l = 3000 * 3000 * 3000; =계산값이 long의 범위를 벗어나므로 롱으로 선언해줘야한다.
				float f2 = 0.1f;
				double d = 0.1;
				boolean result = d==f2; = double과 float비교하는데 더큰 타입 double을 기준으로 계산되기떄문에 double에 float값을 저장시켜준다.
				System.out.println("c="+c);
				System.out.println("ch="+ch);
				System.out.println("f="+f);
				System.out.println("l="+l);
				System.out.println("result="+result);
				
				
				c=30
				ch=C
				f=1.5
				l=27000000000
				result=true
			}
		}
		 */
		
		byte a = 10;
		byte b = 20;
		byte c = (byte) (a + b);	
		char ch = 'A';
		ch = (char) (ch + 2);
		float f = (float) 3 / 2;
		long l = 3000L * 3000L * 3000L;
		float f2 = 0.1f;
		double d = 0.1f;
		boolean result = d==f2;
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
		
		/*
		[3-9] 다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 변수 b의 값이 true가 되도록 하는 코드이다. 
		(1)에 알맞은 코드를 넣으시오.
		[연습문제]/ch3/Exercise3_9.java
		class Exercise3_9 {
			public static void main(String[] args) {
				char ch = 'z';
				boolean b = ( (1) );  
				System.out.println(b);
			}
		}
		
		'a'<=ch2 && ch2<='z'||'A'<=ch2 && ch2<='Z' 영문자일때 true가 나오는 조건식
		영문자 이거나 숫자일때 이므로
		숫자일때 true 식은
		'0'<=ch2 && ch2<='9'
		2개를 합치면
		'a'<=ch2 && ch2<='z'||'A'<=ch2 && ch2<='Z' || '0'<=ch2 && ch2<='9'
		 */
		
		char ch2 = 'z';
		boolean b2 = ('a'<=ch2 && ch2<='z'||'A'<=ch2 && ch2<='Z' || '0'<=ch2 && ch2<='9');
		System.out.println(b2);
		
		/*
		[3-10] 다음은 대문자를 소문자로 변경하는 코드인데, 문자 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경한다. 
		문자코드는 소문자가 대문자보다 32만큼 더 크다. 예를들어 'A‘의 코드는 65이고 ’a'의 코드는 97이다. (1)~(2)에 알맞은 코드를 넣으시오.
		[연습문제]/ch3/Exercise3_10.java
		class Exercise3_10 {
			public static void main(String[] args) {
				char ch = 'A';
				char lowerCase = (  (1)  ) ? (  (2)  ) : ch;
				System.out.println("ch:"+ch);
				System.out.println("ch to lowerCase:"+lowerCase);
			}
		}
		 */
		
		char ch3 = 'A';
		char lowerCase = ('A'<=ch3 && ch3<='Z') ? (char)(ch3+32) : ch3;
		System.out.println("ch:"+ch3);
		System.out.println("ch to lowerCase:"+lowerCase);
	}
}
