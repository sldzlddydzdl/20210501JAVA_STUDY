package java2_12;

import java.util.Scanner;

public class īī�� extends ���� implements ATM {
	
public static Scanner sc = new Scanner(System.in);
	
	public īī��(String ����, String ��й�ȣ, String ������ , int �����ڵ�) {
		
		super(����, ��й�ȣ, ������ , �����ڵ�);
		
	}
	
	public void ���¸��() {
		for(int i = 0; i < Bankaccount.���¸���Ʈ.size(); i++) {
				if( Bankaccount.���¸���Ʈ.get(i).�����ڵ� == 3 ) {
					System.out.println("[īī������] :  " + Bankaccount.���¸���Ʈ.get(i).���� + " �� �ܾ��� : " 
										+ Bankaccount.���¸���Ʈ.get(i).�Աݾ� + "�Դϴ�.");
				}
			}
	}
	
	public īī��() {
		
	}
	
	public int ����( int �����ڵ� ) {
		if(�����ڵ� == 3) {
			System.out.println(" īī�� ���� ���� ");
			return 3;
		}
		else {
			System.out.println("īī�������� �ƴմϴ�.");
			return 0;
		}
		
		
	}
	
	public void ��ũ�޴�() {
	
		while(true) {
			System.out.println(" ========== īī������ ===========");
			System.out.println("1.���»���");
			System.out.println("2.�Ա�");
			System.out.println("3.���");
			System.out.println("4.�ܰ�");
			System.out.println("5.����");
			System.out.println("6.���");
			int ch = sc.nextInt();
			
			if(ch == 1) {
				
				���»���();
			}
			
			if(ch == 2) {
				�Ա�();
			}
			if(ch == 3) {
				���();
			}
			if(ch == 4) {
				�ܰ�();
			}
			if(ch == 5) {
				break;
				
			}
			if(ch == 6) {
				���¸��();
			}
		}
	}
	
	
	public void �Ա�() {
		
		System.out.println("** �Ա� **");
		System.out.print("���¹�ȣ : ");
		String ���� = sc.next();
		System.out.print("��й�ȣ : ");
		String ��й�ȣ = sc.next();
		
		
		for(int i = 0 ; i < Bankaccount.���¸���Ʈ.size(); i++) {
			if(Bankaccount.���¸���Ʈ.get(i).����.equals(����) && 
					Bankaccount.���¸���Ʈ.get(i).��й�ȣ.equals(��й�ȣ)&& 
						Bankaccount.���¸���Ʈ.get(i).�����ڵ� == 3) {
					System.out.print("�Աݾ� : ");
					int �Աݾ� = sc.nextInt();
					Bankaccount.���¸���Ʈ.get(i).�Աݾ� += �Աݾ�;
					System.out.println(Bankaccount.���¸���Ʈ.get(i).������ + " �� īī������ �Ա� ����");
					return;
			}
		}	
		
		System.out.println(" ������ ���� Ȥ�� ��й�ȣ�� �ٸ��ϴ�.");
		
	}
	
	public void ���() {
		System.out.println("** ��� **");
		System.out.print("���¹�ȣ : ");
		String ���� = sc.next();
		System.out.print("��й�ȣ : ");
		String ��й�ȣ = sc.next();
		
		
		for(int i = 0 ; i < Bankaccount.���¸���Ʈ.size(); i++) {
			if(Bankaccount.���¸���Ʈ.get(i).����.equals(����) && 
					Bankaccount.���¸���Ʈ.get(i).��й�ȣ.equals(��й�ȣ)&& 
					Bankaccount.���¸���Ʈ.get(i).�����ڵ� == 3) {
					System.out.print("��ݾ� : ");
					int ��ݾ� = sc.nextInt();
					
					if(Bankaccount.���¸���Ʈ.get(i).�Աݾ� < ��ݾ�) {
						System.out.println(" ��ݾ��� �����մϴ�. [ ��ݽ��� ]");
						return;
					}
					else {
						Bankaccount.���¸���Ʈ.get(i).�Աݾ� -= ��ݾ�;
						System.out.println(" īī������ ��� ����");
						return;
					}
			}
		}	
		
		System.out.println(" ������ ���� Ȥ�� ��й�ȣ�� �ٸ��ϴ�.");
		
	}
	
	public void �ܰ�() {
		// TODO Auto-generated method stub
		System.out.println("** �ܰ� **");
		System.out.print("���¹�ȣ : ");
		String ���� = sc.next();
		System.out.print("��й�ȣ : ");
		String ��й�ȣ = sc.next();
		
		for(int i = 0; i < Bankaccount.���¸���Ʈ.size(); i++) {
			if(Bankaccount.���¸���Ʈ.get(i).����.equals(����) &&
					Bankaccount.���¸���Ʈ.get(i).��й�ȣ.equals(��й�ȣ)&& 
					Bankaccount.���¸���Ʈ.get(i).�����ڵ� == 3 ) {
				System.out.println("[īī������] :  " + Bankaccount.���¸���Ʈ.get(i).���� + " �� �ܾ��� : " 
									+ Bankaccount.���¸���Ʈ.get(i).�Աݾ� + "�Դϴ�.");
			}
			else {
				System.out.println(" ������ ���� Ȥ�� ��й�ȣ�� �ٸ��ϴ�.");
			}
		}
		
		
		
	}
	
	public void ���»���() {
		System.out.println(" īī������ ���»��� ");
		System.out.print(" ���¹�ȣ ���� : ");
		String ���� = sc.next();
		System.out.print(" ��й�ȣ �Է� :");
		String ��й�ȣ = sc.next();
		System.out.print(" ������ �Է� : ");
		String ������ = sc.next();
		
		īī�� temp = new īī��(����, ��й�ȣ ,������ , 3);
		
		Bankaccount.���¸���Ʈ.add(temp);
	}
}
