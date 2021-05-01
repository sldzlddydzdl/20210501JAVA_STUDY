package day0411.interface01;

public class TV implements RemoteController{
	
	@Override
	public void trunOff() {
		System.out.println("티비를 켭니다!");
	}
	
	@Override
	public void turnOn() {
		System.out.println("티비를 끕니다!");
	}
	
	
}
