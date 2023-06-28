package chap01;

public class Ex30Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[10] a; 오류, int i;한다고 4바이트잡히는 것이 아니다, 잡힐때는 실제 값을 넣을때, 인식하는 것이다.
		//int[10] 값을 넣는 것이 아니다, 인식만하는 곳, int i 와 같은 맥락,
		// 선언 시 크기를 지정할 수 없다.
		int a1[] = new int[10]; //비추
		int[] a2 = new int[10]; //추천
		System.out.println(a1.length);
		System.out.println(a2.length);
		
		//초기화법 , 여러가지
		//초기화(1)
		int[] a3 = {0, 1, 2, 3, 4}; //new없이? 편의를 보는 코드
		// String s = "hello" 객체는 new를 통해서만 만들수 있지, 편의를 바주는 것
		// String s = new String("hello");
		//명시적보다 암시적을 별로고 명시적이 좋다고 한다. {}보다, new int[] {}와 같이
		System.out.println(a3); // ?reference값 
		//주소는 jvm에서 철저하게 안보여준다. 보이는게 주소값은 아님
		System.out.println(a3.length);
		
		//초기화(2)
		int[] a4 = new int[5];
		// a.~ / a[0] 로 접근.
		a4[0] = 0;
		a4[1] = 1;
		a4[2] = 2;
		a4[3] = 3;
		a4[4] = 4;

//		for(int k = 0; k < a4.length; k++) {
//			a4[k] = k;
//		}
		System.out.println("a4.length : " + a4.length);
		
		//초기화(3)
		int[] a5 = new int[] {0, 1, 2, 3, 4};
		//사용1 : 랜덤 접근
		//s.price = 2000; sysout(s.price); s.m(); :메소드부르기
		//객체지향의 원칙에 안좋은 예는 앞의 두개의 것들,
		// 정보은닉의 원칙에 메소드로 접근해야한다.
		//a[0] = 0; 이건 메소드가 없는것
		
		System.out.println(a4[3]);
		
		//사용2 : 순회 iteration 
		for(int i = 0; i < a5.length; i++) {
			System.out.println(a5[i]); //조건식에 = 붙이면 out of bound, 오류
		}
		//안보면 수백개는 있고, 
		
		
		//String[] args 여기가 배열이네? 
	}

}
