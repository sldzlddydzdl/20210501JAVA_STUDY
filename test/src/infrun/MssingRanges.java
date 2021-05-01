package infrun;

import java.util.*;

public class MssingRanges {

	public static void main(String[] args) {
		int[] nums = {0,1,3,50,75};
		int lower=0, upper=99;
		System.out.println(solve(nums, lower, upper));
		// [0->1, 4, 6->49, 51->74, 76->99]
	 }
	 
	public static List<String> solve(int[] nums, int lower, int upper) {
		/* 나의풀이 못품...
		List<String> result = new ArrayList<>();
		int count = 0;
		
		if(lower < nums[0] && nums[0]-lower >= 2) {
			result.add(lower+"->"+(nums[0]-1));
			lower = nums[0];
		}
		
		for(int i= 1 ; i < nums.length; i++) {
			
			if(lower < nums[i]) {
				// lower = 3 , nums[i] = 5
				if(nums[i] - lower == 1) {
					
				}
				else if(nums[i] - lower == 2) {
					String s = Integer.toString(nums[i]-1);
					result.add(s);
				}
				else {
					result.add((lower+1) + "->" + (nums[i]-1));
				}
				lower = nums[i];
				
			}
			
			
			else if(lower == nums[i]) {
				lower = nums[i];
			}
			
		}
		
		if(lower < upper) {
			result.add((lower+1)+"->"+upper);
		}
		
		
		return result;
		*/
		
		// 강의풀이
		//1 
		List<String> result = new ArrayList<>();
		if(nums == null || nums.length == 0) return result;
		
		//2-1
		if(lower < nums[0]) {
			result.add(makeRange(lower, nums[0] -1));
		}
		
		//2-2
		for(int i = 0 ; i < nums.length-1; i++) {
			if(nums[i] != nums[i+1] && nums[i]+1 < nums[i+1]) {
				result.add(makeRange(nums[i]+1 , nums[i+1] -1));
			}
		}
		
		//3
		if(nums[nums.length-1] < upper) {
			result.add(makeRange(nums[nums.length-1]+1, upper));
		}
		
		
		return result;
		
		
		
	 }
	
	public static String makeRange(int low, int high) {
		
		return	low == high ? String.valueOf(low) : (low+"->"+high);
		// low 하고 high가 같다면 String.valueOf(low) 을리턴하고
		// low하고 high가 같지않으면 (low+"->"+high) 를 리턴해라
	}


}
