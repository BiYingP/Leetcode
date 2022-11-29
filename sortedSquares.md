# Squares of a Sorted Array #

Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

### Example 1: ###

***Input:*** nums = [-4,-1,0,3,10]

***Output:*** [0,1,9,16,100]]

***Explanation:*** After squaring, the array becomes [16,1,0,9,100]. After sorting, it becomes [0,1,9,16,100].


### Brute Force Approach ###

	public int[] sortedSquares(int[] nums){
		int[] res = new int[nums.length];

		for (int i = 0; i < nums.length; i++){
			res[i] = nums[i] * nums[i];
		}
		Arrays.sort(res);
		return res;
	}

### Tow Pointer Approach ###

	public int[] sortedSquares(int[] nums){
		// Two Pointes
		int left = 0;
		int right = nums.length-1;

		int[] res = new int[nums.length];
		for (int i = nums.length-1; i >= 0; i--){
			if (nums[left] * nums[left] > nums[right] * nums[right]){
				res[i] = nums[left] * nums[left];
				left++;
			}else{
				res[i] = nums[right] * nums[right];
				right--;
			}
		}
		return res;
	}

Time Complexity: O(n) Space Complexity: O(n)/O(1)
