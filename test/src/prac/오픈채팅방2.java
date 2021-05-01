package prac;
import java.util.*;

public class 오픈채팅방2 {

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
	        ArrayList<String> chatLog = new ArrayList<>();
	        HashMap<String, String> nickMap = new HashMap<>();
	        
	        for(String log : record){
	            StringTokenizer st = new StringTokenizer(log);
	            String command = st.nextToken();
	            String userId = st.nextToken();
	            String nickname = "";
	            
	            if(!command.equals("Leave")){
	                nickname = st.nextToken();
	            }
	            
	            switch(command){
	                case "Enter":
	                    nickMap.put(userId, nickname);
	                    chatLog.add(userId + "님이 들어왔습니다.");
	                    break;
	                case "Leave":
	                    chatLog.add(userId + "님이 나갔습니다.");
	                    break;
	                case "Change":
	                    nickMap.put(userId, nickname);
	                    break;
	            }
	        }
	        
	        String[] answer = new String[chatLog.size()];
	        int logIdx = 0;
	        
	        for(String str : chatLog){
	            int endOfId = str.indexOf("님");
	            String userId = str.substring(0, endOfId);
	            
	            answer[logIdx++] = str.replace(userId, nickMap.get(userId));
	        }
	        
	        return answer;
	    }
	}

