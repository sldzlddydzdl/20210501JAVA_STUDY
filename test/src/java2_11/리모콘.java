package java2_11;

public interface ������ {
	// �������̽� ���� 
	
	// �ʵ�
	public int �ִ���� = 10;
	public int �ּҼ��� = 0;
	
	// �߻�޼ҵ� => ����x , ����
	public void ����();
	public void ����();
	public void ��������( int ���� );
	
	default void ���Ұ�( boolean mute) {
		if( mute ) {
			System.out.println( "���Ұ�" );
		}else {
			System.out.println( "���Ұ� ����");
		}
	}
	
	

}
