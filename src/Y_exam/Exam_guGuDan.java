package Y_exam;

public class Exam_guGuDan {
	public static <var> void main(String[] args) {
		
//		for(int i=2; i<5; i++) {
//			for(int j=1; j<4; j++) {
//				System.out.printf("%dx%d=%d\t",i,j,i*j);
//				if(j==3) {
//					System.out.println();
//					continue;
//				}
//			}
//				
//		}
		
//		for (int i = 1; i < 4; i++) {
//			for (int j = 2; j < 9; j++) {
//				System.out.printf("%dx%d=%d\t",j,i,j*i);
//				if(j==4) {
//					System.out.println();
//					j=j-2;
//					continue;
//				}
//				
//				if(j>=5) {
//					System.out.printf("%dx%d=%d\t",j,i,j*i);
//					if(j==7) {
//						System.out.println();
//						j++;
//						break;
//					}
//				}
//				
//				if(j>=8) {
//					System.out.printf("%dx%d=%d\t",j,i,j*i);
//					if(j==9) {
//						System.out.println();
//						j++;
//						break;
//					}
//				}
//			}
//		}
		
//		for (int i = 1; i < 4; i++) {
//			for (int j = 2; j < 10; j++) {
//				int a = j;
//				int b = i;
//				System.out.printf("%dx%d=%d\t\t",j,i,j*i);
//				if(j==4) {
//					System.out.println();
//				}
//			
//			}
//		} System.out.println(); 
		
		
		for (int i = 1; i < 4; i++) {
			for (int j = 2; j < 10; j++) {
			int a = j;
			int b = (i%3==0? 3 : i%3);
			System.out.printf("%dx%d=%d\t",a,b,a*b);
			if(a==4) {
				System.out.println();
			}
		
		}
		} System.out.println(); 
		
//		for (int i = 1; i < 4; i++) {
//			for (int j = 2; j < 5; j++) {
//				System.out.printf("%dx%d=%d\t\t",j,i,j*i);
//				if(j==4) {
//					System.out.println();
//				}
//			
//			}
//		} System.out.println(); 
//		
//		for (int i = 1; i < 4; i++) {
//			for (int j = 5; j < 8; j++) {
//				System.out.printf("%dx%d=%d\t\t",j,i,j*i);
//				if(j==7) {
//					System.out.println();
//				}
//			
//			}
//		} System.out.println(); 
//		
//		for (int i = 1; i < 4; i++) {
//			for (int j = 8; j < 10; j++) {
//				System.out.printf("%dx%d=%d\t\t",j,i,j*i);
//				if(j==9) {
//					System.out.println();
//				}
//			
//			}
//		} System.out.println();
		
	}
}
