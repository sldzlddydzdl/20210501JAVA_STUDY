package day0403;

public class PersonTest {
	public static void main(String[] args) {
		
		// �����ü �����
		Person p1 = new Person();
		
		Money money = new Money();
		money.danwi = "��";
		money.amount = 100000;
		
		// �����ü �ȿ��� �̸��� �Ӵϰ� �ִ�.
		p1.name = "����";
		p1.money = new Money(); // �����ü �ȿ� �ִ� �Ӵ� ��ü
		p1.money.danwi = "�޶�";
		p1.money.amount = 4;
		
	}
}
	