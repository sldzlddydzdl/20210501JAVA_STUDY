package Lobot03;

public class Transformer extends Lobot{
	
	public Transformer() {
		// TODO Auto-generated constructor stub
		name = "트랜스포머";
		attack = new MissileAttack();
		move = new WalkingMove();
		defense = new ArmDefense();
	}

}
