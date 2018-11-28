package D_array;

import java.util.Arrays;

public class Select_sort {
	public static void main(String[] args) {
//		int[] a = {5,2,3,1,4};
//		int b,j;
//		for(int i = 1 ; i < a.length ; i ++) {
//			b = a[i];
//			for(j = i-1 ; j >= 0 && a[j] > b; j --) {
//				a[j+1] = a[j];
//			}
//			a[j+1] = b;
//		}
//		
//		for(int i = 0 ; i < a.length ; i ++) {
//			System.out.println(a[i]);
//		}
		
		int[] array = {5,2,3,1,4};
         
        int temp = 0;
        int j = 0;
         
        for(int i=1; i<array.length; i++){
            temp = array[i]; // 삽입대상 임시 저장.
            j = i; //index 임시저장
            while(j > 0 && temp < array[j-1]){ //삽입대상이 정렬된 대상들보다 작은 경우가 있는 경우 
                array[j] = array[j-1]; //밀기
                j--; //다음 비교를 위해 인덱스 이동
            }
            array[j] = temp; //최종으로 삽입될 위치에 삽입대상 삽입
            System.out.println((i)+"회전 select sort result : " + Arrays.toString(array));    
        }
        
        
        
	}
}
