package java2_18;

import java.util.*;

public class ȸ�����Խ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); // �Է�
		Map<String, String> ȸ�� = new HashMap<>(); // map �÷���
		Set<�Խù�> �Խ��� = new HashSet<>(); // set �÷���
		
		while(true) {
			
			System.out.println(" ** ȸ���� �Խ��� **");
			System.out.println("1.ȸ������");
			System.out.println("2.�α���");
			int ���� = sc.nextInt();
			
			if(���� == 1) {
				System.out.println(" ** ȸ������ ** ");
				System.out.println(" ���̵� ");
					String ���̵� = sc.next();
				System.out.println(" ��й�ȣ ");
					String ��й�ȣ = sc.next();
					
				ȸ��.put(���̵�, ��й�ȣ); // ������ ���̵� ���� // ������ Ű ������ ����.	
					
			}
			
			if(���� == 2) {
				
				System.out.println(" ** �α��� ** ");
				System.out.println(" ���̵� ");
					String ���̵� = sc.next();
				System.out.println(" ��й�ȣ ");
					String ��й�ȣ = sc.next();
				
				if(ȸ��.containsKey(���̵�)) {
					
					if(ȸ��.get(���̵�).equals(��й�ȣ)) {
						System.out.println(" *** �α��� ���� *** ");
						
						while(true) {
						System.out.println(" ����\t\t����\t\t�ۼ���");
							Iterator<�Խù�> iterator = �Խ���.iterator();
							if(!iterator.hasNext()) { // ���࿡ ������Ұ� ������
								System.out.println("�ش� �Խù��� �����ϴ�");
							}
							while(iterator.hasNext()) {
								
								�Խù� temp = iterator.next();
								
								System.out.println(temp.����+"\t\t"+temp.����+"\t\t"+temp.�ۼ���);
								
							}
							System.out.println("1. �Խù� �ۼ� 2. ����");
							int ����2 = sc.nextInt();
							
							if(����2 ==1) {
								System.out.println(" ���� ");
								String ���� = sc.next();
								System.out.println(" ���� ");
								String ���� = sc.next();
								
								�Խù� temp2 = new �Խù�(����, ����, ���̵�);
								
								�Խ���.add(temp2);
							}
							if(����2 ==2) {
								break;
							}
							
						}
						
					}
					else {
						System.out.println("�н����� �ٸ��ϴ�"); // Ű�� �ش��ϴ� ���� ��ġ ����
					}
					
				}
				else {
					System.out.println("���̵� �������� �ʽ��ϴ�"); // Ű ����
				}
			}
		}
		
	}

}
