package EX;

import java.util.*;

public class Ex15 {
	public static void main(String[] args) {
		
		
		// ũ�Ⱑ 10�� ���ڿ��� ���� �� �ִ� �迭�� �ϳ� ����
		String[] books = new String[10] ;
		
		
		// å�̸� 5���� �迭�� �����ð�
		// �����, Į�ǳ뷡, ���ݼ��� , 2021Ʈ���� �ڸ���, �ο�
		books[0] = "�����";
		books[1] = "Į�ǳ뷡";
		books[2] = "���ݼ���";
		books[3] = "2021 Ʈ���� �ڸ���";
		books[4] = "�ο�";
		
		// ũ�Ⱑ 10�� bookCopy �迭�� �����
		String[] booksCopy = new String[10];
		
		// booksCopy�� index 5~9 �� books�� index 0~4 ������ ������ ������ �����ÿ�.
		for(int i = 5; i < books.length; i++) {
			booksCopy[i] = books[i-5];
		}
		
		// books�� 0~4 ������ ����Ͻÿ�
		for(int i = 0 ; i < books.length/2; i++) {
			System.out.println(books[i]);
		}
		
		// bookCopy�� 5~9������ ����Ͻÿ�
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
