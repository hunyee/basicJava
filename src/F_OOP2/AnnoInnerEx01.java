package F_OOP2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnnoInnerEx01 {
	public static void main(String[] args) {
		Button b = new Button();
		ActionListener a = new EventHandler(); //인터페이스의 다형성
		b.addActionListener(a);
	}
}

class EventHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼눌림");
	}
	
}