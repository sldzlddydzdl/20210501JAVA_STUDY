package java2_16;

public class 유저1 extends Thread {
	
	통장 통장1;
	
	public void set통장(통장 통장1) {
		
		this.setName("통장1");
		this.통장1 = 통장1;
	}
	
	@Override
	public void run() {
	
		통장1.set금액(100);
		
		
	}

}
