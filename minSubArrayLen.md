# Minimum Size Subarray Sum

Given the array of positive integers nums and a positive integer target, return the **minimal length** of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

## Example:

Input: target = 7, nums = [2,3,1,2,4,3]

Output: 2

Explanation: The subarray [4,3] has minimal length under the problem constraint.


	public int minSubArrayLen(int target, int[] nums){
		int min = Integer.MAX_VALUE;
		int left = 0;
		int right = 0;
		int sum = 0;

		while(right < nums.length){
			sum += nums[right];
			while(sum >= target){
				min = Math.min(min, right + 1 - left);
				sum -= nums[left];
				left++;
			}
			right++;
		}
		if(min == Integer.MAX_VALUE) return 0;
		return min;
	}


Time Complexity: O(n)
Space Complexity: O(1)
