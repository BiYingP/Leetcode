# Move Zeroes

Given an integer array nums, move all 0's to the end of it, while it maintaining the relative order of the non-zero elements.

### Example 1: ###

***Input:*** nums = [0,1,0,3,12]

***Output:*** [1,3,12,0,0]

### Using Two Pointers ###

	public void moveZeros(int[] nums){
		int l = 0; // left pointer
		int r = 0; // right pointer

		// loop through array using right pointer
		while (r < nums.length){
			// check if num is not 0
			if (nums[r] != 0){
				// swap two nums 
				int temp = nums[l];
				nums[l] = nums[r];
				nums[r] = temp;
				l++;
			}
			r++;
		}
	}

Time Complexity: O(n) Space Complexity: O(1)


