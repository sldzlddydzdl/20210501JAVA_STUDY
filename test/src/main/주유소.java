package main;

import java.util.Scanner;

public class ������ {
//	  2   4   3   1   5	  4	 	meter
//	5   2   4   3   3   5 	2	meterprice
//	
//	10 + 2*17 = 44  		sum
	
//	  2   4   3   1   5	  4	 	meter
//	1   2   4   3   3   5 	2	meterprice
//	
//	1*19 = 19 		sum
	
//	  2   4   3   1   5	  4	 	meter
//	5   6  7   4   6   8  	3	meterprice
//	
//	10 + 20 + 15 + 4 + 20 + 16 = 85 		sum
	
//	  2   4   3   1   5	  4	 	meter
//	5   6   4   3   7   5 	3	meterprice
//	
//	10 + 20 + 12 +3 + 15 + 12 = 72  		sum
	
//	  2   4   3   1   5		meter
//	5   4   2   3   3   5 	meterprice
//	
//	10 + 16 + 6 + 6 = 38  	sum
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      Scanner sc = new Scanner(System.in);
	      int N = sc.nextInt();
	      
	      long[] meter = new long[N-1];
	      long[] meterprice = new long[N];
	      
	     
	      for(int i = 0; i < N-1; i++) {
	    	meter[i] = sc.nextInt();
	      }
	      
	      for(int i = 0 ; i < N; i++) {
	    	  meterprice[i] = sc.nextInt();
	      }
	     
	      long min = meterprice[0];
	      long sum = 0;
	      for(int i = 1; i < meterprice.length; i++ ) {
	    	  
	    	  if(min > meterprice[i]) {
	    		  sum += min * meter[i-1];
	    		  min = meterprice[i];
	    	  }
	    	  else if ( min < meterprice[i]) {
	    		  sum += min * meter[i-1];
	    	  }
	    	  else {
	    		  sum += min * meter[i-1];

	    	  }
	    	 
	    	  
	      }
	      
	      System.out.println(sum);
	}

}
