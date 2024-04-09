// Subarray Sum Equals K

// Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

// A subarray is a contiguous non-empty sequence of elements within an array.

// Example:
// Input: nums = [1,1,1], k = 2
// Output: 2

// Example:
// Input: nums = [1,2,3], k = 3
// Output: 2

import java.util.*;
public class SubarraySum{
	// HashMap Approach
	public static int subarraySum(int[] nums, int k){
		int sum = 0;
		int count = 0;
		HashMap<Integer, Integer> prefixSum = new HashMap<>();
		prefixSum.put(0, 1);

		for (int num : nums){
			sum += num;
			
			if (prefixSum.containsKey(sum - k)){
				count += prefixSum.get(sum - k);
			}
			prefixSum.put(sum, prefixSum.getOrDefault(sum, 0) + 1);
		}

		return count;

	} 

	// Brute Force Approach
	public static int subarraySum2(int[] nums, int k){
		
		int count = 0;
		for (int i = 0; i < nums.length; i++){
			int sum = 0;
			for (int j = i; j < nums.length; j++){
				sum += nums[j];
			
				if (sum == k) count++;
			}
		}
		return count;
	}
	public static void main(String[] args){
		int[] nums = {1,1,1};
		int k = 2;
		System.out.println(subarraySum(nums, k));
		System.out.println(subarraySum2(nums, k));
	}
}
