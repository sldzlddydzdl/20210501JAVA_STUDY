package day0328.classEx01;

public class CarTest {

	public static void main(String[] args) {
		// Car ��� ��ü �ΰ��� ������
		// �ν��Ͻ� 
		// Car�� �ν��Ͻ���� ǥ���Ѵ�.
		// ���� ���� �� ��ü
		Car c1 = new Car(); 
		c1.name = "���̿���5";
		c1.color = "�Ķ�";
		
		Car c2 = new Car();
		c2.name = "���";
		c2.color = "����"; 
		
		Car c3; 
		c3 = c2;
		c3.color = "����";
		
		System.out.println(c2.color); // ����
		System.out.println(c3.color); // ����
		
		// ��ü�� ���� �Ҹ��ϴ°�?
		// gc(�������÷���)��� ���̰� �������ش�. ����?
		// ��ü�� ����� ���̰� �ϳ��� ���� ��!
		c1 = null; // �̷��� ��ü�� �ϳ��� ���Եȴ�. ( -> ��ü�� ������� ���´�. )
		
		c2 = null;  
		System.out.println("c2 = null ��");
		System.out.println(c3.name); 
		
		
		
	}

}
