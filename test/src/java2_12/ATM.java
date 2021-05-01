package java2_12;

public interface ATM {
	
	// 1. interface 는 변수선언 안된다 , // 상수만 된다
		// int maxmoney;
	int maxmoney = 1000000;
	
	// 2. 추상메소드 : 정의되지않는 메소드 선언만
	
	public void 뱅크메뉴();
	public void 계좌생성(); // 1
	public void 입금(); // 2
	public void 출금(); // 3
	public void 잔고(); // 4
	public void 계좌목록(); //6
	
	// 3.default : 메소드를 정의해야한다.! 
	default int 인증(int 은행코드) {
		
		return 0;
		
	}
	
	
}
