package java2_16;

public class 통장 {

	int 금액;
	
	public int get금액() {
		return this.금액;
	}
	
	public synchronized void set금액(int 금액) {
		
		this.금액 = 금액;
		//(현재 클래스내 변수) = 인수로 들어온 변수
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		
		System.out.println(Thread.currentThread().getName() + " : " + this.금액);
		
		
	
	}
	
}
