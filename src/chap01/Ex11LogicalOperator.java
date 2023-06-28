package chap01;

public class Ex11LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// !(not)
		// ! true -> false
		// ! false -> true
		System.out.println(!(3 != 2));
		// &&(and, 논리곱)
		// true && false -> false
		// false && true -> false
		// false && false -> false
		// true && true -> true
		System.out.println(3 > 2+1&& 3 > 4); // 굳이 가로 안해도 산술이 가장 높다 모르면 가로 
		// ||(or, 논리합) 더하는것
		// true || false -> true
		// false || true -> true
		// false || false -> false
		// true || true -> true
		System.out.println(3 != 2 || -1 > 0); // deadcode: -1>0 이미 true인데 왜적었냐
		// ^ (xor, 배타적 논리합)
		// true ^ true -> true
		// flase ^ true -> 
		System.out.println(3 != 2 ^ -1 > 0);
		
		//bitwise 이미지 마스킹 별로 하지않는
	}

}
