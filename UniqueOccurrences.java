// Unique Number of Occurrences

// Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

// Example:
// Inut: arr = [1,2,2,1,1,3]
// Output: true
// Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.

import java.util.*;
public class UniqueOccurrences{
	public static boolean uniqueOccurrences(int[] nums){
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int num : nums){
			if (map.containsKey(num)){
				map.put(num, map.get(num)+1);
			}
			else{
				map.put(num, 1);
			}
		}

		HashSet<Integer> set = new HashSet<>();
		for (int num : map.values()){
			if (set.contains(num)){
				return false;
			}
			set.add(num);
		}
		return true;
	}
	public static void main(String[] args){
		int[] nums = {1,2,2,1,1,3};
		System.out.println(uniqueOccurrences(nums));
	}
}
