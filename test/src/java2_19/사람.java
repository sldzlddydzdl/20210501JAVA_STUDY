package java2_19;

public class ��� implements Comparable<���>{

	String �̸�;
	int ����;
	
	public ���(String �̸� , int ����) {
		// TODO Auto-generated constructor stub
		this.�̸� = �̸�;
		this.���� = ����;
	}
	
	// [ ���ı��� ]
	@Override
	public int compareTo(��� temp) {
		// TODO Auto-generated method stub
		
		if(���� < temp.����) return -1;
		else if(���� == temp.����) return 0;
		else return 1;
		
	}

//	// [ �̸����� ] : string �⺻������ ���������� ������ �Ǿ�����
//	@Override
//	public int compareTo(��� temp) {
//		// TODO Auto-generated method stub
//		return �̸�.compareTo(temp.�̸�);
//		
//		
//		
//	}

}
