package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		/* 코드 작성 */
		System.out.print("숫자를 입력하세요: ");
		int num, sum = 0;
		num = scn.nextInt();
		// 방법1
//		if(num % 2 ==0) {
//			for(int i=0; i <= num; i+=2) {
//				sum += i;
//			}
//		} else {
//			for(int j =1; j <= num; j+=2) {
//				sum += j;
//			}
//		}
//		System.out.println(sum);
		
		//방법2
		for(int k = num % 2; k <= num; k+=2) {
			sum += k;
		}
		System.out.println(sum);
		scn.close();
	}
}
