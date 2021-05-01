package ip;

import java.net.InetAddress;

public class ip {

	// 네트워크 : 인터넷
		// 인터넷 : pc끼리 통신
			// 필수 : ip ???????
	// ip : 인터넷 프로토콜 Internet Protocol address
		// 프로토콜 ??? => 규약
			// ip프로토콜 : ip 사용할때 지켜야되는 규칙
				// 다른접속 : 다른pc의 ip주소 입력해서 접속[통신]
	
	// 비교 : 집주소 
		// 집주소 규칙 => 우편번호 도로명
			// 우편 : 집주소 입력해서 우편 보내기
	
	// 내 컴퓨터의 ip????? : 집/와이파이 = ip자동할당[ DHCP ]
		
	// 네이버 홈페이지 접속 ???? : https://www.naver.com => 도메인주소
		// 컴퓨터 [ 0,1 = 기계어 ] == 사람 [ 문자 ]
		// 	ip 주소				== 문자 주소[ 도메인 주소 ] 			 
	
	
	
	public static void main(String[] args) {
		
		try {
			
			// 내pc
			InetAddress mypc = InetAddress.getLocalHost();
				// InetAddress 인터넷 ip 관련 클래스
					// .getLocalHost() 현재 연결된 호스트[pc] 가져오기
			System.out.println(" 내 pc의 이름 " + mypc.getHostName());
			System.out.println(" 내 pc의 ip주소 " + mypc.getHostAddress());
			
			
			// 네이버 ip주소 알아보기 => 배열 [ ip 주소 2개 ]
			InetAddress[] naverpc = InetAddress.getAllByName("www.naver.com");
			
			System.out.println(" 네이버 pc 의 이름 : " + naverpc[0].getHostName());
			System.out.println(" 네이버 pc 의 ip주소 : " + naverpc[0].getHostAddress());
			
			System.out.println(" 네이버 pc2 의 이름 : " + naverpc[1].getHostName());
			System.out.println(" 네이버 pc2 의 ip주소 : " + naverpc[1].getHostAddress());
			
			// 구글 ip주소 알아보기
			InetAddress googlepc = InetAddress.getByName("www.google.com");
			
			System.out.println(" 구글 pc 의 이름 : " + googlepc.getHostName());
			System.out.println(" 구글 pc 의 ip주소 : " + googlepc.getHostAddress());
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
