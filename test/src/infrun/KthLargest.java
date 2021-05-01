package infrun;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.*;

public class KthLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3 , 2, 1 , 5, 6, 4};
//		int[] nums = {3,2,3,1,2,4,5,5,6};
		int k = 2;
		System.out.println(solve(nums,k));
		System.out.println(solve_pq(nums ,k));
		
	}

	public static int solve(int[] nums , int k) {
		
		// ����Ǯ�� ����
		int result = 0;
		
		String[] m = { "abc", "ser" , "qwe" , "cba"};
		
		
		Arrays.sort(m , Collections.reverseOrder());
		for(int s : nums)
			System.out.println("s : " +s);
		
		for(String n : m)
			System.out.println(n);
		result = nums[nums.length -k];
		
		return result;
	
		
	}
	public static int solve_pq(int[] nums, int k) {
		
		
		// PriorityQueue �� ���(ȣ��) �켱������ ���ڰ� �������� ���� !!
		// �� ���ϳ������ڰ� ���� ȣ��ȴ�.
		PriorityQueue<Integer> pq  = new PriorityQueue<>();
		
		for(int val : nums) {
			pq.offer(val);
			System.out.println("pq123123 : " + val);
			if(pq.size() > k) {
				System.out.println("pq : " + pq.peek());
				pq.poll();
			}
		}
		
		
		return pq.peek();
	}
	
	Comparator<Integer> Comp = new Comparator<Integer>() {
		
		@Override
		public int compare(Integer a, Integer b) {
			// TODO Auto-generated method stub
			return a-b;
		}
	};
	
}
