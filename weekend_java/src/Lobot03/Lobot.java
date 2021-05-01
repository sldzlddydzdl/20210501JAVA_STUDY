package Lobot03;

public class Lobot {
	
	String name;
	Attackable attack;
	Moveable move;
	Defensable defense;
	
	// 각각의 로봇의 기능이 다르기 때문에 내용을 구현하지 않고
	// 추상메서드로만 만듬.
	
	public final void fight() {
		System.out.println(name + "가 전투를 시작합니다");
		attack();
		defense();
		move();
		attack();
		defense();
		System.out.println(name + "가 전투를 종료합니다.");
	}
	
	public void attack() {
		attack.attack();
	}
	public  void move() {
		move.move();
	}
	public void defense() {
		defense.defense();
	}
}

//템플릿 패턴 -> 개발 방법중 하나
// 디자인 패턴