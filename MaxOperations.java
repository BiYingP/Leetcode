// Max Number of K-Sum Pairs

// Given an integer array nums and an integer k.

// In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.

// Return the maximum number of operations you can perform on the array.

// Example
// Input: nums = [1,2,3,4], k = 5
// Output: 2
// Explanation: Starting with nums = [1,2,3,4],
// 		- Remove numbers 1 and 4, then nums = [2,3]
// 		- Remove numbers 2 and 3, then nums = []
// 		There are no more pairs that sum up to 5, hence a total of 2 operations

import java.util.*;
public class MaxOperations{
	public static int maxOperations(int[] nums, int k){
		Arrays.sort(nums);
		int l = 0;
		int r = nums.length-1;

		int count = 0;
		while (l < r){
			if (nums[l] + nums[r] == k){
				count++;
				l++;
				r--;
			}
			else if (nums[l] + nums[r] < k){
				l++;
			}
			else {
				r--;
			}
		}
		return count;
	}
	public static void main(String[] args){
		int[] nums = {1,2,3,4};
		int k = 5;

		System.out.println(maxOperations(nums, k));
	}
}
