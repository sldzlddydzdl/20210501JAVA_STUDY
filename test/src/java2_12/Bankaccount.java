package java2_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Bankaccount {

	// ATM�� [ ���ະ�� �Ա� , ��� ]
	
	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<����> ���¸���Ʈ = new ArrayList<>();
	public static ATM ������ATM; // 1. �������̽� ����
	
	
	public static void main(String[] args) {
	
		while(true) {
			System.out.println("============ ATM ==============");
			System.out.println("1.��������  2.��������  3.īī�� 4.���� 5. ������� ����");
			System.out.println("===============================");
			int ch = sc.nextInt();
			
			if(ch == 1) {
				
				������ATM = new ��������(); // 2. �������̽��� Ŭ���� �޸��Ҵ���� ��ü����
				
				������ATM.��ũ�޴�();
				
			}
			
			if(ch == 2) {
				
				������ATM = new ��������();
			
				������ATM.��ũ�޴�();
				
			}
			
			if(ch == 3) {
				
				������ATM = new īī��();
			
				������ATM.��ũ�޴�();
				
			}
			if(ch ==4) {
				return;
			}
			if(ch ==5) {
				
				�������� temp1 = new ��������(); // ��ü����
				������ATM = temp1; // ���Ƿ� �������̽��� ��ü����
				������ATM.���¸��(); // ��ü�� �������� Ŭ���� ���������Ƿ� ���¸��() �޼ҵ� ȣ��;
				
				�������� temp2 = new ��������();
				������ATM = temp2;
				������ATM.���¸��();
				
				
				īī�� temp3 = new īī��();
				������ATM = temp3;
				������ATM.���¸��();
				
			}
		}
		
	}
	
	
}
