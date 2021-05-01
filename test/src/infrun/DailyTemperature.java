package infrun;

import java.util.Stack;

public class DailyTemperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DailyTemperature a = new DailyTemperature();
		int[] temperatures = {73 , 74 , 75 , 71 ,69, 72, 76, 73};
		
		int[] result = a.dailyTemperature(temperatures);
		for(int i : result)
			System.out.print(i + " ");
		
		
	}
	
	public int[] dailyTemperature(int[] temperatures) {
		/*
		int[] result = new int[temperatures.length];
		int count = 0;
		
		for(int i =0 ; i< temperatures.length; i++) {
			for(int j = i+1; j < temperatures.length; j++) {
				
				if(temperatures[i] < temperatures[j]) {
					count++;
					result[i] = count;
					count = 0;
					break;
				}
				if(temperatures[i] > temperatures[j]) {
					count++;
				}
				
				
			}
		}
		
		
		
		
		return result;
		*/
		Stack<Integer> stack = new Stack<>();
		int[] result = new int[temperatures.length];
		
		for(int i = 0 ; i < temperatures.length; i++) {
			while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
				int index = stack.pop();
				result[index] = i - index;
			}
			
			stack.push(i);
		}
				
		
		
		
		return result;
	}

}
