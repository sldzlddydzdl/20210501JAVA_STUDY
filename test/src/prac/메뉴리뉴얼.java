package prac;

import java.util.*;

public class 메뉴리뉴얼 {

	public static void main(String[] args) {
		
		String[] asdfa = { "BCFG" , "CDE" , "ACDE" ,"AC"};
		
		Arrays.sort(asdfa);
		
		for(String s : asdfa)
			System.out.println(s);
		
		// TODO Auto-generated method stub

//		String str = "ABCD";
//		List<List<String>> list = new ArrayList<>();
//		
//		int[] course = { 2, 3, 4};
//		int count = 0;
//		for(int i= 0 ; i < course.length; i++) {
//			for(int j = 0 ; j < ( 1 << course[i]); j++) {
//				if(Integer.bitCount(j) == course[i]) {
//					list.add(new ArrayList<>());
//					String allmenu = "";
//					for(int k = 0 ; k < course[i]; k++) {
//						if ( (j & ( 1 << k )) != 0) {
//							allmenu += str.charAt(k);
//						}
//					}
//					System.out.println(allmenu);
//					
//				}
//				
//				count++;
//				
//			}
//		}
//		
//		for(List s : list)
//			System.out.println(s.get(0));


		String str = "BCAD";

		int[] course = { 2, 3, 4};
		
		for(int s = 0 ; s < course.length; s++) {
			for(int i = 0 ; i < ( 1<< str.length() ); i++) {
				if(Integer.bitCount(i) != course[s])
					continue;
			
			
				String allmenu = "";
				for(int j = 0 ; j < str.length(); j++) {
					if( ( i & (1 << j) ) != 0){
						allmenu += str.charAt(j);
					}
					
				}
				char[] ch = allmenu.toCharArray();
				Arrays.sort(ch);
				String newallmenu = "";
				for(char k : ch)
					newallmenu += k;
				System.out.println(newallmenu);
				
				
			}
		}
		
	}
	
	

}
