package java2_19;

import java.util.Comparator;

public class 포인트정렬 implements Comparator<회원>{
	
	@Override
	public int compare(회원 temp1, 회원 temp2) {

		if(temp1.포인트 < temp2.포인트) return 1;
		else if( temp1.포인트 == temp2.포인트) return 0;
		else return -1;
		
	}
	

}
