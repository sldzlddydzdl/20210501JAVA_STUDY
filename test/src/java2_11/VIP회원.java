package java2_11;

public class VIPȸ�� extends ȸ�� {
	
	// �ʵ�
	String ����;
	
	// ������
	public VIPȸ��( String id , String pw , String name , String ����) {
		
		super(id, pw, name); // ����Ŭ���� ������ ȣ�� 
		this.���� = ����;
	}
	// �޼ҵ� : �������̵� : ����Ŭ������ ������ �޼ҵ尡 �ִ°�� ������
	public void ȸ������() {
		super.ȸ������(); // ����Ŭ������ �޼ҵ� ȣ�� 
		System.out.println("���� : "+����);	
	}
	
	@Override
	public void ȸ������() {
		// TODO Auto-generated method stub
		super.ȸ������();
	}
	
	@Override
	public void ȸ�����() {
		for( int i = 0 ; i<main.ȸ������Ʈ.size() ;i++) {
			main.ȸ������Ʈ.get(i).ȸ������();
		}
	}

}
