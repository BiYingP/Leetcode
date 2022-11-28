# Search Insert Position #

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it weree inserted in order.

### Example 1: ###

***Input:*** nums = [1,3,5,6], target = 5

***Output:*** 2

***Input:*** nums = [1,3,5,6], target = 2

***Output:*** 1

### Linear Search Approach ###

	public int searchInsert(int[] nums, int target){
		
		for (int i = 0; i < nums.length; i++){
			if (nums[i] >= target){
				return i;
			}
		}
		return nums.length;
	}

Time Complexity: O(n) Space Complexity: O(1)

### Binary Search Approach ###

	public int searchInsert(int[] nums, int target){
	
		int left = 0;
		int right = nums.length - 1;

		while (left <= right){
			int pivot = left + (right - left) / 2;
			
			if (nums[pivot] == target){
				return pivot;
			}
			else if (nums[pivot] > target){
				right = pivot -1;
			}
			else {
				left = pivot + 1;
			}
		}
		return left;
	}

Time Comlexity: O(log n) Space Complexity: O(1)

