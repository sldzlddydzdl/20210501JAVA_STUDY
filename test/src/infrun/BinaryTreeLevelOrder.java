package infrun;

import java.util.*;

public class BinaryTreeLevelOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(4);
		root.right = new TreeNode(5);
		root.left.left = new TreeNode(6);
		root.left.right = new TreeNode(7);
		
		System.out.println(solve(root));
	}
	
	public static List<List<Integer>> solve(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		if(root == null)
			return result;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		
		//2 
		while(!queue.isEmpty()) {
			int size = queue.size();
			System.out.println("size : " + size);
			List<Integer> list = new LinkedList<>();
			for(int i = 0 ; i < size; i++) {
				TreeNode node = queue.poll();
				list.add(node.val);
				System.out.println(list.get(list.size()-1));
				if(node.left != null) {
					queue.offer(node.left);
				}
				if(node.right != null) {
					queue.offer(node.right);
				}
			}
			result.add(list);
		}
				
		return result;
		
	}
	/*
	public static List<List<Integer>> solve(TreeNode root){
		List<List<Integer>> result = new ArrayList<>();
		if(root == null)
			return result;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		
		while(!queue.isEmpty()) {
			int size = queue.size();
			List<Integer> list = new LinkedList<>();
			for(int i = 0 ; i < size; i++) {
				TreeNode node = queue.poll();
				System.out.println(list.get(list.size()));
				list.add(node.val);
				if(node.left != null) {
					queue.offer(node.left);
				}
				if(node.right != null) {
					queue.offer(node.right);
				}
			}
			result.add(list);
		}
	}
	*/
	
	public static class TreeNode{
		int val;
		TreeNode left, right;
		TreeNode(int x){
			this.val = x;
		}
	}

}
