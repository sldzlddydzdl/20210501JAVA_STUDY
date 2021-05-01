package test;

import java.util.*;
import java.util.Arrays;

public class zcvzxcvz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] people = {70, 10, 80, 15};
		int limit = 100;
		System.out.println(solution(people, limit));
		
	}
	
	
	
   public static int solution(int[] people, int limit) {
        int answer = 0;
        int weight = 0;
        
 //       Arrays.sort(people);
        
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new PriorityQueue<>();
        
        
        for(int a : people)
        	queue.offer(a);
        
        	
        
        
        
        
//        for(int i = 0 ; i < list.size(); i++) {
//        	for(int j = list.size()-1 ; j > i ; j --) {
//        		
//        		weight = list.get(i) + list.get(j);
//        		System.out.println(weight);
//        		System.out.println(list.size());
//        		if(weight > limit) {
//        			
//        		}
//        		else if(weight == limit) {
//        			list.remove(i);
//        			list.remove(j);
//        			answer++;
//        		}
//        		else {
//        			list.remove(i);
//        			list.remove(j);
//        			answer++;
//        		}
//        		
//        	}
//        	System.out.println("after : " + list.size());
//        	if(list.size() == 1) {
//        		answer++;
//        		break;
//        	}
//        	if(list.size() == 0) {
//        		break;
//        	}
//        }
//        
//        answer += list.size();
        
        
        
        
        return answer;
    }

}
