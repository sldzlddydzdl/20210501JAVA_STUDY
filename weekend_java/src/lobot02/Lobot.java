package lobot02;

public abstract class Lobot {
	
	String name;
	
	// 각각의 로봇의 기능이 다르기 때문에 내용을 구현하지 않고
	// 추상메서드로만 만듬.
	
	public final void fight() {
		System.out.println(name + "가 전투를 시작합니다");
		attack();
		move();
		attack();
		System.out.println(name + "가 전투를 종료합니다.");
	}
	
	public abstract void attack();
	public abstract void move();
}

//템플릿 패턴 -> 개발 방법중 하나
// 디자인 패턴