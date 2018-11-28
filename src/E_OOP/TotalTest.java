package E_OOP;

public class TotalTest { //TotalTest가 Method Area에 로드된다. 클래스 변수, 클래스 메서드 와 같이 로드됨 , 클래스메서드 main()만 있으므로 TotalTest( main() )로드됨
	public static void main(String[] args) { //main()호출하므로 Call Stack에 main()가 쌓인다.

		TvMaker.color = "Blue"; // TvMaker클래스를 로드시킨다. => TvMaker의 멤버변수 color 의 값에 "blue"를 대입한다.
		TvMaker tm = new TvMaker(); //Tvmaker클래스를 참조하는데 이미 Tvmaker가 Method Area에 로드되어 있으니 가져다쓰고 tm 이라는 지역변수를 만든다. 그 tm에 new를통해 인스턴스가 생성된다. 그리고 TvMaker안에 인스턴스친구들이 tm의 주소가 된다.  
		tm.age = 30; // 25 => 30 // 인스턴스가 생성되면서 생성자로 인해 25로 초기화 => 만들어진 인스턴스 tm을 통해 TvMaker의 인스턴스 변수 age를 찾아 tm.age 주소에 30을 저장한다.  
		// 3. 메서드 호출
		// 3.1 
		System.out.println(TvControll.channel); //TvControll 클래스를 M.A에  클래스 친구들과 같이 로드시킨다. TvControll(MAX_CHANNEL = 50, MIN_CHANNEL = 1, channel = 15, volumeDown())
		//그리고 그 로드되어진 클래스 안에서 channel의 값을 출력 // channel = 15
		TvControll.volumeDown(); //TvController클래스 안에 클래스 메서드 volueDown()메서드를 호출되므로 콜스텍에 쌓인다 //channel = 16
		System.out.println(TvControll.channel); //이미 로드되어진 TvController클래스에서 클래스 변수 channel의 값 출력  = 16

		// 3.2 
		TvControll tc; //TvControll를 참조하는 tc 지역변수 생성 
		tc = new TvControll(); //new를통해 tc의주소 생성 TvControll클래스의 인스턴스 친구들 주소에 담음 그리고 TvControll()생성자가 콜스택에 쌓이고 퇴근
		System.out.println(tc.volume); //tc 볼륨 출력 99
		tc.volumeUp(); //tc.volumeUp() 호출 콜스택에 쌓임 volunme =100
		System.out.println(tc.volume); //100출력
		tc.volumeUp(); //tc.volumeUp() 호출 콜스택에 쌓임 volunme = 0
		System.out.println(tc.volume); //0출력

		
		Calc2 cc = new Calc2(); // Calc클래스와 클래스친구들을 MA에 로드시킨다. => 인스턴스화를 통해 주소를 만들고 Calc클래스의 인스턴스 친구들 같이 주소에 저장 Calc()생성자 메서드 콜스택에 쌓이고 퇴근
		System.out.println(cc.add(Integer.MAX_VALUE, 4)); //cc.add(int, int)호출 콜스택에 쌓임 //  -(인트 최저값) + 3 출력
		System.out.println(cc.add(3L, Integer.MAX_VALUE)); //cc.add(long, int)호출 콜스텍에 쌓임  // 인트최대값+4출력
		
		
	}//메인메서드 종료 퇴근 콜스택 메모리 비워짐
} //Method Area 비워짐, G.C로 남아있는 heap메모리 비움

class TvMaker {
	// 1. 클래스를 찾으면 클래스 변수와, 클래스 메서드를 같이 Method Area에 로드시킨다 TvMaker(color, inch)가 Method Area에 로드 
	// 1.1 전역변수에는 color, inch, name, age가 있다.
	static String color;
	static int inch;
	// 1.2 인스턴스화를 통해 인스턴스 tm의 주소에 인스턴스 변수와 인스턴스 메서드가 같이 heap메모리에 생긴다. 생성자도 메서드이므로 같이 주소에 저장된다. tm(name=""=>"man", age=0=>25, TvMaker(),TvMaker(String, int))
	String name = "";
	int age;

	// 2. 인스턴스가 생성될때 호출되는 인스턴스 초기화 메서드, 생성자는 리턴값이없다.
	// 2.1 인스턴스가 생성되었으므로 TvMaker 메서드가 호출되고 tm의 인스턴스변수 name의 주소에 "man"을, 인스턴스변수 age의 주소에 25의 값으로 초기화하고 퇴근
	TvMaker() {
		this("man", 25);
	}

	// 2.2 TvMaker() 생성자 
	TvMaker(String name, int age) { //아래를 수행하고 퇴근
		this.name = name; //지역변수를 찾아보고 전역변수를 찾음, TvMaker에 전역변수 name에 인자값을 받은 매개변수 name을 대입
		this.age = age; //TvMaker에 전역변수 age에 인자값을 받은 매개변수 age을 대입
	}
}

class TvControll {
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	static final int MAX_CHANNEL = 50;
	static final int MIN_CHANNEL = 1;

	static int channel = 15;
	int volume = 99;

	// 4. return문
	int volumeUp() { //20번줄호출 //22번줄 호출
		if (volume == MAX_VOLUME) { //22번줄 수행 
			volume = MIN_VOLUME;  
		} else { //20번줄수행
			volume++;
		}

		return volume; //volume 리턴하고 퇴근 
	}

	static int volumeDown() { //클래스변수 호출로인해 수행 channel의 값이 15이므로 channel++ 수행하고 channel 리턴하고 종료
		if (channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		} else {
			channel++;
		}
		return channel;
	}
}

class Calc2 { 
	// 5. 27번줄 인스턴스 메서드 호출로 인해 실행 인자값으로 인트최고값과 4를 더해서 출력
	int add(int a, int b) { //Integer.MAX_VALUE, 4 
		return a + b; //인트최고값과 4를 더하면 오버플로우 되어 -(인트 최저값) + 3리턴
	}
	//28번줄 호출되어 실행
	long add(long a, int b) { //인자값으로 3L, Integer.MAX_VALUE
		return a + b; // 반환타입이 롱이므로 롱타입 인트최대값+4 리턴하고 퇴근
	} 

	int minus(int a, int b) {
		return a + b;
	}
}