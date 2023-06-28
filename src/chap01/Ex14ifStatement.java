package chap01;

public class Ex14ifStatement {
	public static void main(String[] args) {

		int n1 = 100;

		int n2 = 30;
		System.out.println("---초기값---");
		System.out.println("n1:" + n1);
		System.out.println("n2:" + n2);

		// Q1: n1값이 항상 큰 값이 되도록, 필요할 경우 n1과 n2를 교체하라.
		if(n1 < n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp; 
		}
		System.out.println("n1: " + n1);

		System.out.println("n2: " + n2);
		
		

//		// Q2: 최대값을 판별하는 조건을 완성해 보세요.
//
//		int a1 = 20;
//
//		int a2 = 10;
//
//		int a3 = 50;
//
//		if (a1 >= a2) {
//
//		} else {
//
//		}

		}
}
