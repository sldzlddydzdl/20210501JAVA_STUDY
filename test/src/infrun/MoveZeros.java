package infrun;

import java.util.ArrayList;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {0,3,2,0,8,5};
		
		moveZeroes(nums);
		
	}
	
	 public static void moveZeroes(int[] nums) {
		 
		 ArrayList<Integer> list = new ArrayList<>();
		 
		 int count = 0;
		 
		 for(int i = 0 ; i < nums.length; i++) {
			 if(nums[i] == 0) {
				 count++;
			 }
			 else {
				 list.add(nums[i]);
			 }
		 }
		 
		 int[] zero = new int[count];
		 for(int i = 0; i < zero.length; i++) {
			 zero[i] = 0;
		 }
		 
		 for(int i = 0 ; i< zero.length; i++) {
			 list.add(zero[i]);
		 }
		 
		 for(int i = 0; i < list.size(); i++) {
			 System.out.print(list.get(i) + " ");
		 }
		 
		 
	 }

}
