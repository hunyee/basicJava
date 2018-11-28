package F_OOP2;

public class PointTest {
	public static void main(String[] args) {
		Point3D p3d = new Point3D(10, 20, 30);
	}
}

class Point2{
	
	int x;
	int y;
	
	Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point2 {
//	int x;
	int z;
	Point3D(int x, int y, int z) {
		super(x,y);
//		this.x = 100; //이 인스턴스 내에 x가 없으면 부모에서 찾음, x가 있으면 자식클래스의 x를 변경
		super.y = 200;
		this.z = z;
	}
}