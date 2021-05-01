package infrun;

import java.util.*;

public class BaseballGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"5" , "-2" , "4" , "C" ,"D" ,"9" ,"+" ,"+"};
		System.out.println(callPoints(strs));
		
	}
	
	public static int callPoints(String[] ops) {
		
		int sum = 0;
		int temp1 = 0;
		int temp2 = 0;
		Stack<Integer> result = new Stack<>();
		
		
		for(int i = 0 ; i < ops.length; i++) {
		
			switch(ops[i]) {
			
			case "C" :
				result.pop();
				break;
			
			case "D" :
				result.push(result.peek()*2);
				break;
			case "+" :
				temp1 = result.pop();
				temp2 = result.pop();
				result.push(temp2);
				result.push(temp1);
				
				result.push(temp1 + temp2);
				break;
			default :
				result.push(Integer.parseInt(ops[i]));
			}
		}

			
		while(!result.isEmpty()) {
			
			sum += result.pop();
			
		}
		
	
		return sum;
	}

	
}
