package prac;

public class ¡∂¿ÃΩ∫∆Ω {
	
	public static void main(String[] args) {
		
//		A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
		
//		String name = "JEROEN";
//		String name = "JAN";
//		String name = "JABAN";
//		String name = "JBAAAAC"; // 9+2+1+1+2
//		String name = "JBAAAAA"; // 11
//		String name = "JAAAABA"; // 12
		String name = "JBABAAAAAAAAABA"; // 9+2+1+2+1+1+1+1+2 = 20  
//					   9 2 1 2 9 2 = 23;
		System.out.println(solution(name));
	}

	 public static int solution(String name) {
	        int answer = 0;
	        int alphacount = 0;
	        int movecount = -1;
	        

	        
	        String newStr = name.substring( 1 , name.length()-1);
	        System.out.println(newStr);
	        
	        String[] onlyA = newStr.split("A");
	        
	        if(onlyA.length == 0) {
	        	alphacount += compareString(name.charAt(0));
	        	alphacount += compareString(name.charAt(name.length()-1));
	        	movecount = 1;
	        }
	        else {
	        	 for(int i = 0 ; i < name.length(); i++) {
	 	        	if(name.charAt(i) != 'A') {
	 	        		alphacount += compareString(name.charAt(i));	
	 	        	}
	 	        	else {
	 	        		movecount++;
	 	        	}
	 	       
	 	        	movecount++;
	 	        }
	        }
	       	        
	        System.out.println("alphacount : " + alphacount );
	        System.out.println("movecount : " + movecount);
	        
	        answer = alphacount + movecount;
	        
	        return answer;
	  }
	 
	 
	 public static int compareString(char m2) {
		 
		 int min = 0;
		 int count1 = 0;
		 int count2 = 1;
		 
		 
		 for(char m1 = 'A'; m1 < m2 ; m1++) {
			 count1++;
		 }
		 
		 for(char m1 = 'Z' ; m1 > m2 ; m1-- ) {
			 count2++;
		 }
		 
		 if(count1  < count2 ) min = count1;
		 else if( count1 > count2 ) min = count2;
		 else min = count2;
		 
		 return min;		 
	 }
	 
}
