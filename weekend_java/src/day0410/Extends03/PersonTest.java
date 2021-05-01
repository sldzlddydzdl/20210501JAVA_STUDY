package day0410.Extends03;

public class PersonTest {

	public static void main(String[] args) {
			Person p = new Person("하하하");
			
			p.printInfo();
			
			Student s = new Student("GKGK");
			s.eng = 10;
			s.kor = 10;
			s.math = 10;
			s.printInfo();
			
	}
}
