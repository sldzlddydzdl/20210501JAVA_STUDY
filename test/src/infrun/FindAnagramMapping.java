package infrun;

import java.util.HashMap;
import java.util.Map;

public class FindAnagramMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = { 12, 28 ,46, 32 ,50};
		int[] B = {50 ,12 ,32 ,46, 28};
		
		for(int s : slove(A, B))
			System.out.print(s+" ");
		
		
	}
	
	public static int[] slove(int[] A , int[] B) {
		
		// �迭 B�� ������ B�� ���ҵ��� �ε������� A���� ���Ұ����� �ε����� ���°���� �����ϱ�
		
		int[] result = new int[A.length];
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0 ; i < B.length; i++) {
			
			map.put(B[i], i);
			// (50,0)
			// (12,1)
			// (32,2)
			// (46,3)
			// (28,4)
			
		}
		
		for(int i = 0; i < result.length; i++) {
			
			result[i] = map.get(A[i]);
			
		}
		
		
		
		
		
		return result;
		
	}

}
