package java2_16;

public class ������A extends Thread {

	
	public ������A() { 
		setName("������A"); // �̸��������ָ� thread - 0 ���� ��
	}
	
	
	@Override
	public void run() {
		
		for(int i = 0 ; i < 10; i++) {
			
			System.out.println(getName() + " ������");
		}
		
	}
	
}
