package day0411.interface01;

public class Aircon implements RemoteController{

	@Override
	public void turnOn() {
		System.out.println("에어컨을 킵니다.");
	}

	@Override
	public void trunOff() {
		System.out.println("에어컨을 끕니다.");
	}
		

}
