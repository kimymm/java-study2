package chap01;

public class Ex25Continue {
	public static void main(String[] args) {
//		for(int i = 1; i<=20; i+=2) {
//			System.out.println(i);
//		}
		for(int i = 1; i<=20; i++) {
			if(i % 2 ==0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
