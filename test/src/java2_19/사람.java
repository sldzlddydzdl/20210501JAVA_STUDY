package java2_19;

public class 사람 implements Comparable<사람>{

	String 이름;
	int 나이;
	
	public 사람(String 이름 , int 나이) {
		// TODO Auto-generated constructor stub
		this.이름 = 이름;
		this.나이 = 나이;
	}
	
	// [ 정렬기준 ]
	@Override
	public int compareTo(사람 temp) {
		// TODO Auto-generated method stub
		
		if(나이 < temp.나이) return -1;
		else if(나이 == temp.나이) return 0;
		else return 1;
		
	}

//	// [ 이름기준 ] : string 기본적으로 사전순으로 정렬이 되어있음
//	@Override
//	public int compareTo(사람 temp) {
//		// TODO Auto-generated method stub
//		return 이름.compareTo(temp.이름);
//		
//		
//		
//	}

}
