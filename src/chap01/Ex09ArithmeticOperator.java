package chap01;

public class Ex09ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10. / 3.); // 산술연산결과는double
		System.out.println(10. / 3); // 산술결과는 double
		System.out.println(10/ .3);  // 산술결과는 double
		System.out.println(10 / 3); // int
		
		//
		System.out.println((double)10 / 3); // casting 가장우선순위 10. / 3
		System.out.println((double) (10/ 3)); // int로 연산 후 double casting
		
		//헷갈리는
		System.out.println(44 % 3); // 2
		System.out.println(-7 % 3); // ? -1 몫 -2, 나머지 -1 나눠진수의 가까운수
		System.out.println(7 % -3); // 1 ?? -6이니 7-6 = 1
		
		//관계연산 true or false
		//논리연산
	}

}
