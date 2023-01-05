# Combination Sum

Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates, where the chosen numbers sum to target. 

The same number may be chosen from candidates an unlimited number of times.

### Example:

Input: candidates = [2,3,6,7], target = 7

Output: [[2,2,3], [7]]

		    [2]			 []
	        /         \	 	/  \
	      [2,2]        [2]        [3]  []
	      /    \      /  \             / \
	   [2,2,2] [2,2][2,3][2]         [6] []
		   /   \                     / \
		[2,2,3][2,2]                [7][]


### Backtracking Approach

	public List<List<Integer>> combinationSum(int[] candidates, int target){
		List<List<Integer>> res = new ArrayList();
		List<Integer> list = new ArrayList();
		backtrack(0, candidates, target, 0, list, res);
		return res;
	}

	public void backtrack(int i, int[] candidates, int target, int sum, List<Integer> list, List<List<Integer>> res){
		if (sum == target){
			res.add(new ArrayList(list));
		}

		while (i < candidates.length){
			if (sum > target) return;
			list.add(candidates[i]);
			backtrack(i, candidates, target, sum + candidates[i], list, res);
			i++;
		}
	}
		        

