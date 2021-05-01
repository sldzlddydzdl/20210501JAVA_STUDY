package day0403;

public class PersonTest {
	public static void main(String[] args) {
		
		// 사람객체 만들기
		Person p1 = new Person();
		
		Money money = new Money();
		money.danwi = "원";
		money.amount = 100000;
		
		// 사람객체 안에는 이름과 머니가 있다.
		p1.name = "브라운";
		p1.money = new Money(); // 사람객체 안에 있는 머니 객체
		p1.money.danwi = "달라";
		p1.money.amount = 4;
		
	}
}
	