package java2_17;

public class ȸ����� <T>{

	String ī����;
	T[] ȸ�����;
	
	public ȸ�����(String ī���� , int �ִ��ο���) {
		// TODO Auto-generated constructor stub
		
		this.ī���� = ī����;
		ȸ����� = (T[]) new Object[�ִ��ο���];
		
	}
	
	public void ȸ���߰�( T newȸ��) {
		
		for(int i = 0 ; i < ȸ�����.length; i++) {
			
			if(ȸ�����[i] == null ) {
				ȸ�����[i] = newȸ��;
				break;
			}
		}
		
	}
}
