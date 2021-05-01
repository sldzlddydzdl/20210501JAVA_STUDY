package java1_7;

import java.util.ArrayList;
import java.util.Scanner;

public class java1_7 {

	static Scanner sc = new Scanner(System.in);
	
	static ArrayList<Member> memberlist = new ArrayList<>();
	static ArrayList<Account> accountlist = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
				System.out.println(" ** ȸ������ â ** ");
				System.out.println("1.ȸ������ 2.�α��� 3.��й�ȣã�� 4. ����");
				System.out.print(" ���� : ");
				int ch = sc.nextInt();
				
				if(ch == 1) {
					member();
				}
				
				if(ch == 2) {
					login();
				}
				
				if(ch == 3) {
					findpw();
				}
				
				if(ch == 4) {
					System.out.println(" �̿��� �ּż� �����մϴ�.");
					break;
				}
		}
	}

	public static void member() {
		Member temp = new Member();
		System.out.println(" *** ȸ������ â *** ");
		System.out.print(" ������ ���̵� �Է��ϼ��� : ");
		String newid = sc.next();
		temp.id = newid;
		System.out.print(" ������ ��й�ȣ�� �Է��ϼ��� : ");
		String newpw = sc.next();
		temp.pw = newpw;
		System.out.print(" �̸��� �Է��ϼ��� : ");
		String newname = sc.next();
		temp.name = newname;
		
		memberlist.add(temp);
	}
	
	public static void login() {
		int j = 0;
		System.out.println(" *** �α��� â *** ");
		System.out.print(" �α����� ���̵� �Է��ϼ��� : ");
		String id = sc.next();
		System.out.print(" �α����� ��й�ȣ�� �Է��ϼ��� : ");
		String pw = sc.next();
		
		for(int i =0; i <memberlist.size(); i++) {
			if(memberlist.get(i).id.equals(id)) {
				if(memberlist.get(i).pw.equals(pw)) {
					System.out.println(" *** �α��� ���� *** ");
					System.out.println("\n\n");
					membermenu(i);	
				}	
			
				j = i;
			
			}
		}
		
		if(!memberlist.get(j).id.equals(id)) {
			System.out.println("���̵� Ʋ�ǽ��ϴ�.");
		}
		
		else if(!memberlist.get(j).pw.equals(pw)) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}
		
	}
	
	public static void findpw() {
		System.out.print(" ã���� ��й�ȣ�� �̸��� �Է��ϼ��� : ");
		String findname = sc.next();
		int j = 0;
		
		for(int i = 0 ; i < memberlist.size(); i++) {
			if(memberlist.get(i).name.equals(findname)) {
				System.out.println(memberlist.get(i).name + " ���� ��й�ȣ�� : " + memberlist.get(i).pw + " �Դϴ�.");
			}
			
			j  = i;
		}
		
		if(!memberlist.get(j).name.equals(findname)) {
			System.out.println(findname + " ���� �� ���̵�� ���������ʽ��ϴ�. ");
		}
		
	}
	
	public static void membermenu(int k ) {
		while(true) {
			System.out.println(" *** ���»��� â *** ");
			System.out.println(" 1.���»��� 2.�Ա� 3.���");
			System.out.println(" 4.�ܰ�   5.����");
			System.out.print(" ���� : ");
			int ch = sc.nextInt();
			
			if(ch == 1) {
				makeaccount(k);
			}
			
			if(ch == 2) {
				input(k);
			}
			
			if(ch == 3) {
				output(k);
			}
			
			if(ch == 4) {
				extra();
			}
			
			if(ch == 5) {
				System.out.println(" ���»��� �޴����� �����ϴ�.");
				break;
			}
		}
		
	}
	
	public static void makeaccount(int k) {
		System.out.println(memberlist.get(k).name + " �� �ݰ����ϴ�.");
		
		Account temp1 = new Account();
		System.out.println(" *** ȸ������ â *** ");
		System.out.print("������ ���� ��ȣ�� �Է��ϼ��� : ");
		String newaccount = sc.next();
		for(int i =0 ; i < accountlist.size(); i++) {
			if(accountlist.get(i).ano.equals(newaccount)) {
				System.out.println(" �̹� �ִ� ���¹�ȣ�Դϴ�.");
			}
		}
		temp1.ano = newaccount;
		System.out.print("������ ���� ��ȣ�� ��й�ȣ�� �Է��ϼ��� : ");
		String newpw = sc.next();
		temp1.apw = newpw;
		
		temp1.money = 0;
		
		accountlist.add(temp1);
		
	}
	
	public static void input(int k ) {
		int s = 0;
		System.out.println(memberlist.get(k).name + " �� �ݰ����ϴ�.");
		
		System.out.print("�Ա��� ���¸� �Է����ּ��� : ");
		String accnum = sc.next();
		
		System.out.print("�Ա��� ���¹�ȣ�� ��й�ȣ�� �Է����ּ��� : ");
		String accpw = sc.next();
		
		for(int i = 0 ; i < accountlist.size(); i++) {
			if(accountlist.get(i).ano.equals(accnum)) {
				if(accountlist.get(i).apw.equals(accpw)) {
				System.out.print("�Ա��� �ݾ��� �Է��ϼ��� : ");
				int inputmoney = sc.nextInt();
				
				accountlist.get(i).money += inputmoney;
				System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
				
				}
			}
			
			s = i;
		}
		
		if(!accountlist.get(s).ano.equals(accnum)) {
			System.out.println(" ���¹�ȣ�� Ʋ�Ƚ��ϴ�. ");
		}
		else if(!accountlist.get(s).apw.equals(accpw)) {
			System.out.println(" ���¹�ȣ�� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}
		
		
		
		
	}
	
	public static void output(int k) {
		int s = 0;
		System.out.print("����� ������ ��ȣ�� �Է����ּ��� : ");
		String accnum = sc.next();
		
		System.out.print("����� ���¹�ȣ�� ��й�ȣ�� �Է����ּ��� : ");
		String accpw = sc.next();
		
		for(int i = 0 ; i < accountlist.size(); i++) {
			if(accountlist.get(i).ano.equals(accnum)) {
				if(accountlist.get(i).apw.equals(accpw)) {
					System.out.print("����� �ݾ��� �Է����ּ��� : ");
					int outputmoney = sc.nextInt();
					
					if(accountlist.get(i).money < outputmoney) {
							System.out.println("�ܰ����ڸ��ϴ�. [�Ա����������ּ���]");
					}
					else {
							accountlist.get(i).money -= outputmoney;
							System.out.println(" ��� ���� ");
					}
					
				}
			}
			
			s = i;
			
		}
		
		if(!accountlist.get(s).ano.equals(accnum)) {
			System.out.println(" ���¹�ȣ�� Ʋ�Ƚ��ϴ�. ");
		}
		else if(!accountlist.get(s).apw.equals(accpw)) {
			System.out.println(" ���¹�ȣ�� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}
		
		
	}
	
	public static void extra() {
		for(int i = 0; i < accountlist.size(); i++) {
			System.out.println(accountlist.get(i).ano + "�� ���¿��� " + accountlist.get(i).money + " ��ŭ�� �����ֽ��ϴ�.");
		}
	}
	/*
	�ٷ�  if(!string.equlas("���ڿ�")



			ex ) 



			if(!str1.equals("AA")){

			System.out.println("AA�� �ƴմϴ�");

			}

	*/

			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


