package day0328.classEx01;

// ��ü�� class�� �̿��Ͽ� �����.
// Ŭ������ ���赵��. 
// Ŭ������ ����
// class Ŭ������{ �ʵ� , �޼��� }
// Ŭ�������� �ݵ�� �빮�ڷ� �����Ѵ�.

public class Person {
	
	// �ʵ� , �������
	String name;
	int age;
	int money;
	
	// �޼��� , ����
	void introduce () {
		System.out.println("���� �̸��� : " + name );
		System.out.println("�� ���̴� : " + age);
		System.out.println("���� " + money + " ���� ��������");
		System.out.println("---------------------------");
	}

	
}
