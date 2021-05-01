package infrun;

import java.util.Stack;

public class MaximumDepthOfBinaryTreeDFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.left.left.left = new TreeNode(6);
		
		System.out.println(dfs(root));
		
	}

	
	
	public static int dfs(TreeNode root) {
		 if(root == null) return 0;
		 
		 Stack<TreeNode> stack = new Stack<>();
		 Stack<Integer> valueStack = new Stack<>();
		 stack.push(root);
		 valueStack.push(1);
		 System.out.println("Ã³À½  : " + valueStack.peek());
		 int max = 0;
		 
		 while(!stack.isEmpty()) {
			 TreeNode node = stack.pop();
			 int count = valueStack.pop();
			 max = Math.max(max, count);
			 if(node.left != null) {
				 stack.push(node.left);
				 valueStack.push(1+count);
				 System.out.println("left : " + valueStack.peek());
			 }
			 if(node.right != null) {
				 stack.push(node.right);
				 valueStack.push(1+count);
				 System.out.println("right : " + valueStack.peek());
			 }
		 }
		 return max;
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
