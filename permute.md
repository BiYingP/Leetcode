# Permutation

Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

Example:

Input: nums = [1,2,3]

Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]

			1	 2	    3 
			/\   	 /\	   / \
		       2  3     1  3      1   2
		      /    \    /  \      /   \
		     3      2  3    1    2     1



### Backtracking Approach

	public List<List<Integer>> permutate(int[] nums){
		List<List<Integer>> res = new ArrayList();
		List<Integer> list = new ArrayList();
		backtrack(nums, list, res);
		return res;
	}

	pulbic void backtrack(int[] nums, List<Integer> list, List<List<Integer>> res){

		if (list.size() == nums.length){
			res.add(new ArrayList(list));
		}
		for (int i = 0; i < nums.length; i++){
			if (list.contains(nums[i]) continue;
			list.add(nums[i]);
			backtracking(nums, list, res);
			list.remove(list.size()-1);
		}
	}

