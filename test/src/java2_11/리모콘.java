package java2_11;

public interface 리모콘 {
	// 인터페이스 정의 
	
	// 필드
	public int 최대소음 = 10;
	public int 최소소음 = 0;
	
	// 추상메소드 => 정의x , 선언만
	public void 실행();
	public void 종료();
	public void 소음설정( int 소음 );
	
	default void 음소거( boolean mute) {
		if( mute ) {
			System.out.println( "음소거" );
		}else {
			System.out.println( "음소거 해제");
		}
	}
	
	

}
