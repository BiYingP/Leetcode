// Concatenation of Array

// Given an integer array nums of length n, create an array ans of length 2n where ans[i] == nums[i] and ans[i+n] == nums[i] for 0<= i < n (0-indexed)

// Specifically ans is the concatenation of two nums arrays
// Return the array ans.

// Example:
// Input: nums = [1,2,1]
// Output: [1,2,1,1,2,1]
// Explanation: The array ans is formed as follows:
// 		ans = [nums[0], nums[1], nums[2], nums[0], nums[1], nums[2]]

import java.util.*;
public class ConcatenationOfArray{
	public static int[] getConcatenation(int[] nums){
		int[] ans = new int[nums.length*2];

		for (int i = 0; i < nums.length; i++){
			ans[i] = nums[i];
			ans[i+nums.length] = nums[i];
		}	
		return ans;
	}
	public static void main(String[] args){
		int[] nums = {1,2,1};
		System.out.println(Arrays.toString(getConcatenation(nums)));
	}
}
