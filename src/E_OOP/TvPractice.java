package E_OOP;

public class TvPractice {
	public static void main(String[] args) {
		String color = Tv1.color;
		System.out.println(color);
		color = "Magenta";
		System.out.println(color);
		
		Tv1.changeColor();
		System.out.println(Tv1.color);
		
		Tv t = new Tv();
		System.out.println(t.power);
		t.power();
		System.out.println(t.power);
		t.channel = 16;
		t.channelUp();
		System.out.println(t.channel);
	}
}

class Tv1{
	static String color;
	
	int channel;
	boolean power;
	static void changeColor() {
		color = "green";
	}
	void power() {
		power = !power;
	}
	void channelUp(){
		channel++;
	}
}