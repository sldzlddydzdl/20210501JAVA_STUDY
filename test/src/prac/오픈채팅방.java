package prac;

import java.util.*;

public class 오픈채팅방 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] record = {"Enter uid1234 Muzi", 
		                   "Enter uid4567 Prodo",
		                   "Leave uid1234 ",
		                   "Enter uid1234 Prodo",
		                   "Change uid4567 Ryan"};
		
		// Prodo 님이 들어왔습니다.
		// Ryan  님이 들어왔습니다.
		// Prodo 님이 나갔습니다.
		// Prodo 님이 들어왔습니다.
		
		
		String[] answer = new String[record.length];
		answer = solution(record);
		for(String s : answer)
			System.out.println(s);
	}
	
	public static String[] solution(String[] record) {
        
        
        String[][] temp = new String[record.length][3];
        
        for(int i= 0 ;  i < record.length; i++) {
        	temp[i] = record[i].split(" ");
        }
        
        for(int i = 0 ; i < temp.length; i++) {
        	for(int j = 0 ; j < temp[i].length; j++) {
        		System.out.println(temp[i][j]);
        	}
        	System.out.println();
        }
        
        List<Id> list = new ArrayList<>();
        Id id = new Id();
        
        for(int i = 0 ; i < temp.length; i++) {
        	if(temp[i].length == 2) {
        		id = new Id(temp[i][0], temp[i][1], "");
        		list.add(id);
        	}
        	else {
        		id = new Id(temp[i][0], temp[i][1], temp[i][2]);
       			list.add(id);
        	}
        }
        
//        for(int i= 0 ; i < list.size(); i++) {
//        	System.out.println(list.get(i).situation
//        			+ " " + list.get(i).id + " " +
//        						 list.get(i).name);
//        }
        
        String[] answer = new String[list.size()];
        for(int i = 0; i < list.size(); i++) {
        	if(list.get(i).situation.equals("Enter")) answer[i] = list.get(i).name + "님이 들어왔습니다.";
        	else if(list.get(i).situation.equals("Leave")) answer[i] = list.get(i).name + "님이 나갔습니다.";
        	else if(list.get(i).situation.equals("Change")) answer[i] = "";
        }
        
        
        return answer;
    }
	
	
	public static class Id{
		String situation;
		String id;
		String name;
		
		public Id() {
			
		}
		
		public Id(String situation ,String id, String name) {
			this.situation = situation;
			this.id = id;
			this.name = name;
		}
		
		
		
	}

}
