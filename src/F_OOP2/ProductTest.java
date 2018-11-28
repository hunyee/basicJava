package F_OOP2;

import java.util.Vector;

public class ProductTest {
	public static void main(String[] args) {
		
		Tv2 t2 = new Tv2("LGTV", 700);
//		System.out.println(t2); //t2인스턴스의 주소 t2.toString(), => toString()생략
		NoteBook nb = new NoteBook("Mac", 400);
		MicroWave mw = new MicroWave("LG렌지", 200);
		
		Buyer b = new Buyer("정창훈", 10000);
		
		b.buy(t2);
		b.buy(nb);
		b.buy(mw);
		b.summary();
		
		//호갱님의 잔여금은 xxx이고 보너스 포인트는 xxx입니다.
//		System.out.println("처음 산 물품 : " + b.item.get(0));
//		System.out.println("호갱님의 남은돈 : " + b.money);
//		System.out.println("호갱님의 포인트 : " + b.bonusPoint);
		b.refund(t2);
		b.summary();
		
	}
}

class Product {
	
	String name;
	int price;
	int bonusPoint;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
		bonusPoint = price/10;
	}
}

class Tv2 extends Product{
	Tv2(String name, int price) {
		super(name, price);
	}

	@Override //alt + shift + s => s => enter
	public String toString() {
		return name;
	}
	
}

class NoteBook extends Product{
	NoteBook(String name, int price) {
		super(name, price);
	}

	@Override //alt + shift + s => s => enter
	public String toString() { //오버라이딩
		return name;
	}
	
}

class MicroWave extends Product{
	MicroWave(String name, int price) {
		super(name, price);
	}

	@Override //alt + shift + s => s => enter
	public String toString() {
		return name;
	}
	
}

class Buyer {
	String name;
	int money;
	int bonusPoint;
	Vector<Product> item = new Vector<Product>(); //<>안쓰면 Object타입 , <Product> => Product 타입으로 변환
	
	Buyer(String name, int money) {
		this.name = name;
		this.money = money;
	}
	

	void buy(Product p) {
		if(money < p.price) {
			System.out.println("꺼져 " +money+"으로 못사");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "를 구매하셨습니다."); //자식에 있는 toString() 호출 , - 참조변수의 타입에 영향을 받지 않는 것은 인스턴스 메서드 뿐이다.
		item.add(p);
		
//		System.out.println("호갱님의 남은돈 : " + money);
//		System.out.println("호갱님의 포인트 : " + bonusPoint);
	}
	
	//1. 반품 refund()
	//단 구매물품이 한개도 없으면 "구매하신 물품이 없습니다"
	//구매물품은 있으나 우리 매장에서 산게 아니다.
	void refund(Product p) {
		if(item.isEmpty()) {
			System.out.println("구매하신 물품이 없습니다");
			return;
		} 
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p+"를 반품하셨습니다.");
		} else {
			System.out.println("그런 물건 사신적 없습니다. 사기치지마세요");
		}
		
//		for (int i = 0; i < item.size(); i++) { 있는거 다지우는거, nb를 3개샀을때 for문을 돌면서 다 삭제
//			if(item.get(i) == p) {//item.get(i).equals(p)도 가능
//				Product p2 = (Product)item.remove(i); //(p) p를 매개변수로 준다면 노트북3개샀을때 다 삭제
//				money += p2.price;
//				bonusPoint -= p2.bonusPoint;
//				System.out.println(p2+"를 반품하셨습니다.");
//				return;
//			}
//		}
		
//		if(item.contains(p)) { //반품하려고 하는 객체를 포함하고 있으면 tre
//			
//			item.remove(p);
//			System.out.println(p.name+"을 반품하셨습니다" +" 금액 " + p.price+ "이 환불되셨습니다");
//			System.out.println("포인트 " + p.bonusPoint+ "점이 사라집니다");
//			money += p.price;
//			bonusPoint -= p.bonusPoint;
//		}
	
	}

	//2. 영수증 summary()
	/*
	 	영	수	증
	 	
	구매물품	LGTV	700만원
			Mac		400만원
			LG레인지	200만원
	총 구매 금액           1300만원
	고객님의 남은돈        8700만원
	         포인트         130만원
	         
	또 오십시요 호갱님~ 
	 */
//	void summary() {
//		System.out.println();
//		System.out.println("*********************************");
//		System.out.println("\t영\t수\t증");
//		System.out.println();
//		System.out.print("구매물품\t");
//		for (int i = 0; i < item.size(); i++) {
//			Product p = (Product)item.get(i);
//			System.out.println(item.get(i)+ "\t\t" + p.price+"만원");
//			System.out.print("\t");
//		}
//		System.out.println();
//		System.out.println("고객님의\t남은돈\t\t" + money+"만원");
//		System.out.println("\t포인트\t\t " + bonusPoint+"만원");
//		System.out.println();
//		System.out.println("또 오십시요 호갱님~~~");
//		System.out.println("*********************************");
//	}
	void summary() {
		System.out.println("\t영\t수\t증");
		System.out.print("구매물품");
		int sum=0;
		for (int i = 0; i < item.size(); i++) {
			System.out.println("\t"+((Product)item.get(i)).name+"\t"+((Product)item.get(i)).price+"만원"); //캐스팅연산자보다 .이 우선 => 
			sum += ((Product)item.get(i)).price;
		}
		System.out.println("총 구매 금액 \t"+sum+"만원");
		System.out.println("\n고객님의 남은돈 : \t"+money+"만원");
		System.out.println("고객님의 포인트 : \t"+bonusPoint+"만원");
		System.out.println("또 오십시요 호갱님");
	}
	
}
//3. 사람 여러명을 관리할 수 있는 클래스를 작성해주세요.
//사람은 이름으로 구분

//4. 물품을 관리할 수 있는 클래스를 만드세요. 
//한개씩 구매가 아님 여러개 구매, 영수증도 바꾸자