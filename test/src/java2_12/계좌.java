package java2_12;

public class 계좌 {
	
	String 계좌;
	String 비밀번호;
	String 계좌주;
	int 입금액 = 0;
	int 은행코드; // 1.국민은행 2.신한은행 3.카카오

	public 계좌() {
		
	}
	
	// 생성자
	public 계좌(String 계좌, String 비밀번호, String 계좌주 , int 은행코드) {
		this.계좌 = 계좌;
		this.계좌주 = 계좌주;
		this.비밀번호 = 비밀번호;
		this.은행코드 = 은행코드;
	}
	

	
}
