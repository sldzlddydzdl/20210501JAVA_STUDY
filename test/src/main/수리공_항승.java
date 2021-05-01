package main;

import java.util.*;

public class ¼ö¸®°ø_Ç×½Â {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);

			int N = sc.nextInt();
			int L = sc.nextInt();
		
			int[] position = new int[N];
			
			for(int i  = 0 ; i < N ; i++) {
				position[i] = sc.nextInt();
			}
			
			int count = 0;
			
//			5 2
//			2 3 4 5 6
			
			
			count++;
			
			Arrays.sort(position);
		

			int tapeRange = (int)(position[0] - 0.5 + L);
			// tapeRange = 3.5
			
			for(int i = 1; i < position.length; i++) {
				if(tapeRange < (int)(position[i] + 0.5)) {
					tapeRange =(int)(position[i] - 0.5 + L );
					count++;
				}
			}
			
			System.out.println(count);
		}

}

