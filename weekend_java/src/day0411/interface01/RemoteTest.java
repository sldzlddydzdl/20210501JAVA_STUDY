package day0411.interface01;

public class RemoteTest {
	public static void main(String[] args) {
		TV tv = new TV();
		tv.turnOn();
		tv.trunOff();

		Aircon aircon = new Aircon();
		aircon.turnOn();
		aircon.trunOff();
		
		// 다형성
		RemoteController rc = tv;
		rc.turnOn();
		rc.trunOff();
	}
}
