package prac;

import java.util.*;

import infrun.MaximumDepthOfBinaryTree.TreeNode;

public class Å¸°Ù³Ñ¹ö {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int V = sc.nextInt();
		
		int[][] nums = new int[M][2];
		
		for(int i = 0 ; i < nums.length; i++) {
			for(int j = 0 ; j < 2; j++) {
				nums[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0 ; i < nums.length; i++) {
			nums[i][0] = nums[i][1];
			
		}
		

	}
	
	public static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
	
	public static class TreeNode1 {
	      int val;
	      TreeNode1 num;
	      
	      TreeNode1() {}
	      TreeNode1(int val) { this.val = val; }
	      TreeNode1(int val, TreeNode1 num) {
	          this.val = val;
	          this.num = num;
	      }
	  }

}
