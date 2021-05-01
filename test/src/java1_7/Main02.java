package java1_7;


import java.util.Scanner;


public class Main02 {
	public static void main(String[] args) {
 
		
		
		String[][] array = {{"kim" ,"dong", "hyun"} ,{ "kim","moo", "yeol"}};
		
	;
		
		for(int i = 0; i < array.length; i++) {
			int j = array[i].length;
				if(array[i][j].equals(array[i][j])) {
					System.out.println("성이같습니다.");
				}
			
			
		}
		
	}
 
	// 소수 생성 메소드 
	public static void make_prime(int number) {
 
		// 0 과 1 은 소수가 아니므로 종료
		if(number < 2) {
			return;
		}
		
		// 2 는 소수다
		if(number == 2) {
			System.out.println(number);
			return;
		}
		
        
		for(int i = 2; i < number; i++) {
        
			// 소수가 아닐경우 종료
			if(number % i == 0) {
				return;
			}
		}
		// 위 반복문에서 약수를 갖고 있지 않는경우 소수다.
		System.out.println(number);
		return;
	}
	
	
 
 
}