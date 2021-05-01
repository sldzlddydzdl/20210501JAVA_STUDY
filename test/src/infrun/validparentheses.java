package infrun;

import java.util.*;

public class validparentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "([}}])";
		System.out.println(isVaild(s));
		
	}
	
	public static boolean isVaild(String s) {
//		boolean result = true;
//		Stack<Character> store = new Stack<>();		
//		
//		for(int i = 0 ; i < s.length(); i++) {
//			char ch = s.charAt(i);
//			
//			store.push(ch);
//		}
//		while(!store.isEmpty()) {
//			if(store.peek() == '}') {
//				
//			
//			if(store.peek() == ']') {
//				
//			}
//			if(store.peek() == ')') {	
//			}	
//			
//		return result;
		
		if(s.length() % 2 != 0)
			return false;
		Stack<Character> stack = new Stack<>();
		
		
		for(int i = 0 ; i < s.length(); i++) {
			switch(s.charAt(i)) {
				case ')' :
					if(!stack.empty() && stack.peek() == '(') stack.pop();
					else stack.push(s.charAt(i)); 
					break;
				case '}' :
					if(!stack.empty() && stack.peek() == '{') stack.pop();
					else stack.push(s.charAt(i));
					break;
				case ']' :
					if(!stack.empty() && stack.peek() == '[') stack.pop();
					else stack.push(s.charAt(i));
					break;
					
				default:
					stack.push(s.charAt(i));
					break;
			}
		}
		
		return stack.empty();
	}

}
