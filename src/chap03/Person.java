package chap03;

public class Person {
	//필드추가
	private String name;
	
	//기본생성자
	public Person() {
		System.out.println("Person() called");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
