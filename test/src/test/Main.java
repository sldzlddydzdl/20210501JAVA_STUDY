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
	      
		// 계산기만들기  [ Scanner , printfln , if ]
					//[ 조건 ] : 두개의 수를 입력받아 입력받은 기호로 계산 
					//[ 예 ] : 
							// [입력] 2 + 3
							// [출력] 2 + 3  결과 : 5
							
							// [입력] 3 * 2
							// [출력] 3 * 2  결과 : 6
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두수와 연산을 입력 하세요 : ");
		
		boolean key = true;
		while(key) {
			
			int num1 = sc.nextInt();
			char cal = sc.next().charAt(0);
			int num2 = sc.nextInt();
			
			if(cal == '+') {
				System.out.println("두수의 덧셈은 : " + (num1 + num2) + " 입니다.");
			}
			else if(cal =='-') {
				System.out.println("두수의 뺄셈은 : " + (num1 - num2) + " 입니다.");
			}
			else if(cal == '/') {
				System.out.println("두수의 나눗셈은 : " + (num1 / num2) + " 입니다.");
			}
			else if(cal == '*') {
				System.out.println("두수의 곱은 : " + (num1 * num2) + " 입니다.");
			}
			else if(cal == '%') {
				System.out.println("두수의 나머지는 : " + (num1 % num2) + " 입니다.");
			}
			else if(cal =='Q') {
				System.out.println("종료되었습니다. ");
				key = false;
			}
			else {
				System.out.println("잘못 입력 하셨습니다.");
			}
			
		}
		*/
		
		

		/* 회원가입 / 로그인 만들기 
		 *  회원가입
				ID , PW 입력받아 변수에 저장 
			로그인 [ 무한루프 ] 
				ID , PW 가 동일한 경우 무한루프 종료
				ID , PW 가 동일하지 않으면 무한루프
		*/
		
		
		/*
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("------- 회원가입 창 ---------");
		System.out.print("가입할 아이디를 입력하세요 : ");
		String id = sc.next();
			
		System.out.print("가입할 비밀번호를 입력하세요 : ");
		String pw = sc.next();
		
		System.out.print("회원가입이 완료되었습니다 .");
		
		boolean key = true;
		while(key) {
		System.out.println("------- 로그인 창 ---------");
		System.out.print("로그인할 아이디를 입력하세요 : ");
		String id2 = sc.next();
		
		System.out.print("로그인할 비밀번호를 입력하세요 : ");
		String pw2 = sc.next();
		
		if(id.equals(id2)) {
			if(pw.equals(pw2)) {
				System.out.println("로그인되었습니다.");
				key = false;
			}
			else {
				System.out.println("비밀번호가 틀렸습니다. ");
			}
		}
		else {
			System.out.println("아이디가 틀렸습니다. ");
		}
		
		
		}
		
		
		*/
		/*
		 * 키오스크 만들기 
			* 메뉴 무한루프 번호 계속 입력받아 
			* 입력받은 번호의 금액을 누적으로 변수에 더하기
			* 종료 입력시 총 계산 :  누적금액 출력 
				[ 메뉴 ] 
				1. 아메리카노 [ 200 ]
				2. 에이드 [ 300 ] 
				3. 아이스크림 [ 400 ]
				4. 과자 [ 500 ]
				5. 종료
		 * 
		 * 
		 */
		
		/*
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		boolean key = true;
		while(key) {
			System.out.println("------- 메뉴 --------");
			System.out.println("1. 아메리카노 [200] ");
			System.out.println("2. 에이드 [300]");
			System.out.println("3. 아이스크림 [400]");
			System.out.println("4. 과자[500]");
			System.out.println("5. 종료");
			System.out.print("메뉴를 선택해주세요 : ");
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
				System.out.println("총 합은 : " + sum + " 입니다.");
				System.out.println("종료합니다.");
				key = false;
			}
		}
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int[] ar = new int[N]; // 입력받을떄 새로운공간할당
		
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
		Scanner sc = new Scanner(System.in); // 입력공간 할당
		
		int N = sc.nextInt(); // 정수 N 입력
		int K = N;
		int temp = 111; // temp 초기화
		int count = 0; // count 초기화

		while(N != temp) { // 만약 N 과 temp가 같지않으면 while 안에 문장을 실행해라
			
			int A = K/10; 		// A = 10의자리수
		//	System.out.println("A : " + A);
			int B = K - A*10;	// B = 1의자리수
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
				K = (B*10)+ (A+B);  // 결과
			}
		//	System.out.println("K : " +K);
			temp = K; 			// 비교할 N 값 대신 대입
			count++;
		}
		System.out.println(count);
		// 5 + 5 = 10 , 50  5 + 0 = 5 , 5 
		*/
		
		/* 10818번 최소, 최대
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
	
		/* 문제 2562
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
		
		
		/* 문제 2577 못품,,,,,
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
			
		
		/* 문제 3052
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
		
		/* 문제 1546
		// 최댓값을 M이라하고 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double sum = 0;
		double n = 0;
		int ar[] = new int[N];
		
		for(int i =0; i < N; i++) {
			ar[i] = sc.nextInt();
		}
		
		int max = 0;
		// 최댓값찾기
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
		
		/* 문제 8958 못품,,,
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
		
	/*  문제 4344
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
		
	
		
	/* 선택정렬 오름차순
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
		
		
		
	/* 버블정렬 내림차순
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
	
	// 삽입정렬 오름차순
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
		
	/* 퀵정렬
	Scanner sc = new Scanner(System.in);
	
	System.out.println("배열의 갯수 입력 : ");
	int N = sc.nextInt();
	
	int a[] = new int[N];
	
	System.out.println("원소들의 값 입력 : ");
	for(int i = 0 ; i < a.length;  i++) {
		a[i] = sc.nextInt();
	}	
		
	System.out.println(" 완료");
	
	quickSort(a, 0 , N-1);
	
	for(int i = 0; i < a.length; i++) {
		System.out.print(a[i] + " ");
	}
	
}
	
	public static void quickSort(int a[], int start, int end) {
		if(start >= end) { // 원소가 1개인 경우
			return;
		}
		
		int key = start; // 키는 첫번째 원소
		int i = start + 1; // i는 왼쪽 출발지점
		int j  = end;	// j는 오른쪽 출발지점
		int temp;
		
		while(i <= j) { // 엇갈릴 때까지 반복
			while(i <= end && a[i] <= a[key]) { // 키 값보다 큰 값을 만날 때까지 오른쪽으로 이동
				i++;
			}
			
			while(a[j] >= a[key] && j > start) { // 키 값보다 작은 값을 만날 때까지 왼쪽으로 이동
				j--;
			}
			
			if(i > j) { // 현재 엇갈린 상태면 키 값과 교체
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
	
	
	System.out.println("배열의 갯수 입력 : ");
	
	int N = sc.nextInt();
	
	int a[] = new int[N];
	
	
	System.out.println("배열의 원소 값 입력 : ");
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

		
		
		
		
		
	




