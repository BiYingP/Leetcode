// Sort Array by Increasing Frequency

// Given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order.

// Return the sorted array.

// Example:
// Input: nums = [1,1,2,2,2,3]
// Output: [3,1,1,2,2,2]
// Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.

import java.util.*;
public class FrequencySort{
	public static int[] frequencySort(int[] nums){
		Integer[] res = new Integer[nums.length];
		HashMap<Integer, Integer> freq = new HashMap<>();

		for (int i = 0; i < nums.length; i++){
			if (freq.containsKey(nums[i])){	
			freq.put(nums[i], freq.get(nums[i])+1);
			}else{
			freq.put(nums[i], 1);
			}
			res[i] = nums[i];

		}

		Arrays.sort(res, (a,b) -> {
			if (freq.get(a) == freq.get(b)){
				return b - a;
			}
			else{
				return freq.get(a) - freq.get(b);
			}
		}
		);

		for (int i = 0; i < nums.length; i++){
			nums[i] = res[i];
		}
		return nums;
	}
	public static void main(String[] args){
		int[] nums = {1,1,2,2,2,3};

		System.out.println(Arrays.toString(frequencySort(nums)));
	}

} 
