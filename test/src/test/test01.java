package test;

import java.util.ArrayList;
import java.util.Scanner;



public class test01 {

	public static void main(String[] args) {
		/*
		int[] ���� = {83, 90 , 97};
		System.out.println("�迭�� 1��° : " + ����[0]);
		System.out.println("�迭�� 2��° : " + ����[1]);
		System.out.println("�迭�� 3��° : " + ����[2]);
		
		for(int i = 0 ; i < ����.length; i++) {
			System.out.println(i + "��° ���� : " + ����[i]);
		}
		
		int[] score = new int[] {83,90,87};
		
		int sum = 0;
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		System.out.println(sum);
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		int N = sc.nextInt();
		System.out.print("���� �Է��ϼ��� : ");
		int M = sc.nextInt();
			
		
		String[][] stu = new String[N][M];
		
		
		
		for( int i = 0; i < N; i++) {
		//	for( int j = 0; j < M; j++) {
				System.out.print(i + "��° �л��� �̸��� �Է��ϼ��� : ");
				stu[i][0] = sc.next();
				System.out.print(i + "��° �л��� ���������� �Է��ϼ��� : ");
				stu[i][1] = sc.next();
				System.out.print(i + "��° �л��� ���������� �Է��ϼ��� : ");
				stu[i][2] = sc.next();
				
		//	}
		}
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int stu[] = null;
		
		while(true) {
			System.out.println(" -------- �޴��� ----------");
			System.out.println("1. �л���");
			System.out.println("2. �����Է�");
			System.out.println("3, ��������Ʈ");
			System.out.println("4. �м�");
			System.out.println("5. ����");
			System.out.print("���� : ");
			int ch = sc.nextInt();
			
			
			if(ch == 1) {
				System.out.println("�л����� �Է��ϼ��� : ");
				n = sc.nextInt();
				
				stu = new int[n];
			}
			
			if(ch == 2) {
				System.out.println("�л� ������ �Է��ϼ��� :");
				for(int i = 0 ; i < stu.length; i ++) {
					stu[i] = sc.nextInt();
				}
			}
			
			if(ch == 3) {
				System.out.println("�л����� ���� : ");
				for(int i = 0 ; i < stu.length; i++) {
					System.out.println((i+1) + "��° �л��� ���� : " + stu[i]);
				}
			}
			
			if(ch == 4) {
				int sum = 0;
				int max = 0;
				
				for(int i = 0;  i < stu.length; i ++) {
					sum += stu[i]; 
				}
				System.out.println("��ü�л����� ��� : " + (double)(sum/stu.length));
				
				for(int i = 0;  i < stu.length; i++) {
					if(max < stu[i]) {
						max = stu[i];
					}
				}
				System.out.println("�ְ����� : " + max);
			}
			
			if(ch == 5) {
				System.out.println("�����մϴ�. ");
				break;
			}
		}
		*/
		
		/*
		ArrayList<String> list = new ArrayList<>();
		
		list.add("���缮");
		list.add("��ȣ��");
		System.out.println("����Ʈ ���� : " + list.size());
		list.remove(0);
		System.out.println("������ ����Ʈ ���� : " + list.size());
		System.out.println("����Ʈ ��� : " + list.get(0));
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		
		
		ArrayList<Member> list = new ArrayList<>();
	//	int count = 0;
		
		
		while(true) {
			System.out.println(" *** ȸ���� ���α׷� ***");
			System.out.println(" 1.ȸ������ 2.�α��� 3.ȸ��Ż�� 4.ȸ�����");
			System.out.print("���� : ");
			int ch = sc.nextInt();
			
			if(ch == 1) {
				Member temp = new Member();
				System.out.println(" *** ȸ������ â *** ");
				System.out.print("������ ���̵� : ");
				temp.id = sc.next();
				System.out.print("������ ��й�ȣ : ");
				temp.pw = sc.next();
				System.out.print("������ �̸� : ");
				temp.name = sc.next();
				
				list.add(temp);				
			}
			
			if(ch == 2) {
				System.out.print("�α����� ���̵� �Է��ϼ��� : ");
				String logid = sc.next();
				System.out.println("�α����� ��й�ȣ�� �Է��ϼ��� : ");
				String logpw = sc.next();
		
				int count = 0;
				
				for(int i = 0;  i < list.size(); i ++) {
					
					// Ȯ�����ϱ� list.get(i).id.equals(logid) && list.get(i).pw.equals(logpw)
					if(logid.equals(list.get(i).id) && logpw.equals(list.get(i).pw))
					{
						System.out.println("�α����� �Ǿ����ϴ�.");
						count ++;
						break;
					}
					
					
				}
				if(count == 0) {
					System.out.println("��й�ȣȤ�� ���̵� Ʋ�Ƚ��ϴ�.");
				}
				
			}
			
			if(ch == 3) {
				System.out.println(" *** ȸ��Ż�� â *** ");
				System.out.print("Ż���� �̸��� �Է��ϼ��� : ");
				String outname = sc.next();
				for(int i = 0; i < list.size(); i++) {
					if(list.get(i).name.equals(outname)) {
						list.remove(i);
					}
				break;
				}
			}
			
			if(ch == 4) {
				System.out.println(" *** ȸ�����â ***");
				for(int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i).name);
				}
			}
			
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		ArrayList<TellMember> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		String recentname = null;
		String recentnum = null;
		
		
		while(true) {
			System.out.println(" ------ �޴� â -------");
			System.out.println("1. ��ȭ��ȣ ���");
			System.out.println("2. ��ȭ�ɱ�");
			System.out.println("3. ��ȭ��ȣ��");
			System.out.println("4. �ֱ���ȭ�� ���");
			System.out.println("5. ����");
			System.out.print("���� : ");
			int ch = sc.nextInt();
			
			if(ch == 1) {
				TellMember temp = new TellMember();
				System.out.println("------- ��ȭ��ȣ ��� â ---------");
				System.out.print("����� �̸��� ���ּ��� : ");
				temp.name = sc.next();
				System.out.print("����� ��ȭ��ȣ�� ���ּ��� : ");
				temp.tellnum = sc.next();
				
				list.add(temp);
			}
			
			if(ch == 2) {
				int count = 0;
				System.out.println("��ȭ�� �̸��� �Է��ϼ��� : ");
				String toname = sc.next();
				System.out.println("��ȭ�� ��ȣ�� �Է��ϼ��� : ");
				String totellnum = sc.next();
				
				for(int i = 0; i < list.size(); i++) {
					if(list.get(i).name.equals(toname) && list.get(i).tellnum.equals(totellnum)) {
						System.out.println(list.get(i).name + "���� ��ȭ�� �̴ϴ�.");
						count++;
						recentname = list.get(i).name;
						recentnum = list.get(i).tellnum;
						break;
					}
				}
				
				if(count == 0) {
					System.out.println("��ȭ���� �̸��̳� ��ȭ��ȣ�� �����ϴ�.");
				}
			}
			
			if(ch == 3) {
				System.out.println("�̸�\t\t��ȭ��ȣ");
				for(int i = 0; i < list.size(); i++) {
					
					System.out.println(list.get(i).name + "\t\t" + list.get(i).tellnum);
				}
			}
			
			if(ch == 4) {
				System.out.println("�����ֱٿ� ��ȭ�� �̸��� : " + recentname + " �̰� ��ȭ��ȣ�� : " + recentnum + " �Դϴ�.");
			}
			
			if(ch == 5) {
				System.out.println("�����մϴ�. ");
				break;
			}
			
		}
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int point = 0;
		if(B > C) {
			System.out.println(-1);
		}
		for(int i = 0;  i< 1000; i++) {
			point = A + (i*B) - (i*C);
			if(point < 0) {
				System.out.println(i);
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
		
		





















