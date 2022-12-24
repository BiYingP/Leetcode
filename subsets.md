# Subsets

Given an integer array nums of unique elements, return all possible subsets.

The solution set must not contain duplicate subsets. Return the solution in any order.

### Example:

Input: nums = [1,2,3]

Output: [[],[1],[2],[1,2],[3],[2,3],[1,2,3]]

### Decision Tree
			1            []  
		       /              \
	     	      [1]               []
	     	   /       \          /    \
	 	[1,2]       [1]      [2]    []
	       /     \     /   \     /  \   / \
	   [1,2,3] [1,2] [1,3] [1] [2,3][2][3] []


### Backtracking Approach


	public List<List<Integer>> subsets(int[] nums){
		List<List<Integer>> res = new ArrayList();
		List<Integer> subset = new ArrayList();
		dfs(0, nums, subset, res);
		return res;
	}

	public void dfs(int i, int[] nums, List<Integer> subset, List<List<Integer>> res){
		// add subset to the result list
		res.add(new ArrayList(subset));

		while (i < nums.length){
			// add possible number to the subset list
			subset.add(nums[i]);
			// make a recursive call
			dfs(i+1, nums, subset, res);
			// backtracking
			subset.remove(subset.size()-1);
			i++;
		}
	}


