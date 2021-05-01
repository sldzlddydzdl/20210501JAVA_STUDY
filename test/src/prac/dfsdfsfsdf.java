package prac;

import java.util.HashMap;

public class dfsdfsfsdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] al = { "A" , "B" , "C" ,"A" };
		HashMap<String, Integer> hm = new HashMap<>();
		for(String key : al) hm.put(key, hm.getOrDefault(key, 0) + 1);
		
		System.out.println("결과 : " + hm);
		//	결과 : {A=2, B=1, C=1}
		
		for(String s : al)
		System.out.println(hm.get(s));
		
		int k = Math.max(10, 5);
		
		System.out.println(k);
		
	}
	
	// getOrDefault
	
	// 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본값을 반환하는 메서드 
	
	// 사용방법
	// getOrDefault( Object key , V DefaultValue )
	
	// 매개 변수 : 이 메서드는 두 개의 매개 변수를 허용합니다.
		// key : 값을 가져와야 하는 요소의 키입니다.
		// defaultValue : 지정된 키로 매핑된 값이 없는 경우 반환되어야 하는 기본값입니다.
	
		// 반환 값 : 찾는 key가 존재하면 해당 key에 매핑되어 있는 값을 반환하고, 그렇지않으면
		// 디폴트 값이 반환됩니다.
	
	
	

}
