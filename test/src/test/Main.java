package test;

import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    /*  
		Scanner sc = new Scanner(System.in);
	      
	      int N = sc.nextInt();
	      
	      
	      for ( int i = 1 ; i <= N ; i++ ){
	    		for( int j = 1 ; j <= N-i ; j++ ) {
	    			System.out.printf(" ");
	    		}
	    		for( int k = 1 ; k <= i ; k++ ){
	    			System.out.printf("*");
	    		}
	    		System.out.printf("\n");
	    	}
		*/
	      
		// ���⸸���  [ Scanner , printfln , if ]
					//[ ���� ] : �ΰ��� ���� �Է¹޾� �Է¹��� ��ȣ�� ��� 
					//[ �� ] : 
							// [�Է�] 2 + 3
							// [���] 2 + 3  ��� : 5
							
							// [�Է�] 3 * 2
							// [���] 3 * 2  ��� : 6
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�μ��� ������ �Է� �ϼ��� : ");
		
		boolean key = true;
		while(key) {
			
			int num1 = sc.nextInt();
			char cal = sc.next().charAt(0);
			int num2 = sc.nextInt();
			
			if(cal == '+') {
				System.out.println("�μ��� ������ : " + (num1 + num2) + " �Դϴ�.");
			}
			else if(cal =='-') {
				System.out.println("�μ��� ������ : " + (num1 - num2) + " �Դϴ�.");
			}
			else if(cal == '/') {
				System.out.println("�μ��� �������� : " + (num1 / num2) + " �Դϴ�.");
			}
			else if(cal == '*') {
				System.out.println("�μ��� ���� : " + (num1 * num2) + " �Դϴ�.");
			}
			else if(cal == '%') {
				System.out.println("�μ��� �������� : " + (num1 % num2) + " �Դϴ�.");
			}
			else if(cal =='Q') {
				System.out.println("����Ǿ����ϴ�. ");
				key = false;
			}
			else {
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
			}
			
		}
		*/
		
		

		/* ȸ������ / �α��� ����� 
		 *  ȸ������
				ID , PW �Է¹޾� ������ ���� 
			�α��� [ ���ѷ��� ] 
				ID , PW �� ������ ��� ���ѷ��� ����
				ID , PW �� �������� ������ ���ѷ���
		*/
		
		
		/*
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("------- ȸ������ â ---------");
		System.out.print("������ ���̵� �Է��ϼ��� : ");
		String id = sc.next();
			
		System.out.print("������ ��й�ȣ�� �Է��ϼ��� : ");
		String pw = sc.next();
		
		System.out.print("ȸ�������� �Ϸ�Ǿ����ϴ� .");
		
		boolean key = true;
		while(key) {
		System.out.println("------- �α��� â ---------");
		System.out.print("�α����� ���̵� �Է��ϼ��� : ");
		String id2 = sc.next();
		
		System.out.print("�α����� ��й�ȣ�� �Է��ϼ��� : ");
		String pw2 = sc.next();
		
		if(id.equals(id2)) {
			if(pw.equals(pw2)) {
				System.out.println("�α��εǾ����ϴ�.");
				key = false;
			}
			else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�. ");
			}
		}
		else {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�. ");
		}
		
		
		}
		
		
		*/
		/*
		 * Ű����ũ ����� 
			* �޴� ���ѷ��� ��ȣ ��� �Է¹޾� 
			* �Է¹��� ��ȣ�� �ݾ��� �������� ������ ���ϱ�
			* ���� �Է½� �� ��� :  �����ݾ� ��� 
				[ �޴� ] 
				1. �Ƹ޸�ī�� [ 200 ]
				2. ���̵� [ 300 ] 
				3. ���̽�ũ�� [ 400 ]
				4. ���� [ 500 ]
				5. ����
		 * 
		 * 
		 */
		
		/*
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		boolean key = true;
		while(key) {
			System.out.println("------- �޴� --------");
			System.out.println("1. �Ƹ޸�ī�� [200] ");
			System.out.println("2. ���̵� [300]");
			System.out.println("3. ���̽�ũ�� [400]");
			System.out.println("4. ����[500]");
			System.out.println("5. ����");
			System.out.print("�޴��� �������ּ��� : ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				sum += 200;
			}
			if(menu == 2) {
				sum += 300;
			}
			if(menu == 3) {
				sum += 400;
			}
			if(menu == 4) {
				sum += 500;
			}
			if(menu == 5) {
				System.out.println("�� ���� : " + sum + " �Դϴ�.");
				System.out.println("�����մϴ�.");
				key = false;
			}
		}
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int[] ar = new int[N]; // �Է¹����� ���ο�����Ҵ�
		
		for(int i = 0; i < N; i++) {
			ar[i] = sc.nextInt();
		}
		
		for(int i =0; i <N; i++)
		if(ar[i] < X) {
			System.out.print(ar[i] + " ");
		}
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		
		int key = 1111111;
		
		while(key != 0) {
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		key = (A + B);
		if(key == 0) {
			System.out.print("");
			break;
		}
		System.out.println(A + B);
		}
		*/
		
		/*
		for(int i = 1; i <= 5; i++) {
			for(int j = i; j < 5; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		/*
		for(int i = 1; i <= 5; i ++) {
			for(int j = i; j <= 4; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			for(int s = 2; s <= i; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		int B= 0;
		while(B != 2) {
			int A = sc.nextInt();
			B = sc.nextInt();
			System.out.println(A + B);
		}
		*/
		
		/*
		Scanner sc = new Scanner(System.in); // �Է°��� �Ҵ�
		
		int N = sc.nextInt(); // ���� N �Է�
		int K = N;
		int temp = 111; // temp �ʱ�ȭ
		int count = 0; // count �ʱ�ȭ

		while(N != temp) { // ���� N �� temp�� ���������� while �ȿ� ������ �����ض�
			
			int A = K/10; 		// A = 10���ڸ���
		//	System.out.println("A : " + A);
			int B = K - A*10;	// B = 1���ڸ���
		//	System.out.println("B : " +B);
			if(A + B >= 10) {
				if((A+B)%10 == 1) {
					K = (B*10);
				}
				K = (B*10) + (A+B-10);
			}
			else {
				if(K == 0) {
					temp = K;
				}
				K = (B*10)+ (A+B);  // ���
			}
		//	System.out.println("K : " +K);
			temp = K; 			// ���� N �� ��� ����
			count++;
		}
		System.out.println(count);
		// 5 + 5 = 10 , 50  5 + 0 = 5 , 5 
		*/
		
		/* 10818�� �ּ�, �ִ�
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();

		
		int ar[] = 	new int[N];
		int max = -1000000;
		int min = 10000000;
		
		for(int i = 0; i < N; i++) {
			ar[i] = sc.nextInt();
		}
		for(int i =0; i < N; i++) {
			if(max < ar[i]) {
				max = ar[i];
				// System.out.println("max : " + max);
			}
			if(min > ar[i]) {
				min = ar[i];
				// System.out.println("min : " + min);
			}
		}
		System.out.println(min + " " + max);
		*/
	
		/* ���� 2562
		Scanner sc = new Scanner(System.in);
		
		int N = 9;
		
		int num = 0;
		int max = 0;
		int ar[] = new int[N];
		
		for(int i =0; i < N; i++) {
			ar[i] = sc.nextInt();
			if(max < ar[i]) {
				max = ar[i];
				num = i+1;
			}
		}
		System.out.println(max);
		System.out.println(num);
		*/
		
		
		/* ���� 2577 ��ǰ,,,,,
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int result = A*B*C;
		
		int ar[] = new int[10];
		
		
		
		// for(int i =0; i < 10; i++) {
		//	 for(int k = 100000000; k >= 1; k = k/10){
		//		if(k < result) {
		//			if((result / k) == i) {
		//				result = result - (result/k)*k;
		//				System.out.println(result);
		//				ar[i] += 1;
		//				}
		//			}
		//		}		
		//	}
		
		System.out.println("result : " + result);
		int num;
		while(result >0) {
			
			num = result%10;
			System.out.println("num : " + num);
			ar[num]++;
			result /= 10;
			System.out.println("result : " + result);
		}
		
		for(int j =0; j<10; j++) {
			System.out.println(ar[j]);
		}
		*/
	//	System.out.println(1%42);
			
		
		/* ���� 3052
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		int ar[] = new int[10];
		int ar2[] = new int[42];
		
		for(int i =0; i< 10; i++) {
			ar[i] = sc.nextInt();
		}
		
		for(int i =0; i <10; i++) {
			for(int k =0; k <=41; k++) {
			if((ar[i]%42) == k) {
				 ar2[k]++;
				 if(ar2[k] == 2) {
					 ar2[k]--;
				 }
				}
			}
		}
		for(int j = 0; j < 42; j++) {
			count += ar2[j];
		}
		System.out.println(count);
		*/
		
		/* ���� 1546
		// �ִ��� M�̶��ϰ� �� ���� M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double sum = 0;
		double n = 0;
		int ar[] = new int[N];
		
		for(int i =0; i < N; i++) {
			ar[i] = sc.nextInt();
		}
		
		int max = 0;
		// �ִ�ã��
		for(int i=0; i < N; i++) {
			if(max < ar[i]) {
				max = ar[i];
			}
		}
		
		for(int i =0; i < N; i++) {
			n = (double)ar[i]/max;
			sum = sum + (n * 100);
		}
		
		double av = (double)sum/N;
		
		System.out.println(av);
		*/
		
		/* ���� 8958 ��ǰ,,,
 		Scanner sc = new Scanner(System.in);
		 
		
		int num = sc.nextInt();
		
		String ar[] = new String[num];
		
		for(int i =0 ; i < ar.length; i++) {
			ar[i] = sc.next();
		}
		
		for(int i=0; i< ar.length; i++) {
			int cnt = 0;
			int sum = 0;
			
			for(int j =0; j < ar[i].length(); j++) {
				if(ar[i].charAt(j) == 'O') {
					cnt++;
				}
				else {
					cnt = 0;
				}
				sum += cnt;
			}
			System.out.println(sum);
		}
		*/
		
	/*  ���� 4344
	Scanner sc = new Scanner(System.in);
	
	int sum = 0;
	int count = 0;
	int C = sc.nextInt();
	
	for(int i =0; i <C; i++) {
		int N = sc.nextInt();
	
		int ar[] = new int[N];
	
			for(int j = 0; j < N; j++) {
				ar[j] = sc.nextInt();
			}
			
			
			for(int k = 0; k< N; k++) {
				sum += ar[k];
			}
			
			double av = (double)sum / N;
			
			for(int j = 0; j < N; j++) {
				if(av < ar[j]) {
					count += 1;
				}
			}
			double Q = (double)N;
			double K = (double)count;
			System.out.printf("%.3f" , (K/Q*100));
			System.out.println("%");
		//	System.out.println((K/Q *100) + "%");
			count = 0;
			K = 0;
			av = 0;
			sum = 0;
	}
	*/
		
	/*
	class Test{
	long sum(int [] a) {
		long sum = 0;
		
		for(int i  =0; i< a.length; i++) {
			sum += a[i];
		}
		
		return sum;
		
		}
	}
	*/
		
	
		
	/* �������� ��������
	Scanner sc = new Scanner(System.in);
	
	int N = sc.nextInt();
	int a[] = new int[N];
	
	int temp , index;
	
	for(int i = 0; i < a.length; i++) {
		a[i] = sc.nextInt();
	}
		
	for(int i = 0;  i < a.length; i++) {
		int min = i; 
		for(int j =i+1; j < a.length; j ++) {
				if(a[min] > a[j]) {
					min = j;
					// min  = 4
				}
		}
		// min = 4 , i = 0
		temp = a[min]; // min[4] = 1 , a[0] = 2 , temp = 1
		
		a[min] = a[i]; // a[4] = 2
		a[i] = temp; // a[0] = 1  ---> before a[0] = 2 , a[4] = 1 after a[0] = 1 , a[4] = 2
	}
		
	for(int i = 0; i < a.length; i++) {
		System.out.print(a[i] + " ");
	}
	*/
		
		
		
	/* �������� ��������
	Scanner sc = new Scanner(System.in);
	
	int N = sc.nextInt();
	int a[] = new int[N];
	
	int temp;
	
	for(int i = 0; i < a.length; i++) {
		a[i] = sc.nextInt();
	}
	
	for(int i = 0; i < a.length; i++ ) {
		for(int j = 0; j < (a.length-1) - i; j++) {
			if(a[j] > a[j + 1]) {
				temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;
			}
		
		}
		
	}
	
	for(int i = 0; i < a.length; i++) {
		System.out.print(a[i] + " ");
	}
	*/
	
	// �������� ��������
	/*
	Scanner sc = new Scanner(System.in);
	
	int temp , j;
	int N = sc.nextInt();
	int a[] = new int[N];
	
	for(int i = 0; i < a.length; i++) {
		a[i] = sc.nextInt();
	}
	
	for(int i =0; i < a.length -1; i++) {
		 j = i;
		 	while(a[j] < a[j+1]) {
		 		temp = a[j];
		 		a[j] = a[j+1];
		 		a[j+1] = temp;
		 		j--;
		 		if(j == -1) {
		 			j = 0;
		 		}
		 	}
		
	}
	
	for(int i = 0 ; i < a.length; i++) {
		System.out.print(a[i] + " ");
	}
	*/
		
	/* ������
	Scanner sc = new Scanner(System.in);
	
	System.out.println("�迭�� ���� �Է� : ");
	int N = sc.nextInt();
	
	int a[] = new int[N];
	
	System.out.println("���ҵ��� �� �Է� : ");
	for(int i = 0 ; i < a.length;  i++) {
		a[i] = sc.nextInt();
	}	
		
	System.out.println(" �Ϸ�");
	
	quickSort(a, 0 , N-1);
	
	for(int i = 0; i < a.length; i++) {
		System.out.print(a[i] + " ");
	}
	
}
	
	public static void quickSort(int a[], int start, int end) {
		if(start >= end) { // ���Ұ� 1���� ���
			return;
		}
		
		int key = start; // Ű�� ù��° ����
		int i = start + 1; // i�� ���� �������
		int j  = end;	// j�� ������ �������
		int temp;
		
		while(i <= j) { // ������ ������ �ݺ�
			while(i <= end && a[i] <= a[key]) { // Ű ������ ū ���� ���� ������ ���������� �̵�
				i++;
			}
			
			while(a[j] >= a[key] && j > start) { // Ű ������ ���� ���� ���� ������ �������� �̵�
				j--;
			}
			
			if(i > j) { // ���� ������ ���¸� Ű ���� ��ü
				temp = a[j];
				a[j] = a[key];
				a[key] = temp;
			}
			
			else {
				temp = a[j];
				a[j] = a[i];
				a[i] = temp;
			}
		}
		
		quickSort(a , start , j -1);
		quickSort(a , j + 1 , end);
		
		
	}
	
	
  }
	   
	*/

	
		/*
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("�迭�� ���� �Է� : ");
	
	int N = sc.nextInt();
	
	int a[] = new int[N];
	
	
	System.out.println("�迭�� ���� �� �Է� : ");
	for(int i = 0 ; i < a.length; i ++ ) {
		a[i] = sc.nextInt();
	}
		
	 MergeSort(a , 0 , 1);
	
	 
	System.out.print("a[] : ");
	for(int i = 0; i < a.length; i++) {
		System.out.print(a[i] + " ");
	}
}
	
	
	
	public static void MergeSort(int a[] , int start , int end ) {
		int i = start;
		int j = end;
		int temp;

		
		while(i < a.length && j < a.length ) {
			if(a[i] < a[j]) {
				i += 2;
				j += 2;
			}
			else {
				temp = a[j];
				a[j] = a[i];
				a[i] = temp;
		
				i += 2;
				j += 2;
			}
		}
		int count = 0;
		int s = 0;
		i = start = 0;
		j = end = 2; // 2
		int k[] = new int[a.length];
		
			while(i < a.length && j < a.length) {
				if(a[i] > a[j]) {
					
					k[s] = a[j];
					j++;
					s++;
					if(count == 1) {
						i ++;
						count = 0;
					}
					count++;
					
						
					if(i == 2) {
						i = 4;
						j = 6;
					}
				}
				else {
					k[s] = a[i];
					j++;
					s++;
					
					if(count == 1) {
						i ++;
						count = 0;
					}
					count++;
					if(i == 2) {
						i = 4;
						j = 6;
					}
				}
			}
		
		a[a.length] = k[a.length];
		
		
		
	}
}
		*/
		
		

		
	}
	

}

		
		
		
		
		
	




