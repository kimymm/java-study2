package chap01;

public class Ex13ifStatement {
	public static void main(String[] args) {
		char grade = ' ';
		int score = 92;
		
//이제 점수비교를 할것입니다.
		if(score >= 90) { //한줄이면 블락생략해도 되지만, 한줄이래도 쓰는 걸 추
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		}
		
		System.out.println("학점은 " + grade + "입니다.");
		
	}
}
