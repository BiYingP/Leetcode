# Maximum Product Subarry

Given an integer array nums, find a subarray that has the largest product, and return the product.

### Example:

***Input:*** nums = [2,3,-2,4]

***Output:*** 6

***Explanation:*** [2,3] has the larget product 6.

### Brute Force Approach

	public int maxProduct(int[] nums){

		int maxProd = nums[0];
		for (int i = 0; i < nums.length; i++){
			int curProd = 1;
			for (int j = i; j < nums.length; j++){
				curProd *= nums[j];
				if (curProd > maxProd){
					maxProd = curProd;
				}
			}
		}
		return maxProd;
	}

Time Complexity: O(n^2) Space Complexity: O(1)

### Swap Min and Max Approach

		public int maxProduct(int[] nums){
			int curMin = nums[0];
			int curMax = nums[0];
			int maxProd = nums[0];

			for (int i = 1; i < nums.length; i++){
				// Swap Min and Max
				if (nums[i] < 0){
					int tmp = curMax;
					curMax = curMin;
					curMin = tmp;
				}
				curMax = Math.max(curMax*nums[i], nums[i]);
				curMin = Math.min(curMin*nums[i], nums[i]);
				
				maxProd = Math.max(maxProd, curMax);
			}
			return maxProd;
		}

Time Complexity: O(n) Space Complexity: O(1)

### Two Pointer Approach

	public int maxProduct(int[] nums){
		int maxProd = nums[0];
		int l = 0;
		int r =0;

		for (int i = 0; i < nums.length; i++){
			// update left pointer or right pointer to 1
			l = l==0 ? 1 : l;
			r = r==0 ? 1 : r;
			
			l *= nums[i];
			r *= nums[nums.length-1-i];
			
			maxProd = Math.max(maxProd, Math.max(l, r));
		}
		return maxProd;
	}

Time Complexity: O(n) Space Complexity: O(1)

