package prac;

public class ��ݱװ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String m = "ABCDEFG";		
		String[] musicinfos = new String[2];
		musicinfos[0] = "12:00,12:14,HELLO,CDEFGAB";
		musicinfos[1] = "13:00,13:05,WORLD,ABCDEF";
		
		System.out.println(solution(m,musicinfos));
		
	}
	
	
	 public static String solution(String m, String[] musicinfos) {
	        String answer = "";
	        StringBuilder sb = new StringBuilder();
	        String h1 = ""; 
	        String h2 = "";	
	        String m1 = "";
	        String m2 = "";
	        int count = 0;
	        
	        for(int i = 0 ; i < musicinfos.length; i++) {
	        	h1 = sb.substring(musicinfos[i].codePointAt(0), musicinfos[i].codePointAt(1)); // ���� �ð��� ��
	        	h2 = sb.substring(musicinfos[i].codePointAt(6), musicinfos[i].codePointAt(7)); // �� �ð��� ��
	        	m1 = sb.substring(musicinfos[i].codePointAt(3), musicinfos[i].codePointAt(4)); // ���� �� ��
	        	m2 = sb.substring(musicinfos[i].codePointAt(9), musicinfos[i].codePointAt(10)); // �� �� ��
	        	
	        	int hour1 = Integer.parseInt(h1);
	        	int hour2 = Integer.parseInt(h2);
	        	int min1 = Integer.parseInt(m1);
	        	int min2 = Integer.parseInt(m2);
	        	
	        	int k = 0;
	        	int secondcom = 0;
	        	int thirdcom = 0;
	        	if(hour1 - hour2 == 0) {
	        		
	        		int minindex = min2 - min1;
	        		for(int j = 0 ; j < musicinfos.length; j++) {
	        			for( k = 0 ;  k < musicinfos[j].length(); k++) {
	        				if(musicinfos[j].charAt(k) == ',') {
	        					count++;
	        				}
	        				if(count == 2) {
	        					secondcom  = k;
	        				}
	        				
	        				if(count == 3) {
	        					thirdcom = k;
	        					count =0;
	        					break;
	        				}
	        			}
	        			
	        			String newStr = sb.substring(musicinfos[j].codePointAt(k) , musicinfos[j].codePointAt(musicinfos[j].length()-1));
	        			// CDEFGAB
	        			String newans = sb.substring(musicinfos[j].codePointAt(secondcom) , musicinfos[j].codePointAt(thirdcom));
	        			// HELLO
	        			String song = "";
	        			
	        			if(minindex < newStr.length()) {
//	        				  14			7
	        			 
	        			}
	        			else if( minindex == newStr.length()) {
	        				
	        			}
	        			else {
//	        				14  > 7
	        				song = song + newStr;
	        			}
	        			
	        					
	        					
	        		}
	        	}
	        	
	        	
	        }
	        
	        
	        
	        return answer;
	    }

}
