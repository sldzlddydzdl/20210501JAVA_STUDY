package java2_19;

public class 회원 implements Comparable<회원>{

	String 아이디;
	String 비밀번호;
	String 이름;
	int 포인트;
	
	public 회원(String 아이디 ,String 비밀번호, String 이름, int 포인트) {
		// TODO Auto-generated constructor stub
		
		this.아이디 = 아이디;
		this.비밀번호 = 비밀번호;
		this.이름 = 이름;
		this.포인트 = 포인트;
		
	}
	
	
	@Override
	public int compareTo(회원 temp) {
		// TODO Auto-generated method stub
		return 이름.compareTo(temp.이름);
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return 아이디;
	}
	
	
}
