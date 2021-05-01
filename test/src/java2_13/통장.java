package java2_13;

public class 통장 {
	
	//필드
	long 금액;
	
	//생성자
	public 통장() {
		
	}
	
	
	//메소드
	public long get금액() {
		return 금액;
	}
	
	public void set금액(int 금액) {
		this.금액 = 금액;
	}
	
	public void 출금(int 출금액) throws 출금액부족 {
		
		if( 금액 < 출금액 ) {
			
			throw new 출금액부족("잔고부족");
			
			
			
			/*
			// 새로운 예외 처리를 던지겠다.
			throw new Exception("잔고부족");
			
			// 		throw new Exception("잔고부족");
										// 예외처리시 출력되는 문자 출력
			*/
		}
		else {
			금액 -= 출금액;
		}
		
	}
	
}
