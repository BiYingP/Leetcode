// Number of Subsequences That Satisfy the Given Sum

// Given an array of integers nums and integer target.
// Return the number of non-empty subsequences of nums such that the sum of the minimum and maximum element on it is less or equal to target. Since the answer may be too large, return it modulo 10^9 + 7.

// Example:
// Input: nums = [3,5,6,7], target = 9
// Output: 4

// Explanaton: There are 4 subsequences that satisfy the condition
// [3] -> 3+3<=9
// [3,5] -> 3+5<=9
// [3,5,6] ->3+6<=9
// [3,6] -> 3+6<=9

import java.util.*;
public class NumberSubsequences{
	public static int solution(int[] nums, int target){
		// sort the array
		Arrays.sort(nums);
		// left pointer
		int l = 0;
		// right pointer
		int r = nums.length-1;
		int res = 0;
		int mod = 1000000007;
		
		int[] pow2 = new int[nums.length];
		pow2[0] = 1;
		for (int i = 1; i < nums.length; i++){
			pow2[i] = (pow2[i-1] * 2) % mod;
	//		System.out.println(pow2[i]);
		}

		while (l <= r){
			if (nums[l] + nums[r] > target){
				r--;
			}
			else{
				res += pow2[r-l];
				res %= mod;
				l++;
			}
		}
		return res;
	}
	public static void main(String[] args){
		int[] nums = {3,5,6,7};
		int target = 9;

		System.out.println(solution(nums, target));
	}
}

// Time Complexity: O(nlogn)
// Space Complexity: O(n) 
