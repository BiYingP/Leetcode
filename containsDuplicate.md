# Contains Duplicate

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every elements is distinct.

### Example 1: ###

**Input:** nums = [1,2,3,1]

**Output:** true

### Example 2: ###

**Input:** nums = [1,2,3,4]

**Output:** false

### HashSet Approach

	public boolean containsDuplicate(int[] nums){
		Set<Integer> set = new HashSet();
		
		for (int num : nums){
			set.add(num);
		}
		if (set.size() != nums.length) return true;
		return false;
	}


	public boolean containsDuplicate(int[] nums){
		Set<Integer> set = new HashSet();

		for (int num : nums){
			if (!set.add(num)) return true;
		}
		return false;
	}

	public boolean containsDuplicate(int[] nums){
		Set<Integer> set = new HashSet();

		for (int num : nums){
			if (set.contains(num) return true;
			set.add(num);
		}
		return false;
	}


Time Complexity: O(n) Space Complexity: O(n)

### Sorting Approach ###

	public boolean containsDuplicate(int[] nums){
		Arrays.sort(nums);

		for (int i = 0; i < nums.length; i++){
			if (nums[i] == nums[i + 1]){
				return true;
			}
		}
		return false;
	}

Time Complexity: O(logn) Space Complexity: O(1)
	
### HashMap Approach ###

	public boolean containsDuplicate(int[] nums){
		Map<Integer, Integer> map = new HashMap();

		for (int num : nums){
			if (!map.containsKey(num){
				map.put(num, 1);
			}else{
				map.put(num, map.get(num) + 1);
			}
			if (map.get(num) >= 2) return true;
		}	
		return false;
	}

Time Complexity: O(n) Space Complexity: O(n)


