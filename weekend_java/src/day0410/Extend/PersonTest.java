package day0410.Extend;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("감자");
		System.out.println(p.name);
		
		Student s  = new Student();
		s.setName("바나나"); // 부모가 정의한 메서드를 사용
		System.out.println(s.name); // 부모가 갖고있는 필드를 사용
		s.eng = 10;
		s.math = 10;
		s.kor = 10;
		
		System.out.println(s.eng);
		System.out.println(s.math);
		System.out.println(s.kor);
	}
}
