# Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.


Example

Input: nums = [2,7,11,15], target = 9

Output: [0,1]

Explanation: nums[0] + nums[1] = 9, return [0,1]

### Two Pointer Approach
        
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }        
              
Time Complexity: O(n) Space Complexity: O(n)

### HashMap Appraoch

	public int[] twoSum(int[] nums, int target){
		map<Integer, Integer> map = new HashMap();

		for (int i = 0; i < nums.length; i++){
			if (map.containsKey(target-nums[i]){
				return new int[]{map.get(target-nums[i]),i};
			}
			map.put(nums[i], i);
		}
		return new int[]{0,0};
	}

Time Complexity: O(n) Space Complexity: O(n)
