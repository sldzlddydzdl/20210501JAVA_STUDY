package java2_11;

public class 회원 {
	
	//필드
	String id;
	String pw;
	String name;
	
	// 생성자 => 객체의 초기값
	public 회원( String id , String pw , String name) {
		this.id = id;
		this.pw = pw;
		this.name=name;
	}
	// 메소드 
	public void 회원정보() {
		
		System.out.println( "아이디 : "+id);
		System.out.println( "패스워드 : "+pw);
		System.out.println( "이름 : "+name);
		
	}
	
	public void 회원삭제() {
		
		System.out.println(" 권한이 없습니다 ");
		
	}
	
	public void 회원목록() {
		System.out.println(" 권한이 없습니다 ");
	}
	

}
