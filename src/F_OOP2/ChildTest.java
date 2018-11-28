package F_OOP2;

public class ChildTest {
	public static void main(String[] args) {
		
		Child c1 = new Child();
		
		c1.channel = 10;
		c1.channelUp();
		System.out.println(c1.channel);
		
		c1.volume = 5;
		c1.volumeUp();
		System.out.println(c1.volume);
		
		
	}
}

class Parent {
	int volume;
	void volumeUp() {
		volume++;
	}
}

class Child extends Parent {
	int channel;
	int volume;
	void channelUp() {
		channel++;
	}
}