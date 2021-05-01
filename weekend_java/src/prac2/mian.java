package prac2;

import java.util.*;

public class mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] lottos = {45, 4, 35, 20, 3, 9};
		int[] win_nums = {20, 9, 3, 45, 4, 35};
		
		for(int s : solution(lottos,win_nums))
			System.out.println(s);
	}
	
	  public static int[] solution(int[] lottos, int[] win_nums) {
	        int[] answer = new int[2];
	        
	    List<Integer> lottos_list = new ArrayList<>();
//		List<Integer> win_list = new ArrayList<>();
			for(int s : lottos)	
				lottos_list.add(s);
			
//			for(int s : win_nums)
//				win_list.add(s);
//			
			int min_count = 0;
	        int max_count = 0;
	        
	        
			for(int i = 0 ; i < win_nums.length; i++) {
				if(lottos_list.contains(win_nums[i])) {
				    min_count++;
				}
	            
			}
			for(int i = 0; i < lottos_list.size(); i++) {
				if(lottos_list.get(i) == 0) {
					max_count++;
				}
			}
			
			List<Integer> min_result = new ArrayList<>();
			if(min_count == 6 ) min_result.add(1);
			else if (min_count == 5  ) min_result.add(2);
			else if (min_count == 4 ) min_result.add(3);
			else if (min_count == 3 ) min_result.add(4);
			else if (min_count == 2 ) min_result.add(5);
			else if (min_count == 1 || min_count == 0) min_result.add(6);
	        
	        
			List<Integer> max_result = new ArrayList<>();
			if(( max_count+min_count ) == 6 ) max_result.add(1);
			else if (( max_count+min_count )== 5  ) max_result.add(2);
			else if (( max_count+min_count )== 4 ) max_result.add(3);
			else if (( max_count+min_count ) == 3 ) max_result.add(4);
			else if (( max_count+min_count ) == 2 ) max_result.add(5);
			else if (( max_count+min_count ) == 1 || max_count == 0) min_result.add(6);
	        
			
			
	        answer[0] = max_result.get(0);
	        answer[1] = min_result.get(0);        
	        
	        return answer;
	    }
	
	

}
