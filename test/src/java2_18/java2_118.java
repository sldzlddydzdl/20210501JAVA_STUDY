package java2_18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class java2_118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �÷��� �����ӿ�ũ
			// �÷��� : ����
			// �����ӿ�ũ : ���α׷� ������ ���� �̸� ������� ���α׷�
				// ���̺귯�� : ���α׷� ������ ���� ����
					// ���̺귯�� -> �ҽ� -> �����ӿ�ũ
		
		// Collection => 1.list / 2. set
		// Map
		
		//1. List �÷���
			// 0. ArrayList // 1.Vector // 2.LinkedList : ��� ����ϱ�
				// ��Ƽ������ : Vector   // ���Ͻ����� : ArrayList // �ε����� ��ȭ�� �������� : LinkedList 	
		
			// 1.1 ArrayList Ŭ����
				// 1. .add("��ü") ��ü �߰�
				// 2. .get( �ε��� ) �ش��ϴ� �ε����� ��ü ȣ��
				// 3. .size() ��ü ��
				// 4. .remove( �ε��� ) �ش��ϴ� �ε����� ��ü ����
				// 5. .clear() ��� ��ü ����
				
				
		
				// ����1 
					List<String> list = new ArrayList<>();
					// �������̽� = Ŭ���� 
		//			list = new Vector<>(); // �������̽� ���߿� �޸𸮺��� ����
						// �ڷ��� ���� ����Ǵ� ��� => �������̽� 
									
		//			ArrayList<String> list2 = new ArrayList<>();
					// Ŭ���� = Ŭ����
						
	//		[����]	list2 = new Vector(); // Ŭ���� ���߿� ���ο� �޸� ���� �Ұ���
						// �������� �ڷ��� => Ŭ����[��ü]
					
					
				list.add("java");			// ����Ʈ�� ��ü �߰� 
				list.add("JDBC");			// ����Ʈ�� ��ü �߰� 
				list.add("Servlet/jsp");	// ����Ʈ�� ��ü �߰� 
				list.add("database");		// ����Ʈ�� ��ü �߰� 
				list.add("C");				// ����Ʈ�� ��ü �߰� 
				
				System.out.println(" ����Ʈ�� ��ü�� : " + list.size());
				
				for(int i = 0 ; i < list.size(); i++) {
					System.out.println("����Ʈ�� �ε��� : " + i + " ���� " + list.get(i));
				}
				
				list.remove(3); // �ε����� �����ǰ� ������ �� �ε������� ��ĭ�� �����
				System.out.println();
				
				System.out.println(" *������ ����Ʈ�� ��ü�� : " + list.size());
				
				for(int i = 0 ; i < list.size(); i++) {
					System.out.println("����Ʈ�� �ε��� : " + i + " ���� " + list.get(i));
				}
				
					// for( �ʱⰪ ; ���ǹ� ; ������ ) 
				// ����Ʈ �ݺ���
				for(String temp : list) {	// ����Ʈ�� ��ü�� null�϶����� �Ѱ��� temp ����
					System.out.println(temp);
				}
				
				list.clear(); // ��� ��ü ����
				System.out.println();
				
				System.out.println(" * ��� ������ ����Ʈ�� ��ü�� : " + list.size());

				for(int i = 0 ; i < list.size(); i++) {
					System.out.println("����Ʈ�� �ε��� : " + i + " ���� " + list.get(i));
				}
				
		System.out.println("*************************************************");
				
			// 1.2 Vector Ŭ����
				// ������ : ArrayList ������ ������ 
				// ���� : Vector [ ����ȭ O ] 		��Ƽ������ ������ Vector ���
				// ���� : ArrayList[ ����ȭ X ] 	���Ͻ����� ������ ArrayList ���
				
				List<�Խù�> list2 = new Vector<>();
				
				list2.add(new �Խù�("����1", "����1", "�ۼ���1"));
				list2.add(new �Խù�("����2", "����2", "�ۼ���2"));
				list2.add(new �Խù�("����3", "����3", "�ۼ���3"));
				list2.add(new �Խù�("����4", "����4", "�ۼ���4"));
				list2.add(new �Խù�("����5", "����5", "�ۼ���5"));
				
				System.out.println("����Ʈ�� ��ü �� : " + list2.size());
				
				for(�Խù� temp2 : list2) {
					System.out.println(temp2.����);
					System.out.println(temp2.����);
					System.out.println(temp2.�ۼ���);
				}
				
				list2.remove(3);
				
				System.out.println();
				System.out.println(" list2 ���� �� ");
				for(�Խù� temp2 : list2) {
					System.out.println(temp2.����);
					System.out.println(temp2.����);
					System.out.println(temp2.�ۼ���);
				}
				System.out.println("����Ʈ�� ��ü �� : " + list2.size());
				
				System.out.println();
				
				list2.clear();
				System.out.println(" list2 ��� ���� ��");
				System.out.println(" ����Ʈ�� ��ü �� : " + list2.size());
				
		System.out.println("***********************************************");
		
			// 1.3 LinkedList Ŭ����
				// ���� : ArrayList , Vector : �ε��� �������� �޸� ����
				// ���� : LinkedList / head , tail �������� �޸� ���� 
					// ���������� �߰�/���� => ArrayList
					// �߰��� �߰�/���� => LinkedList
					// �˻� => ArrayList
		
			List<String> list3 = new ArrayList<>();
			List<String> list4 = new LinkedList<>();
		
			long ����;
			long ��;
			
			���� = System.nanoTime(); // ���� ����ð�
			for(int i = 0 ; i < 10000; i++) {
				
				list3.add(0, String.valueOf(i)); // 0��° �ε��� �߰�
				
				
			}
			�� = System.nanoTime();
			
			System.out.println("ArrayList �ɸ��ð� : " + (��-����) + "ns");
			
			���� = System.nanoTime();
			for(int i = 0; i < 10000; i++) {
				
				list4.add(0, String.valueOf(i));// 0��° �ε��� �߰�
			}
			
			�� = System.nanoTime();
			
			System.out.println("Linkedlist �ɸ��ð� : " + (��-����) + "ns");
		
			// ��� LinkedList �� ArrayList ���� �ε����� ��ȭ�� �������� 3~4�� ������.
		
		System.out.println("********************************************");
		
			
		// SET �÷���
				// list ���� : �ε��� �������� ������� ����
				// Set : �ε��� X : ��������� ����
					//1. .add(��ü ) : ��ü �߰� // !!!�ߺ�����
					//2. .size() : ��� ��ü ��
					//3. .iterator() : ��� ��ü
						// .hasNext() : ������� ���� Ȯ�� / T /F
						// .next() : ������� ��ȯ
					//4. .remove(��ü) : �ش� ��ü ����
					//5. clear() : ��� ��ü ���� 
				
				// HashSet Ŭ����
				Set<String> set = new HashSet<>();
				
				set.add("java");
				set.add("JDCB");
				set.add("Servlet/jsp");
				set.add("Database");
				set.add("C");
				set.add("C"); // �ߺ� ��� ���� ����
				
				System.out.println(" HashSet ��ü�� : " + set.size());
		
				// ��� : ����ϱ����ؼ��� �Ѱ��� ��� 
				Iterator<String> iterator = set.iterator();
					// set �÷��ǿ� �����ϴ� ���ͷ����͸� �������̽��� ���� ��Ų��
					// set�� �����ϴ� ��ü[���] ���� �ϳ��� ��ȸ
						// null -> ���1 -> ���2 -> ���3 ~~~
				while(iterator.hasNext() ) {
						// hasNext() : ������ҿ� ���� ���� Ȯ�� : ������ True / ������ False
					
					String temp = iterator.next();
						// next() : ������� ��������
					
					System.out.println(" set�� ���[��ü] : " + temp );
					
				}
					
				// ���� : 
				set.remove("java");
				set.remove("Database");
				System.out.println("���� �� HashSet ��ü�� : " + set.size());
				
				// ��� : ����ϱ����ؼ��� �Ѱ��� ��� 
				Iterator<String> iterator1 = set.iterator();
					// set �÷��ǿ� �����ϴ� ���ͷ����͸� �������̽��� ���� ��Ų��
					// set�� �����ϴ� ��ü[���] ���� �ϳ��� ��ȸ
						// null -> ���1 -> ���2 -> ���3 ~~~
				while(iterator1.hasNext() ) {
						// hasNext() : ������ҿ� ���� ���� Ȯ�� : ������ True / ������ False
					
					String temp = iterator1.next();
						// next() : ������� ��������
					
					System.out.println(" set�� ���[��ü] : " + temp );
					
				}
				
				set.clear();
				System.out.println("��� ���� �� HashSet ��ü�� : " + set.size());
				
		System.out.println("*********************************************");
		// Map �÷���
				// ���� : list => �ε���[����o] 	// set => �ε���x[����x]
				// Map : Ű , �� => Ű�� ���� �̿��ؼ� Ű�� �̿��� ���� ����
					// 1. .put ( Ű , �� ) ��� �߰�
					// 2. .size()
					// 3. .get( Ű ) Ű�� �ش��ϴ� �� ȣ�� 
					// 4. .remove( Ű ) Ű�� �ش��ϴ� ���� Ű ��� ���� , �� Ű�� ���� �Ѵ� ���� 
					// 5. .clear : ��� Ű�� �� ����
						// ���� : iterator ���� �ε����� ��� set�� ����ؾ��Ѵ�.
		
				// HashMap Ŭ����
					Map<String, Integer> map = new HashMap<>();
						// Ű , �� => �ϳ��� ���� ,�� �ϳ��� ���
					
					map.put("���缮", 80);
					map.put("��ȣ��", 70);
					map.put("�ŵ���", 90);
					map.put("������", 100);
					
					System.out.println(" map ��ü �� : " + map.size());
					// �˻�
					System.out.println(" ��ȣ�� �˻� : " + map.get("��ȣ��"));
					// ����
					map.remove("��ȣ��");
					System.out.println(" ���� �� map ��ü �� : " + map.size());
					// ��� ��� [ ����x , iterator x] ���������� iterator �� ����
						// ��� Ű => set => iterator => ��� Ű�� ���� => ��� ���� ����
					
					Set<String> setkey = map.keySet();
					// keySet() : ���Ű�� set�� �ִ´� -> �� , ��� ���� ��´�.
					
					Iterator<String> keyIterator = setkey.iterator();
					
					while( keyIterator.hasNext()) {
						
						String key = keyIterator.next();
						System.out.println(key + " �� Ű ���� " + map.get(key));
						
					}
					
					map.clear(); // ��� ����
					System.out.println("��� ���� �� map ��ü �� : " + map.size());
					
				System.out.println("************************************************");
					
				// HashTable Ŭ����      			��Ʈ������? �̴�
					// ���� : ������ ������ 
						// HashMap : ����ȭ ���Ұ���	���� ������ ( ���Ͻ����忡�� HashMap ���)
						// HashTable : ����ȭ ��밡��	��Ƽ ������ ( ��Ƽ�����忡�� HashTable ���)
					
					// ����1 : ���̵� ��й�ȣ�� �̿��� �α��� �����
					Map<String, String> map2 = new Hashtable<>();
					
					map2.put("qwe", "123");
					map2.put("qwe1", "123");
					map2.put("qwe2", "123");
					map2.put("qwe3", "123");
					map2.put("qwe4", "123");
					map2.put("qwe4", "123"); // �ߺ� Ű ���x // ���� �ߺ� ���o
					System.out.println(" map2 ��ü �� : "+ map2.size());
					
					Scanner sc = new Scanner(System.in);
					
					while(true) {
						
						System.out.println("���̵�");
							String id = sc.next();
						System.out.println("��й�ȣ");
							String pw = sc.next();
						
						if(map2.containsKey(id)) {
								// �ش� map�� Ű ���� ���� Ȯ��
							if(map2.get(id).equals(pw)) {
								System.out.println(" �α��� ���� ");
								break;
							}
							else {
								System.out.println("�н����尡 �ٸ�");
							}
						}
						else {
							System.out.println("���̵� �ٸ�");
						}
					}		
					
					
					// Map ��ø
			//		Map<String, String> list123 = new HashMap<>();
			//		Map<String, String> list1234 = new HashMap<>();
			//		Map<list123,list1234> list12345 = new HashMap<>();
					
			//		list123.put("123" ,"1234" ,"1232", "2345");
					
					// ���� : ȸ���� �Խ���
						// ȸ�� : ���̵� , ��й�ȣ [map]
						// �Խù� Ŭ���� : [Set]
						
						// [�޴�]
						// 1. ȸ������
						// 2. �α���
					
						// [�α�����]
						// ���Խù� ��µǰ�
						// 1. ���ۼ�
					
		//	Scanner sc = new Scanner(System.in);
			Map<String, String> login = new HashMap<>();
			Set<�Խù�> write = new HashSet<>();
			
			Iterator<�Խù�> check = write.iterator();
	
			while(true) {
				System.out.println(" �޴� ");
				System.out.println("1. ȸ������");
				System.out.println("2. �α���");
				System.out.println("3. ����");
				System.out.println("************* �Խ��� **************");
				System.out.println();
				if(write.isEmpty()) {
					System.out.println("�Խñ��� �����ϴ�");
					
				}
				else {
					
					while(check.hasNext() ) {
							// hasNext() : ������ҿ� ���� ���� Ȯ�� : ������ True / ������ False
						
						�Խù� temp = check.next();
						
						String temp1 = check.next().����;
						String temp2 = check.next().�ۼ���;
						String temp3 = check.next().����;
							// next() : ������� ��������
						
						System.out.println(" �Խñ� :  " + temp + " �ۼ��� : " + temp + " ���� : " + temp );
						
					
					}
				}
				System.out.println();
				System.out.println("*********************************");
				
				int ch = sc.nextInt();
			
				
				
				
				if( ch ==1) {
					System.out.println(" ȸ�������� ���̵� �Է��ϼ��� :");
					System.out.println(" ȸ�������� ��й�ȣ�� �Է��ϼ��� :");
					login.put(sc.next(), sc.next());
				}
				
				if( ch == 2) {
					
					System.out.println("�α����� ���̵� �Է��ϼ��� : ");
						String id = sc.next();
					System.out.println("�α����� ���̵� �Է��ϼ��� : ");
						String pw = sc.next();
						
					if(login.containsKey(id)) {
						if(login.get(id).equals(pw)) {
							System.out.println(" ������ �Է��ϼ��� : ");
							System.out.println(" ������ �Է��ϼ��� : ");
							System.out.println(" �ۼ����� �Է��ϼ��� : ");
							
							�Խù� temp2 = new �Խù�(sc.next(), sc.next(), sc.next());
							
							write.add(temp2);
						}
						else {
							System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
						}
					}
					else {
						System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
					}
						
				
					
				}
				if(ch == 3) {
					
					break;
				}
				
			}
					
					
					
					
					
			}
	}


