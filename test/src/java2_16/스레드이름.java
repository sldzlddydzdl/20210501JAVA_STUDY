package java2_16;

public class �������̸� {
	
	public static void main(String[] args) {
							// main �޼ҵ� : �ϳ��� main ������ ����
		
		Thread thread = Thread.currentThread(); // ���罺���� ������°�
		
		System.out.println(" ���� main �޼ҵ峻 ������ �̸� : " + thread.getName());
			
		������A ������a = new ������A();
		System.out.println(" �� ����� ������ : " + ������a.getName());
		������a.start();
		
		������B ������b = new ������B();
		System.out.println(" �� ����� ������ : " + ������b.getName());
		������b.start();
		
	
		
		
	}

}
