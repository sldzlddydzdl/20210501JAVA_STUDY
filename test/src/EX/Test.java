package EX;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
//		1. 56827��¥�� �ǹ��� �ִ� �� ������ �����ϱ� ���Ͽ� 
//		���� , õ�� ,��� ,�ʿ� �Ͽ�¥���� �� ���� 
//		�ʿ����� �˾Ƴ��� ����Ͻÿ�
//		
		int manwon = 0;
		int chunwon =0;
		int backwon = 0;
		int sipwon = 0;
		int ylwon = 0;
		int money = 56827;
		manwon = money / 10000; // ������ ���� // 5
		chunwon = (money - manwon)/1000; // 6
		backwon = (money%1000)/100; // 8
		sipwon = (money%100)/10; // 2
		ylwon = (money%10); // 7
		
//		2. �غ��� ���̸� ������ �ִ� ������ �����ϰ�
//		�غ��� ���̿� ���� ���� �� �ﰢ���� ���̸� ����Ͻÿ�.

		int width = 20; // �غ�
		int height = 10; // ����
		System.out.println("�ﰢ���� ���� : " + ( width * height / 2 ) );	
		
//		3. ���ο� ���θ� ���� �� �ִ� ������ �����ϰ�
//		���ο� ������ ���� ���� �� �簢���� �ѷ��� ���Ͽ� ����Ͻÿ�.

		width = 30; // �غ�
		height = 15; // ����
		System.out.println("�簢���� �ѷ� : " + ((width*2) + (height*2)));
		
		/****************** ���ð� �ݺ� ********************/
		// ���ñ��� : �������� ���������� �ϳ��� ���°�!
		// ���ǽ��� ����� boolean ���� ���´�!
		
		// �� ���� ������ �״Ͻ��� ģ�� -> �� ���� �״Ͻ��� ��ģ��.
//									 
//									 ||
//									 ||
//								   __||__
//								   \    /
//		                            \  /  
//		                             \/
						 
		// 				���ǽ� if
		// 				���� : 
		// 				if( ���ǽ� ) { 
//							���� �� �����Ϸ��� ����1;
//							���� �� �����Ϸ��� ����2;
		// 				}
		// 				���ǽ��� ����� true , false �� ���´�.
		
		int age = 15;
		if(age >= 20) { // age �� 15 �� --> false
			System.out.println("�����Դϴ�.");
		}
		
		if(age < 20) { // age�� 15 �� --> true
			System.out.println("�̼����Դϴ�");
		}
		
		// if - else
		// ���ǽ��� ���� �ƴϸ� else �� �����Ѵ�.
		// if - else �� ���� �ϳ��� ������ �����Ѵ�.
		// if(���ǽ�){
		// 		������ ����1;
		// }else{
		// 		������ ����2;
		// }
		System.out.println("-------------------------------");
		if(age < 20) {
			System.out.println("�̼����Դϴ�.");
		}else {
			System.out.println("�����Դϴ�.");
		}
		
		// ����� ( �ܼ� ) �� ���� ���ڸ� �Է¹޾ƺ���.
		// Scanner �� �Է��ϰ� Ctrl + Space �� �� ��, 
		// Scanner ���� java.util �̶�� �ִ� �ָ� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է����ּ���.");
		// ����ڷκ��� ���ڸ� �Է¹޴´�.
		int number = sc.nextInt(); // �ַܼκ��� ������ �Է¹޴´�. 
								   // ���� number�� �����Ѵ�.
		
		System.out.println("�Է¹��� ���ڴ� : " + number);
		
		System.out.println("����");
		
		
	}
}
