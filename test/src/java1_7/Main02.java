package java1_7;


import java.util.Scanner;


public class Main02 {
	public static void main(String[] args) {
 
		
		
		String[][] array = {{"kim" ,"dong", "hyun"} ,{ "kim","moo", "yeol"}};
		
	;
		
		for(int i = 0; i < array.length; i++) {
			int j = array[i].length;
				if(array[i][j].equals(array[i][j])) {
					System.out.println("���̰����ϴ�.");
				}
			
			
		}
		
	}
 
	// �Ҽ� ���� �޼ҵ� 
	public static void make_prime(int number) {
 
		// 0 �� 1 �� �Ҽ��� �ƴϹǷ� ����
		if(number < 2) {
			return;
		}
		
		// 2 �� �Ҽ���
		if(number == 2) {
			System.out.println(number);
			return;
		}
		
        
		for(int i = 2; i < number; i++) {
        
			// �Ҽ��� �ƴҰ�� ����
			if(number % i == 0) {
				return;
			}
		}
		// �� �ݺ������� ����� ���� ���� �ʴ°�� �Ҽ���.
		System.out.println(number);
		return;
	}
	
	
 
 
}