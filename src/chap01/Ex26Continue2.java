package chap01;

public class Ex26Continue2 {
	public static void main(String[] args) {
		testFor();
		// while문에서 continue 구문을 사용할 때는 조건 변경을 신경써야한다.
		testwhile();
	}
		public static void testFor() {
			System.out.println("!!!!!");
			for(int i = 0; i < 10; i++) {
				if(i % 2 != 0) {
					continue;
				}// 올라가면 i++
				System.out.println(i);
				
			}
		}
		public static void testwhile() {
			int i = 0;
			while(i < 10) {
				if(i % 2 != 0) {
					continue;
				}
				System.out.println(i);
				i++;
				
			}
		}
}
