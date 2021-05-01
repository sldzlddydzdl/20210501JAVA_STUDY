package test;

import java.util.*;

public class qweqwe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] land ={{1,2,3,5},
						{5,6,7,8},
						{4,3,2,1}};
		
		System.out.println(solution(land));
	}  
	
	public static int solution(int[][] land) {
		/*
        int answer = 0;
        
        List<MaxIndex> list = new ArrayList<>();
        Queue<MaxIndex> queue = new LinkedList<>();
        
        int[] maxarr = new int[land.length];
        
        int max = 0; 
        for(int i =0 ; i < land.length; i++){
            for(int j = 0 ; j < land[i].length; j++){
                
                max = Math.max(max , land[i][j]);
                MaxIndex m = new MaxIndex(max , j);
                queue.offer(m);
                
            }
            while(!queue.isEmpty()){
                System.out.println("max : " + queue.peek().max + "   index : " + queue.peek().index);
                
                int queuemax = queue.peek().max;
                int queueindex = queue.peek().index;
                queue.poll();
                queuemax = Math.max(queue.peek().max, queuemax);
                maxW
                
                
            }

            System.out.println(max);
            maxarr[i] = max;
            max  = 0 ;
        }

        return answer;
    }
    
    public static class MaxIndex{
        
        int max;
        int index;
        
        public MaxIndex(int max , int index){
            this.max =max;
            this.index = index;
        }
        
    }*/
		
		   for(int i=1; i<land.length; i++){
	           land[i][0] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][3]);
	           land[i][1] += Math.max(Math.max(land[i-1][0], land[i-1][2]), land[i-1][3]);
	           land[i][2] += Math.max(Math.max(land[i-1][1], land[i-1][0]), land[i-1][3]);
	           land[i][3] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][0]);
	       }
		   
		   for(int i =0 ; i < land.length; i++) {
			   System.out.println(land[i][0] + " " + land[i][1] + " " + land[i][2] + " " + land[i][3] );
		   }

		   System.out.println(land.length-1);
	       int[] answer = land[land.length-1];
	       Arrays.sort(answer);
	       for(int s : answer)
	    	   System.out.println("answer : " + s);

	       return answer[answer.length-1];
	}
    

}
