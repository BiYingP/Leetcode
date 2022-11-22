# Majority Element II #

Given an integer array of size n, find all elements that appear more than [n/3] times.

### Example 1: ###

**Input:** nums = [3,2,3]

**Output:** [3]


### Example 2: ###

**Input:** nums = [1,2]

**Output:** [1,2]


### Brute Force Approach ###

	public List<Integer> majorityElement(int[] nums){
		List<Integer> res = new ArrayList();
		Set<Integer> set = new HashSet();

		for (int i : nums){
			int count = 0;
			for (int j : nums){
				if (i == j) count++;
			}
			if (count > nums.length/3){
				set.add(i);
			}
		}
		for (int i : set){
			res.add(i);
		}
		return res;
	}

Time Complexity: O(n2) Space Complexity: O(n)

### HashMap Approach ###

	public List<Integer> majorityElement(int[] nums){
		List<Integer> res = new ArrayList();
		Map<Integer, Integer> map = new HashMap();

		for (int i : nums){
			if (!map.containsKey(i)){
				map.put(i, 1);
			}else{
				map.put(i, map.get(i) + 1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()){
			if (entry.getValue() > nums.length / 3){
				res.add(entry.getKey());
			}
		}
		return res;
	}

Time Complexity: O(n) Space Complexity: O(n)


