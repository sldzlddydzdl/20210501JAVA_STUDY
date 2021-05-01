package java2_16;

public class 유저2 extends Thread {

	통장 통장2;
	
	public void set통장(통장 통장2) {
		
		this.setName("통장2");
		this.통장2 = 통장2;
		
	}
	
	@Override
	public void run() {
		
		통장2.set금액(50);
		
	}
	
}
