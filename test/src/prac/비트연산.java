package prac;

public class 비트연산 {
	public static void main(String[] args) {
		
		char[] data = { 'A' , 'B' , 'C' , 'D' };
		printSubsets(data, 4);
		
		
	}
	
	
	
	public static void printSubsets(char[] arr, int n) {
		
		for(int i = 0 ;i < (1 << n) ; i++) {
			System.out.print("{");
			for(int j = 0; j < n; j++) {
				if((i & 1 << j) != 0)
					System.out.print(arr[j] + "");
			}
			System.out.print("}");
		}
	}
	
}
