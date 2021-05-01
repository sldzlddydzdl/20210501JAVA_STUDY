package infrun;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String J = "a";
		String S = "aAAbbbb";
		
		JewelsAndStones a = new JewelsAndStones();
		
		int result = a.solve(J, S);
		
		System.out.println(result);
		
		
	}

	public int solve(String jew , String stone) {
		
		int result = 0;
		
		/* 나의풀이
		for(int i = 0 ; i < jew.length(); i++) {
			for(int j = 0; j < stone.length(); j++) {
				if(jew.charAt(i) == stone.charAt(j)) {
					result++;
				}
			}
		*/
		
		// Set , HashSet사용
		HashSet<Character> set = new HashSet<>();
		for(char jewel : jew.toCharArray()) {
			set.add(jewel); // a , A		
		}
		
		for(char stoneChar : stone.toCharArray()) {
			if(set.contains(stoneChar)) {
				result++;
			}
		}
		
		
		
		
		return result;
	}
	
}
