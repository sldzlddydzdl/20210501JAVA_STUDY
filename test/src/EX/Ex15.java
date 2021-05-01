package EX;

import java.util.*;

public class Ex15 {
	public static void main(String[] args) {
		
		
		// 크기가 10인 문자열을 담을 수 있는 배열을 하나 만들어서
		String[] books = new String[10] ;
		
		
		// 책이름 5개를 배열에 넣으시고
		// 어린왕자, 칼의노래, 연금술사 , 2021트랜드 코리아, 인연
		books[0] = "어린완자";
		books[1] = "칼의노래";
		books[2] = "연금술사";
		books[3] = "2021 트랜드 코리아";
		books[4] = "인연";
		
		// 크기가 10인 bookCopy 배열을 만들고
		String[] booksCopy = new String[10];
		
		// booksCopy의 index 5~9 에 books에 index 0~4 까지의 내용을 복사해 넣으시오.
		for(int i = 5; i < books.length; i++) {
			booksCopy[i] = books[i-5];
		}
		
		// books의 0~4 까지를 출력하시오
		for(int i = 0 ; i < books.length/2; i++) {
			System.out.println(books[i]);
		}
		
		// bookCopy의 5~9까지를 출력하시오
		for(int i = 5; i < books.length; i++) {
			System.out.println(booksCopy[i]);
		}
		
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int[][] s = new int[5][2];
		for(int i = 0 ; i < s.length; i++) {
			for(int j = 0 ;  j < s[i].length; j++) {
				s[i][j] = sc.nextInt();
			}
		}
		
		Arrays.sort(s,Comparator.comparingInt(o1 -> o1[1]));
		Arrays.sort(s , Comparator.comparingInt(o1 -> o1[0]));
		
		
		for(int i = 0 ; i < s.length; i++) {
			for(int j = 0 ;  j < s[i].length; j++) {
				System.out.print(s[i][j] + " ");
			}
			System.out.println();
		}
	}
}
