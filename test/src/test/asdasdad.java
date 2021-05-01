package test;

import java.util.*;

public class asdasdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String skill = "CBD";
		String[] skill_trees = {"BACDE" , "CBADF" , "AECB" , "BDA"};
		
		System.out.println(solution(skill , skill_trees));
		
	}
	
	
	public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        char[] skills = skill.toCharArray();
        List<Character> list = new ArrayList<>();
        
        for(int i = 0 ; i < skill_trees.length; i++) {
        	char[] skills_trees = skill_trees[i].toCharArray();
        	for(int k = 0 ; k < skills_trees.length; k++) {
        		for(int j = 0 ; j < skills.length; j++) {
        			if(skills[j] == skills_trees[k]) list.add(skills_trees[k]);
        			
        		}
        		
            	
            	
        		
//        		int result = what(skills, list);
        	
        		
        	}
        	for(int s = 0 ; s < list.size(); s++) {
        		System.out.print(list.get(s) + " ");
        	}
        	System.out.println();
        	
        	int start = 0;
    		int z = 0;
    		int cnn = 0;
    		while(start < skills.length && z < list.size()) {
    			System.out.println(skills[start] + "  " + list.get(z));
        		if(skills[start] == list.get(z)) {
        			cnn++;
        			start++;
        			z++;
        		}
        		else {
        			break;
        			
        		}
    		}
    		System.out.println("cnn : " + cnn);
    		System.out.println("list.size() : " + list.size());
    		
    		if(cnn == list.size()) {
    			answer++;
    			System.out.println("answer : " + answer);
    		}
    		start = 0;
    		z = 0;
    		cnn =0;

        	list.clear();
//        	System.out.println();
        	
        
       	}
        	
        
        
        return answer;
    }
	
	public static int what(char[] skills, List<Character> list) {
		int cnn = 0;
		
		int start =0;
		int j = 0;
		if(skills[start] == list.get(j)) {
			cnn++;
			
		}
		else {
			
		}
		
		
		
		return cnn;
	}

}
