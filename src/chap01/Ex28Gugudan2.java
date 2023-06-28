package chap01;

public class Ex28Gugudan2 {

	public static void main(String[] args) {
		//1~9
		System.out.println("hello World");//print line "\n"개행문자 helloworldㅇ하고 개행을 붙여준다
		System.out.print("hello world\n" + "\n");
		System.out.println("=========="); //왜 println
		
		System.out.print("1 x 1 = 1");
		System.out.print("\t");
		System.out.print("2 x 1 = 2");
		
		System.out.println("\n");
		System.out.print("1 x 2 = 1");
		System.out.print("\t");
		System.out.print("2 x 2 = 4");
		System.out.println();
		for(int i = 1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.print(j + "x" + i + "=" + j*i + "\t");
			}
			System.out.println();
		}
	}

}
