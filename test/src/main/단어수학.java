package main;

import java.util.*;

public class  단어수학 {

		public static void main(String[] args) {
		
			/*
			Scanner sc = new Scanner(System.in);
			
//			for(char ch = 'A' ; ch <= 'Z'; ch++) {
//				ch = 0;
//			}
//			
//			System.out.println('A');
			
			String k = "";
			int m = 10;
			k += Integer.toString(m);
			System.out.println(k);
			
			int N = sc.nextInt();
			String[] str = new String[N];
			for(int i = 0 ; i< N ; i++) {
				str[i] = sc.next();
			}
			String[] addnumber = new String[N];
			for(int i= 0 ; i < addnumber.length; i++) {
				addnumber[i] = "";
			}
			int max = 0;
			int count = 0;
			while(count < N) {
				for(int a = 0; a < str.length; a++) {
						max = Math.max(max, str[a].length());	
					
					int[] length = new int[str.length];
					for(int i= 0 ; i< str.length; i++) {
						length[i] = str[i].length(); 
					}
					
					for(int s : length)
						System.out.println("�迭�Ǳ��� : " + s);
					
					System.out.println(" max : " + max);
					int value = 9;
					for(int i = 0; i < str.length; i++) {
						
						if(max == length[i]) {
							for(int j = 0; j < str[i].length(); j++) {
								Stringindex temp = new Stringindex(str[i].charAt(j) , value);
																    // A ,			  // 9
								addnumber[i] += Integer.toString(temp.value);
								
								value--;
							}
							length[i] = 0;
						}
					}
					count++;
					max = 0;
				}
			}
			
			for(String s : addnumber)
				System.out.println("s : " + s);
			
			int[] number = new int[N];
			for(int i = 0 ; i < N; i++) {
				number[i] = Integer.parseInt(addnumber[i]);
			}
			
			int sum = 0;
			for(int i = 0 ; i < N; i++) {
				sum += number[i];
			}
			
			System.out.println(sum);
			*/
	        //testcase �� ���ڿ� �Է�
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        String [] arr = new String[n];
	        int [] alpha = new int[26];
	        for(int i=0; i<n; i++){
	            arr[i] = sc.next();
	        }


	        for(int i=0; i<n; i++){
	            int temp = (int)Math.pow(10,arr[i].length()-1);
	            for(int j=0; j<arr[i].length(); j++){
	                alpha[(int)arr[i].charAt(j)-65]+=temp;
	                temp /=10;
	            }
	        }

	        Arrays.sort(alpha);
	        int index = 9;
	        int sum =0;
	        for(int i=alpha.length-1; i>=0; i--){
	            if(alpha[i] == 0){
	                break;
	            }
	            sum+= alpha[i]*index;
	            index--;
	        }
	        System.out.println(sum);
		}
		
		public static class Stringindex{
			
			char ch;
			int value;
			
			public Stringindex(char ch, int value) {
				
				this.ch = ch;
				this.value = value;
				
			}
			
		}

}







//	A = 9, B = 4, C = 8, D = 6, E = 5, F = 3, G = 7
// 	783 +  98654
// 94 + 49
// 9 4 8 6 5 3 7 2 1 = 45

//			ACDEB
//			  GCF
//			98754
//			  683