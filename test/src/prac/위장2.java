package prac;

import java.util.*;

public class 위장2 {

	public static void main(String[] args) {
		String[][] clothes = {{"yellowhat", "headgear"}, 
								{"bluesunglasses", "eyewear"}, 
								{"green_turban", "headgear"}};	
		
		System.out.println(solution(clothes));
	}
	
    public static int solution(String[][] clothes) {
        int answer = 1; //곱셈을 위해 1로 선언
        HashMap<String, Integer> clothesMap = new HashMap<String, Integer>();
        //map 구하기
        for(int i =0; i<clothes.length; i++){
        	//의상종류, 갯수
            clothesMap.put(clothes[i][1], clothesMap.getOrDefault(clothes[i][1], 0)+1);
        }
        //조합
        Set<String> keySet = clothesMap.keySet(); //의상종류.
        
        for(String key : keySet) {
        	answer *= clothesMap.get(key)+1; 
        }
        return answer-1; //아무것도 안입는 경우의 수 제거
    }
	
	/*
	public static int solution(String[][] clothes) {
        int answer = 0;
        
        List<Overlap> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        List<String> clohtes_name = new ArrayList<>();
        
        for(int i = 0; i < clothes.length; i++) {
        	Overlap overlap = new Overlap(clothes[i][0] , clothes[i][1]);
        	
        	list.add(overlap);
        }
        
        for(int i= 0 ; i < list.size(); i++) {
        	set.add(list.get(i).clothe_kind);
        	clohtes_name.add(list.get(i).clothe_name);
        }
        
        System.out.println(set.size());
        
        
        return answer;
	}
	*
	*/
    
//    3 * 2 * 2 * 2 = 24 ,5 + 3 + 3 +2 +1 ,2 + 2 + 2  , 2
    						 
	
	
	
	
	
	
				public static class Overlap{
					String clothe_name;
					String clothe_kind;
					
					public Overlap(String clothe_name, String clothe_kind) {
						this.clothe_name = clothe_name;
						this.clothe_kind = clothe_kind;
					}
				}
}


