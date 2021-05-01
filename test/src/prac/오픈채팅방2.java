package prac;
import java.util.*;

public class ����ä�ù�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] record = {"Enter uid1234 Muzi", 
		                   "Enter uid4567 Prodo",
		                   "Leave uid1234 ",
		                   "Enter uid1234 Prodo",
		                   "Change uid4567 Ryan"};
		
		// Prodo ���� ���Խ��ϴ�.
		// Ryan  ���� ���Խ��ϴ�.
		// Prodo ���� �������ϴ�.
		// Prodo ���� ���Խ��ϴ�.
		
		
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
	                    chatLog.add(userId + "���� ���Խ��ϴ�.");
	                    break;
	                case "Leave":
	                    chatLog.add(userId + "���� �������ϴ�.");
	                    break;
	                case "Change":
	                    nickMap.put(userId, nickname);
	                    break;
	            }
	        }
	        
	        String[] answer = new String[chatLog.size()];
	        int logIdx = 0;
	        
	        for(String str : chatLog){
	            int endOfId = str.indexOf("��");
	            String userId = str.substring(0, endOfId);
	            
	            answer[logIdx++] = str.replace(userId, nickMap.get(userId));
	        }
	        
	        return answer;
	    }
	}

