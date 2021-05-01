package infrun;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = {1 ,2, 3};
//		int[] digits = {9 ,9, 9};
//		int[] digits = {9 ,8, 9};
//		int[] digits = {8 ,9, 9};
//		int[] digits = {0 ,0, 1};
//		int[] digits = {0, 0};
//		int[] digits = {9 ,0, 0, 9};
//		int[] digits = {2, 1, 9, 9, 9};
		
		int[] result = plusOne(digits); 
		for(int i  :  result)
			System.out.println(i);
		
		
	}

	public static int[] plusOne(int[] digits) {
		
		
		int index = digits.length-1;
		int carry = 1;
		
		while(index >= 0 && carry >0) {
			digits[index] = (digits[index]+1) % 10;
			
			if(digits[index] == 0) {
				carry = 1;
			}
			else {
				carry = 0;
				
			}
			
			index--;
		}
		
		if(carry == 1) {
			digits = new int[digits.length+1];
			digits[0] = 1;
		}

		
		return digits;
		
		
		
	}
	
}
