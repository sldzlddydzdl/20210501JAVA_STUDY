package java2_11;

public class java1_11 {

	public static void main(String[] args) {
		
		// 클래스 : 설계도 => 객체 생성			// extends [ 상속 ] 		: 상속받을수 있는 수 : 1개
		// 인터페이스 : 메소드 모임 : 객체 조작		// implements[ 인터페이스 ] : 상속받을수 있는 수 : 여러개
		
		// TV : 슈퍼 클래스 								// 에이컨  : 슈퍼 클래스			
			// 서브 클래스 : 삼성TV , LGTV 등 					// 서브 클래스 : 삼성 에어컨
				// 오늘삼성TV : 객체   // 어제삼성TV : 객체
		
		// 인터페이스 : 객체 조작 모임 : 전원 조작 , 볼륨 조작 , 채널 조작 등 
		
		리모콘 rc; // 인터페이스 객체 
		
		rc = new 텔레비전();
		rc.실행();
		rc.종료();
		rc.소음설정(3);
		
		rc = new 오디오();
		rc.실행();
		rc.종료();
		rc.소음설정(5);
		
		텔레비전 tv1 = new 텔레비전();
		오디오 오디오1 = new 오디오();
		
		rc = tv1;
		rc.실행();
		rc = 오디오1;
		rc.실행();
		rc.음소거(true);
		rc.음소거(false);
		

	}

}
