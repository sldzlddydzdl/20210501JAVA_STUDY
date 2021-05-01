package day0411.interface02;

public class TV implements RemoteController{
	
	@Override
	public void turnOff() {
		System.out.println("티비를 켭니다!");
	}
	
	@Override
	public void turnOn() {
		System.out.println("티비를 끕니다!");
	}
	
	
}
