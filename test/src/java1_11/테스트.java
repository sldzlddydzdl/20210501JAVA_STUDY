package java1_11;

public class 테스트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answer = {1, 3, 2, 4, 2};
		
		
	        solution(answer);
		
	}
	
	
	 public static int[] solution(int[] answers) {
	        int[] answer = {1, 2, 3, 4, 5};
	        
	        int[] realmath1 = new int[10000];
	        int[] math1 = { 1 , 2 , 3 , 4 , 5 }; // 5개 반복
	        for(int i = 0; i < realmath1.length; i+=5){
	            realmath1[i] = math1[0];
	            realmath1[i+1] = math1[1];
	            realmath1[i+2] = math1[2];
	            realmath1[i+3] = math1[3];
	            realmath1[i+4] = math1[4];
	        }
	        
	       
	        
	        int[] realmath2 = new int[10000];
	        int[] math2 = { 2,1,2,3,2,4,2,5};   // 8개 반복
	        for(int i = 0; i < realmath2.length; i+=8){
	            realmath2[i] = math2[0];
	            realmath2[i+1] = math2[1];
	            realmath2[i+2] = math2[2];
	            realmath2[i+3] = math2[3];
	            realmath2[i+4] = math2[4];
	            realmath2[i+5] = math2[5];
	            realmath2[i+6] = math2[6];
	            realmath2[i+7] = math2[7];
	        }
	        
	      
	        
	        int[] realmath3 = new int[10000];
	        int[] math3 = {3,3,1,1,2,2,4,4,5,5}; // 10개 반복
	        for(int i = 0; i < realmath3.length; i+=10){
	            realmath3[i] = math3[0];
	            realmath3[i+1] = math3[1];
	            realmath3[i+2] = math3[2];
	            realmath3[i+3] = math3[3];
	            realmath3[i+4] = math3[4];
	            realmath3[i+5] = math3[5];
	            realmath3[i+6] = math3[6];
	            realmath3[i+7] = math3[7];
	            realmath3[i+8] = math3[8];
	            realmath3[i+9] = math3[9];
	        }
	        for(int i =  0 ; i < realmath3.length; i++) {
	        	System.out.println(realmath3[i]);
	        }
	        
	        int count1 = 0;
	        int count2 = 0;
	        int count3 = 0;
	        
	      
	        
	         for(int i = 0; i < realmath1.length; i+=5){
	            if(answer[0] == realmath1[i]){
	                count1++;
	            } 
	            if(answer[1] == realmath1[i+1]){
	                count1++;
	            } 
	            if(answer[2] == realmath1[i+2]){
	                count1++;
	            }
	            if(answer[3] == realmath1[i+3]){
	                count1++;
	            } 
	            if(answer[4] == realmath1[i+4]){
	                count1++;
	            } 
	        }
	        
	        for(int i = 0; i < realmath2.length; i+=5){
	            if(answer[0] == realmath2[i]){
	                count2++;
	            } 
	            if(answer[1] == realmath2[i+1]){
	                count2++;
	            } 
	            if(answer[2] == realmath2[i+2]){
	                count2++;
	            }
	            if(answer[3] == realmath2[i+3]){
	                count2++;
	            } 
	            if(answer[4] == realmath2[i+4]){
	                count2++;
	            } 
	        }
	        
	        for(int i = 0; i < realmath3.length; i+=5){
	            if(answer[0] == realmath3[i]){
	                count3++;
	            } 
	            if(answer[1] == realmath3[i+1]){
	                count3++;
	            } 
	            if(answer[2] == realmath3[i+2]){
	                count3++;
	            }
	            if(answer[3] == realmath3[i+3]){
	                count3++;
	            } 
	            if(answer[4] == realmath3[i+4]){
	                count3++;
	            } 
	        }
	        
	        System.out.println(count1);
	        System.out.println(count2);
	        System.out.println(count3);
	        /*
	        for(int i = 0; i < 10000; i++){
	            if(answer[i] == realmath1[i]){
	                count1++;
	            }
	        }
	        
	        for(int i = 0; i < 10000; i++){
	            if(answer[i] == realmath2[i]){
	                count2++;
	            }
	        }
	        
	        for(int i = 0; i < 10000; i++){
	            if(answer[i] == realmath3[i]){
	                count3++;
	            }
	        }
	        */
	        
	        /*
	        int[] result = {};
	        if(count1 == count2 && count2 == count3){
	            result = new int[3];
	            result[0] = 1;
	            result[1] = 2;
	            result[2] = 3;
	        }
	        
	        else if(count1 == count2){
	            result = new int[2];
	            result[0] = 1;
	            result[1] = 2;
	        }
	        else if(count2 == count3){
	            result = new int[2];
	            result[0] = 2;
	            result[1] = 3;
	        }
	        else if(count1 == count3){
	            result = new int[2];
	            result[0] = 1;
	            result[1] = 3;
	        }
	        
	        else if( (count1 > count2 && count2 > count3) || (count1 > count3 && count3 > count2)  ){
	            result = new int[1];
	            result[0] = 1;
	        }
	        else if( (count2 > count1 && count1 > count3) || (count2 > count3 && count3 > count1) ){
	            result = new int[1];
	            result[0] = 2;
	        }
	        else if( (count3 > count1 && count1 > count2) || (count3 > count2 && count2 > count1) ){
	            result = new int[1];
	            result[0] = 3;
	        }
	        */
	        
	        int[] result = {};
	        if(count1 == count2 && count2 == count3){
	            result = new int[3];
	            result[0] = 1;
	            result[1] = 2;
	            result[2] = 3;
	        }
	        
	        else if(count1 == count2){
	            result = new int[2];
	            result[0] = 1;
	            result[1] = 2;
	        }
	        else if(count2 == count3){
	            result = new int[2];
	            result[0] = 2;
	            result[1] = 3;
	        }
	        else if(count1 == count3){
	            result = new int[2];
	            result[0] = 1;
	            result[1] = 3;
	        }
	        
	        else if( count1 > count2 && count2 > count3 ){
	            result = new int[1];
	            result[0] = 1;
	        }
	        else if( count1 > count3 && count3 > count2){
	            result = new int[1];
	            result[0] = 1;
	        }
	        
	        else if( count2 > count1 && count1 > count3 ){
	            result = new int[1];
	            result[0] = 2;
	        }
	        else if( count2 > count3 && count3 > count1){
	            result = new int[1];
	            result[0] = 2;
	        }
	        
	        else if( count3 > count1 && count1 > count2 ){
	            result = new int[1];
	            result[0] = 3;
	        }
	        else if( count3 > count2 && count2 > count1){
	            result = new int[1];
	            result[0] = 3;
	        }
	        
	        for(int i = 0 ; i < result.length; i++) {
	        	System.out.println(result[i]);
	        }
	        
	        return result;
	        
	    }

}
