package java1_7;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	
	static int N = sc.nextInt();
	
	static int sorted[] = new int[N];
	
	public static void main(String[] args) {
			
		int K = sc.nextInt();
		
		int a[] = new int[K];
		
		for(int i = 0 ; i < sorted.length; i ++) {
			a[i] = sc.nextInt();
		}
		
		mergesort(a, 0 , N-1);
		
		for(int i = 0 ; i < sorted.length; i ++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public static void merge(int a[] , int m , int middle , int n ) {
		
		int i  = m; // 시작 
		int j = middle+1;  // 시작 배열의끝 과 나중배열의 처음
		int k = m;  // 마지막 
		
		while(i <= middle && j <= n) { // 
			if(a[i] <= a[j]) {
				sorted[k] = a[i];
				i++;
			}
			else {
				sorted[k] = a[j];
				j++;
			}
			k++;
		}
		
		if(i > middle) {
			for(int  t = j; t <= n; t ++) {
				sorted[k] = a[t];
				k++;
			}
		}
		else {
			for(int t = i; t <= middle; t ++) {
				sorted[k] = a[t];
				k++;
			}
		}
		
		for(int t = m ; t <= n; t ++) {
			a[t] = sorted[t];
		}
		
		
	}
	
	public static void mergesort(int a[], int m , int n) {
		// 크기가 1보다 큰 경우
		if(m < n) {
			int middle = (m + n) / 2;
			mergesort(a , m , middle);
			mergesort(a , middle+1 , n);
			merge(a , m , middle , n);
		}
		
		
	}

}
