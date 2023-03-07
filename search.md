# Search in Rotated Sorted Array

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

Example:

	Input: nums = [4,5,6,7,0,1,2], target = 0;
	Output: 4


### Intuitive Approach

	public int search(int[] nums, int target){
		for (int i = 0; i < nums.length; i++){
			if (nums[i] == target){
				return i;
			}
		}
		return -1;
	}

Time Complexity: O(n) Space Complexity: O(1)

### Binary Search Approach

	public int search(int[] nums, int target){
		int left = 0;
		int right = nums.length - 1;

		while (left <= right){
			int mid = left + (right - left) / 2;
			if (nums[mid] == target) return mid;

			if (nums[left] <= nums[mid]){
				if (nums[mid] >= target && nums[left] <= target){
					right = mid - 1;
				}else{
					left = mid + 1;
				}
			}else{
				if (nums[mid] <= target && nums[right] >= target){
					left = mid + 1;
				}
				else{
					right = mid - 1;
				}
			}
		}
		return -1;
	}

Time Complexity: O(log n) Space Complexity: O(1)

