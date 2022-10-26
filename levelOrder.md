Binary Tree Level Order Traversal

Given the root of a binary tree, return the level order traversal of its nodes'values(i,e, from left to right, level by level).


Example

		3
	       / \
	      9   20
	         /  \
		15   7



Input: root = [3,9,20,null,null,15,7]

Output: [[3],[9,20],[15,7]]



Definition for a binary tree node.

// public class TreeNode{

// 	int val;

//	TreeNode left;

// 	TreeNode right;

// 	TreeNode(){}

// 	TreeNode(int val) { this.val = val}

// 	TreeNode(int val, TreeNode left, TreeNode right){

// 		this.val = val;

// 		this left = left;

// 		this.right = right;



    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> res = new LinkedList();
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        if (root == null) {
            return res;
        }
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new LinkedList<>();
            
            for(int i = 0; i < size; i++){
                TreeNode node = q.poll();
                
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
                level.add(node.val);
            }
            res.add(level);
        }
        return res;
    }
