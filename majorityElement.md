# Majority Element

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than [n/2] times. Assume tha the majority element always exists in the array.

### Example 1: ###

**Input:** nums = [3,2,3]

**Output:** 3

### Example 2: ###

**Input:** nums = [2,2,1,1,1,2,2]

**Output:** 2


### Brute Force Approach ###

	public int majorityElement(int[] nums){
		//int count = 0;
		for (int i : nums){
			int count = 0;
			for (int j : nums){
				if (i == j){
					count++
				}
			}
		}
		if (count > nums.length/2){
			return i;
		}
		return -1;
	}

Time Complexity: O(n2) Space Complexity: O(1)

### Sorting Approach ###


	public int majorityElement(int[] nums){

		Arrays.sort(nums);
		return nums[nums.length/2];
	}	


Time Complexity: O(nlgn) Space Complexity: O(1)


### HashMap Approach ###

	public int majorityElement(int[] nums){
		
		HashMap<Integer, Integer> map = new HashMap();
		if (nums.length == 1) return nums[0];
		for (int i : nums){
			if (map.containsKey(i) && map.get(i) + 1 > nums.length / 2){
				return i;
			}else{
				//map.put(i, map.getOrDefault(i, 0) + 1);
				if (!map.containsKey(i)){
					map.put(i, 1);
				}else{
					map.put(i, map.get(i) + 1);
				}
			}
		}
		return -1;
	}

	public int majorityElement(int[] nums){
		HashMap<Integer, Integer> map = new HashMap();

		for (int i : nums){
			//map.put(i, map.getOrDefault(i,0) + 1);
			if (!map.containsKey()){
				map.put(i, 1);
			}else{
				map.put(i, map.get(i) + 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()){
			if (entry.getValue() > nums.length / 2){
				return entry.getKey();
			}
		}
		return -1;
	}

Time Complexity: O(n) Space Complexity: O(n)

### Boyer Moore Voting Algorithm Approach ###

	public int majorityElement(int[] nums){
		int count = 0;
		int majority = 0;

		for (int num : nums){
			if (count == 0){
				majority = num;	
			}
			if (majority == num){
				count++;
			}else{
				count--;
			}
		}
		return majority;

	}

Time Complexity: O(n) Space Complexity: O(1)


