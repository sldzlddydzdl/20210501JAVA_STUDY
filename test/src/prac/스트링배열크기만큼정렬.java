package prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class 스트링배열크기만큼정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = { "ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH" };
		
		List<String> list = new ArrayList<>();
		
		for(int i = 0; i < str.length; i++) {
			list.add(str[i]);
		}
		
		
		Comparator<String> c = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o2.length(), o1.length());
			}
		};
				
		Collections.sort(list, c);
		
		for(String s : list)
			System.out.println(s);

	}

}
