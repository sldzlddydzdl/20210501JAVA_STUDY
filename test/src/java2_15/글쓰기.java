package java2_15;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class 글쓰기 {
	public static Scanner sc = new Scanner(System.in);
	String 글내용;
	String 작성자;
	String 작성일;

	public void write(int log) {
		System.out.println(" === 글쓰기 === ");
		System.out.print(" 글내용 : ");
			글내용 = sc.nextLine(); // 띄어쓰기 포함
		작성자 = Main.회원목록.get(log).이름;
		
		Date 날짜 = new Date();
		SimpleDateFormat 형식 = new SimpleDateFormat("MM월 dd일 hh:mm:ss");
		
		작성일 = 형식.format(날짜);
	}
	
	public void remove(int log) {
		System.out.println(" ===== 글삭제 ===== ");
		System.out.println(" 삭제할 게시물 번호 : ");
			int 삭제 = sc.nextInt();
			
		if(Main.회원목록.get(log).이름.equals(Main.글목록.get(삭제).작성자)) {
			Main.글목록.remove(삭제);
		}
		else {
			System.out.println(" ** 알림 : 삭제 권한이 없습니다 " );
		}
	}
	
	public void modify(int log) {
		System.out.println(" ===== 글삭제 ===== ");
		System.out.println(" 수정할 게시물 번호 : ");
			int 수정 = sc.nextInt();
			
		if(Main.회원목록.get(log).이름.equals(Main.글목록.get(수정).작성자)) {
			
			System.out.print(" 수정할 내용 입력 : ");
			sc.nextLine(); // nextLine() 오류 보완  // nextLine() 두번이 연속으로오면 앞에 nextLine()이 띄어쓰기로 인식못하게하기위함
			Main.글목록.get(수정).글내용 = sc.nextLine(); // 오류 : nextLine() 띄어쓰기 
			
		}
		else {
			System.out.println(" ** 알림 : 삭제 권한이 없습니다 " );
		}
	}

}
