package java1_11;

public class VIPȸ�� extends ȸ��{
	
	// �ʵ�
	String ����;
	
	// ������
	public VIPȸ��(String id, String pw , String name, String ����) {
		
		super(id, pw, name); // ����Ŭ���� ������ ȣ��
		this.���� = ����;
		
	}
	
	// �޼ҵ� : �������̵� : ����Ŭ������ ������ �޼ҵ尡 �ִ°�� ������
	@Override
	public void ȸ������() {
		
		super.ȸ������(); // ����Ŭ������ �޼ҵ� ȣ��
		System.out.println("���� : " + ����);
		
	}
	
	@Override
	public void ȸ�����() {
		
		for(int i = 0 ; i < Main.ȸ������Ʈ.size(); i++) {
			Main.ȸ������Ʈ.get(i).ȸ������();
			
		}
		
	}
	
	
	@Override
	public void ȸ������() {
		super.ȸ������();
	}
	
	
	
	

}
