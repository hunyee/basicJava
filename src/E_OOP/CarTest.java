package E_OOP;

public class CarTest {
	public static void main(String[] args) {
		
		Car c1 = new Car();
		
		Car c2 = new Car("red", "auto", 2);
		
		Car c3 = new Car("yellow", "auto");
		
	}
}

class Car {
	String color;
	String gearType;
	int door;
	
	Car() {
		color = "black";
		gearType = "stick";
		door = 4;
	}
	
//	Car(String color, String gearType) {
//		this(); //생성자내에서 다른생성자를 호출할때, 단 조건, 무조건 생성자의 첫줄에 써야함
////		this("", "", 2); //밑에있는 매개변수가 있는 생성자 호출
//		this.color = color; //지역변수 찾아보고 전역변수찾음
//		this.gearType = gearType; //this. 이 인스턴스에 gearType이란 변수
//	}
	
	Car(String color, String gearType) {
		this();
		this.color = color; //지역변수 찾아보고 전역변수찾음
		this.gearType = gearType; //this. 이 인스턴스에 gearType이란 변수
	}
	
	Car(String color, String gearType, int door) {
		this.color = color; //지역변수 찾아보고 전역변수찾음
		this.gearType = gearType; //this. 이 인스턴스에 gearType이란 변수
		this.door = door;
	}
}