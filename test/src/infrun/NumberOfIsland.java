package infrun;

public class NumberOfIsland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] grid = {
			{'1', '1', '1', '0' ,'1'},
			{'1', '1', '0', '0' ,'0'},
			{'1', '1', '0', '0' ,'1'},
			{'0', '0', '0', '0' ,'1'},
			};
		
		System.out.println(solve(grid));
		
	}
	
	public static int solve(char[][] grid) {
		print(grid);
		
		//1 error managing
		if(grid == null || grid.length == 0 || grid[0].length ==0) return 0;
		
		//2 00위치가 1인 것부터 찾는다
		int count = 0;
		for(int i= 0; i < grid.length; i++) {
			for(int j =0; j < grid[i].length; j++) {
				if(grid[i][j] == '1') {
					count++;
					dfs(grid, i , j);
				}
			}
		}
		System.out.println("====after====");
		print(grid);
		return count;
	}
	
	public static void dfs(char[][] grid , int i , int j) {
		int m = grid.length;
		int n = grid[0].length;
		if(i < 0 || i >= m || j <0 || j >=n || grid[i][j] != '1' ) return;
		grid[i][j] = 'X';
		
		dfs(grid, i-1, j);
		dfs(grid, i+1, j);
		dfs(grid, i ,j-1);
		dfs(grid, i ,j+1);
	}
	
	public static void print(char[][] grid) {
		for(int i = 0 ; i < grid.length; i++) {
			for(int j = 0 ; j < grid[i].length; j++) {
				System.out.print(" grid["+i+"]["+j+"] " + grid[i][j]);
			}
			System.out.println();
		}
	}
	


}
