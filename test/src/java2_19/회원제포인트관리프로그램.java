package java2_19;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;




public class ȸ��������Ʈ�������α׷� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<ȸ��> ȸ��Ʈ�� = new TreeSet<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println(" ** ȸ���� ����Ʈ���� **");
			System.out.println(" ȸ����� : " + ȸ��Ʈ��);
			System.out.println(" 1. ȸ������ 2.�α���");
			int ���� = sc.nextInt();
			
			if(���� ==1) {
			
				System.out.println("*** ȸ������ ***");
				System.out.println(" ���̵� : ");
					String ���̵� = sc.next();
				System.out.println(" ��й�ȣ : ");
					String ��й�ȣ = sc.next();
				System.out.println(" �̸� : ");
					String �̸� = sc.next();
					
				ȸ�� temp = new ȸ��(���̵� ,��й�ȣ ,�̸� ,10);
				ȸ��Ʈ��.add(temp);
			}
			
			if(���� ==2) {
				
				System.out.println(" ** �α��� **");
				System.out.println(" ���̵� : ");
				 String id = sc.next();
				System.out.println(" ��й�ȣ : ");
				 String pw = sc.next();
				 
				 Iterator<ȸ��> iterator = ȸ��Ʈ��.iterator();
				 while( iterator.hasNext()) {
					 
					 ȸ�� temp = iterator.next();
					 
					 if(temp.���̵�.equals(id) &&
							 temp.��й�ȣ.equals(pw)) {
						 while(true) {
							 System.out.println(" �α��μ���");
							 temp.����Ʈ += 5;
							 System.out.println("*** ����Ʈ ���� ***");
							 System.out.println(" 1. ����Ʈ ������ ");
							 System.out.println(" 2. �̸������� ");
							 System.out.println(" 3. ���� ");
							 int ����2 = sc.nextInt();
							 
							 if(����2 == 1) {
								 
								 TreeSet<ȸ��> ����Ʈ���� = new TreeSet<ȸ��>(new ����Ʈ����());
								 
								 System.out.println(" ����Ʈ�� ȸ����� [ �������� ] ");
								 System.out.println(" ���̵�\t�̸�\t����Ʈ ");
								 
								 NavigableSet<ȸ��> �̸����� = ȸ��Ʈ��.descendingSet();								 
								 
								 for(ȸ�� temp2 : �̸�����)
									 	System.out.println(temp2.���̵� + "\t" + temp2.�̸� + "\t" + temp2.����Ʈ);	 
								 
								 System.out.println(" ����Ʈ�� ȸ����� [ �������� ] ");
								 System.out.println(" ���̵�\t�̸�\t����Ʈ ");
								 
								 �̸����� = ȸ��Ʈ��.descendingSet().descendingSet();
								 for(ȸ�� temp2 : �̸�����)
									 	System.out.println(temp2.���̵� + "\t" + temp2.�̸� + "\t" + temp2.����Ʈ);
								 
								 
							 }
							 if(����2 == 2) {
								 System.out.println(" �̸��� ȸ����� [ �������� ] ");
								 System.out.println(" ���̵�\t�̸�\t����Ʈ ");
								 
								 NavigableSet<ȸ��> �̸����� = ȸ��Ʈ��.descendingSet();
								 for(ȸ�� temp2 : �̸�����)
									 	System.out.println(temp2.���̵� + "\t" + temp2.�̸� + "\t" + temp2.����Ʈ);	 
								 
								 System.out.println(" �̸��� ȸ����� [ �������� ] ");
								 System.out.println(" ���̵�\t�̸�\t����Ʈ ");
								 
								 �̸����� = ȸ��Ʈ��.descendingSet().descendingSet();
								 for(ȸ�� temp2 : �̸�����)
									 	System.out.println(temp2.���̵� + "\t" + temp2.�̸� + "\t" + temp2.����Ʈ);	 
								  
							 }
							 if(����2 == 3) {
								 break;
								 
							 }
						 }
						 break;
					 }
					 
				 }
				 /*
				 ȸ�� temp = new ȸ��();
				 
				 
				 if(id.equals(temp.���̵�)) {
					 if(pw.equals(temp.��й�ȣ)) {
						 System.out.println(" �α��μ���");
						 temp.����Ʈ += 5;
						 
						 System.out.println("*** ����Ʈ ���� ***");
						 System.out.println(" 1. ����Ʈ ������ ");
						 System.out.println(" 2. �̸������� ");
						 System.out.println(" 3. ���� ");
						 int ����2 = sc.nextInt();
						 
						 if(����2 == 1) {
							 NavigableSet<ȸ��> �������� = ȸ��Ʈ��.descendingSet();
							 for(ȸ�� temp2 : ��������)
								 	System.out.print(temp2.����Ʈ + " ");
							 
							 �������� = ȸ��Ʈ��.descendingSet().descendingSet();
							 for(ȸ�� temp3 : ��������)
								 System.out.println(temp3.����Ʈ + " ");
						 }
						 if(����2 == 2) {
							 NavigableSet<ȸ��> �̸����� = ȸ��Ʈ��.descendingSet();
							 for(ȸ�� temp2 : �̸�����)
								 	System.out.print(temp2.�̸� + " ");
							 
							 �̸����� = ȸ��Ʈ��.descendingSet().descendingSet();
							 for(ȸ�� temp3 : �̸�����)
								 System.out.println(temp3.�̸� + " ");
							 
						 }
						 if(����2 == 3) {
							 break;
							 
						 }
						 
						 
						 
						 
						 
						 
					 }
					 else {
						 System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
					 }
				 }
				 else {
					System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
				 }
				*/
				
			}
		}
		
	}

}
