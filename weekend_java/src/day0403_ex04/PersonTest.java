package day0403_ex04;

import java.util.Scanner;

public class PersonTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ����̸� , �� �̸� , �� ���� , ���̸� , ���귣��, �� ����, �Ź� �귣��, �Ź� ������, �Ź� ����
		// ��������� ���� �����͸� ����.
		
		System.out.println("�Է��� ����� ���� ��������.");
		
		int N = sc.nextInt();
		
		Person[] people = new Person[N];
		
		for(int i = 0 ; i < people.length; i++) {
			people[i] = new Person();
			people[i].car = new Car();
			people[i].phone = new Phone();
			people[i].shoes = new Shoes();
			
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
			
			// �Է¹��� ����Ÿ�� ��ü�� ����ش�.
			people[i].name = personName;
			people[i].car.name = carName;
			people[i].car.price = carPrice;
			people[i].phone.name = phoneName;
			people[i].phone.brand = phoneBrand;
			people[i].phone.price = phonePrice;
			people[i].shoes.brand = shoesName;
			people[i].shoes.size = shoesSize;
			people[i].shoes.price = shoesPrice;
		}// for�� ��
		
		for(Person p : people) {
			if("����".equals(p.name) ) {
				System.out.println(p.name + "�� ���� " +p.phone.name);
				System.out.println("�귣�� : " + p.shoes.brand);
				System.out.println("���� : " + p.shoes.price);
			}
		}
		
		
		// ����ڷκ��� ã����� ����� �̸��� �Է¹޴´�.
		
		while(true) {
			System.out.println("ã����� ����� �̸��� �Է����ּ��� (�׸�ã������� 2���� �Է����ּ���) ");
			String name = sc.next();
			
			if(name.equals("2")) {
				break;
			}
			else {
				for(Person p : people) {
					if(p.name.equals(name)) {
						// ã���� �ϴ� ����� ����
						p.PrintInfo();
					}
					else {
						System.out.println(name + "�̶�� ����� �����ϴ�.");
						break;
					}
				}
			}
		}
		
		/*
		�赿��
		���Ͻý�
		130000000
		��Ʈ10
		�Ｚ
		100000
		����Ű
		270
		50000
		
		��ȣ��
		��Ƽ��
		23000000
		������
		����
		134043
		���뷱��
		260
		1350000
		*/
		
		/*
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
		*/
	}

}
