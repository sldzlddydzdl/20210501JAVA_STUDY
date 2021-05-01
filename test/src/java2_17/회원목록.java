package java2_17;

public class 회원목록 <T>{

	String 카드사명;
	T[] 회원목록;
	
	public 회원목록(String 카드사명 , int 최대인원수) {
		// TODO Auto-generated constructor stub
		
		this.카드사명 = 카드사명;
		회원목록 = (T[]) new Object[최대인원수];
		
	}
	
	public void 회원추가( T new회원) {
		
		for(int i = 0 ; i < 회원목록.length; i++) {
			
			if(회원목록[i] == null ) {
				회원목록[i] = new회원;
				break;
			}
		}
		
	}
}
