package java2_17;

public class 코스 <T> {
	
	String 과정명;
	T[] 학생명단;
	
	public 코스(String 과정명 , int 최대인원수) {
		// TODO Auto-generated constructor stub
		
		this.과정명 = 과정명;
		학생명단 = (T[])new Object[최대인원수]; 
				// 강제형변환
		
		
				// 배열 선언
					// 자료형[] 배열명 = new 자료형[배열크기];

	}
	
	public void 학생추가( T 새로운학생) {
		
		// 빈공간을 찾아서 배열에 학생 추가
		for(int i = 0 ; i < 학생명단.length; i++) {
			if(학생명단[i] == null) {
				학생명단[i] = 새로운학생;
				break;
			}
		}
	}
	
	
}
