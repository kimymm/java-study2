package chap01;

public class Ex27Break {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while(true) {
			if (sum > 500000) {
//				System.out.println(i);
				break;
			}
			sum += i;
			i = i + 1;
		}
		System.out.println("i: " + i);
		System.out.println("sum: " + sum);
	}
}
