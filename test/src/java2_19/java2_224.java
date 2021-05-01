package java2_19;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class java2_224 {


	// ����Ʈ�� [ �θ��� 1���� 2���� �ڽĳ�� ]
		// ��� : �� [ ��ü , ����]
		// �θ��� �������� ���� ������ => ���� �ڽ�
		// �θ��� �������� ���� ũ�� => ������ �ڽ�
		// ��) ����
		
	
	
	
	// ����
	
	
	// ť
	
	
	
	public static void main(String[] args) {
		/*
		// 1. TreeSet Ŭ���� : ����Ʈ�� ���� Ŭ����
			// 1. .first() : ���� ������ ��� ��� [ ���� ���� ��ü ]
			// 2. .last() : ���� ������ ��� ��� [ ���� ū ��ü ]
			// 3. .lower(��ü) : �ش簴ü�� ���� �ڽĳ�� 
			// 4. .higher(��ü) : �ش簴ü�� ������ �ڽĳ��
			// 5. .floor(��ü) : �ش簴ü[����]�� ���� �ڽ� ���
			// 6. .ceiling(��ü) : �ش簴ü[����]�� ������ �ڽ� ���
			// 7. .descendingSet() : ��������
			// 8. .descendingSet().descendingSet() : ��������
				// NavigableSet ���� �������̽� : ������ ���� �ϳ��� ��� ����
			// 9. .isEmpty() : ���� Ʈ�� ��� �ִ��� ���� Ȯ�� T / F
			// 10. .pollFirst() : ���� ���� ��� ���� [ ���� ���� ��ü ����]
			// 11. .pollLast() : ���� ū ��� ���� [ ���� ū ��ü ���� ]
			// 12. .remove(��) : �ش簪 ���� 
		TreeSet<Integer> ����Ʈ�� = new TreeSet<>();
		
			// Ʈ���� ��[��ü , ��] �߰�
		
		����Ʈ��.add( 87 );
		����Ʈ��.add( 98 );
		����Ʈ��.add( 75 );
		����Ʈ��.add( 95 );
		����Ʈ��.add( 80 );
		����Ʈ��.add( 80 ); // �ߺ��� ��� X
		
		System.out.println("���� Ʈ���� ��ü�� : " + ����Ʈ��);
		
		// �˻�
		System.out.println(" ���� ���� ���� : " + ����Ʈ��.first());
			// first : ���� ���ʿ� �ִ� ��� ���
	
		System.out.println(" ���� ���� ���� : " + ����Ʈ��.last());
			// last : ���� �����ʿ� �ִ� ��� ���
	
		System.out.println(" 95�� �ٷ� �Ʒ� ���� : " + ����Ʈ��.lower(95));
			// lower( �� ) : �ش� ����� �����ڽ� ��� ���
		
		System.out.println(" 95�� �ٷ� �� ���� : " + ����Ʈ��.higher(95));
			// higher( �� ) : �ش� ����� �������ڽ� ��� ���
	
		System.out.println(" 95�� �̰ų� �ٷ� �Ʒ� ���� : " + ����Ʈ��.floor(95));
			// .floor( �� ) : �ش� ����̰ų� �����ڽ� ��� ���
			//              ��� <= �� 
	
		System.out.println(" 95�� �̰ų� �ٷ� �� ���� : " + ����Ʈ��.ceiling(95));
			// .ceiling( �� ) : �ش� ����̰ų� �������ڽ� ��� ���
			//      		��� >= �� 
		// ���� [ �������� ]
		NavigableSet<Integer> ���� = ����Ʈ��.descendingSet();
			// NavigableSet : �����������̽�			// �������� [ ���� �����ʳ����� ���]
		for(Integer temp : ����) {
			System.out.print( temp + " ");
		}
		
		System.out.println();
		// ���� [ �������� ]
		���� = ����Ʈ��.descendingSet().descendingSet(); // ��������.�������� : ��������
		
		for(Integer temp : ����)
			System.out.print(temp + " ");
		
		System.out.println();
		
		// ���� ����
		����Ʈ��.remove(87);
		
		// ��� ���� 
		while( !����Ʈ��.isEmpty()) { // !:���� 
						
			System.out.println(" ������ ��� : " + ����Ʈ��.pollLast() + "         ���� ��ü�� :" + ����Ʈ��.size());
			
		}
		 
		// ����Ʈ�� 
		TreeSet<String> ����Ʈ�� = new TreeSet<>();
		
			//Ʈ���� ��[��ü, ��] �߰�
		����Ʈ��.add("apple");
		����Ʈ��.add("forever");
		����Ʈ��.add("description");
		����Ʈ��.add("JAVA"); // 
		����Ʈ��.add("10");
		����Ʈ��.add("!");
		����Ʈ��.add("%");
		����Ʈ��.add("�ڹ�");
		����Ʈ��.add("ever");
		����Ʈ��.add("zoo");
		����Ʈ��.add("bass");
		����Ʈ��.add("bass");		
		System.out.println("���� Ʈ���� ��ü�� : " + ����Ʈ��);
			// Ư������ => ���� => �빮�� => �ҹ��� => �ѱ�
		
		// �˻�
		System.out.println(" ù��° ��� : " + ����Ʈ��.first());
		System.out.println(" ù��° ��� : " + ����Ʈ��.last());
		
		NavigableSet<String> �˻� =  ����Ʈ��.subSet("c", true, "�ڹ�", true); // c <= �˻� <= f
	//	NavigableSet<String> �˻� =  ����Ʈ��.subSet("c", false, "f", false); // c < �˻� < f
										// subSet(" �˻����۰� " , " �˻����۰����Կ��� " , "�˻�����" , �˻��������Կ��� )
	
		for(String temp : �˻� )
			System.out.print(temp + " ");	
		System.out.println();
		
		NavigableSet<String> ���ļ� = �˻�.descendingSet();
		for(String temp : ���ļ�)
			System.out.println(temp);
		
		// Map �÷��� : Ű , �� = ��Ʈ��
		*/
				// ����Ʈ��
		/*
		* 	    				[���] : ��Ʈ�� ( Ű , �� )
		* 
		* 		  [���]��Ʈ��			   [���]��Ʈ��
		* 			
		* 	[���]		[���]		[���]		[���]
		* 
		* 
		*/
		/*
		// TreeMap Ŭ����
		TreeMap<Integer, String> Ʈ���� = new TreeMap<>();
		
		Ʈ����.put(87 , "���缮");
		Ʈ����.put(98 , "��ȣ��");
		Ʈ����.put(75 , "�ŵ���");
		Ʈ����.put(95 , "������");
		Ʈ����.put(80 , "����");
		Ʈ����.put(80 , "����"); // �ߺ�x
			// �ߺ�x , Ű �������� ����
		System.out.println(" ���� Ʈ���� ��ü�� : " + Ʈ����);

		// �˻�
		System.out.println(" ���� ���� ��� : " + Ʈ����.firstEntry());
		System.out.println(" ���� ū ��� : " + Ʈ����.lastEntry());
		System.out.println(" 95�� �Ʒ� ���� : " + Ʈ����.lowerEntry(95));
		System.out.println(" 95�� �� ���� : " + Ʈ����.higherEntry(95));
		System.out.println(" 95��[����] �ٷ� �Ʒ� ���� : " + Ʈ����.floorEntry(95));
		System.out.println(" 95��[����] �ٷ� �� ���� : " + Ʈ����.ceilingEntry(95));
		
		// ���� [ �������� ]
		NavigableMap<Integer, String> ���ĸ� = Ʈ����.descendingMap();
			// Map ���� �ٷ� iterator�� ȣ����Ѵ�
		
		for(Map.Entry<Integer, String> temp : ���ĸ�.entrySet()) {
			// ��Ʈ���� Ű�� ���� ������ �ֱ� ������ ��Ʈ�������� ���� ����
			System.out.print( temp + " ");
		}
		
		System.out.println();
		
		// ���� [ �������� ]
		���ĸ� = Ʈ����.descendingMap().descendingMap();
			// Ʈ����ü�� �⺻������ ������������ ���־ ���������Լ��� ���ξ���.
		
		for(Map.Entry<Integer, String> temp : ���ĸ�.entrySet()) {
			// ��Ʈ���� Ű�� ���� ������ �ֱ� ������ ��Ʈ�������� ���� ����
			System.out.print( temp + " ");
		}
		System.out.println();
		
		// ���� ����
		Ʈ����.remove(75);
		System.out.println(" ���� Ʈ���� ��ü�� : " + Ʈ����);
		
		// ��� ����
		while(!Ʈ����.isEmpty()) {
			
			System.out.println(" ������ ��Ʈ��" + Ʈ����.pollFirstEntry());
			
		}
		
		// �˻�
		TreeMap<String, Integer> ���ڸ� = new TreeMap<>();
		
		���ڸ�.put("apple", 10);
		���ڸ�.put("forever", 20);
		���ڸ�.put("description", 30);
		���ڸ�.put("JAVA", 40); // 
		���ڸ�.put("10", 50);
		���ڸ�.put("�ڹ�", 60);
		���ڸ�.put("ever", 70);
		���ڸ�.put("zoo", 80);
		���ڸ�.put("bass", 90);
		���ڸ�.put("bass", 90); // �ߺ� x
		
		System.out.println(" ���� Ʈ���� ��ü�� : " + ���ڸ�);
		
		NavigableMap<String, Integer> �˻�2 = ���ڸ�.subMap("c", true, "�ڹ�", true);
		
		System.out.println(" �˻� ��� :" + �˻�2);
		
		for(Map.Entry<String, Integer> temp : �˻�2.entrySet())
			System.out.print(temp + " ");
		System.out.println();
		//////////////////////////////////////////////////////////////////////////////////////
		
		// ����ڰ� ���� Ŭ������ �ʵ�������� ����
		
		// ���� �������̽� : Comparable
			// compareTo �޼ҵ� �������̵��ؼ� ���ı��� ���ϱ�
		
		TreeSet<���> ���Ʈ�� = new TreeSet<>();
		
		���Ʈ��.add(new ���("���缮" , 40));
		���Ʈ��.add(new ���("��ȣ��" , 50));
		���Ʈ��.add(new ���("�ŵ���" , 20));
//		���Ʈ��.add(new ���("����" , 50));
		���Ʈ��.add(new ���("������" , 100));
//		���Ʈ��.add(new ���("������" , 100));
		
		System.out.println(" ���� Ʈ�� ��ü �� : " + ���Ʈ��);
			// ���� �߻� : Ŭ������ �ʵ尡 2�� �̻��̸� ���ı����� ��ǻ�Ͱ� ���� ����������.
			// compareTo �޼ҵ� �������̵��� : ���� x
		
		// ���� ��������
		NavigableSet<���> �������� = ���Ʈ��.descendingSet();
		
		for(��� temp : ��������)
			System.out.print(temp.���� + " ");
		
		System.out.println();
		
		// ���� ��������
		�������� = ���Ʈ��.descendingSet().descendingSet();
		
		for(��� temp : ��������)
			System.out.print(temp.���� + " ");
		
		System.out.println();
		
		
		// �̸� ��������
		NavigableSet<���> �̸����� = ���Ʈ��.descendingSet();
		
		for(��� temp : �̸�����)
			System.out.print(temp.�̸� + " ");
		
		System.out.println();
		
		// �̸� ��������
		�̸����� = ���Ʈ��.descendingSet().descendingSet();
		
		for(��� temp : �̸�����)
			System.out.print(temp.�̸� + " ");
		
		System.out.println();
		
		*/
//		Scanner sc = new Scanner(System.in);
//		TreeSet<ȸ��> ȸ������Ʈ = new TreeSet<>();
//		
//		while(true) {
//		System.out.println(" ** ȸ���� ���� ���α׷� **");
//		System.out.println("1. ȸ������");
//		System.out.println("2. �α���");
//		System.out.println("3. ����");
//		int ch = sc.nextInt();
//		
//		if(ch ==1) {
//			System.out.println(" ** ȸ������ **");
//			System.out.println(" ���̵� : ");
//			 String id = sc.next();
//			System.out.println(" ��й�ȣ : ");
//			 String pw = sc.next();
//			System.out.println(" �̸� : ");
//			 String name = sc.next();
//			 int point = 0;
//			
//			ȸ������Ʈ.add(new ȸ��(id, pw, name, point+=10));
//			
//		}
//		
//		if(ch ==2) {
//			System.out.println(" ** �α��� **");
//			System.out.println(" ���̵� : ");
//			 String id = sc.next();
//			System.out.println(" ��й�ȣ : ");
//			 String pw = sc.next();
//			
//
//			 
//			 if(id.equals(temp.���̵�)  ) {
//				 if(pw.equals(temp.��й�ȣ )){
//					 System.out.println("�α��� ����");
//				 point += 5;
//				 }
//				 else {
//					 System.out.println("��й�ȣ�� �ٸ��ϴ�.");
//				 }
//			 }
//			 else {
//				 System.out.println("���̵� �ٸ��ϴ�.");
//			 }
//			
//		}
//		
//		if(ch ==3) {
//			
//			
//		}
//		
//		
//		}
//		
//		
//		
//		
		
		
		
		
		
		
	}
	

	
}
