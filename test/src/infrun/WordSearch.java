package infrun;

public class WordSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = {{'A','B','C','E'},
						  {'S','F','C','S'},
						  {'A','D','E','E'}};
		String word = "ABCCES";
		
		System.out.println(exist(board, word));
		
	}

	/*
    public static boolean exist(char[][] board, String word) {
        boolean answer = false;
        int result = 0;
        
        for(int i = 0 ; i < board.length; i++){
            for(int j= 0 ; j < board[i].length; j++){
                
            	
                if(board[i][j] == word.charAt(0)){
                	
                       result = dfs(board ,  i , j , 0 , word);
                       System.out.println("main 에서의 result : " +  result);
                       result++;
                    if(result == word.length())
                        answer = true;
                }
            }
        }

        return answer;
    }
    
    
    static int[][] dir = {{-1,0} , {1, 0} , { 0 , -1} , { 0,1}};
    
    public static int dfs(char[][] board , int x , int y ,int result, String word){
    	
        if(x < 0 || x >= board.length || y < 0 || y >= board[0].length || board[x][y] != word.charAt(result) ){
            return result;
        }
	
 
        result++;
        System.out.println("dfs 의 result : " + result);
        
        	
            for(int[] dirs : dir){

                result = dfs(board, x+dirs[0] , y + dirs[1], result , word);
                if(board[x][y] == word.charAt(result)) {
                	result++;
                }
            }
        
        
        
        return result;
    }
    */
	public static boolean exist(char[][] grid, String word) {
		if(grid == null || grid.length == 0 || grid[0].length== 0) return false;
	
		boolean[][] visited = new boolean[grid.length][grid[0].length];
		for(int i= 0 ;i < grid.length; i++) {
			for(int j = 0; j < grid[0].length; j++) {
				if(dfs(grid,visited, i , j , 0 , word)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	static int[][] dirs = {{-1,0} , {1, 0} , { 0 , -1} , { 0,1}};
    
    
	private static boolean dfs(char[][] grid , boolean[][] visited, int x, int y, int start , String word) {
    	if(start == word.length()) return true;
    	if( x < 0 || x >= grid.length || y < 0 || y >= grid[0].length) return false;
    	if(visited[x][y]) return false;
    	if(grid[x][y] != word.charAt(start)) return false;
    	
    	visited[x][y] = true;
    	for(int[] dir : dirs) {
    		int dx = x+ dir[0];
    		int dy = y + dir[1];
    		if(dfs(grid, visited, dx, dy, start +1 ,word)) {
    			return true;
    		}
    	}
    	
    	visited[x][y] = false;
    	return false;
    	
    }
}
