package java2_17;

public class �ڽ� <T> {
	
	String ������;
	T[] �л����;
	
	public �ڽ�(String ������ , int �ִ��ο���) {
		// TODO Auto-generated constructor stub
		
		this.������ = ������;
		�л���� = (T[])new Object[�ִ��ο���]; 
				// ��������ȯ
		
		
				// �迭 ����
					// �ڷ���[] �迭�� = new �ڷ���[�迭ũ��];

	}
	
	public void �л��߰�( T ���ο��л�) {
		
		// ������� ã�Ƽ� �迭�� �л� �߰�
		for(int i = 0 ; i < �л����.length; i++) {
			if(�л����[i] == null) {
				�л����[i] = ���ο��л�;
				break;
			}
		}
	}
	
	
}
