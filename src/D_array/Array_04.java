package D_array;

public class Array_04 {
	public static void main(String[] args) {
		// 6명의 이름을 저장할 수 있는 변수
		String[] name = new String[]{"정창훈", "가나다", "라마바", "사아자", "차카타", "자바하"};
		
		// 7과목을 저장할 수 있는 변수;
		String[] subject = new String[]{"국어", "영어", "수학", "사회", "과학", "오라클", "자바"}; 
		
		//1. 6명의 7과목을 저장할 수 있는 변수 score를 선언 및 생성해주세요.
		int[][] score = new int[name.length][subject.length];
		// 6명의 이름을 저장할 수 있는 변수
		

		//2. score의 각방을 0~100점 사이의 랜덤한 정수값을 저장해주세요.
//		score[0][0] = (int)(Math.random()*101+0);
//		score[0][1] = (int)(Math.random()*101+0);
//		score[0][2] = (int)(Math.random()*101+0);
//		score[0][3] = (int)(Math.random()*101+0);
//		score[0][4] = (int)(Math.random()*101+0);
//		score[0][5] = (int)(Math.random()*101+0);
//		score[0][6] = (int)(Math.random()*101+0);
		for (int i = 0; i < score.length; i++) {  //0행부터 시작
			for (int j = 0; j < score[i].length; j++) { //0열부터 시작
				score[i][j] = (int)(Math.random()*101+0); //0행0열에 랜덤값 출력
			}
		}
		
		//한사람당 과목 총점수 합계
		int[] nameSum = new int[name.length];
		for (int i = 0; i < name.length; i++) { //이름길이까지 반복
			for (int j = 0; j < subject.length; j++) { //과목길이만큼 반복
				nameSum[i] += score[i][j];
			}
		}
		
		//한사람당 과목 합계 평균
		float[] nameAvg = new float[name.length];
		for (int i = 0; i < name.length; i++) { //이름길이까지 반복
			nameAvg[i] = (int)(nameSum[i]/(float)subject.length*100+0.5)/100f;
		}
		
		//과목별 합계
		int[] subSum = new int[subject.length];
		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < subject.length; j++) {
				subSum[j] += score[i][j]; 
			}
		}
		//과목별 평균
		float[] subAvg = new float[subject.length];
		for (int j = 0; j < subject.length; j++) {
			subAvg[j] = (int)(subSum[j]/(float)name.length*100+0.5)/100f;
		}
		
		//사람별석차 RANK
		int[] rank = new int[name.length];
			for (int j = 0; j < name.length; j++) {
				int cnt = 0;
				for (int k = 0; k < name.length; k++) {
					if(nameSum[j]<nameSum[k]) {
						cnt++;
					}
				}
				rank[j] = cnt+1;
			}
			
		//RANK별 정렬	
			
		
		//3. 과목명 출력
		for (int i = 0; i < subject.length; i++) {
			System.out.print("\t" + subject[i]);
		}
		System.out.print("\t" + "합계"); 
		System.out.print("\t" + "평균");
		System.out.print("\t" + "석차");
		System.out.println();
		
//		점수출력
		for (int i = 0; i < score.length; i++) { //행의개수만큼
			System.out.print(name[i] + "\t"); //이름출력
			for (int j = 0; j < score[i].length; j++) { //열의개수만큼
				System.out.print(score[i][j] + "\t");
			}
			System.out.print(nameSum[i]+"\t");  //한사람의 총점수
			System.out.print(nameAvg[i]+"\t"); 		//한사람 평균
//			for (int k = 0; k < rank.length; k++) {
//				if(nameSum[i]<nameSum[k]) {
//					cnt++;
//				}
//				rank[k] = cnt;
//			}
			System.out.print(rank[i]);
			System.out.println();
		}
		
		System.out.print("과목합계");
		
		//과목별 합계 출력
		for (int i = 0; i < subject.length; i++) {
			System.out.print("\t" + subSum[i]);
		}
		System.out.println();
		System.out.print("과평균");
		
//		과목별출력
		for (int i = 0; i < subject.length; i++) {
			System.out.print("\t" + subAvg[i]);
		}
		
		
		
		
		
	}
}
