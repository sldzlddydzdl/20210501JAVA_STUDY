package day0403_ex03;

public class Person {

	String name;
	Car car;
	Phone phone;
	Shoes shoes;
	
	public void PrintInfo() {
		System.out.println("�� �̸��� " + name + "�Դϴ�");
		System.out.println("�� ���� �̸��� " + car.name + " �̰� " + "�� ���� " + car.price + " �Դϴ�");
		System.out.println("�� �ڵ����� �̸��� " + phone.name + "�̰�" + "�귣��� " + phone.brand + " �̰� " + phone.price +"�� ¥���Դϴ�.");
		System.out.println("�� �Ź��� �귣��� " + shoes.brand + "�̰�" + "������´� " + shoes.size + " �̰� " + shoes.price +"�� ¥���Դϴ�.");
	}
}
