package java2_19;

public class ȸ�� implements Comparable<ȸ��>{

	String ���̵�;
	String ��й�ȣ;
	String �̸�;
	int ����Ʈ;
	
	public ȸ��(String ���̵� ,String ��й�ȣ, String �̸�, int ����Ʈ) {
		// TODO Auto-generated constructor stub
		
		this.���̵� = ���̵�;
		this.��й�ȣ = ��й�ȣ;
		this.�̸� = �̸�;
		this.����Ʈ = ����Ʈ;
		
	}
	
	
	@Override
	public int compareTo(ȸ�� temp) {
		// TODO Auto-generated method stub
		return �̸�.compareTo(temp.�̸�);
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ���̵�;
	}
	
	
}
