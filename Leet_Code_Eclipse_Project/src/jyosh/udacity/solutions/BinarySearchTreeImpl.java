/**
 * 
 */
package jyosh.udacity.solutions;

/**
 * @author Subash
 *
 */
public class BinarySearchTreeImpl {
	
	BinaryTreeNode root = null;
	
	public BinarySearchTreeImpl(BinaryTreeNode node) {
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
    	else if (root.val < key)
    		return preorderSearch(root.right, key);
		else
			return preorderSearch(root.left, key);
    	}
	
	/**
	 * 
	 * @param key
	 */
	public void insert (int key){
		
		BinaryTreeNode parent = getParent(root, key);
		BinaryTreeNode child = new BinaryTreeNode(key);
		if(key <parent.val )
			if(parent.left == null)
				parent.left = child;
			else{
				BinaryTreeNode temp = parent.left;
				parent.left = child;
				child.left = temp;
			}
				
		else
			if(parent.right == null)
				parent.right = child;
			else {
				BinaryTreeNode temp = parent.right;
				parent.right = child;
				child.right = temp;
			}
	}
        
	/**
	 * 
	 * @param root
	 * @param key
	 * @return
	 */
	private BinaryTreeNode getParent(BinaryTreeNode root, int key) {
		if(root == null)
			return null;
		if(key < root.val)
			if(key > root.left.val)
				return root;
			else
				return getParent(root.left, key);
		else
			if(key < root.right.val)
				return root;
			else
				return getParent(root.right, key);		
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
    	else if (currentNode.val < key)
    		return preorderSearch(currentNode.right, key);
		else
			return preorderSearch(currentNode.left, key);
    	
    }

   
	public static void main(String[] args) {
		BinarySearchTreeImpl bst = new BinarySearchTreeImpl(new BinaryTreeNode(50));
		bst.root.left = new BinaryTreeNode(25);
		bst.root.right = new BinaryTreeNode(75);
		bst.root.right.right= new  BinaryTreeNode(100);
		bst.root.right.left = new  BinaryTreeNode(65);
		
		System.out.println("Search Result: " + bst.search(25));
		System.out.println("Search Result: " + bst.search(61));
		System.out.println("Search Result: " + bst.search(75));

		bst.printTree(bst.root);
		bst.insert(85);
		bst.printTree(bst.root);
	}

	

}
