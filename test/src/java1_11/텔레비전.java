package java1_11;

public class 텔레비전 implements 리모콘 {
	
	int 소음;
	
	public void 실행() {
		System.out.println(" 텔레비전 실행 ");
	}
	
	public void 종료() {
		System.out.println(" 텔레비전 종료 ");
	}
	
	public void 소음설정(int 소음) {
		this.소음 = 소음;
		System.out.println("텔레비전 소음 : " + 소음);
	}
	
}
