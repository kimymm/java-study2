package chap01;

public class Ex07Arith{

public static void main(String[] args){

int a = 3;
int b = 7;

//unary operator 단항연산자
	System.out.println(-a);
	
	++a;
	// a+= 1;
	// a = a+1; 어렵게 짜는 것보다 이렇게가 낳지
	System.out.println(a);
	
	a++;
	System.out.println(a);
//	System.out.println(a++);
//	 a = a + 1;
	System.out.println(++a); // 6
	
	--a;
	System.out.println(--a); //6
	System.out.println(a); //
	
	//이해가 안가면 a= a  + 1, sysout(a) 을 써라
	
	
}

}
