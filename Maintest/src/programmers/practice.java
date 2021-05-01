package programmers;
import java.util.*;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> res = new ArrayList<>();
		Set<String> dic = new HashSet<>();
			
		String s = "hit";
		
		char[] chars = s.toCharArray();
		for(int i=  0;  i< s.length(); i++) {
			for(char ch='a'; ch <= 'z'; ch++) {
				
				chars[i] = ch;
				String word  = new String(chars);
				if(dic.remove(word)) {
					res.add(word);
				}
			}
		}
		
			
			
	
	
	

    }

}
