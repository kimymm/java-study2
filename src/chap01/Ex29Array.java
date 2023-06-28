package chap01;

public class Ex29Array {

	public static void main(String[] args) {
		//점수를 내는 표현
		int score01 = 90;
		int score02 = 90;
		int score03 = 90;
		int score04 = 90;
		int score05 = 90;
		int score06 = 90;
		int score07 = 90;
		int score08 = 90;
		int score09 = 90;
		int score10 = 90;
		int score11 = 90;
		int score12 = 90;
		int score13 = 90;
		int score14 = 90;
		int score15 = 90;
		int score16 = 90;
		int score17 = 90;
		int score18 = 90;
		int score19 = 90;
		int score20 = 90;

		int sum = score01 + score02 + score03 + score04 + score05 + score06 + score07 + score08 + score09 + score10;
		double average = (double) (sum/10);
		System.out.println("평균: " + average);
		
		//배열
		int[] scores = new int[10]; //정적
		int[] scores1 = new int[] {90, 60}; 
		
		//sum은 어떻게? for문을 돌릴 생각이 퍼뜩나야한다. 이걸요구한다.
		int sum2 = 0;
		for(int i =0; i < scores1.length; i++) {
			sum2 += scores1[i];			
		}
		double average2 = sum2 / scores.length;
		System.out.println("sum : " + sum2);
		
		for(int j =1; j <= 20; j++) {
			int[] scores2 = new int[] {}
		}
		
	}

}
