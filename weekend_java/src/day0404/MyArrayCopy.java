package day0404;

public class MyArrayCopy {
	
	// �迭1 { 10, 20, 30, 40, 50, 60 }
	// int �� �迭�� ���� �����Ͽ� int���迭 ��ȯ�ϴ� �޼���
	
	
	// int �� �迭�� ���� �����Ͽ� ��ȯ�ϴ� �޼���
	
	// �����غ�����.
	
	int[] DeepCopy(int[] a) {
		int[] newnumbers = new int[a.length];
		
		for(int i = 0 ; i < newnumbers.length; i++) 
			newnumbers[i] = a[i];
	
		// �ּ� ��ȯ 
		return newnumbers;
	}
	
	int[] ShallowCopy(int[] a) {
		int[] s;
		s = a;
		
		return s;
	}
	
	// int �� �迭�� ���� �����Ͽ� int���迭 ��ȯ�ϴ� �޼���(��ü�� ���� ����)
	int[] deepCopyArray(int[] ori) {
		// �Ű������� ���� �迭�� �� �迭�� �����ؼ� ��ȯ���ش�.
		int[] copyArray = new int[ori.length];
		
		for(int i = 0 ; i < ori.length; i++) {
			copyArray[i] = ori[i];
		}
		return copyArray;
	}
	
	// int �� �迭�� ���� �����Ͽ� ��ȯ�ϴ� �޼���(���� �ּҸ� ����)
	int[] shallowCopy(int[] ori) {
		int[] copyArray = ori;
		return copyArray;
	}
	
	
}
