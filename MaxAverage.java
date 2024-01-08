// Maximum Average Subarray 

// Given an integer array nums consisting of n elements, and an integer k.

// Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. 

// Example:
// Input: nums = [1,12,-5,-6,50,3], k = 4
// Output: 12.75000
// Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75


import java.util.*;
public class MaxAverage{
	public static double findMaxAverage(int[] nums, int k){
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int l = 0; // left pointer

		for (int r = 0; r < nums.length; r++){
			sum += nums[r];

			if (r >= k - 1){
				max = Math.max(max, sum);
				sum -= nums[l++];
			}
		}	
		return (double) max / 4;
	}
	public static void main(String[] args){
		int nums[] = {1,12,-5,-6,50,3};
		int k = 4;
		System.out.println(findMaxAverage(nums, k));
	}
}
