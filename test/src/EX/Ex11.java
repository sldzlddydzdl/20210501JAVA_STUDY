package EX;

public class Ex11 {
	public static void main(String[] args) {
		
		// ������

		int s = 2;
		int m = 1;
		int n = 1;
		System.out.println(s+"��\t\t" + (s+1)+"��\t\t" + (s+2)+"��\t\t"
				+ (s+3)+"��\t\t"+ (s+4)+"��\t\t"+ (s+5)+"��\t\t"
				+ (s+6)+"��\t\t"+ (s+7)+"��\t\t"
				);

		
			
			while(m < 9) {
				
				while(n < 9) {
					for(int i = 2 ; i <= 9 ; i++) {
						System.out.print(i+"x"+m+" = " + (i*n)+"         ");
						
						System.out.println();
						n++;
					}
				}
				m++;
			}
		
			int num1 = 120;
			int num2 = 50;
			n = (num1 < num2 ) ? num1 : num2; // �� ���� ���� ���� ���� n �� ����
			int gcd = n;
			for(int i = n; i > 0; i--) {
				if(num2 % i == 0 && num1 % i == 0) {
					gcd = i;
					break;
				}
			}
			
			System.out.println("�ִ� ����� : " + gcd);
			
			
			
	}
}

//	System.out.print(i+"x"+j+" = " + (i*j) + "  ");