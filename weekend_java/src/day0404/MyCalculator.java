package day0404;

public class MyCalculator {
//	MyCalculator Ŭ���� ����
//	�� ���� ���� ���ϴ� sub �޼��� ����(ù ��° ���� - �� ��° ����)
//	�� ���� ���� ��ȯ�ϴ� mul �޼��� ����
//	�� ���� �������� ���Ͽ� ����ϴ� �޼��� div����
//	�� ���� ���̸� ���Ͽ� ��ȯ�ϴ� �޼��� abs ���� ( �� ���� ���� ���밪 )
//	
//	MyCalculatorTest Ŭ���� ����
//	main �޼��忡�� �� Ŭ���� ��ü�� ����� �޼��带 ȣ���ϴ� ������� ����Ͻÿ�.
	
	String ShowSub(int a, int b) {
		if(a > b) return a + " - " + b + " = " +  (a - b);
		else return b + " - " + a + " = " + (b - a);
	}
	
	String ShowMul(int a, int b) {
		return a + " X " + b + " = " +  (a * b);
	}
	
	String ShowDiv(double a , double b) {
		return a + " / " + b + " "
				+ "= " +  (a / b);
	}
	
	String Calculator(int a, int b, char cal) {
		String s = "";
		
		switch(cal) {
			case '+' :
				s = a + " " + cal +  " " + b + " = " + (a + b);
				break;
			case '-' :
				s = a + " " + cal +  " " + b + " = " + (a - b);
				break;
			case '*' :
				s = a + " " + cal +  " " + b + " = " + (a * b);
				break;
			case '/' :
				s = a + " " + cal +  " " + b + " = " + (a / b);
				break;
			case '%' :
				s = a + " " + cal +  " " + b + " = " + (a % b);
				break;
			default :
				System.out.println("�ùٸ� �����ڸ� ����ּ���");
				break;	
		}
		
		return s;
	}
	
}
