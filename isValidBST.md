Validate Binary Search Tree

Given the root of a binary tree, determine if it is a valid binary search tree(BST)

A valid BST is defined as follows:

	- The left subtree of a node contains only nodes with keys less than the node's key.

	- The right subtree of a node contians only nodes with keys greater than the node's key.

	- Both the left and right subtrees must also be binary search trees.



Example:

		2
	       / \
	      1   3


Input: root = [2,1,3]

Output: true


Example:

		5
	       / \
	      1   4
	         / \
		3   6


Input: root = [5,1,4,null,null,3,6]

Output: false

Explanation: The root node's value is 5 but its right child's value is 4


Definition for a binary tree node.

// public class TreeNode{

//	int val;

//	TreeNode left;

//	TreeNode right;

//	TreeNode(){}

//	TreeNode(int val) { this.val = val;}

//	TreeNode(int val, TreeNode left, TreeNode right){

//		this.val = val;

//		this.left = left;

//		this.right = right;

//	}

// }



    public boolean isValidBST(TreeNode root) {
        
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
        
    } 
    
    boolean helper(TreeNode root, long min, long max){
        if (root == null) return true;
        if(root.val <= min || root.val >= max){
            return false;
        }
        return helper(root.left, min, root.val) 
            && helper(root.right, root.val, max);
    }
