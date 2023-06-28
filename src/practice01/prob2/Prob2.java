package prob2;

public class Prob2 {
	public static void main(String[] args) {
		/* 코드 작성 */
		int num = 10;
		for(int i = 1; i <= 10; i++) {
			for(int j = num-9; j <= num; j++) {
				
				System.out.print(j);
			
			}
			System.out.println();
			num++;
		}
	}
}
