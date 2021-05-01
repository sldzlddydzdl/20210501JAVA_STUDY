package day0411.interface02;

public class MyRemoteTest {
	public static void main(String[] args) {
		
		// 어떤 기기를 켜고 끄는 기능을 제공하는 역할을 함.
		MyRemote myRemote = new MyRemote();
		
		TV tv = new TV();
		
		// 리모콘으로 티비를 켜고 끌 수 있게됨.
		myRemote.setRemoteController(tv);
		
		myRemote.on();
		myRemote.off();
		
		
	}
}
