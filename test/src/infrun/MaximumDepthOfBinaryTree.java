package infrun;

import java.util.*;

public class MaximumDepthOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode tree = new TreeNode(3);
		tree.left = new TreeNode(1);
		tree.right = new TreeNode(4);
		tree.left.left = new TreeNode(5);
		tree.left.right = new TreeNode(8);
		tree.left.left.left =  new TreeNode(7);
		
		System.out.println(solve(tree));
		
	}
	
	public static int solve(TreeNode root) {
	
		/*
		List<List<Integer>> result = new ArrayList<>();
	    
	    if(root == null)
	        return 0;
	    
	    Queue<TreeNode> queue = new LinkedList<>();
	    queue.offer(root);
	    
	    while(!queue.isEmpty()){
	        int size = queue.size();
	        List<Integer> list = new LinkedList<>();
	        for(int i = 0 ; i < size; i++){
	            TreeNode node = queue.poll();
	            list.add(node.val);
	            if(node.left != null){
	                queue.offer(node.left);
	            }
	            if(node.right != null){
	                queue.offer(node.right);
	            }
	        }
	        
	        result.add(list);
	    }
	    
	    return result.size();
	    */
		
		if(root == null) return 0;
		System.out.println(root.val);
		int leftMax = solve(root.left);
		System.out.println("leftMax : " + leftMax);
		int rigtMax = solve(root.right);
		System.out.println("rightMax : " + rigtMax);
		return Math.max(leftMax, rigtMax)+1;
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
}
