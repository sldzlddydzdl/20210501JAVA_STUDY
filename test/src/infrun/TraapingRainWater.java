package infrun;

public class TraapingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] rain = { 0 ,1  ,0 , 2, 1, 0, 1, 3, 2, 1, 2, 1};
		System.out.println(trap(rain));
		
		
	}

	public static int trap(int[] height) {
		
		
	
		        /* 나의 풀이 못품 .....
 		int result = 0;
        
        int max = 0;
        int maxposition = 0;
        
        int rightmax =0;
        int leftmax =0;
        int left= 0;
        int right =0;
        
        
        
        for(int i = 0 ; i < height.length; i++){
                if(height[i] > max ){
                     max = height[i];
                    maxposition = i;
                }
         }
        
        height[maxposition] = height[maxposition] -1;
        
      //  { 0 , 1 , 0 , 2 ,1, 0 , 1, 3, 2, 1, 2, ,1}
        while( max >= 2 ){
            for(int i = 0 ; i < height.length; i++){
                if(height[i] > max ){
                     max = height[i];
                }
            }
            System.out.println("max : " + max);

            for(int i = height.length-1 ; i > 0; i --){
                if(max - 1 == height[i]){
                    rightmax = height[i];
                    right = i;
                    break;
                }
            }
            System.out.println("right : " + right);
        
            for(int i = 0 ; i < height.length; i++){   
 
                if(max - 1 == height[i]){
                    leftmax = height[i];
                    left = i;
                    break;
                }
            }
            System.out.println("left : " + left);
            System.out.println("rightamx : " + rightmax);
            for(int i = left ; i < right; i++){
                if(height[i] < rightmax ){
                    result += 1;
                }
            }
            max  = max -1;
        
        }
        return result;
		        */	
		
		int result = 0;
		if(height == null || height.length <= 2) return result;
		int[] left = new int[height.length];
		int[] right = new int[height.length];
		
		//2. left
		int max = height[0];
		left[0] = height[0];
		for(int i = 1; i < height.length; i++) {
			if(max < height[i]) {
				left[i] = height[i];
				max = height[i];
			}else {
				left[i] = max;
			}
		}
		
		//2 right
		max = height[height.length-1];
		right[height.length-1] = height[height.length-1];
		for(int i = height.length-2; i >= 0; i--) {
			if(max < height[i]) {
				right[i] = height[i];
				max = height[i];
			}
			else {
				right[i] = max;
			}
		}
		
		//3
		for(int i = 0 ; i < height.length; i++) {
			result += Math.min(left[i], right[i]) - height[i];
		}
		
		return result;
		
		
		    }

	}
	

