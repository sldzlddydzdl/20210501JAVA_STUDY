package java2_15;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<ȸ��> ȸ����� = new ArrayList<>();
	public static ArrayList<�۾���> �۸�� = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Ŭ���� : ȸ��, �Խ���[ �湮�� ]
					// [ �ʵ� : ���̵� , ��й�ȣ , �̸�]
					// [ �ʵ� : ���� , �ۼ��� , �ۼ��� ]
		//2. �޼ҵ� 
					// [ �μ� , ��ȯ��]
		
		// ȸ���� �Խ���
		
		start();
		
	}

	// public : ������
	// static : �켱 �޸� �Ҵ�
	public static void start() {
		
		boolean ����ġ = true;
		
		while(����ġ) { 
		System.out.println(" ======== ȸ���� �Խ��� =========");
		System.out.println(" 1. �α��� 2. ȸ������ 3. ����");
		
		try { // ����ó�� : ���� �߻��� �ٸ� �ڵ�� ��ü =>  ���� �߻��� catch �� �̵�
			int ���� = sc.nextInt();
			
			
			if(���� ==1) {
				ȸ�� temp = new ȸ��();
				temp.�α���();
			}
			else if(���� ==2) {
				ȸ�� temp = new ȸ��();
				temp.ȸ������();
				if(temp.��й�ȣ == null) {
					System.out.println(" ** �˸� : ȸ������ ���� ");
				}
				else {
					ȸ�����.add(temp);
					System.out.println(" *** ȸ������ ���� *** ");
				}
				
			}
			else if(���� ==3) {
				//System.exit(0); // ��� �ڵ� ����
				//return; // �޼ҵ� ����
				//break; // �ݺ��� ����
				����ġ = false; // �ݺ��� booleanŸ�� ���� �߰��� �ݺ��� ����
				System.out.println("����Ǿ����ϴ�.");
			}
			else {
				System.out.println(" ** 1~3�� ���̸� �Է����ּ��� ** ");
			}
		} catch (Exception e) {
			// TODO: handle exception
			sc = new Scanner(System.in); // ������ ��ĵ�� �޸��Ҵ�
			System.out.println(" �޴����ִ� ���ڸ� �Է����ּ��� ");
			
			
			
		}
		
			

		
		
		
		}
		
		
	}

	
	
}
