# N-ary Tree Preorder Traversal

Given the root of an n-ary tree, return the preorder traversal of its node's value.

N-ary Tree input seriliazaton is represented in their level order traversal. Each group of children is separated by the null value.


Example

			1
		      / | \
		     3  2  4
		    / \
		   5   6


Input: root = [1,null,3,2,4,null,5,6]

Output: [1,3,5,6,2,4]


// Definition for a Node.

// Class Node {

// 	public int val;

//	public List<Node> children;

//	public Node(){}

//	pulbic Node(int _val){val = _val;}

//	public Node(int _val, List<Node> _children){val = _val; children= _children;}

// }


    List<Integer> res = new ArrayList();
    public List<Integer> preorder(Node root) {
       
        if (root != null){
            res.add(root.val);
            for (int i = 0; i < root.children.size(); i++){
                preorder(root.children.get(i));
            }
        }
        return res;
    }
