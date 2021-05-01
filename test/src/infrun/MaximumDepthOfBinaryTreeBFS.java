package infrun;

import java.util.LinkedList;
import java.util.Queue;

import infrun.MaximumDepthOfBinaryTreeDFS.TreeNode;

public class MaximumDepthOfBinaryTreeBFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(1);
		root.right = new TreeNode(4);
		root.left.left = new TreeNode(5);
		root.left.right = new TreeNode(6);
		root.left.left.left = new TreeNode(7);
		
		System.out.println(dfs(root));

	}
	
	public static int dfs(TreeNode root) {
		if(root == null) return 0;
		
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		int count = 0;
		while(!queue.isEmpty()) {
			int size = queue.size();
			for(int i =0 ; i < size; i++) {
				TreeNode node = queue.poll();
				if(node.left != null) {
					queue.offer(node.left);
				}
				if(node.right != null) {
					queue.offer(node.right);
				}
			}
			count++;
		}
		return count;
		
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
