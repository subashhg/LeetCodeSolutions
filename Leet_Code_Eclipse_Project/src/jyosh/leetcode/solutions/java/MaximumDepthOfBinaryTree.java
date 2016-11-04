/**
 * 
 */
package jyosh.leetcode.solutions.java;

/**
 * @author Subash
 * 
 * Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf 
node.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 *
 *
 */
public class MaximumDepthOfBinaryTree {

	int maxDepth(TreeNode root) {
        if (root == null) return 0;
        	return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

	 class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }