import java.util.*;

public class rowcolumns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows = 6;
		int columns = 6;
		int[][] queries = {{2,2,5,4},{3,3,6,6}};
		
//		
		
		for(int s : solution(rows, columns, queries))
			System.out.println(s);
		
	}

	 public static int[] solution(int rows, int columns, int[][] queries) {
	        int[] answer = new int[queries.length];
	        
	        int[][] numbers = new int[rows][columns];
	        int count = 0;
	        for(int i = 0 ; i< numbers.length; i++){
	            for(int j = 0 ; j < numbers[i].length; j++){
	                count++;
	                numbers[i][j] = count; 
	            }
	        }
	        
	        for(int i = 0 ; i< numbers.length; i++){
	            for(int j = 0 ; j < numbers[i].length; j++){
	                System.out.print(numbers[i][j] + " ");
	                 
	            }
	            System.out.println();   
	        }
	        
	        System.out.println();
	        int start_row = 0;
	        int start_col = 0;
	        int end_row = 0;
	        int end_col = 0;
	        
	
	        List<Integer> list = new ArrayList<>();
	        int min = 10000;
	        for(int i = 0;  i< queries.length; i++) {
	        	
	        	start_row = queries[i][0] -1;
	        	start_col = queries[i][1] -1; // 1
	        	
	        	end_row = queries[i][2] -1;
	        	end_col = queries[i][3] -1;
	        	
	        	for(int j = start_col+1; j <= end_col; j++) {
	        		numbers[start_row][j]--;
	        		list.add(numbers[start_row][j]);
	        	}
	        	for(int j = start_row; j < end_row; j++) {
	        		numbers[j][start_col] += rows;
	        		list.add(numbers[j][start_col]);
	        	}
	        	for(int j = start_row+1 ; j <= end_row; j++ ) {
	        		numbers[j][end_col] -= rows;
	        		list.add(numbers[j][end_col]);
	        	}
	        	for(int j = start_col; j < end_col; j++) {
	        		numbers[end_row][j]++;
	        		list.add(numbers[end_row][j]);
	        	}
	        	for(int j = 0 ; j < list.size(); j++) {
		        	min = Math.min(list.get(j), min);
		        }
	        	answer[i] = min;
	        	min = 10000;
	        	list.clear();
	        }
	        
	        
	        
	        for(int i = 0 ; i< numbers.length; i++){
            for(int j = 0 ; j < numbers[i].length; j++){
                System.out.print(numbers[i][j] + " ");
                 
            }
            System.out.println();   
        }
	        
	        
	        
	        return answer;
	    }
}
