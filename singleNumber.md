# Single Number

Given a non-empty array of integer nums, every element appears twice except for one. Find that single one.


Example:

	Input: nums = [2,2,1]
	Output: 1

### Bit Manipulation Approach

XOR

If the bit is the same, return 0

if the bit is not the same, return 1

	public int singleNumber(int[] nums){
		int res = 0;
		for (int num : nums){
			res = res ^ num;
		}
		return res;
	}

Implememt a solution with a linear runtime complexiy and use only constant extra space.

Time Complexity: O(n) Space Complexity: O(1)

### HashSet Approach

	public int singleNumber(int[] nums){
		
		Set<Integer> set = new HashSet();

		for (int num : nums){
			if (set.contains(num){
				set.remove(num);
			}else{
				set.add(num);
			}
		}
		for (int num : set){
			return num;
		}
		return 0;
	}

Time Complexity: O(n) Space Complexity: O(n)

### HashMap Apprach

	public int singleNumber(int[] nums){
		HashMap<Integer, Integer> map = new HashMap();
	
		for (int num : nums){
			if (map.containsKey(num){
				map.put(num, map.get(num) + 1);
			}else{
				map.put(num, 1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()){
			int key = entry.getKey();
			int val = entry.getValue();

			if (val == 1) return key;
		}
		return 0;
	}


Time Complexity: O(n) Space Complexity: O(n)

