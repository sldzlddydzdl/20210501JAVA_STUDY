package java2_11;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	
	public static Scanner scan = new Scanner(System.in);
	public static ArrayList<ȸ��> ȸ������Ʈ = new ArrayList<>();
	
	public static void main(String[] args) {
		
		// ȸ���� => �α��� // ȸ������
			// ȸ�� Ŭ���� [ ����Ŭ���� ] ��� 
				// �Ϲ�ȸ�� [ ���� Ŭ���� ]
				// VIPȸ�� [ ���� Ŭ���� ]
				// ������ [ ���� Ŭ���� ] 
		int i = -1 ;
		
		while( true ) {
			
			System.out.println(" ��� ȸ���� ");
			System.out.println("1.ȸ������");
			System.out.println("2.�α���");
			System.out.println("3.ȸ������[ �α��ν� �����ڰ��� ]");
			System.out.println("4.ȸ�����[ �α��ν� VIP����");
			
			int ch = scan.nextInt();
			
			if( ch == 1) {
				join();
			}
			if( ch ==2 ) {
				i = login();

			}
			if( i!=-1 && ch ==3 ) {
				
				ȸ������Ʈ.get(i).ȸ������();
	
			}
			
			if( i!=-1 && ch ==4 ) {
				
				ȸ������Ʈ.get(i).ȸ�����();
	
			}
		}
		
		
	} // main �� 
	
	public static void join() {
		
		System.out.println("1.ȸ�� 2.VIP 3.������");
		int ch = scan.nextInt();
		
		if( ch == 1 ) {
			System.out.println(" ���̵� , ��й�ȣ , ���� ������ �Է� : ");
			ȸ�� temp = new ȸ��( scan.next() ,  scan.next()  ,  scan.next() );	
			temp.ȸ������();
			ȸ������Ʈ.add(temp);
			
		}
		if( ch== 2) {
			System.out.println(" ���̵� , ��й�ȣ , ���� , ���� ������ �Է� : ");
			VIPȸ�� temp = new VIPȸ��( scan.next() ,  scan.next()  ,  scan.next() , scan.next() );	
			temp.ȸ������();
			ȸ������Ʈ.add(temp);
		}
		if( ch== 3 ) {
			System.out.println(" ���̵� , ��й�ȣ , ���� , ���� ������ �Է� : ");
			������ temp = new ������( scan.next() ,  scan.next()  ,  scan.next() , scan.next() );	
			temp.ȸ������();
			ȸ������Ʈ.add(temp);
		}
	}
	public static int login() {
		System.out.println(" �α��� ");
		System.out.print(" ���̵� ");
		String logid = scan.next();
	
		System.out.print(" ��й�ȣ ");
		String logpw = scan.next();
		
		for( int i = 0 ; i<ȸ������Ʈ.size() ;i ++ ) {
			
			if( logid.equals(ȸ������Ʈ.get(i).id ) ) {
				if( logpw.equals( ȸ������Ʈ.get(i).pw)) {
					System.out.println("�α��� ����");
					
					return i;
					
				}
				
			}
			
		}
		return -1;
	}
	

}
