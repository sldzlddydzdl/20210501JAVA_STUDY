package day0328.classEx01;

import java.util.Scanner;

public class PersonTest {
	
	public static void main(String[] args) { // �ڹٴ� �׻� main���� �����Ѵ�.
		// Person �̶�� Ŭ������ ��ü�� ����� ����.
		// ��ü�� ����� Ű�����? new 
		// Ŭ������ ������ : ������ ���� 
		// ���� = new Ŭ������(); ��ü ������ ����
		
		/*
		System.out.println("---------------------------");
		// Ŭ���� : ����� ���� �ڷ���
		Person person1 = new Person(); // ����ִ� ��ü
		
		// ��ü�� �ִ� �ʵ忡 ���� �ִ� ���
		// . �����ڸ� �̿��Ѵ�.
		// ������.�ʵ��
		person1.name = "�۱�ȣ";
		person1.age = 40;
		person1.money = 1000000;
		
		// �޼��� ȣ��
		// ������.�޼����();
		person1.introduce();
		
		Person person2 = new Person();
		person2.name = "���缮";
		person2.age = 43;
		person2.money = 1000;
		
		person2.introduce();
		
		Person person3 = new Person();
		person3.name = "��ȣ��";
		person3.age = 45;
		person3.money = 5000;
		
		person3.introduce();
		
		System.out.println("person2�� �̸��� : " + person2.name);
		System.out.println("person3�� �̸��� ���̴� : " + person3.name + " , " + person3.age);
		
		// �۱�ȣ�� ���̸� 70���� �ٲٰ�
		// ���� 10������ �����Ͽ� 
		// ����ϼ���.
		person1.age = 70;
		person1.money = 1000000000;
		person1.introduce();
		*/
		
		/*
		 *  �ϳ��� ���� ��� ���ؼ��� ������ �ʿ���
		 *  ���� �ڷ����� �����͸� ������ ��� ���ؼ��� �迭�� �ʿ��ϴ�
		 *  ���δٸ� �ڷ����� �����͸� ��� ���ؼ��� Ŭ������ �ʿ��ϴ�.
		 *  
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸� , ���� , ����� , ����� , ���м��� ������ �Է����ּ���~");
		Student student = new Student(sc.next(), sc.nextInt(), sc.nextInt()
										, sc.nextInt(), sc.nextInt());
		student.show();
	}
}
