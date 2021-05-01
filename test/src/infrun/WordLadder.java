package infrun;

import java.util.*;

public class WordLadder {

	public static void main(String[] args) {
		
		WordLadder a = new WordLadder();
		String[] words = {"hot" , "lot" , "dot" ,"log" ,"cog"};
		List<String> wordlist = Arrays.asList(words);
		System.out.println(a.ladderLength_neighbor("hoz","log" , wordlist));

	}
	
	public  int ladderLength_neighbor(String beginWord, String endWord, List<String> wordList) {
		if(wordList == null || !wordList.contains(endWord)) return 0;
		
		Queue<String> queue = new LinkedList<>();
		Set<String> dict = new HashSet<>(wordList);
		queue.offer(beginWord); // queue : hoz
		dict.add(endWord); // dict : log
		dict.remove(beginWord); // // dict 에 beginword 가 잇으면 제거해라 
		int level = 1;
		
		while(!queue.isEmpty()) {
			
			int size = queue.size();
			for(int i = 0; i < size; i++) {
				String str = queue.poll(); 
				if(str.equals(endWord)) return level; 
				for(String neighbor : neighbors(str, dict)) {
					queue.offer(neighbor);
					System.out.println("queue : " + queue.peek());
				}
				 
			}
			level++;
		}
		
		return 0;
		
	}
	
	public  List<String> neighbors(String s, Set<String> dict){
		
		List<String> res = new LinkedList<>();
	
		for(int i = 0; i < s.length(); i++) {
			char[] chars = s.toCharArray();
			for(char ch = 'a'; ch <= 'z'; ch++) {
				chars[i] = ch; // ait ~ zit
				String word = new String(chars);
				System.out.println(word);
				if(dict.remove(word)) {
					System.out.println("????????//");
					System.out.println("word : " + word);
					res.add(word);
				}
			}
		}
		
		return res;
	}
	
	
	
}
