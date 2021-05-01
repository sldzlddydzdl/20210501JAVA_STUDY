package programmers;

import java.util.*;

public class 베스트앨범 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] genres = {"classic", "pop", "classic","kpop" , "classic", "pop" , "pop"};
					//  	  0         1        2        3         4        5
		int[] plays = {500, 600, 150,2000 ,800, 2500, 700};
		
		for(int s : solution(genres, plays))
			System.out.print(s + " ");

	}

	public static int[] solution(String[] genres, int[] plays) {
		
//		Map<Map<Integer, String> , Integer > map2 = new HashMap<Map<Integer, String> , Integer>();
//		{{0=classic, 1=pop, 2=classic, 3=classic, 4=pop}=2500}
//		
//		Map<Integer, String> innerMap = new HashMap<>();
//		{0=classic, 1=pop, 2=classic, 3=classic, 4=pop}
//		for(int i = 0 ; i < genres.length; i++) {
//			innerMap.put(i, genres[i]);
//		}
//		
//		for(int i = 0 ; i < plays.length ; i++) {
//			map2.put(innerMap, plays[i]);
//		}
//		
		
		
//		Map<Integer , Map<Integer, String>> map2 = new HashMap<Integer, Map<Integer, String>>();
//		Map<Integer,String> innerMap = new HashMap<>();
//		
//		for(int i = 0 ; i < genres.length; i++) {
//			innerMap.put(i, genres[i]);
//			map2.put(plays[i], innerMap);
//			innerMap.clear();
//		}
//		
//		for(int i = 0 ; i < plays.length; i++) {
//			
//		}
		
		
		
		//고유번호 = key값 & 장르, 플레이횟수 = value값
        HashMap<Integer, Integer> pMap = new HashMap<Integer, Integer>();
        HashMap<Integer, String> gMap = new HashMap<Integer, String>();
        for(int i = 0; i < genres.length; i++){
            pMap.put(i, plays[i]);
            gMap.put(i, genres[i]);
        }
        
        //HashSet으로 장르 분류
        HashSet<String> gSet = new HashSet<String>();
        
        for(int i = 0; i < genres.length; i++){
            gSet.add(genres[i]);
        }
        
        //장르별 총 플레이 횟수
        HashMap<Integer, String> coPlay = new HashMap<Integer, String>();
        for(String x : gSet){
            int count = 0;
            for(int i = 0; i < gMap.size(); i++){
                if(gMap.get(i).equals(x)){
                    count+= pMap.get(i);
                }
            }
            coPlay.put(count, x);
        }
        
        //플레이 횟수 별로 정렬(키 값을 기준으로 정렬, TreeMap)
        TreeMap sort = new TreeMap(coPlay);
        String[] sortGenre = new String[gSet.size()];
        int index = 0;
        for(Object o : sort.keySet()){
            sortGenre[index] = sort.get(o).toString();
            index++;
        }
        
        //장르별 많이 플레이 된 노래의 고유번호 찾기
        ArrayList<Integer> fIndex = new ArrayList<Integer>();
        for(int i = sortGenre.length-1; i >= 0; i--){
            int count = 0;
            for(int p1 : gMap.keySet()){
                if(sortGenre[i].equals(gMap.get(p1))){
                    count++;
                }
            }
            
            int[] temp = new int[count];
            int k = 0;
            for(int p2 : gMap.keySet()){
                if(sortGenre[i].equals(gMap.get(p2))){
                    temp[k] = pMap.get(p2);
                    k++;
                }
            }
            
            if(temp.length != 1){
                Arrays.sort(temp);
                for(int j = temp.length - 1; j >= temp.length - 2; j--){
                    for(int p : pMap.keySet()){
                        if(temp[j] == pMap.get(p)){
                            fIndex.add(p);
                            pMap.put(p, 0);
                            break;
                        }
                    }
                }                
            }else{
                for(int p : pMap.keySet()){
                    if(temp[0] == pMap.get(p)){
                        fIndex.add(p);
                        pMap.put(p, 0);
                        break;
                    }
                }                
            }
        }
        
        int[] answer = new int[fIndex.size()];
        
        for(int i = 0; i < fIndex.size(); i++){
            answer[i] = fIndex.get(i);
        }
        
        return answer;
	}
	
	public static class Genres_Index{
		String genres_name;
		int index;
		
		
		public Genres_Index(String genres_name, int index) {
			this.genres_name = genres_name;
			this.index = index;
		}
		
		
		
	}
}
