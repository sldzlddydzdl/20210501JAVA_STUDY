package test;

import java.util.*;

public class techonlogydevelopment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] pro = {95, 90, 99, 99, 80, 99};
		int[] speeds= {1, 1, 1, 1, 1, 1};
		
		for(int s : solution(pro,speeds))
			System.out.println(s);
	}

    public static int[] solution(int[] progresses, int[] speeds) {
        /*
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queuedata = new LinkedList<>();
        Stack<Integer> stack = new Stack<Integer>();

    	for (int i = progresses.length - 1; i >= 0; i--)
    		stack.add((100 - progresses[i]) / speeds[i] + ((100 - progresses[i]) % speeds[i] > 0 ? 1 : 0));
    		
    	while(!stack.isEmpty()) {
    		System.out.println("stack : " + stack.pop());
    	}
    	
//         7 3 9 , 2 1 
//         5 10 1 1 20 1  , 1 3 2
        int[] workdays = new int[progresses.length];
        int temp = 0;
        int count = 1;
        
        for(int i = 0 ; i < progresses.length; i++){
            temp = progresses[i] + speeds[i];
            while(temp  < 100){
                temp += speeds[i];
                count++;
            }
            workdays[i] = count;
            count =1;
        }
        
        for(int a : workdays) {
        	System.out.println(a);
            queue.offer(a);
        }
        
        int count1 = 0;
        int count2 = 0;
        
        while(!queue.isEmpty()){
            int m = queue.poll();
            System.out.println("m : " + m);
            int n = queue.peek();
            System.out.println("n : " + n);

            if(m < n){
                count1++;
                count2++;
            }
            if(m > n){
                count2++;
                count1++;
                while(m < queue.poll()){
                    count1++;
                    
                }
            }
            System.out.println("count1 : " + count1);
            System.out.println("count2 : " + count2);
            queue.offer(count1);
            count1 = 0;
            count2 = 0;
        }
        
        int[] result = new int[count2];
        
        while(!queuedata.isEmpty()){
            for(int i = 0 ; i < count2; i++){
                result[i] = queuedata.poll();
            }
        }
       */
        	Stack<Integer> stack = new Stack<Integer>();

        	for (int i = progresses.length - 1; i >= 0; i--) {
        		int p = (100 - progresses[i]) / speeds[i] + ((100 - progresses[i]) % speeds[i] > 0 ? 1 : 0);
        		stack.add((100 - progresses[i]) / speeds[i] + ((100 - progresses[i]) % speeds[i] > 0 ? 1 : 0));
        		
        				System.out.println("p : " + p);
        	}
        	List<Integer> s = new ArrayList<Integer>();

        	while (!stack.isEmpty()) {
        		int cnt = 1;

        		int top = stack.pop();

        		while (!stack.isEmpty() && stack.peek() <= top) {
        			cnt++;
        			stack.pop();
        		}

        		s.add(cnt);
        	}

        	int[] answer = new int[s.size()];

        	for (int i = 0; i < answer.length; i++) {
        		answer[i] = s.get(i);
        	}

        	return answer;
     

        //return workdays;
        
    }

}
