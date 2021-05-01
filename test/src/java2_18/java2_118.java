package java2_18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class java2_118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 컬렉션 프레임워크
			// 컬렉션 : 수집
			// 프레임워크 : 프로그램 개발을 위한 미리 만들어진 프로그램
				// 라이브러리 : 프로그램 개발을 위한 도구
					// 라이브러리 -> 소스 -> 프레임워크
		
		// Collection => 1.list / 2. set
		// Map
		
		//1. List 컬렉션
			// 0. ArrayList // 1.Vector // 2.LinkedList : 골라서 사용하기
				// 멀티스레드 : Vector   // 단일스레드 : ArrayList // 인덱스의 변화가 많을때는 : LinkedList 	
		
			// 1.1 ArrayList 클래스
				// 1. .add("객체") 객체 추가
				// 2. .get( 인덱스 ) 해당하는 인덱스의 객체 호출
				// 3. .size() 객체 수
				// 4. .remove( 인덱스 ) 해당하는 인덱스의 객체 삭제
				// 5. .clear() 모든 객체 삭제
				
				
		
				// 예제1 
					List<String> list = new ArrayList<>();
					// 인터페이스 = 클래스 
		//			list = new Vector<>(); // 인터페이스 도중에 메모리변경 가능
						// 자료형 자주 변경되는 경우 => 인터페이스 
									
		//			ArrayList<String> list2 = new ArrayList<>();
					// 클래스 = 클래스
						
	//		[에러]	list2 = new Vector(); // 클래스 도중에 새로운 메모리 변경 불가능
						// 고정적인 자료형 => 클래스[객체]
					
					
				list.add("java");			// 리스트에 객체 추가 
				list.add("JDBC");			// 리스트에 객체 추가 
				list.add("Servlet/jsp");	// 리스트에 객체 추가 
				list.add("database");		// 리스트에 객체 추가 
				list.add("C");				// 리스트에 객체 추가 
				
				System.out.println(" 리스트내 객체수 : " + list.size());
				
				for(int i = 0 ; i < list.size(); i++) {
					System.out.println("리스트내 인덱스 : " + i + " 값은 " + list.get(i));
				}
				
				list.remove(3); // 인덱스가 삭제되고 삭제된 뒤 인덱스들은 한칸씩 당겨짐
				System.out.println();
				
				System.out.println(" *삭제후 리스트내 객체수 : " + list.size());
				
				for(int i = 0 ; i < list.size(); i++) {
					System.out.println("리스트내 인덱스 : " + i + " 값은 " + list.get(i));
				}
				
					// for( 초기값 ; 조건문 ; 증감식 ) 
				// 리스트 반복문
				for(String temp : list) {	// 리스트내 객체가 null일때까지 한개씩 temp 대입
					System.out.println(temp);
				}
				
				list.clear(); // 모든 객체 삭제
				System.out.println();
				
				System.out.println(" * 모두 삭제후 리스트내 객체수 : " + list.size());

				for(int i = 0 ; i < list.size(); i++) {
					System.out.println("리스트내 인덱스 : " + i + " 값은 " + list.get(i));
				}
				
		System.out.println("*************************************************");
				
			// 1.2 Vector 클래스
				// 공통점 : ArrayList 구조가 동일함 
				// 차이 : Vector [ 동기화 O ] 		멀티스레드 쓸데는 Vector 사용
				// 차이 : ArrayList[ 동기화 X ] 	단일스레드 쓸데는 ArrayList 사용
				
				List<게시물> list2 = new Vector<>();
				
				list2.add(new 게시물("제목1", "내용1", "작성자1"));
				list2.add(new 게시물("제목2", "내용2", "작성자2"));
				list2.add(new 게시물("제목3", "내용3", "작성자3"));
				list2.add(new 게시물("제목4", "내용4", "작성자4"));
				list2.add(new 게시물("제목5", "내용5", "작성자5"));
				
				System.out.println("리스트내 객체 수 : " + list2.size());
				
				for(게시물 temp2 : list2) {
					System.out.println(temp2.제목);
					System.out.println(temp2.내용);
					System.out.println(temp2.작성자);
				}
				
				list2.remove(3);
				
				System.out.println();
				System.out.println(" list2 삭제 후 ");
				for(게시물 temp2 : list2) {
					System.out.println(temp2.제목);
					System.out.println(temp2.내용);
					System.out.println(temp2.작성자);
				}
				System.out.println("리스트내 객체 수 : " + list2.size());
				
				System.out.println();
				
				list2.clear();
				System.out.println(" list2 모두 삭제 후");
				System.out.println(" 리스트내 객체 수 : " + list2.size());
				
		System.out.println("***********************************************");
		
			// 1.3 LinkedList 클래스
				// 차이 : ArrayList , Vector : 인덱스 기준으로 메모리 순서
				// 차이 : LinkedList / head , tail 기준으로 메모리 연결 
					// 순차적으로 추가/삭제 => ArrayList
					// 중간에 추가/삭제 => LinkedList
					// 검색 => ArrayList
		
			List<String> list3 = new ArrayList<>();
			List<String> list4 = new LinkedList<>();
		
			long 시작;
			long 끝;
			
			시작 = System.nanoTime(); // 현재 나노시간
			for(int i = 0 ; i < 10000; i++) {
				
				list3.add(0, String.valueOf(i)); // 0번째 인덱스 추가
				
				
			}
			끝 = System.nanoTime();
			
			System.out.println("ArrayList 걸린시간 : " + (끝-시작) + "ns");
			
			시작 = System.nanoTime();
			for(int i = 0; i < 10000; i++) {
				
				list4.add(0, String.valueOf(i));// 0번째 인덱스 추가
			}
			
			끝 = System.nanoTime();
			
			System.out.println("Linkedlist 걸린시간 : " + (끝-시작) + "ns");
		
			// 결론 LinkedList 는 ArrayList 보다 인덱스의 변화가 많을때는 3~4배 빠르다.
		
		System.out.println("********************************************");
		
			
		// SET 컬렉션
				// list 차이 : 인덱스 기준으로 저장순서 있음
				// Set : 인덱스 X : 저장순서가 없음
					//1. .add(객체 ) : 객체 추가 // !!!중복제거
					//2. .size() : 모든 객체 수
					//3. .iterator() : 모든 객체
						// .hasNext() : 다음요소 여부 확인 / T /F
						// .next() : 다음요소 반환
					//4. .remove(객체) : 해당 객체 삭제
					//5. clear() : 모든 객체 삭제 
				
				// HashSet 클래스
				Set<String> set = new HashSet<>();
				
				set.add("java");
				set.add("JDCB");
				set.add("Servlet/jsp");
				set.add("Database");
				set.add("C");
				set.add("C"); // 중복 허용 되지 않음
				
				System.out.println(" HashSet 객체수 : " + set.size());
		
				// 출력 : 출력하기위해서는 한개씩 출력 
				Iterator<String> iterator = set.iterator();
					// set 컬렉션에 존재하는 이터레이터를 인터페이스에 연결 시킨것
					// set에 존재하는 객체[요소] 들을 하나씩 순회
						// null -> 요소1 -> 요소2 -> 요소3 ~~~
				while(iterator.hasNext() ) {
						// hasNext() : 다음요소에 존재 여부 확인 : 있으면 True / 없으면 False
					
					String temp = iterator.next();
						// next() : 다음요소 가져오기
					
					System.out.println(" set내 요소[객체] : " + temp );
					
				}
					
				// 삭제 : 
				set.remove("java");
				set.remove("Database");
				System.out.println("삭제 후 HashSet 객체수 : " + set.size());
				
				// 출력 : 출력하기위해서는 한개씩 출력 
				Iterator<String> iterator1 = set.iterator();
					// set 컬렉션에 존재하는 이터레이터를 인터페이스에 연결 시킨것
					// set에 존재하는 객체[요소] 들을 하나씩 순회
						// null -> 요소1 -> 요소2 -> 요소3 ~~~
				while(iterator1.hasNext() ) {
						// hasNext() : 다음요소에 존재 여부 확인 : 있으면 True / 없으면 False
					
					String temp = iterator1.next();
						// next() : 다음요소 가져오기
					
					System.out.println(" set내 요소[객체] : " + temp );
					
				}
				
				set.clear();
				System.out.println("모두 삭제 후 HashSet 객체수 : " + set.size());
				
		System.out.println("*********************************************");
		// Map 컬렉션
				// 차이 : list => 인덱스[순서o] 	// set => 인덱스x[순서x]
				// Map : 키 , 값 => 키와 맵을 이용해서 키를 이용한 값에 접근
					// 1. .put ( 키 , 값 ) 요소 추가
					// 2. .size()
					// 3. .get( 키 ) 키에 해당하는 값 호출 
					// 4. .remove( 키 ) 키에 해당하는 값과 키 요소 삭제 , 즉 키와 값을 둘다 삭제 
					// 5. .clear : 모든 키와 값 삭제
						// 단점 : iterator 없고 인덱스도 없어서 set를 사용해야한다.
		
				// HashMap 클래스
					Map<String, Integer> map = new HashMap<>();
						// 키 , 값 => 하나의 묶음 ,즉 하나의 요소
					
					map.put("유재석", 80);
					map.put("강호동", 70);
					map.put("신동엽", 90);
					map.put("서장훈", 100);
					
					System.out.println(" map 객체 수 : " + map.size());
					// 검색
					System.out.println(" 강호동 검색 : " + map.get("강호동"));
					// 삭제
					map.remove("강호동");
					System.out.println(" 삭제 후 map 객체 수 : " + map.size());
					// 모두 출력 [ 순서x , iterator x] 순서도없고 iterator 도 없다
						// 모든 키 => set => iterator => 모든 키에 접근 => 모든 값에 접근
					
					Set<String> setkey = map.keySet();
					// keySet() : 모든키를 set에 넣는다 -> 즉 , 모든 값도 얻는다.
					
					Iterator<String> keyIterator = setkey.iterator();
					
					while( keyIterator.hasNext()) {
						
						String key = keyIterator.next();
						System.out.println(key + " 의 키 값은 " + map.get(key));
						
					}
					
					map.clear(); // 모두 삭제
					System.out.println("모두 삭제 후 map 객체 수 : " + map.size());
					
				System.out.println("************************************************");
					
				// HashTable 클래스      			앤트리구조? 이다
					// 차이 : 구조는 동일함 
						// HashMap : 동기화 사용불가능	단일 스레드 ( 단일스레드에는 HashMap 사용)
						// HashTable : 동기화 사용가능	멀티 스레드 ( 멀티스레드에는 HashTable 사용)
					
					// 예제1 : 아이디 비밀번호를 이용한 로그인 만들기
					Map<String, String> map2 = new Hashtable<>();
					
					map2.put("qwe", "123");
					map2.put("qwe1", "123");
					map2.put("qwe2", "123");
					map2.put("qwe3", "123");
					map2.put("qwe4", "123");
					map2.put("qwe4", "123"); // 중복 키 허용x // 값은 중복 허용o
					System.out.println(" map2 객체 수 : "+ map2.size());
					
					Scanner sc = new Scanner(System.in);
					
					while(true) {
						
						System.out.println("아이디");
							String id = sc.next();
						System.out.println("비밀번호");
							String pw = sc.next();
						
						if(map2.containsKey(id)) {
								// 해당 map에 키 포함 여부 확인
							if(map2.get(id).equals(pw)) {
								System.out.println(" 로그인 성공 ");
								break;
							}
							else {
								System.out.println("패스워드가 다름");
							}
						}
						else {
							System.out.println("아이디가 다름");
						}
					}		
					
					
					// Map 중첩
			//		Map<String, String> list123 = new HashMap<>();
			//		Map<String, String> list1234 = new HashMap<>();
			//		Map<list123,list1234> list12345 = new HashMap<>();
					
			//		list123.put("123" ,"1234" ,"1232", "2345");
					
					// 문제 : 회원제 게시판
						// 회원 : 아이디 , 비밀번호 [map]
						// 게시물 클래스 : [Set]
						
						// [메뉴]
						// 1. 회원가입
						// 2. 로그인
					
						// [로그인후]
						// 모든게시물 출력되고
						// 1. 글작성
					
		//	Scanner sc = new Scanner(System.in);
			Map<String, String> login = new HashMap<>();
			Set<게시물> write = new HashSet<>();
			
			Iterator<게시물> check = write.iterator();
	
			while(true) {
				System.out.println(" 메뉴 ");
				System.out.println("1. 회원가입");
				System.out.println("2. 로그인");
				System.out.println("3. 종료");
				System.out.println("************* 게시판 **************");
				System.out.println();
				if(write.isEmpty()) {
					System.out.println("게시글이 없습니다");
					
				}
				else {
					
					while(check.hasNext() ) {
							// hasNext() : 다음요소에 존재 여부 확인 : 있으면 True / 없으면 False
						
						게시물 temp = check.next();
						
						String temp1 = check.next().내용;
						String temp2 = check.next().작성자;
						String temp3 = check.next().제목;
							// next() : 다음요소 가져오기
						
						System.out.println(" 게시글 :  " + temp + " 작성자 : " + temp + " 제목 : " + temp );
						
					
					}
				}
				System.out.println();
				System.out.println("*********************************");
				
				int ch = sc.nextInt();
			
				
				
				
				if( ch ==1) {
					System.out.println(" 회원가입할 아이디를 입력하세요 :");
					System.out.println(" 회원가입할 비밀번호를 입력하세요 :");
					login.put(sc.next(), sc.next());
				}
				
				if( ch == 2) {
					
					System.out.println("로그인할 아이디를 입력하세요 : ");
						String id = sc.next();
					System.out.println("로그인할 아이디를 입력하세요 : ");
						String pw = sc.next();
						
					if(login.containsKey(id)) {
						if(login.get(id).equals(pw)) {
							System.out.println(" 제목을 입력하세요 : ");
							System.out.println(" 내용을 입력하세요 : ");
							System.out.println(" 작성자을 입력하세요 : ");
							
							게시물 temp2 = new 게시물(sc.next(), sc.next(), sc.next());
							
							write.add(temp2);
						}
						else {
							System.out.println("비밀번호가 틀렸습니다.");
						}
					}
					else {
						System.out.println("아이디가 틀렸습니다.");
					}
						
				
					
				}
				if(ch == 3) {
					
					break;
				}
				
			}
					
					
					
					
					
			}
	}


