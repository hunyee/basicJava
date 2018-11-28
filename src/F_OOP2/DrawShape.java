package F_OOP2;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DrawShape extends Frame{
//	private static final int[] Point = null;

	public static void main(String[] args) {
//		DrawShape ds = new DrawShape();
		DrawShape ds = new DrawShape("TITLE", 400, 400);
//		ds.paint(new Graphics()); //jvm에서는 실행하는걸로
//		Triangle tg = new Triangle(new Point(100,100),new Point(200,200),new Point(100,100));
	}
	
	@Override //Frame클래스에 있는 paint를 쓰는데, 그게 마음에 안들어서 다시 메서드 재정의 => ★오버라이드★
	public void paint(Graphics g) {
		//1. 원 객체를 만드세요 (매개변수 두개짜리 생성자를 이용해주세요)
		// 150,150  50
		Point p1 = new Point(150,150);
		Circle c = new Circle(p1, 50);
//		Circle cc = new Circle(new Point(150,150), 50);
//		Circle(Point center, int r) {
//			this.center = center;
//			this.r = r;
//		}
		
		//2. 원을 그려주세요 //앞에 인트2개는 원점, 뒤에두개는 지름
		//g.drwaOval(int, int, int, int)
//		g.drawOval(cc.center.x, cc.center.y, 2*(cc.r), 2*(cc.r));
		g.drawOval(c.center.x, c.center.y, 2*(c.r), 2*(c.r));
		
		//3. 삼각형 객체를 만드세요
		// 매개변수 하나짜리 생성자를 이용해주세요
		// 100,100  200,200  200,100
		Point p2 = new Point(100,100);
		Point p3 = new Point(200,200);
		Point p4 = new Point(200,100);
		Point[] pp = new Point[3];
		pp[0] = p2;
		pp[1] = p3;
		pp[2] = p4;
		
		Triangle tr = new Triangle(pp);
//		Point[] p = new Point[]{new Point(100,100), new Point(200,200), new Point(200,100)};
//		Triangle tr = new Triangle(p);
//		Triangle(Point[] p) { 
//			this.p = p;
//		}
		
		//4. 삼각형을 그려주세요
		// g.drawLine(int, int, int, int)
		g.drawLine(tr.p[0].x,tr.p[0].y,tr.p[1].x,tr.p[1].y);
		g.drawLine(tr.p[1].x,tr.p[1].y,tr.p[2].x,tr.p[2].y);
		g.drawLine(tr.p[2].x,tr.p[2].y,tr.p[0].x,tr.p[0].y);
	}
	
	DrawShape() {
		setTitle("열심히 하자"); //제목 만들어주는
		setSize(500, 500);
		setVisible(true);
		setBackground(Color.MAGENTA);
		setResizable(false);
		
//		addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.exit(0);
//			}
//		});
	}
	
	DrawShape(String title, int a, int b) {
		setTitle(title); //제목 만들어주는
		setSize(a, b);
		setVisible(true);
		setBackground(Color.CYAN);
		setResizable(false);
	}
	
}


class Point {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Circle { //extends 상속 ~는 ~이다
	//1. 점하나를 저장할 수 있는 변수 center를 선언하세요
	Point center;  //포함관계 ~는 ~를 가지고 있다.
	//2. 반지름(정수)을 저장할 수 있는 변수 r을 선언하세요
	int r;
	
	
	//3. 매개변수가 2개인 생성자를 만드세요 
	//	단, 매개변수 2개로 center와 r을 초기화해주세요
	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
	
	//4. 기본생성자를 만들어주세요
	//단 매개변수가 두개인 생성자를 이용하여 점(50,50)으로 반지름은 100으로 만들어주세요
	Circle() {
		this(new Point(50,50), 100);
	}
	
}

class Triangle { 
	//1. 점3개를 저장할수 있는 변수 p를 선언하세요
	Point[] p;
	
	//2. 매개변수가 하나인 생성자를 만드세요
    //단 매개변수의 값으로 p를 초기화해주세요
	Triangle(Point[] p) { 
		this.p = p;
	}
	
	//3. 매개변수 세개인 생성자를 만드세요
	//단 매개변수 세개로 p를 초기화해주세요
	Triangle(Point a, Point b, Point c) {
//		this.p = new Point[3];
//		this.p[0] = a;
//		this.p[1] = b;
//		this.p[2] = c;
		this.p = new Point[]{a, b, c};
	}
	
}



