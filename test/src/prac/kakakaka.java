package prac;

import java.util.ArrayList;

public class kakakaka {

	public static void main(String[] args) {
		 int answer = 0;
		 int count1 = 0; 
		 int count = 0;
		 String dartResult = "1D2S3T*";   
	        for(int i = 0 ; i < dartResult.length(); i++){
	            if(dartResult.charAt(i) =='S') count += (int)Math.pow(((int)dartResult.charAt(i-1)-48) , 1);
	            if(dartResult.charAt(i) == 'D')count += (int)Math.pow(((int)dartResult.charAt(i-1)-48) , 2);  
	            if(dartResult.charAt(i) == 'T')count += (int)Math.pow(((int)dartResult.charAt(i-1)-48) , 3);
	            if(dartResult.charAt(i) == '*' && i >= 4 ){
	            	if(dartResult.charAt(i-1) == 'S' && dartResult.charAt(i-3) =='S')count1 += (int)Math.pow((int)dartResult.charAt(i-1)-48, 1)*(2) + (int)Math.pow((int)dartResult.charAt(i-3)-48, 1)*(2);
           			if(dartResult.charAt(i-1) == 'S' && dartResult.charAt(i-3) =='D')count1 += (int)Math.pow((int)dartResult.charAt(i-1)-48, 1)*(2) + (int)Math.pow((int)dartResult.charAt(i-3)-48, 2)*(2);
           			if(dartResult.charAt(i-1) == 'S' && dartResult.charAt(i-3) =='T')count1 += (int)Math.pow((int)dartResult.charAt(i-1)-48, 1)*(2) + (int)Math.pow((int)dartResult.charAt(i-3)-48, 3)*(2);	
       				if(dartResult.charAt(i-1) == 'D' && dartResult.charAt(i-3) =='D')count1 += (int)Math.pow((int)dartResult.charAt(i-1)-48, 2)*(2) + (int)Math.pow((int)dartResult.charAt(i-3)-48, 2)*(2);
       				if(dartResult.charAt(i-1) == 'D' && dartResult.charAt(i-3) =='T')count1 += (int)Math.pow((int)dartResult.charAt(i-1)-48, 2)*(2) + (int)Math.pow((int)dartResult.charAt(i-3)-48, 3)*(2); 
	            	if(dartResult.charAt(i-1) == 'T' && dartResult.charAt(i-3) =='T')count1 += (int)Math.pow((int)dartResult.charAt(i-1)-48, 3)*(2) + (int)Math.pow((int)dartResult.charAt(i-3)-48, 3)*(2);
	            	if(dartResult.charAt(i-1) == 'D' && dartResult.charAt(i-3) =='S')count1 += (int)Math.pow((int)dartResult.charAt(i-1)-48, 2)*(2) + (int)Math.pow((int)dartResult.charAt(i-3)-48, 1)*(2);
	            	if(dartResult.charAt(i-1) == 'T' && dartResult.charAt(i-3) =='S')count1 += (int)Math.pow((int)dartResult.charAt(i-1)-48, 3)*(2) + (int)Math.pow((int)dartResult.charAt(i-3)-48, 1)*(2);
	            	if(dartResult.charAt(i-1) == 'T' && dartResult.charAt(i-3) =='D')count1 += (int)Math.pow((int)dartResult.charAt(i-1)-48, 3)*(2) + (int)Math.pow((int)dartResult.charAt(i-3)-48, 2)*(2);
	            }
	            if(dartResult.charAt(i) == '*' && i >= 2 && i < 4) {
	            	if(dartResult.charAt(i) == 'S') count1 += (int)Math.pow(((int)dartResult.charAt(i-1)-48) , 1);
	                if(dartResult.charAt(i) == 'D') count1 += (int)Math.pow(((int)dartResult.charAt(i-1)-48) , 2);
	                if(dartResult.charAt(i) == 'T') count1 += (int)Math.pow(((int)dartResult.charAt(i-1)-48) , 3);
	            }
	  
	            if(dartResult.charAt(i) == '#'){     
	            	if(dartResult.charAt(i-1) == 'S') count1 += (int)Math.pow((int)dartResult.charAt(i-2)-48, 1)*(-1) + (int)Math.pow((int)dartResult.charAt(i-2)-48, 1)*(-1);
	            	if(dartResult.charAt(i-1) == 'D') count1 += (int)Math.pow((int)dartResult.charAt(i-2)-48, 2)*(-1) + (int)Math.pow((int)dartResult.charAt(i-2)-48, 2)*(-1);           	
	            	if(dartResult.charAt(i-1) == 'T') count1 += (int)Math.pow((int)dartResult.charAt(i-2)-48, 3)*(-1) + (int)Math.pow((int)dartResult.charAt(i-2)-48, 3)*(-1);
	            }
	            
	            answer = count + count1;
	            // ¼ýÀÚ 10
	            
	            System.out.println(answer);
	        }
	        
	}

}
