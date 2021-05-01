package prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Arrays;

public class progra {

	public static void main(String[] args) {
	
		

		
		
		
		
	}
	
	   public static String[] solution(int n, int[] arr1, int[] arr2) {
	        String[] answer = new String[n];
	        
	        
	        String[] binaryString1 = new String[n];
	        String[] binaryString2 = new String[n];
	        
	        
	        for(int i = 0 ; i < arr1.length; i++){
	             binaryString1[i] = Integer.toBinaryString(arr1[i]);
	             while(binaryString1[i].length() != n){
	                 binaryString1[i] = "0" + binaryString1[i];
	             }
	        }
	        System.out.println("*********** binaryString1 ***********");
	        
	        for(int i= 0 ; i < binaryString1.length; i++) {
	        	System.out.println(binaryString1[i]);
	        }
	        
	        for(int i = 0 ; i < arr2.length; i++){
	            binaryString2[i] = Integer.toBinaryString(arr2[i]);
	            while(binaryString2[i].length() != n){
	                binaryString2[i] = "0" + binaryString2[i];
	            }
	        }
	        
	        System.out.println("*********** binaryString2 ***********");
	        
	        for(int i= 0 ; i < binaryString2.length; i++) {
	        	System.out.println(binaryString2[i]);
	        }
	        
	        for(int i = 0; i < answer.length; i++){
	            answer[i] = "";
	        }
	        
	        for(int i = 0 ; i < arr1.length; i++){
	            for(int j = 0 ; j < arr1.length; j++){
	                if(binaryString1[i].charAt(j) == '1' && binaryString2[i].charAt(j) == '0'){
	                    answer[i] += "#";
	                }

	                else if(binaryString1[i].charAt(j) == '1' && binaryString2[i].charAt(j) == '1'){
	                    answer[i] += "#";
	                }

	                else if(binaryString1[i].charAt(j) == '0' && binaryString2[i].charAt(j) == '1'){
	                    answer[i] += "#";
	                }
	                else { //(binaryString1[i].charAt(j) == '0' && binaryString2[i].charAt(j) == '0'){
	                    answer[i] += " ";
	                } 
	            }
	        }

	        
	        return answer;
	    }
		
}
