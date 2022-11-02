# Lowest Common Ancestor of a Binary Search Tree

Given a binary search tree(BST), find the lowest common ancestor(LCA) node of two bien nodes in the BST.

According to the definition of LCA on Wikipedia: "The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself)."


Example:


		 6
	       /   \
	      2     8
	     / \   / \
	    0   4 7   9
	       / \
	      3   5


Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8

Output: 6

Explanation: The LCA of nodes 2 and 8 is 6.


Definition of a binary tree node.

// public class TreeNode{

// 	int val;

// 	TreeNode left;

// 	TreeNode right;

// 	TreeNode(int val) { val = val; }

//}


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // TreeNode cur = root;
        // while(root != null){
        //     if(p.val < cur.val && q.val < cur.val){
        //         cur = cur.left;
        //     }
        //     else if(p.val > cur.val && q.val > cur.val){
        //         cur = cur.right;
        //     }
        //     else{
        //         return cur;
        //     }
        // }
        // return cur;
        while (root != null){
            if(p.val < root.val && q.val < root.val){
                return lowestCommonAncestor(root.left, p, q);
            }
            else if(p.val > root.val && q.val > root.val){
                return lowestCommonAncestor(root.right, p, q);
            }
            else {
                return root;
            }
        }
        return root;
    }
