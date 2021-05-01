package prac;

import java.util.ArrayList;

public class asd {

	public static void main(String[] args) {
		int board[][] = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int moves[]	 = {1,5,3,5,1,2,1,4};
		
		int[][] newboard = new int[board.length][board.length];
        
        for(int i = 0 ; i < board.length ; i++){
            for(int j= 0 ; j < board[i].length; j++){
                newboard[i][j] = board[j][i];
            }
        }
        
        for(int i = 0 ; i < board.length; i++) {
        	for(int j = 0 ; j < board[i].length; j++) {
        		System.out.print(newboard[i][j] + " ");
        	}
        	System.out.println();
        }
        
        
		
		int answer = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0 ; i  < moves.length; i++){
            for(int j = 0; j < newboard[moves[i]-1].length; j++){
                if(newboard[moves[i]-1][j] != 0)  {
                    list.add(newboard[moves[i]-1][j]);
                    newboard[moves[i]-1][j] = 0;
                    System.out.println("dhdld");
                    for(int k = 1 ; k < list.size(); k++){
                        if(list.get(k).equals(list.get(k-1))){
                            list.remove(k);
                            list.remove(k-1);
                            answer += 2;
                        }
                    }
                    break;
                    
                }
                
               
             
            } 
            
        }
        
        for(int i = 0; i < list.size(); i++) {
        	System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println();
        
        System.out.println(answer);
	}

}
