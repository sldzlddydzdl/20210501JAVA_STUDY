package prac;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class kk {

public static void main(String[] args) {
	
	int n = 5;
	int[] stage = {2, 1, 2, 6, 2, 4, 3, 3};
	
//	int n = 4;
//	int[] stage = {4,4,4,4};
//	double[] watch = new double[n]; 
	
	
			solution(n , stage);
	
	
}

		    public static int[] solution(int N, int[] stages) {
		        int[] answer = new int[N];
		       
		          
		        int[] count = new int[stages.length+1]; 
		        
		        for(int i =0 ; i < count.length; i++){
		            count[i] = 0;
		        }
		        
		        for(int i = 0; i< stages.length; i++){
		            for(int j = 1 ; j < count.length; j++){
		                if(stages[i] == j){
		                    count[j] += 1;
		                }
		            }
		        }
		        
		        for(int i = 0 ; i < count.length; i++) {
		        	System.out.println(count[i]);
		        }
		        
		        System.out.println("********************");
		        
		        int stand = stages.length;
		        Double[] result = new Double[stages.length+N];
		        int k = 1;
		        
		        for(int i = 0 ; i < result.length; i++) {
		        	result[i] = 0.0;
		        }
		        
		        while(stand != 0){
		            result[k] =  (double)count[k] / (double)stand;
		            stand = stand - count[k];
		
		            k++;
		            System.out.println("result : " + result[k]);
		            System.out.println("stand : " + stand);
		            
		        }
		        /*
		        for(int i = 0 ;  i< result.length; i++) {
		        	if(result[i] == 1.0) {
		        		result[i] = 0.0;
		        	}
		        }
		        */
		        for(int i = 0 ; i < result.length; i++) {
		        	System.out.println(result[i]);
		        }
		        
		        System.out.println("****************************");
		        
		      //  Arrays.sort(result, Collections.reverseOrder());
		        
		        for(int i = 0 ; i < result.length; i++) {
		        	System.out.println(result[i]);
		        }
		        
		        System.out.println("********************");
		        
		        Double[][] failure = new Double[N][2];
		        
		        for(int i = 0; i < failure.length;i++){
		            failure[i][0] = (double)i+1;
		            failure[i][1] = result[i+1];
		        }
		        
		        for(int i = 0 ; i < failure.length; i++) {
		        	System.out.println(failure[i][0] + " " + failure[i][1]);
		        }
		        
		        //Arrays.sort(failure, Comparator.comparingDouble(o1 -> o1[1]));
		        
		        
		        /*
		        double temp = 0;
		        
		        for(int i = 0 ; i < failure.length; i++){
		            for(int j = 1; j < failure.length; j++){
		                if(failure[i][1] == failure[j][1]){
		                    temp = failure[j][1];
		                    failure[j][1] = failure[i][1];
		                    failure[i][1] = temp;
		                }
		            }
		        }
		        */
		        
		    //    Arrays.sort(failure, Comparator.comparingDouble(o1 -> o1[1]));
		        
		        Arrays.sort(failure , (o1, o2)->{
		        	if(o1[0] == o2[0]) {
		        		return Double.compare(o2[0], o1[0]);
		        	}
		        	else {
		        		return Double.compare(o2[1], o1[1]);
		        	}
		        }
		        		
		        );
		        
		        for(int i = 0 ; i < answer.length; i++) {
		        	answer[i] = 0;
		        }
		        
		        
		        double[] answer1 = new double[N];
		        
		        for(int i = 0 ; i < answer1.length; i++) {
		        	answer1[i] = 0;
		        }
		        
		        for(int i = 0; i < answer1.length; i++) {
		        	answer1[i] = failure[i][0];
		        }
		        
		        for(int i = 0 ; i < failure.length; i++){
		            answer[i] = (int)answer1[i];
		        }   
		        
		        for(int i = 0 ; i < answer.length; i++) {
		        	System.out.print(answer[i] + " ");
		        }
		        
		        return answer;
		        
		    }
		}

	


