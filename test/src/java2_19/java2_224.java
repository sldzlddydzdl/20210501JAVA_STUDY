package java2_19;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class java2_224 {


	// 이진트리 [ 부모노드 1개당 2개의 자식노드 ]
		// 노드 : 값 [ 객체 , 변수]
		// 부모노드 기준으로 값이 작으면 => 왼쪽 자식
		// 부모노드 기준으로 값이 크면 => 오른쪽 자식
		// 예) 폴더
		
	
	
	
	// 스택
	
	
	// 큐
	
	
	
	public static void main(String[] args) {
		/*
		// 1. TreeSet 클래스 : 이진트리 구현 클래스
			// 1. .first() : 가장 왼쪽의 노드 출력 [ 가장 작은 객체 ]
			// 2. .last() : 가장 오른쪽 노드 출력 [ 가장 큰 객체 ]
			// 3. .lower(객체) : 해당객체의 왼쪽 자식노드 
			// 4. .higher(객체) : 해당객체의 오른쪽 자식노드
			// 5. .floor(객체) : 해당객체[포함]의 왼쪽 자식 노드
			// 6. .ceiling(객체) : 해당객체[포함]의 오른쪽 자식 노드
			// 7. .descendingSet() : 내림차순
			// 8. .descendingSet().descendingSet() : 오름차순
				// NavigableSet 정렬 인터페이스 : 정렬의 값을 하나씩 출력 가능
			// 9. .isEmpty() : 현재 트리 비어 있는지 여부 확인 T / F
			// 10. .pollFirst() : 가장 왼쪽 노드 삭제 [ 가장 작은 객체 삭제]
			// 11. .pollLast() : 가장 큰 노드 삭제 [ 가장 큰 객체 삭제 ]
			// 12. .remove(값) : 해당값 삭제 
		TreeSet<Integer> 점수트리 = new TreeSet<>();
		
			// 트리에 값[객체 , 값] 추가
		
		점수트리.add( 87 );
		점수트리.add( 98 );
		점수트리.add( 75 );
		점수트리.add( 95 );
		점수트리.add( 80 );
		점수트리.add( 80 ); // 중복값 허용 X
		
		System.out.println("현재 트리의 객체수 : " + 점수트리);
		
		// 검색
		System.out.println(" 가장 낮은 점수 : " + 점수트리.first());
			// first : 가장 왼쪽에 있는 노드 출력
	
		System.out.println(" 가장 높은 점수 : " + 점수트리.last());
			// last : 가장 오른쪽에 있는 노드 출력
	
		System.out.println(" 95점 바로 아래 점수 : " + 점수트리.lower(95));
			// lower( 값 ) : 해당 노드의 왼쪽자식 노드 출력
		
		System.out.println(" 95점 바로 위 점수 : " + 점수트리.higher(95));
			// higher( 값 ) : 해당 노드의 오른쪽자식 노드 출력
	
		System.out.println(" 95점 이거나 바로 아래 점수 : " + 점수트리.floor(95));
			// .floor( 값 ) : 해당 노드이거나 왼쪽자식 노드 출력
			//              출력 <= 값 
	
		System.out.println(" 95점 이거나 바로 위 점수 : " + 점수트리.ceiling(95));
			// .ceiling( 값 ) : 해당 노드이거나 오른쪽자식 노드 출력
			//      		출력 >= 값 
		// 정렬 [ 내림차순 ]
		NavigableSet<Integer> 정렬 = 점수트리.descendingSet();
			// NavigableSet : 정렬인터페이스			// 내림차순 [ 가장 오른쪽노드부터 출력]
		for(Integer temp : 정렬) {
			System.out.print( temp + " ");
		}
		
		System.out.println();
		// 정렬 [ 오름차순 ]
		정렬 = 점수트리.descendingSet().descendingSet(); // 내림차순.내림차순 : 오름차순
		
		for(Integer temp : 정렬)
			System.out.print(temp + " ");
		
		System.out.println();
		
		// 개별 삭제
		점수트리.remove(87);
		
		// 모두 삭제 
		while( !점수트리.isEmpty()) { // !:부정 
						
			System.out.println(" 삭제된 노드 : " + 점수트리.pollLast() + "         남은 객체수 :" + 점수트리.size());
			
		}
		 
		// 문자트리 
		TreeSet<String> 문자트리 = new TreeSet<>();
		
			//트리에 값[객체, 값] 추가
		문자트리.add("apple");
		문자트리.add("forever");
		문자트리.add("description");
		문자트리.add("JAVA"); // 
		문자트리.add("10");
		문자트리.add("!");
		문자트리.add("%");
		문자트리.add("자바");
		문자트리.add("ever");
		문자트리.add("zoo");
		문자트리.add("bass");
		문자트리.add("bass");		
		System.out.println("현재 트리의 객체수 : " + 문자트리);
			// 특수문자 => 숫자 => 대문자 => 소문자 => 한글
		
		// 검색
		System.out.println(" 첫번째 노드 : " + 문자트리.first());
		System.out.println(" 첫번째 노드 : " + 문자트리.last());
		
		NavigableSet<String> 검색 =  문자트리.subSet("c", true, "자바", true); // c <= 검색 <= f
	//	NavigableSet<String> 검색 =  문자트리.subSet("c", false, "f", false); // c < 검색 < f
										// subSet(" 검색시작값 " , " 검색시작값포함여부 " , "검색끝값" , 검색끝값포함여부 )
	
		for(String temp : 검색 )
			System.out.print(temp + " ");	
		System.out.println();
		
		NavigableSet<String> 정렬셋 = 검색.descendingSet();
		for(String temp : 정렬셋)
			System.out.println(temp);
		
		// Map 컬렉션 : 키 , 값 = 엔트리
		*/
				// 이진트리
		/*
		* 	    				[노드] : 엔트리 ( 키 , 값 )
		* 
		* 		  [노드]엔트리			   [노드]엔트리
		* 			
		* 	[노드]		[노드]		[노드]		[노드]
		* 
		* 
		*/
		/*
		// TreeMap 클래스
		TreeMap<Integer, String> 트리맵 = new TreeMap<>();
		
		트리맵.put(87 , "유재석");
		트리맵.put(98 , "강호동");
		트리맵.put(75 , "신동엽");
		트리맵.put(95 , "서장훈");
		트리맵.put(80 , "이훈");
		트리맵.put(80 , "이훈"); // 중복x
			// 중복x , 키 기준으로 정렬
		System.out.println(" 현재 트리의 객체수 : " + 트리맵);

		// 검색
		System.out.println(" 가장 작은 노드 : " + 트리맵.firstEntry());
		System.out.println(" 가장 큰 노드 : " + 트리맵.lastEntry());
		System.out.println(" 95의 아래 점수 : " + 트리맵.lowerEntry(95));
		System.out.println(" 95의 위 점수 : " + 트리맵.higherEntry(95));
		System.out.println(" 95의[포함] 바로 아래 점수 : " + 트리맵.floorEntry(95));
		System.out.println(" 95의[포함] 바로 위 점수 : " + 트리맵.ceilingEntry(95));
		
		// 정렬 [ 내림차순 ]
		NavigableMap<Integer, String> 정렬맵 = 트리맵.descendingMap();
			// Map 단점 바로 iterator를 호출못한다
		
		for(Map.Entry<Integer, String> temp : 정렬맵.entrySet()) {
			// 엔트리를 키와 값을 가지고 있기 때문에 엔트리형에만 저장 가능
			System.out.print( temp + " ");
		}
		
		System.out.println();
		
		// 정렬 [ 오름차순 ]
		정렬맵 = 트리맵.descendingMap().descendingMap();
			// 트리자체가 기본값으로 오른차순으로 되있어서 오름차순함수가 따로없다.
		
		for(Map.Entry<Integer, String> temp : 정렬맵.entrySet()) {
			// 엔트리를 키와 값을 가지고 있기 때문에 엔트리형에만 저장 가능
			System.out.print( temp + " ");
		}
		System.out.println();
		
		// 개별 삭제
		트리맵.remove(75);
		System.out.println(" 현재 트리의 객체수 : " + 트리맵);
		
		// 모두 삭제
		while(!트리맵.isEmpty()) {
			
			System.out.println(" 삭제된 엔트리" + 트리맵.pollFirstEntry());
			
		}
		
		// 검색
		TreeMap<String, Integer> 문자맵 = new TreeMap<>();
		
		문자맵.put("apple", 10);
		문자맵.put("forever", 20);
		문자맵.put("description", 30);
		문자맵.put("JAVA", 40); // 
		문자맵.put("10", 50);
		문자맵.put("자바", 60);
		문자맵.put("ever", 70);
		문자맵.put("zoo", 80);
		문자맵.put("bass", 90);
		문자맵.put("bass", 90); // 중복 x
		
		System.out.println(" 현재 트리의 객체수 : " + 문자맵);
		
		NavigableMap<String, Integer> 검색2 = 문자맵.subMap("c", true, "자바", true);
		
		System.out.println(" 검색 결과 :" + 검색2);
		
		for(Map.Entry<String, Integer> temp : 검색2.entrySet())
			System.out.print(temp + " ");
		System.out.println();
		//////////////////////////////////////////////////////////////////////////////////////
		
		// 사용자가 만든 클래스내 필드기준으로 정렬
		
		// 정렬 인터페이스 : Comparable
			// compareTo 메소드 오버라이딩해서 정렬기준 정하기
		
		TreeSet<사람> 사람트리 = new TreeSet<>();
		
		사람트리.add(new 사람("유재석" , 40));
		사람트리.add(new 사람("강호동" , 50));
		사람트리.add(new 사람("신동엽" , 20));
//		사람트리.add(new 사람("이훈" , 50));
		사람트리.add(new 사람("서장훈" , 100));
//		사람트리.add(new 사람("서장훈" , 100));
		
		System.out.println(" 현재 트리 객체 수 : " + 사람트리);
			// 오류 발생 : 클래스내 필드가 2개 이상이면 정렬기준을 컴퓨터가 몰라서 에러가난다.
			// compareTo 메소드 오버라이딩후 : 오류 x
		
		// 나이 내림차순
		NavigableSet<사람> 나이정렬 = 사람트리.descendingSet();
		
		for(사람 temp : 나이정렬)
			System.out.print(temp.나이 + " ");
		
		System.out.println();
		
		// 나이 오름차순
		나이정렬 = 사람트리.descendingSet().descendingSet();
		
		for(사람 temp : 나이정렬)
			System.out.print(temp.나이 + " ");
		
		System.out.println();
		
		
		// 이름 내림차순
		NavigableSet<사람> 이름정렬 = 사람트리.descendingSet();
		
		for(사람 temp : 이름정렬)
			System.out.print(temp.이름 + " ");
		
		System.out.println();
		
		// 이름 오름차순
		이름정렬 = 사람트리.descendingSet().descendingSet();
		
		for(사람 temp : 이름정렬)
			System.out.print(temp.이름 + " ");
		
		System.out.println();
		
		*/
//		Scanner sc = new Scanner(System.in);
//		TreeSet<회원> 회원리스트 = new TreeSet<>();
//		
//		while(true) {
//		System.out.println(" ** 회원제 관리 프로그램 **");
//		System.out.println("1. 회원가입");
//		System.out.println("2. 로그인");
//		System.out.println("3. 종료");
//		int ch = sc.nextInt();
//		
//		if(ch ==1) {
//			System.out.println(" ** 회원가입 **");
//			System.out.println(" 아이디 : ");
//			 String id = sc.next();
//			System.out.println(" 비밀번호 : ");
//			 String pw = sc.next();
//			System.out.println(" 이름 : ");
//			 String name = sc.next();
//			 int point = 0;
//			
//			회원리스트.add(new 회원(id, pw, name, point+=10));
//			
//		}
//		
//		if(ch ==2) {
//			System.out.println(" ** 로그인 **");
//			System.out.println(" 아이디 : ");
//			 String id = sc.next();
//			System.out.println(" 비밀번호 : ");
//			 String pw = sc.next();
//			
//
//			 
//			 if(id.equals(temp.아이디)  ) {
//				 if(pw.equals(temp.비밀번호 )){
//					 System.out.println("로그인 성공");
//				 point += 5;
//				 }
//				 else {
//					 System.out.println("비밀번호가 다릅니다.");
//				 }
//			 }
//			 else {
//				 System.out.println("아이디가 다릅니다.");
//			 }
//			
//		}
//		
//		if(ch ==3) {
//			
//			
//		}
//		
//		
//		}
//		
//		
//		
//		
		
		
		
		
		
		
	}
	

	
}
