package EX;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
//			�迭(array) : ���� �ڷ���(Ÿ��) �� �������� ����
//			�迭�̶�� ���̸� �� ����?
//			�ݺ����� ���� ���ؼ�
		
//			int �ڷ����� ���� 10���� ����
//			���� 1�� ������ �ϰ� ����غ�����
		

//			System.out.println("n1  : " + n1);
//			System.out.println("n2  : " + n2);
//			System.out.println("n3  : " + n3);
//			System.out.println("n4  : " + n4);
//			System.out.println("n5  : " + n5);
//			System.out.println("n6  : " + n6);
//			System.out.println("n7  : " + n7);
//			System.out.println("n8  : " + n8);
//			System.out.println("n9  : " + n9);
//			System.out.println("n10 : " + n10);
			
			// �� ������
			// n1 = 1
			// n2 = 2
			// n3 = 3
						
//			System.out.println("--------------------");
//			
//			System.out.println("n1  : " + n1);
//			System.out.println("n2  : " + n2);
//			System.out.println("n3  : " + n3);
//			System.out.println("n4  : " + n4);
//			System.out.println("n5  : " + n5);
//			System.out.println("n6  : " + n6);
//			System.out.println("n7  : " + n7);
//			System.out.println("n8  : " + n8);
//			System.out.println("n9  : " + n9);
//			System.out.println("n10 : " + n10);
			
			int n1 = 1;
			int n2 = 1;
			int n3 = 1;
			int n4 = 1;
			int n5 = 1;
			int n6 = 1;
			int n7 = 1;
			int n8 = 1;
			int n9 = 1;
			int n10 = 1;

			// �ݺ����̶�°� ������� �̰� �Ẽ��?
			// 1 ~ 10 ���� ���� �־�� !
			
			n1 = 1;
			n2 = 2;
			n3 = 3;
			n4 = 4;
			n5 = 5;
			n6 = 6;
			n7 = 7;
			n8 = 8;
			n9 = 9;
			n10 = 10;
			// ������ �� �ٸ� �ֵ��̱� ������ �ݺ������� �� �� ����.
			
			// �迭
			// �ڷ���[] ������ : �迭������ ����
			// ������ = new �ڷ���[����];
			// ���� 10���� ���� �� �ִ� �迭�� ����.
			
//			int[] numbers;
//			numbers = new int[10]; // 10��¥�� �迭 ��ü�� �����Ͽ� numbers �� ����.
			
			int[] numbers = new int[10];
			
			// ������[index��ȣ] : index�� 0���� �����Ѵ�.
			// numbers �迭�� ��� ������ 1�� ��ƺ���
			
//			numbers[0] = 1;
//			numbers[1] = 1;			
//			numbers[2] = 1;
//			numbers[3] = 1;			
//			numbers[4] = 1;
//			numbers[5] = 1;			
//			numbers[6] = 1;
//			numbers[7] = 1;			
//			numbers[8] = 1;
//			numbers[9] = 1;			
			
			// �ݺ����� �̿��ؼ� 1�� �־��
			for(int i = 0; i < 10; i++)
				numbers[i] = 1;
			
			// ������ stack ���� heap
			// new �� ������ heap�޸𸮿� �ö󰣴�.
			
			//[1,1,1,1,1,1,1,1,1,1,]
//			System.out.println(numbers);
			
//			for(int i = 0; i < 10; i++) {
//				System.out.println("numbers["+i+"] : " + numbers[i]);
//			}
			
			// 10���� ������ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ������ ����
//			numbers[0] = 1;
//			numbers[1] = 2;
//			numbers[2] = 3;
//			numbers[3] = 4;
//			numbers[4] = 5;
//			numbers[5] = 6;
//			numbers[6] = 7;
//			numbers[7] = 8;
//			numbers[8] = 9;
//			numbers[9] = 10;
		
//			System.out.println("------------------------------------");
			
			for(int i = 0; i < 10; i++) {
				numbers[i] = i+1;
			}
			
//			for(int i = 0 ; i< 10; i++) {
//				//%d ������ ����, \n �� ������ �ǹ�
//				System.out.printf("numbers[%d] : %d \n", i , numbers[i]);
//			}
//			
			// ũ�Ⱑ 5���� ���ڿ��� ���� �� �ִ� �迭�� �����
			// �����ϴ� ���� �̸� 5���� �ְ�
			// ����ϼ���.
			
			
			String[] food = new String[5];
			food[0] = "����";
			food[1] = "����";
			food[2] = "ġŲ";
			food[3] = "���ȸ";
			food[4] = "��ġȸ";
			
				
//			System.out.println("���� �����ϴ� ���� : ");
//			System.out.print("-> " + food[0] + " "
//								   + food[1] + " "
//								   + food[2] + " "
//								   + food[3] + " "
//								   + food[4] + " �Դϴ�.");
			
			// index 2���� ������
			System.out.println();
			food[2] = "������";
//			System.out.println("************ index 2���� ���� �� �� *****************");
//			for(int i = 0 ; i < 5; i++) {
//				System.out.println("food["+i+"] : " + food[i]);
//			}
//			
			// �迭�� ����� ���
			int[] array1 = new int[5];// [0,0,0,0,0]
			
			// �� ���̸� ó�� �ʱ�ȭ(���������� ���� ���ÿ� ����) �� ���� ����.
			int[] array2 = {10,7,4,3,2}; // heap ���� ����.
						
			
			
			int[] array3 = new int[] {10 , 7 ,4 ,3, 2}; // [10,7,4,3,2]
			
			int[] arrays;
			arrays = new int[5]; // [0,0,0,0,0]
			
//			int[] arrays2;
//			arrays2 = {10, 7 , 4 ,3 , 2}; �ȵ�!!!!!!!!!!!!
			
			int[] arrays3;
			arrays3 = new int[] { 10 , 7 , 4 , 3 , 2 }; // [10,7,4,3,2]
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
	
}
