package EX;

import java.util.*;

public class Ex07 {

	public static void main(String[] args) {
		// 사용자로부터 1~5 중 하나의 숫자를 입력받아
		// 해당되는 번호의 메뉴를 출력하는 코드를 작성하시오
		System.out.println("***********메뉴판***********");
		System.out.println("1. 김밥" );
		System.out.println("2. 주먹밥" );
		System.out.println("3. 만두");
		System.out.println("4. 라면");
		System.out.println("5. 떡볶이");
		System.out.println("**************************");
		System.out.print("선택하실 메뉴는 골라주세요 : ");
		Scanner sc = new Scanner(System.in);
		
		int ch = sc.nextInt();
		if( ch >= 1 && ch <= 5) {
			switch(ch) {
				case 1:
					System.out.println("김밥을 선택했습니다.");
					break;
				case 2:
					System.out.println("주먹밥을 선택했습니다.");
					break;
				case 3:
					System.out.println("만두를 선택했습니다.");
					break;
				case 4:
					System.out.println("라면을 선택했습니다.");
					break;
				case 5:
					System.out.println("떡볶이를 선택했습니다.");
			}
		}else {
			System.out.println("해당 메뉴가 없습니다. 다시 골라주세요 ");
			Ex07.main(args);
		}
	}

}
