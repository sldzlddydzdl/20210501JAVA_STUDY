package prac;

import java.util.HashMap;

public class dfsdfsfsdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] al = { "A" , "B" , "C" ,"A" };
		HashMap<String, Integer> hm = new HashMap<>();
		for(String key : al) hm.put(key, hm.getOrDefault(key, 0) + 1);
		
		System.out.println("��� : " + hm);
		//	��� : {A=2, B=1, C=1}
		
		for(String s : al)
		System.out.println(hm.get(s));
		
		int k = Math.max(10, 5);
		
		System.out.println(k);
		
	}
	
	// getOrDefault
	
	// ã�� Ű�� �����Ѵٸ� ã�� Ű�� ���� ��ȯ�ϰ� ���ٸ� �⺻���� ��ȯ�ϴ� �޼��� 
	
	// �����
	// getOrDefault( Object key , V DefaultValue )
	
	// �Ű� ���� : �� �޼���� �� ���� �Ű� ������ ����մϴ�.
		// key : ���� �����;� �ϴ� ����� Ű�Դϴ�.
		// defaultValue : ������ Ű�� ���ε� ���� ���� ��� ��ȯ�Ǿ�� �ϴ� �⺻���Դϴ�.
	
		// ��ȯ �� : ã�� key�� �����ϸ� �ش� key�� ���εǾ� �ִ� ���� ��ȯ�ϰ�, �׷���������
		// ����Ʈ ���� ��ȯ�˴ϴ�.
	
	
	

}
