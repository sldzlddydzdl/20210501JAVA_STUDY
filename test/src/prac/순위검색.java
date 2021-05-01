package prac;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 순위검색 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String[] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
		
		int[] answer = new int[query.length];
		answer = solution(info , query);
		
		for(int i : answer)
			System.out.print(i + " ");
		
		
	}
	
    public static int[] solution(String[] info, String[] query) {
        
        String[][] moreinfo = new String[info.length][5];
        for(int i = 0 ; i < info.length; i++) {
        	moreinfo[i] = info[i].split(" ");
        	
        }
        
        for(String[] s : moreinfo)
        	System.out.println(s[0] + " " + s[1] + " " + s[2] + " " + s[3] + " " + s[4]);
        
        String[][] morequery = new String[query.length][5];
        String[] temp = new String[query.length];
        for(int i = 0 ;  i < query.length; i++) {
        	temp[i] = query[i].replace(" and ", " ");
        }
//        System.out.println("-------------------------------");
//        for(String s : temp)
//        	System.out.println(s);
//        System.out.println("________________________________");
        for(int i = 0 ; i < temp.length; i++) {
        	morequery[i] = temp[i].split(" ");
        }
        
//        for(String[] s : morequery)
//        	System.out.println(s[0] + " " + s[1] + " " + s[2] + " " + s[3] + " " + s[4]);
//        
//        
//         
        System.out.println("--------------------------------------------------");
        
        for(String[] s : morequery)
        	System.out.println(s[0] + " " + s[1] + " " + s[2] + " " + s[3] + " " + s[4]);
        
        int[] answer = new int[query.length];
        
        for(int i = 0 ; i < morequery.length; i++) {
        	for(int j = 0 ; j < morequery.length; j++) {
        		if(morequery[i][0].equals(moreinfo[j][0]) && morequery[i][1].equals(moreinfo[j][1])
        			&& morequery[i][2].equals(moreinfo[j][2]) && morequery[i][3].equals(moreinfo[j][3]) 
        			&& Integer.parseInt(morequery[i][4]) <= Integer.parseInt(moreinfo[j][4]) ) {
        			answer[i]++;
        		}
        	}
        }
        
        return answer;
    }

}
