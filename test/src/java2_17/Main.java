package java2_17;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	
	
	public static Scanner sc = new Scanner(System.in);
//	public static ī���<String, Integer, Integer> ī�� = new ī���<>(sc.next() ,sc.nextInt() , s );
	
	public static void main(String[] args) {
		
		ȸ�����<����ī��> ����ī���� = new ȸ�����<>("����ī��" , 5);
		ȸ�����<����ī��> ����ī���� = new ȸ�����<>("����ī��" , 5);
		ȸ�����<�Ե�ī��> �Ե�ī���� = new ȸ�����<>("�Ե�ī��" , 5);
		
		ī��� card = new ī���();
		
		Random ra = new Random();
		int count = 0;
		int count1= 0; 
		int count2 = 0;
		while(true) {
			System.out.println(" ***** ī��� ȸ������ ���α׷� *****");
			System.out.println("========= ȸ����� ========");
			
				Object[] temp1 = ����ī����.ȸ�����;
				Object[] temp2 = ����ī����.ȸ�����;
				Object[] temp3 = ����ī����.ȸ�����;
				if(temp1[0] == null && temp2[0] == null && temp3[0] == null) {
					System.out.println("\n      �������� �����ϴ�     ");
				}
				else {
					ȸ�����(����ī����);	
					ȸ�����(����ī����);
					ȸ�����(�Ե�ī����);	
				}
			
			System.out.println();
			System.out.println("===========�޴�===========");
			System.out.println("1. ���  2.Ż��  3.����");
			System.out.print(" ���� : ");
			int ch = sc.nextInt();
			if(ch == 1) { // ī�� ���
		
				System.out.println(" 1.��翬��[����ī��] 2. ���ɺ�ī��[����ī��(����) , �Ե�ī��(û�ҳ�) ");
				
				int choice = sc.nextInt();
				
				System.out.println(" �̸��� �Է����ּ��� : ");
					String �̸� = sc.next();
				System.out.println(" ���̸� �Է����ּ��� : ");
					int ���� = sc.nextInt();
					
					int ī���ȣ = ra.nextInt(5) + 1;
								
				
			//	temp.ī����(sc.next(), sc.nextInt(), s);
							
				if(choice == 1) {
					
					����ī����.ȸ���߰�(new ����ī��(�̸�, ����, ī���ȣ));
					
					Object[] ����temp = ����ī����.ȸ�����;
					
					count++;
					if(count >= 2) {
						
						for(int i = count-1; i > 0; i--) {
							����ī�� sinhan1 = (����ī��)����temp[0];
							for(int j  = i -1 ; j > 1; j--) {
								����ī�� sinhan2 = (����ī��)����temp[j]; 
								while(sinhan1.ī���ȣ == sinhan2.ī���ȣ) {
									sinhan2.ī���ȣ = ra.nextInt(5) +1;
									System.out.println("�ߺ��� ī���ȣ�Դϴ�.");
									System.out.println("�ߺ��ȹ�ȣ : " + sinhan2.ī���ȣ);
								}
							}
						}
						
						
						for(int i = 0 ; i < count-1; i++) {
							����ī�� sinhan1 = (����ī��)����temp[i];
							for(int j = i+1; j < count; j++) {
								����ī�� sinhan2 = (����ī��)����temp[j]; 
								while(sinhan1.ī���ȣ == sinhan2.ī���ȣ) {
									sinhan2.ī���ȣ = ra.nextInt(5) +1;
									System.out.println("�ߺ��� ī���ȣ�Դϴ�.");
									System.out.println("�ߺ��ȹ�ȣ : " + sinhan2.ī���ȣ);
								}
							}						
							
						}
						
						
						
						
						
						if(count == ����temp.length) {
							����ī�� sinhan1 = (����ī��)����temp[0];
							����ī�� sinhan2 = (����ī��)����temp[count-1];
							if(sinhan1.ī���ȣ == sinhan2.ī���ȣ) {
								
								sinhan2.ī���ȣ = ra.nextInt(5) + 1;
								
							}
						}
						
						

					
						
						
					
						
						
						
					}	
					
					
					
					
				}
				
				
				if(choice == 2) {
					
					if( ���� <= 19) {
						
						����ī����.ȸ���߰�(new ����ī��(�̸�, ���� , ī���ȣ));
						
						Object[] ����temp = ����ī����.ȸ�����;
						count1++;
						if(count1 >= 2) {
							for(int i = 0 ; i < count1-1;  i++) {
								����ī�� kook1 = (����ī��)����temp[i];
								for(int j = i + 1; j < count1; j++) {
									����ī�� kook2 = (����ī��)����temp[j];
									while(kook1.ī���ȣ == kook2.ī���ȣ) {
										kook2.ī���ȣ = ra.nextInt(5)+1;
										System.out.println("�ߺ��� ī���ȣ�Դϴ�.");
										System.out.println("�ߺ��ȹ�ȣ : " + kook2.ī���ȣ);
									}
								}
							}
						}
						
					}
					else {
						
						�Ե�ī����.ȸ���߰�(new �Ե�ī��(�̸�, ���� , ī���ȣ));
						
						Object[] �Ե�temp = �Ե�ī����.ȸ�����;
						count2++;
						if(count2 >= 2) {
							for(int i = 0 ; i < count2-1;  i++) {
								�Ե�ī�� lotte1 = (�Ե�ī��)�Ե�temp[i];
								for(int j = i + 1; j < count2; j++) {
									�Ե�ī�� lotte2 = (�Ե�ī��)�Ե�temp[j];
									while(lotte1.ī���ȣ == lotte2.ī���ȣ) {
										lotte2.ī���ȣ = ra.nextInt(5)+1;
										System.out.println("�ߺ��� ī���ȣ�Դϴ�.");
										System.out.println("�ߺ��ȹ�ȣ : " + lotte2.ī���ȣ);
									}
								}
							}
						}
						
					}
					
				}
			}
			
			if(ch ==2) { // ī�� Ż��
				
				System.out.println("Ż���Ͻ� ī��縦 �Է��ϼ��� : ");
				System.out.println("1.����ī�� 2. ����ī�� 3. �Ե�ī��");
				int out1 = sc.nextInt();
				System.out.print(" Ż���Ͻ� ī���ȣ�� �Է��ϼ��� : ");
				int out2 = sc.nextInt();
				
				
				if(out1 == 1) {
					Object[] ����temp = ����ī����.ȸ�����;
						
					for(int i = 0 ; i < ����temp.length; i++) {
						
						����ī�� temp = (����ī��)����temp[i];
						
						if(����temp[i] == null) {
							break;
						}
						
						if(temp.ī���ȣ  == out2) {
							����temp[i] = null;
							
							break;
						}
					}
				}
				
				if(out1 == 2) {
					
					Object[] ����temp = ����ī����.ȸ�����;
					
					for(int i = 0 ; i < ����temp.length; i++) {
						
						����ī�� temp = (����ī��)����temp[i];
						
						if(temp.ī���ȣ  == out2) {
							����temp[i] = null;
							break;
						}
					}
					
				}
				
				if(out1 == 3) {
					
					Object[] �Ե�temp = �Ե�ī����.ȸ�����;
					
					for(int i = 0 ; i < �Ե�temp.length; i++) {
						
						�Ե�ī�� temp = (�Ե�ī��)�Ե�temp[i];
						
						if(temp.ī���ȣ == out2) {
							�Ե�temp[i] = null;
							break;
						}
					}
				}
				
				// 1.����ī�尡 2���̻󿡼� Ż���ϸ� ù��°�� Ż��Ǿ���ϴµ� ������ �ڿ������ ���ŵǴ°� ����ó���ϱ�
				// 2.ī���ȣ �ߺ��� ����
				
				
				
			}
			
			if(ch == 3) { // ����
				
				break;
			}
			
			
		}
	
		
	}
	
	
	public static void ȸ�����(ȸ�����<?> course) {
		
		System.out.println("ī���� : " + course.ī���� +
				Arrays.toString(course.ȸ�����));
		
		
	}
	

}
