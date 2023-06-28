package chap01;

public class MainParameters {

	public static void main(String[] args) {
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]); // 아무것도 안나옴 $ java Mainparams 뒤에 아무것도 없음
			//command line에서 인수를 주는방법, eclipse에서 주느 방법
			// java MainParams Hello World , 두개를 주는 것
			//만일 copy프로그램을 만들었다면
			//java api 때 copy program만들 예정
			
		}
	}

}
