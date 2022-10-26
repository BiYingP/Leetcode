N-ary Tree Level Order Traversal

Given an n-ary tree, return the level order traversal of its nodes' values.


Example:

		1
	      / | \
	     3  2  4
	    / \
	   5   6


Input: root = [1,null,3,2,4,null,5,6]

Output: [[1],[3,2,4],[5,6]]


Definition for a Node.

// class Node{

// 	public int val;

// 	public List<Node> children;

// 	public Node(){}

// 	public Node(int _val){ val = _val;}

// 	public Node(int_val, List<Node> _children){

// 		val = _val;

// 		children = _children;

// 	}


    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new LinkedList();
        Queue<Node> q = new LinkedList();
        
        q.add(root);
        if(root == null){
            return res;
        }
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new LinkedList();
            for (int i = 0; i < size; i++){
                Node node = q.poll();

                if (node.children != null){
                    for (int j = 0; j < node.children.size(); j++){
                        q.add(node.children.get(j));
                    }
                }      
                level.add(node.val);
            }
            res.add(level);
        }  
        return res;
    }
