package java2_19;

import java.util.Comparator;

public class ����Ʈ���� implements Comparator<ȸ��>{
	
	@Override
	public int compare(ȸ�� temp1, ȸ�� temp2) {

		if(temp1.����Ʈ < temp2.����Ʈ) return 1;
		else if( temp1.����Ʈ == temp2.����Ʈ) return 0;
		else return -1;
		
	}
	

}
