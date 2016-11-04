/**
 * 
 */
package jyosh.leetcode.solutions.java;

/**
 * @author Subash
 * 
 * Given two binary trees, write a function to check if they are equal or not.

Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 *
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
		 
		 return isSame(p,q);
	   
   }
	
	private boolean isSame(TreeNode p, TreeNode q) {
		 if((p==null && q!=null) || (p!=null && q==null)){
			return false;
		}
		if(p==null && q==null)
		  return true;
	
		 
		 return (p.val==q.val) && isSame(p.left, q.left) && isSame(p.right, q.right);
	}
}

	