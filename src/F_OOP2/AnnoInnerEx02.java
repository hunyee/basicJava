package F_OOP2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnnoInnerEx02 {
	public static void main(String[] args) {
		Button b = new Button();
		
		b.addActionListener(new ActionListener() { //익명클래스
//			클래스를 만들고 implements를 해야되지만 addAcionListener에 클래스를 만들지 않고바로 바로 객체생성을 하여 메서드를집어넣어 클래스를 여러개 만들지 않고 호출하게함
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼눌림");
			}
		});
		
	}
}
