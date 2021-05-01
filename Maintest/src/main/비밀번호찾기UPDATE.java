package main;

import java.util.*;

public class 비밀번호찾기UPDATE {

	public static void main(String[] args)  {
		// 비밀번호 찾기 17219번 문제
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		String[][] id_password = new String[N][2];
		
		for(int i = 0 ; i < id_password.length; i++) {
			// 저장된 사이트 주소
			id_password[i][0] = sc.next();
			
			// 비밀번호를 찾으려는 사이트 주소
			id_password[i][1] = sc.next();
		}
		
		// 비밀번호를 찾을 사이트 주소를 저장한다.
		String[] find_password = new String[M];
		
		for(int i = 0 ;  i < M; i++) {
			find_password[i] = sc.next();
		}
		
		// 맵을 써서 사이트주소와 그에대한 비밀번호를 저장한다.
		Map<String, String> site_map = new HashMap<>();
		
		// 정보들을 넣는다.
		for(int i = 0 ;  i < id_password.length; i++) {
			site_map.put(id_password[i][0], id_password[i][1]);
		}
		
		// 찾고자하는 비밀번호의 주소를 key값에넣어 그에대한 values 값들을 출력한다.
		for(String key : find_password)
			System.out.println(site_map.get(key));

	}
}	