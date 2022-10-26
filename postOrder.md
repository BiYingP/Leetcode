N-ary Tree Postorder Traversal

Given the root of an n-ary tree, return the postorder traversal of its nodes' values.

Example:

		1
	      / | \
	     3  2  4
	    / \
	   5   6


Input: root = [1,null,3,2,4,null,5,6]

Output: [5,6,3,2,4,1]


// Definition for a Node.

// Class Node {

//      public int val;

//      public List<Node> children;

//      public Node(){}

//      pulbic Node(int _val){val = _val;}

//      public Node(int _val, List<Node> _children){val = _val; children= _children;}

// }



    List<Integer> res = new ArrayList();
    public List<Integer> postorder(Node root) {
        if (root != null){
            for (int i = 0; i < root.children.size(); i++){
                postorder(root.children.get(i));
            }
            res.add(root.val);
        }
        
        return res;
    }
