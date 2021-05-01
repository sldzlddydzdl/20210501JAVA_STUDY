package infrun;

import java.util.*;

public class SpiralMatrix {

	public static void main(String[] args) {
		
		
		int[][] matrix = { { 1, 2, 3,4 }, { 5, 6, 7,8 }, { 9,10,11,12 },{13,14,15,16} };
		System.out.println(solve(matrix));
		
	}
	
	public static List<Integer> solve(int[][] matrix) {
		
		List<Integer> result = new ArrayList<>();
		if(matrix==null || matrix.length == 0)
			return result;
		
		int rowStart = 0; // ����
		int rowEnd  = matrix.length - 1;
		int colStart = 0;
		int colEnd = matrix[0].length -1; //����
		
		while(rowStart <= rowEnd && colStart <= colEnd) {
			
			System.out.println("****** right  �� *******");
			System.out.println("rowStart : " + rowStart);
			System.out.println("rowEnd : " + rowEnd);
			System.out.println("colStart : " + colStart);
			System.out.println("colEnd : " + colEnd);
			for(int i = colStart; i <= colEnd; i++) {
				result.add(matrix[rowStart][i]);
			}
			rowStart++;
			System.out.println("****** right  �� *******");
			System.out.println("rowStart : " + rowStart);
			System.out.println("rowEnd : " + rowEnd);
			System.out.println("colStart : " + colStart);
			System.out.println("colEnd : " + colEnd);
			
			System.out.println("****** down �� *******");
			System.out.println("rowStart : " + rowStart);
			System.out.println("rowEnd : " + rowEnd);
			System.out.println("colStart : " + colStart);
			System.out.println("colEnd : " + colEnd);
			
			for(int i = rowStart; i <= rowEnd; i++) {
				result.add(matrix[i][colEnd]);
			}
			colEnd--;
			System.out.println("****** down �� *******");
			System.out.println("rowStart : " + rowStart);
			System.out.println("rowEnd : " + rowEnd);
			System.out.println("colStart : " + colStart);
			System.out.println("colEnd : " + colEnd);
			

			System.out.println("****** left ��*******");
			System.out.println("rowStart : " + rowStart);
			System.out.println("rowEnd : " + rowEnd);
			System.out.println("colStart : " + colStart);
			System.out.println("colEnd : " + colEnd);
			if(rowStart <= rowEnd)
			for(int i = colEnd; i >= colStart; i--) {
				result.add(matrix[rowEnd][i]);
			}
			rowEnd--;
			System.out.println("****** left ��*******");
			System.out.println("rowStart : " + rowStart);
			System.out.println("rowEnd : " + rowEnd);
			System.out.println("colStart : " + colStart);
			System.out.println("colEnd : " + colEnd);
			
			System.out.println("****** up ��*******");
			System.out.println("rowStart : " + rowStart);
			System.out.println("rowEnd : " + rowEnd);
			System.out.println("colStart : " + colStart);
			System.out.println("colEnd : " + colEnd);
			if(colStart <= colEnd)
			for(int i = rowEnd; i >= rowStart; i--) {
				result.add(matrix[i][colStart]);
			}
			colStart++;
			System.out.println("****** up ��*******");
			System.out.println("rowStart : " + rowStart);
			System.out.println("rowEnd : " + rowEnd);
			System.out.println("colStart : " + colStart);
			System.out.println("colEnd : " + colEnd);
			
			
//	 		1  2  3  4
//	 		5  6  7  8 
//	 		9  10 11 12
//	 		13 14 15 16
		}
		
		
		
		
		
		
		return result;
	 }
}
