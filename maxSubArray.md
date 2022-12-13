# Maximum Subarray

Given an integer array nums, find the subarray which has the largest sum and return its sum.

### Example:

***Input:*** nums = [-2,1,-3,4,-1,2,1,-5,4]

***Output:*** 6

***Explanation:*** [4,-1,2,1] has the largest sum = 6

	public maxSubArray(int[] nums){
		int curSum = 0;
		int maxSum = nums[0];

		for (int i = 0; i < nums.length; i++){
			curSum += nums[i];

			if (curSum > maxSum){
				maxSum = curSum;
			}
			if (curSum < 0){
				curSum = 0;
			}
		}
		return maxSum;
	}

Time Complexity: O(n) Space Complexity: O(1)


