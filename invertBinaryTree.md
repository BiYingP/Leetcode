# Invert Binary Tree

Given the root of a binary tree, invert the tree, and return its root.

Example 1:


Input: root = [4,2,7,1,3,6,9]
Output: [4,7,2,9,6,3,1]


    public TreeNode invertTree(TreeNode root) {
        // if(root != null){
        //     TreeNode right = invertTree(root.right);
        //     TreeNode left = invertTree(root.left);
        //     root.left = right;
        //     root.right = left;
        // }
        // return root;
        
        if(root != null){
            TreeNode tmp = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(tmp);
        }
        return root;
    }
