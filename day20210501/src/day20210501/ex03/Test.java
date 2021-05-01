package day20210501.ex03;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가입할 아이디를 입력하세요 : ");
		String userId = sc.nextLine();
		
		System.out.print("가입할 비밀번호를 입력하세요 : ");
		String userPw = sc.next();
		
		UserIdCheck userIdCheck = new UserIdCheck();
		UserPwCheck userPwCheck = new UserPwCheck();
		UserCheck uc = new UserCheck();
		
		try {
			boolean result = uc.check(userId, userPw);
			if(result) {
				System.out.println("가입되었습니다.");
			}
		} catch (InvalidUserIdException e) {
			System.out.println("아이디를 잘못 입력했습니다.");
			System.out.println("아이디를 다시 입력하세요");
			userId = sc.nextLine();
		} catch (InvalidUserPwException e) {
			System.out.println(e.getMessage());
			System.out.println("비밀번호를 다시 입력하세요");
			userPw = sc.nextLine();
		}
		
		
//		try {
//			if(userIdCheck.IdCheck(userId))
//				System.out.println("아이디 생성");
//		} catch (InvalidUserIdException e) {
//			System.out.println("아이디의 길이가 8 이상이입니다!!");
//		}
//		
//		
//		try {
//			if(userPwCheck.PwCheck(userPw))
//				System.out.println("비밀번호 생성");
//		} catch (InvalidUserPwException e) {
//			System.out.println("비밀번호의 길이가 8 이상입니다!!");
//		}
		
	}
	
}
