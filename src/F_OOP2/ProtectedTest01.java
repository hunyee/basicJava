package F_OOP2;

import E_OOP.ProtectedTest03;

public class ProtectedTest01 extends ProtectedTest03{
	public static void main(String[] args) {
		ProtectedTest02 pt2 = new ProtectedTest02();
		pt2.b = 0;
		ProtectedTest03 pt3 = new ProtectedTest03();
		pt3.d = 0;
		ProtectedTest01 pt1 = new ProtectedTest01();
		pt1.c = 0;
	}
}
