package java2_15;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class ȸ�� {
	
	public static ArrayList<String> �񱳻���  = new ArrayList<>();
	
	public static Scanner sc = new Scanner(System.in);
	
	// �ʵ� = �����[�޸�] = ���� / ��ü ��
	String ���̵�;
	String ��й�ȣ;
	String �̸�;
	String ����;
	
	// ������ = ��ü�� �ʱⰪ
	
	
	
	// �޼ҵ� = �ڵ� ����
	public void ȸ������() {
		System.out.println(" ==== ȸ������ ====");
		System.out.println("���̵� : ");
			���̵� = sc.next();
			
			// �ߺ�����
			for(int i = 0 ; i < Main.ȸ�����.size(); i++) {
				if( Main.ȸ�����.get(i).���̵�.equals(���̵�)) {
					System.out.println(" �����ϴ� ���̵� �Դϴ� ");
					return; // �޼ҵ� ��
				}
			}
			
			
		System.out.println("��й�ȣ : ");
			��й�ȣ = sc.next();
		System.out.println("�̸� : ");
			�̸� = sc.next();
		System.out.println(" *** �ֹι�ȣ���ڸ� 6�ڸ��� �Է����ּ��� *** ");
		System.out.println("�ֹξ��ڸ� : ");
			���� = sc.next();
		
		
			
	}
	public void �α���() {
		System.out.println(" ==== �α��� ====");
		System.out.println("���̵� : ");
			���̵� = sc.next();
		System.out.println("��й�ȣ : ");
			��й�ȣ = sc.next();		
		
		
		for(int i = 0 ; i < Main.ȸ�����.size(); i++) {
			if(Main.ȸ�����.get(i).���̵�.equals(���̵�) && Main.ȸ�����.get(i).��й�ȣ.equals(��й�ȣ)){
					System.out.println("�α��� ���� ");
					int log = i;
					�α��θ޴�(log); // �α��μ����� ������ i���� �μ��� ������
					return;
			}
			else {
				System.out.println("** �˸� : ȸ�������� �����ϴ�");
			}
		}
		
		
	}
	
	public void �α��θ޴�(int log) {
		
		System.out.println(" ** �˸� : " +Main.ȸ�����.get(log).�̸� + " �� �ȳ��ϼ���");
		
		while(true) {
		System.out.println(" ====================�����[�湮��]====================== ");
		System.out.println("\t��ȣ\t����\t\t�ۼ���\t�ۼ���");
		if(Main.�۸��.size() != 0) {
			for(int i = 0 ; i < Main.�۸��.size(); i++) {
				System.out.println("\t" + (i) + "\t" + Main.�۸��.get(i).�۳��� 
						+ "\t\t" + Main.�۸��.get(i).�ۼ��� + "\t" + Main.�۸��.get(i).�ۼ���);
			}
			
			
		}
		else {
			System.out.println(" ** �˸� :  �Խù��� �����ϴ�.");
		}
		
		
		Calendar cal = Calendar.getInstance();
		String �񱳻���1 = "";		
				
		for(int j = 0 ; j < Main.ȸ�����.size(); j++) {
			for(int i = 2 ; i < Main.ȸ�����.get(log).����.length()-2; i++) {
				�񱳻���1 += Main.ȸ�����.get(j).����.charAt(i);
				
			}	
			�񱳻���.add(�񱳻���1);
			�񱳻���1 = "";
		}
		
		int[] �� = new int[�񱳻���.size()];
		
		for(int i = 0 ; i < �񱳻���.size(); i++) {
			 ��[i] = Integer.parseInt(�񱳻���.get(i));
		}
		
		int month = cal.get(Calendar.MONTH);
		
		System.out.println(" ================== " + (month+1)  + "�� ������ ===================== ");
		for(int i = 0 ;i < Main.ȸ�����.size(); i++) {
			if(month+1 == ��[i]) {
				System.out.println(Main.ȸ�����.get(i).�̸� );
			}
		}
		System.out.println("======================================================");
		
		
		System.out.println("1.�۾��� 2.�ۻ��� 3.�ۼ��� 4.�α׾ƿ�");
		
		try {
			int ���� = sc.nextInt();
			if(���� == 1) {
				�۾��� temp = new �۾���();
				temp.write(log);
				Main.�۸��.add(temp);
			}
			else if(���� == 2) {
				�۾��� temp = new �۾���();
				temp.remove(log);
				
			}
			else if(���� == 3) {
				�۾��� temp = new �۾���();
				temp.modify(log);
				
			}
			else if(���� == 4) {
				System.out.println("�α׾ƿ� �մϴ�");
				return;
			}
			else {
				System.out.println(" 1~4�� ���̸� �Է����ּ��� ");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			sc = new Scanner(System.in); // ������ ��ĵ�� �޸��Ҵ�
			System.out.println(" �޴����ִ� ���ڸ� �Է����ּ��� ");
			
		}
		
		
		}
	}
	
}
