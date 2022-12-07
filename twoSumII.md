# Two Sum II #

Given a 1-indexed array of integers nums that is already sorted in non-decreasing order, find two nums such that they add up to the target number.

Return the indices of the two nums.

### Example 1 ###

***Input:*** nums = [2,7,11,15], target = 9

***Output:*** [1,2]

***Explanation:*** The sum of 2 and 7 is 9. Therefore, we return [1, 2]


### Two Pointer Approach ###

	public int[] twoSum(int[] nums, int target){
		int l = 0; // left pointer
		int r = nums.length-1; // right pointer

		while (nums[l] + nums[r] != target){
			if (nums[l] + nums[r] > target){
				r--;
			}else{
				l++;
			}
		}
		return new int[] {l+1, r+1}
	}

Time Complexity: O(n) Space Complexity: O(1)


