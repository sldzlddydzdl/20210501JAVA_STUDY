package day0418.collectionsEx02;

import java.util.*;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3명의 user 객체를 생성하여 arraylist 에 담고
		
		// arraylist 에 담긴 내용을 활용하여.
		// 모든 사람의 정보를 출력
		// 모든 사람의 나이 총합을 구하여라.
		
//		User user1 = new User("김동현", 27);
//		User user2 = new User("김윤아", 29);
//		User user3 = new User("김무열", 34);
		
		List<User> list = new ArrayList<>();
		
		list.add(new User("김동현", 27));
		list.add(new User("김윤아", 29));
		list.add(new User("김무열", 34));

//		list.add(user1);
//		list.add(user2);
//		list.add(user3);
		
		for(int i = 0 ; i < list.size(); i++) {
			list.get(i).toString();
		}
		
		for(User u : list)
			System.out.println(u);
		
		int ageAmount = 0;
		
		for(User u : list)
			ageAmount += u.getAge();
		
		System.out.println(ageAmount);
		
		for(User u : list)
			System.out.println(u.getName());
		
	}

}
