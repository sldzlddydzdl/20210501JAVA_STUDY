package java2_13;

public class ���� {
	
	//�ʵ�
	long �ݾ�;
	
	//������
	public ����() {
		
	}
	
	
	//�޼ҵ�
	public long get�ݾ�() {
		return �ݾ�;
	}
	
	public void set�ݾ�(int �ݾ�) {
		this.�ݾ� = �ݾ�;
	}
	
	public void ���(int ��ݾ�) throws ��ݾ׺��� {
		
		if( �ݾ� < ��ݾ� ) {
			
			throw new ��ݾ׺���("�ܰ����");
			
			
			
			/*
			// ���ο� ���� ó���� �����ڴ�.
			throw new Exception("�ܰ����");
			
			// 		throw new Exception("�ܰ����");
										// ����ó���� ��µǴ� ���� ���
			*/
		}
		else {
			�ݾ� -= ��ݾ�;
		}
		
	}
	
}
