package E_OOP;

public class Random_excp {
	public static void main(String[] args) {
		int[] array = {
//				1,
//				2,
				3,
				4,
				5,
				6,
//				7,
//				8,
//				9,
//				10,
//				11,
//				12,
//				13,
				14,
//				15,
//				16,
//				17
				19,
				25
		};
		
		int a = (int)(Math.random()*array.length);
		System.out.println(array[a]);
	}
}
