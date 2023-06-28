package chap01;

public class Ex08ArithmeticOperator {

	public static void main(String[] args) {
		final int TIME = 20000; // 20000초
		int hour = TIME / 60 / 60;
		//int minutes = TIME / 60; // 전체 분인걸, 시간을 나누고 나머지의 분은..?
		int minutes = TIME / 60 % 60;
		int seconds  = TIME % 60 ;
		System.out.println(TIME + "초는 " + hour + "시간 " + minutes + "분 " + seconds + "초 입니다." ); //기본타입 + 객체?? 나중에, 아 문자를 더할수 있구나
	}

}
