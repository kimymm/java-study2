package chap03;

public class Student extends Person {
	//필드 생성
	private String major;
	private int grade;
	
	public Student() {
//		super(); // 명시함 뒤에다 넣을 시 에러, 자동으로 해주기 때문에 적을 필요도 없음
		//안적어도 좋죠 아 알고 있으니 자동으로 들어간다고 안적
		
		// 자식의 모든 생성자에서
		// 부모의 특정 생성자를 명시적으로 호출하지 않으면 : super();
		// 암시적으로 부모의 기본생성자가 자식의 생성자 코드 앞에 호출된다.
		System.out.println("Student() called");
		
		
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
}
