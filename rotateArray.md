# Rotate Array #

Given an array, rotate the array to the right by k steps, where k is non-negative.

### Example 1: ###

***Input:*** nums = [1,2,3,4,5,6,7], k = 3

***Output:*** [5,6,7,1,2,3,4]


### Using Array ###

	public void rotate(int[] nums, int k){
		int[] res = new int[nums.length];

		for (int i = 0; i < nums.length; i++){
			res[(i+k)%nums.length] = nums[i];
		}
		// make a copy of the array		
		for (int i = 0; i < nums.length; i++){
			nums[i] = res[i];
		}
	}

Time Complexity: O(n), Space Complexity: O(n)

### Using Reverse ###

	public void rotate(int[] nums, int k){
		k = k % nums.length;

		// reverse all nums in array
		reverse(nums, 0, nums.length-1);
		// reverse first k nums in array
		reverse(nums, 0, k-1);
		// reverse last n-k nums
		reverse(nums, k, nums.length-1);
	}

	public void reverse(int[] nums, int start, int end){
		while(start < end){
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			
			start++;
			end--;
		}
	}

Time Complexity: O(n), Space Complexity: O(1)


