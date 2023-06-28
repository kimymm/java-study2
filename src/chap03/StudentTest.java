package chap03;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student(); //자식보다 부모가 먼저 불리는 구나
		//왜?:컴파일러가 자식생성자, 부모생성자 명시하지 않으면, 
		// 부모호출카드가 없으면, 맨 앞에다가 부모기본생성자를 끼워준다고함.
		//생성자가 불리는지
		
		s.setGrade(1);
	
		Person p1 = (Person) s1; // upcasting 암시적으로 됩니다. 그럼 자->부이네. 굳이 명시적으로 적었음
		s1.setName("둘리");
		
		//다운캐스팅 : 자식 졸라 많은데 그 중에 뭐로 내려가는건지 명시하는 것
		
		Student s2 = (Student) p1; // 다운캐스팅 당연 명시적으로 해야한다. 부->자로 내려가는 구조
		p1.setName("Computer Science"); //부에 setName이 있는데 뭐시러 명시를 하지?
		//아니면 이렇게 한번에도 가능하다
		((Student)p1).setMajor("ComputerScience2"); // 다운캐스팅
		
		
		
		
		
		//메소드 오버라이딩이ㅏ니ㅏ안ㅇㄴ이ㅏㄴㅇㄴㅇ
		
	}
}
