# Combinations

Given two integers n and k, return all possible combinations of k numbers chosen from the range [1,n].

You may return the answer in any order.

### Example:

Input: n = 4, k = 2

Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]

Explanation: There are 4 choose 2 = 6 total combinations

Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same combination.

		 1	2	3	4
		/|\    / \     /      
	       2 3 4  3   4   4       

### Backtracking Approach

	public List<List<Integer>> combine(int n, int k){
		List<List<Integer>> res = new ArrayList();
		List<Integer> subset = new ArrayList();
		backtracking(1, n, k, subset, res);
		return res;
	}

	public void backtracking(int i, int n, int k, List<Integer> subset, List<List<Integer>> res){
		if (subset.size() == k){
			res.add(new ArrayList(subset);
		}
		while (i <= n){
			subset.add(i);
			backtrack(i+1, n, k, subset, res);
			subset.remove(subset.size()-1);
			i++
		}
	}
