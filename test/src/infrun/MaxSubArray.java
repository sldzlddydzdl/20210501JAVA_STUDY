package infrun;

public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums =  {-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.println(maxSubArray(nums));
	}
	
	public static int maxSubArray(int[] nums) {
	        
			/*
	        int sum = 0 ,  max  = -100000;
	            
	        for(int i = 0 ; i < nums.length- 1; i++) {
	            
	                sum += nums[i];
	        
	        
	            System.out.println("nums[i] : " + nums[i]);
	        	System.out.println("i의 for문 sum : " + sum );
	            
	            for(int j = i+1 ; j < nums.length ; j++){
	                 
	            	System.out.println("nums[j] : " + nums[j]);
	            	
	                sum += nums[j];
	                
	                System.out.println("j의 for문 sum : " + sum );    
	                
	                
	                System.out.println("max함수 전 j의 for문 : " + max );
	                
	                max = Math.max(max , sum);
	                
	                System.out.println("max함수 후 j의 for문 : " + max );
	                System.out.println("*******************************");
	            }
	            
	            sum = 0;

	        System.out.println("********** 한바퀴 끝 *******************");
	        
	    }
	        return max;
	        */
		
		int newSum = nums[0];
		int max = nums[0];
		
		for(int i  = 1; i < nums.length; i++) {
			newSum = Math.max(nums[i], newSum + nums[i]);
			max = Math.max(newSum, max);
		}
		
		return max;
		
	}
}
