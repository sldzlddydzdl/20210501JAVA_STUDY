package java1_11;

import java.util.Scanner;

import java1_11.*;

public class ������ extends ȸ��{
	
	public static Scanner sc = new Scanner(System.in);
	
	String ����;
	
	public ������(String id , String pw , String name , String ����) {
		super(id, pw, name);
		this.���� = ����;
	}
	
	@Override
	public void ȸ������() {
		
		super.ȸ������();
		System.out.println("��� : " + ����);
	}
	
	// ȸ�� ���� �޼ҵ�
	
	@Override
	public void ȸ������() {
		
		for(int i = 0; i < Main.ȸ������Ʈ.size(); i++) {
			
			System.out.println( i + "��");
			Main.ȸ������Ʈ.get(i).ȸ������();
		}
		
		System.out.println(" ȸ�������� ��ȣ �Է� ");
		
		int ch = sc.nextInt();
		Main.ȸ������Ʈ.remove(ch);
	}
	
	@Override
	public void ȸ�����() {
		// TODO Auto-generated method stub
		super.ȸ�����();
	}
	
}
