package prac;

import java.util.ArrayList;
import java.util.Arrays;

public class pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int answer = 0;
		
		int board[][] = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int moves[]	 = {1,5,3,5,1,2,1,4};
		
		
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer[][]> boardlist = new ArrayList<Integer[][]>();
       
        Integer newmoves[] = Arrays.stream(moves).boxed().toArray(Integer[] :: new);
        
        System.out.println(board[0].length);
        
        for(int i = 0; i < board.length; i ++){
            for(int j = 0 ; j < board[i].length; j++){
                 boardlist.add(new Integer[][] {board[i][j]});
            }
        }
        
        for(int i = 0 ;  i< boardlist.size(); i++) {
        	
        		System.out.println(boardlist.size());
        		System.out.print(boardlist.get(i)[0]);
        		
        		System.out.println();
        	
        }
        
        
        
        
        for(int i = 0 ; i < moves.length; i++){
            if(boardlist.get(boardlist.get(moves[i]-1)[boardlist.get(moves[i]-1)[boardlist.get(moves[i]-1).length]]).equals(0)){
            	boardlist.remove(boardlist.get(moves[i]-1)[boardlist.get(moves[i]-1)[boardlist.get(moves[i]-1).length]]); 
            }
            else{
            	list.remove(boardlist.get(moves[i]-1)[boardlist.get(moves[i]-1)[boardlist.get(moves[i]-1).length]]); 
            	boardlist.remove(boardlist.get(moves[i]-1)[boardlist.get(moves[i]-1)[boardlist.get(moves[i]-1).length]]);     
            }
                for(int j = 1 ; j < list.size(); j ++){
                    if(list.get(i-1).equals(list.get(i))){
                        list.remove(i-1);
                        list.remove(i);
                        answer++;

                    }
                }
            
        }
        
        // return answer;
        
        System.out.println(answer);
        */
	}

}
