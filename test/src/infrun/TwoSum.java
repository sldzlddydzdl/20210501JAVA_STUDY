package infrun;

import java.util.*;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSum a = new TwoSum();
		int[] nums = {2, 8 ,10 ,21};
		int target= 10;
		
		int[] result = a.twoSum(nums ,target);
		for(int i : result)
			System.out.println(i);

	}
	
	public static int[] twoSum(int[] nums , int target) {
		
		/*
		int[] result = new int[2]; 
		
		for(int i = 0 ; i< nums.length; i++) {
			for(int j = 1; j < nums.length; j++) {
				
				if(nums[i] + nums[j] == target) {
					result[0] = i+1;
					result[1] = j+1;
					
				}
				
			}
		}
		
		for(int i = 0 ; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		
		return result;
		*/
		Map<Integer , Integer> map = new HashMap<>();
		int[] result = new int[2];
		
		for(int i = 0 ; i < nums.length; i++) {
			if(map.containsKey(nums[i])) {
				int mapValue = map.get(nums[i]); // i = 1ÀÏ¶§ 8 , map(8, 0)
				result[0] = mapValue + 1;
				result[1] = i + 1;
				
			}else {
				map.put(target-nums[i], i); // key 10 - 2 = 8 , i = 0
 			}
		}
		
		
		return result;
		
	}
	
	
	

}
