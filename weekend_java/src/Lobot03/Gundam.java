package Lobot03;

public class Gundam extends Lobot{
	
	//객체를 외부에서 주입받는다. 
	public Gundam(PunchAttack attack , WalkingMove move, LegDefense defense) {
		// TODO Auto-generated constructor stub
		name = "건담";
		this.attack = attack;
		this.move = move;
		this.defense = defense;
	}

}
