package infrun;

import java.util.*;

public class KClosest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<Integer>> list = new ArrayList<List<Integer>>();
		
	//	list.add(0, {1,3});
		
		
		
		
		
	//	kClosest(list,K);
		
	//	int[][] s = {{1, 3} , {-2,2}};
		int[][] s = {{3,3} , {5,-1} , {-2,4} };
		
		int K = 2;
		
		int result[][] = kClosest1( s , K);
		
		print(result);
		
	}

	public static int[][] kClosest(List<List<Integer>>list, int K){
		
		
		
		
		
		
		
		return null;
		
	}
	
	
	public static int[][] kClosest1(int[][] points, int K){
		
			/*
			int[][] result = new int[K][2];
			int[] temp = new int[list.length];
			
			System.out.println(list[0][0]);
			System.out.println(list[0][1]);
			System.out.println(list[1][0]);
			System.out.println(list[1][1]);
			System.out.println((int)Math.sqrt(list[0][0]));
			System.out.println((int)Math.sqrt(list[0][1]));
			System.out.println((int)Math.sqrt(list[1][0]));
			System.out.println((int)Math.sqrt(list[1][1]));
			System.out.println((int)Math.pow(list[0][0] , 2));
			System.out.println((int)Math.pow(list[0][1] , 2));
			System.out.println((int)Math.pow(list[1][0] , 2));
			System.out.println((int)Math.pow(list[1][1] , 2));
			
			for(int i = 0 ; i< list.length; i++) {
				
					
				temp[i] = (int)Math.pow(list[i][0] ,2) + (int)Math.pow(list[i][1] ,2) ;
					
				
			}
			
			for(int i : temp)
				System.out.println(i);
			
			Arrays.sort(temp);
			
			for(int i : temp)
				System.out.println(i);
			
			for(int i = 0 ; i < K; i++) {
				
				result[i][0] = 
				
			}
			
			*/
			
		//	Queue<int[]> queue = new PriorityQueue<>(points.length, Comp );
			
			// a에 대한 오름차순
		//	Queue<int[]> queue = new PriorityQueue<>((a ,b) -> (a[0]*a[0] + a[1]*a[1]) - (b[0]*b[0] + b[1]*b[1]) );
			
			// a에 대한 오름차순
//			Queue<int[]> queue = new PriorityQueue<>((a ,b) -> ((int)Math.pow(a[0], 2) + (int)Math.pow(a[1], 2)) - 
//															   ((int)Math.pow(b[0], 2) + (int)Math.pow(b[1], 2)));
			
			// a에 대한 내림차순
//			Queue<int[]> queue = new PriorityQueue<>((a ,b) -> ((int)Math.pow(b[0], 2) + (int)Math.pow(b[1], 2) -
//															   ((int)Math.pow(a[0], 2) + (int)Math.pow(a[1], 2))));

			// b에 대한 내림차순
			Queue<int[]> queue = new PriorityQueue<>((b , a) -> ((int)Math.pow(a[0], 2) + (int)Math.pow(a[1], 2)) - 
															   ((int)Math.pow(b[0], 2) + (int)Math.pow(b[1], 2)));

			// b에 대한 오름차순
//			Queue<int[]> queue = new PriorityQueue<>((b ,a) -> ((int)Math.pow(b[0], 2) + (int)Math.pow(b[1], 2) -
//															   ((int)Math.pow(a[0], 2) + (int)Math.pow(a[1], 2))));

			
			
			int[][] result = new int[K][2];
			int index = 0;
			
			for(int[] p : points) {
				queue.offer(p);
			}
			
			while(index < K) {
				result[index] = queue.poll();
				index++;
			}
			
			return result;
			
	
		
		}
	
	
	static Comparator<int[]> Comp = new Comparator<int[]>() {
		
		@Override
		public int compare(int[] a, int[] b) {
			// TODO Auto-generated method stub
			// a에대한 오름차순
			return (a[0]*a[0] + a[1]*a[1]) - (b[0]*b[0] + b[1]*b[1]);
			
			
		}
	};
	
	public static void  print(int[][] result) {
		int m = result.length;
		int n = result[0].length;
		for(int i =0 ; i< result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
