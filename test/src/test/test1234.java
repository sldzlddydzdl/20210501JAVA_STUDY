package test;

import java.util.ArrayList;
import java.util.Scanner;

public class test1234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Member> memberlist = new ArrayList<>();
		
		while(true) {
			System.out.println(" ** ȸ���� ���α׷� **");
			System.out.println(" 1.ȸ������ 2.�α��� 3.ȸ��Ż�� 4.ȸ����� ");
			System.out.print(" ���� : ");
			int ch = sc.nextInt();
			
			if(ch == 1) {
				// member ����� temp ��ü ����
				Member temp = new Member();
				System.out.println(" **ȸ������ â** ");
				System.out.print(" ������ ���̵� ");
				temp.id = sc.next();
				System.out.print(" ������ ��й�ȣ ");
				temp.pw = sc.next();
				System.out.print(" ������ �̸� ");
				temp.name = sc.next();
				
				// ��ü ����Ʈ�� ���
				memberlist.add(temp);
			}
			
			if(ch == 2) {
				System.out.println(" ** �α��� â ** ");
				System.out.print(" ���̵� : ");
				String logid = sc.next();
				System.out.print(" ��й�ȣ :  ");
				String logpw = sc.next();
				
				int count = 0;
				
				for(int i = 0; i < memberlist.size(); i ++) {
					if(memberlist.get(i).id.equals(logid) && memberlist.get(i).pw.equals(logpw)) {
						System.out.println(" ** �α��� ���� **");
						count ++;
						break;
					}
				}
				
				
				
			}
			
			if(ch == 3) {
				
			}
			
			if(ch == 4) {
				
			}
		}

	}
	
	

}
