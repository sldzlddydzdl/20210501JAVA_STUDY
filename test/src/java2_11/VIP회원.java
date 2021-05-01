package java2_11;

public class VIP회원 extends 회원 {
	
	// 필드
	String 혜택;
	
	// 생성자
	public VIP회원( String id , String pw , String name , String 혜택) {
		
		super(id, pw, name); // 슈퍼클래스 생성자 호출 
		this.혜택 = 혜택;
	}
	// 메소드 : 오버라이딩 : 슈퍼클래스내 동일한 메소드가 있는경우 재정의
	public void 회원정보() {
		super.회원정보(); // 슈퍼클래스내 메소드 호출 
		System.out.println("혜택 : "+혜택);	
	}
	
	@Override
	public void 회원삭제() {
		// TODO Auto-generated method stub
		super.회원삭제();
	}
	
	@Override
	public void 회원목록() {
		for( int i = 0 ; i<main.회원리스트.size() ;i++) {
			main.회원리스트.get(i).회원정보();
		}
	}

}
