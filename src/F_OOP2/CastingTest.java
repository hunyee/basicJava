package F_OOP2;

public class CastingTest {
	public static void main(String[] args) {
		
		FireCar fc = new FireCar();
		fc.water();
		
		Car c = fc; //up-casting
		c.drive();
		
		FireCar fc2 = (FireCar)c; //down-casting
		fc2.water();
		
//		FireCar fc3 = (FireCar)new Car(); //자식타입의 참조변수로 부모타입의 인스턴스를 참조할수 없다. 형변환으로 문법은 에러가 없지만 터짐
		
	}
}


class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("순천으로 가자");
	}
	
	void stop() {
		System.out.println("주차중 띠리리리리리리리리 띠리리리");
	}
}

class FireCar extends Car {
	void water() {
		System.out.println("물뿌려");
	}
}

class Ambulance extends Car {
	void AED() {
		System.out.println("200줄 차지");
	}
}