package java2_11;

import java.util.Scanner;

import java2_11.*; // ��Ű�� ȣ�� 

public class ������ extends ȸ�� {
	
	public static Scanner scan = new Scanner(System.in);
	// �ʵ�
	String ���� ; 
	
	// ������
	public ������( String id , String pw , String name , String ���� ) {
		
		super(id, pw, name);
		this.���� = ����;
		
	}
	public void ȸ������() {
		super.ȸ������();
		System.out.println(" ���� : " + ����);
	}
	// ȸ������ �޼ҵ� 
	public void ȸ������() {
		for( int i = 0 ; i <main.ȸ������Ʈ.size(); i++  ) {
			
			System.out.println( i + "��");
			main.ȸ������Ʈ.get(i).ȸ������();
		}
		System.out.println(" ȸ�������� ��ȣ �Է� ");
		int ch = scan.nextInt();
		main.ȸ������Ʈ.remove(ch);		
	}
	
	@Override
	public void ȸ�����() {
		// TODO Auto-generated method stub
		super.ȸ�����();
	}
	
}
