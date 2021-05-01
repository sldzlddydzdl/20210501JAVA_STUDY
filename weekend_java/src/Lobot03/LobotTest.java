package Lobot03;

public class LobotTest {
	public static void main(String[] args) {
		TeakwonV teakwonV = new TeakwonV();
		teakwonV.fight();
		
		Transformer transformer = new Transformer();
		transformer.fight();
		
		Gundam gundam = new Gundam(new PunchAttack(), new WalkingMove(), new LegDefense());
		gundam.fight();
	}
}

//				추상
//				인터페이스
//				
//				추상클래스가 뭔지? 어떻게 쓰는가?
//				인터페이스는 뭔지? 어떻게 쓰는가?
//				
//				추상클래스를 상속받아 쓸수 있는가?
//				인터페이스를 구현하여 쓸수 있는가?
//				
//				어떻게 활용할 것인가?