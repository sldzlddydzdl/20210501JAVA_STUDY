package day0403_ex03;

import java.util.Scanner;

public class PersonTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ����̸� , �� �̸� , �� ���� , ���̸� , ���귣��, �� ����, �Ź� �귣��, �Ź� ������, �Ź� ����
		
		Person p1 = new Person();
		p1.car = new Car();
		p1.phone = new Phone();
		p1.shoes = new Shoes();
		
		// ����ڷκ��� �Է¹���
		// �̸��� �Է¹ޱ�
		System.out.println(" �̸��� �Է��ϼ���. ");
		String personName = sc.next();
		
		System.out.println(" �� �̸��� �Է��ϼ���.");
		String carName = sc.next();
		
		System.out.println("�� ������ �Է��ϼ���");
		int carPrice = sc.nextInt();
		
		System.out.println("�޴��� �귣�带 �Է��ϼ���");
		String phoneBrand = sc.next();
		
		System.out.println("�޴����� �𵨸��� �Է��ϼ���");
		String phoneName = sc.next();
		
		System.out.println("�޴����� ������ �Է��ϼ���");
		int phonePrice = sc.nextInt();
		
		System.out.println("�Ź��� �귣�带 �Է��ϼ���");
		String shoesName = sc.next();
		
		System.out.println("�Ź��� ����� �Է��ϼ���");
		String shoesSize = sc.next();
		
		System.out.println("�Ź��� ������ �Է��ϼ���");
		int shoesPrice = sc.nextInt();
		
		p1.name = personName;
		p1.car.name = carName;
		p1.car.price = carPrice;
		p1.phone.name = phoneName;
		p1.phone.brand = phoneBrand;
		p1.phone.price = phonePrice;
		p1.shoes.brand = shoesName;
		p1.shoes.size = shoesSize;
		p1.shoes.price = shoesPrice;
		
		if("����".equals(p1.name) ) {
			System.out.println(p1.name + "�� ���� " +p1.phone.name);
		}
	}

}
