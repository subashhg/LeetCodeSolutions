/**
 * 
 */
package jyosh.udacity.solutions;

/**
 * @author Subash
 *
 */
public class BinaryTreeImpl {
	
	BinaryTreeNode root = null;
	
	public BinaryTreeImpl(BinaryTreeNode node) {
		root = node;
	}
	
	/**
	 * 
	 * @param key
	 * @return
	 */
	public boolean search(int key){
		if(root == null)
    		return false;
    	else if(root.val==key)
    		return true;
    	else{
    		return (preorderSearch(root.left, key) || preorderSearch(root.right, key));
    	}
	}
        
	/**
	 * 
	 * @param root
	 */
    public void printTree(BinaryTreeNode root){
    	if(root == null)
    		return;
    	else{
    		System.out.println(root.val + " ");
    		printTree(root.left);
    		printTree(root.right);
    	}
    	
    }
    
    /**
     * 
     * @param currentNode
     * @param key
     * @return
     */
    
    public boolean preorderSearch(BinaryTreeNode currentNode, int key){
    	if(currentNode == null)
    		return false;
    	else if(currentNode.val==key)
    		return true;
    	else{
    		return (preorderSearch(currentNode.left, key) || preorderSearch(currentNode.right, key));
    	}
    	
    }

   
	public static void main(String[] args) {
		BinaryTreeImpl binaryTree = new BinaryTreeImpl(new BinaryTreeNode(1));
		binaryTree.root.left = new BinaryTreeNode(2);
		binaryTree.root.right = new BinaryTreeNode(3);
		binaryTree.root.left.left = new  BinaryTreeNode(4);
		binaryTree.root.left.right = new  BinaryTreeNode(5);
		
		System.out.println("Search Result: " + binaryTree.search(4));
		System.out.println("Search Result: " + binaryTree.search(6));
		System.out.println("Search Result: " + binaryTree.search(5));

		binaryTree.printTree(binaryTree.root);
	}

	

}
