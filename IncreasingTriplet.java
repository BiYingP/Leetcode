// Increasing Triplet Subsequence

// Given an integer array nums, return true if there exists a triple of indices (i, j,k) such that i < j < k and nums[i] < nums[j] < nusm[k]. If no such indices exists, return false.

// Example:
// Input: nums = [1,2,3,4,5]
// Output: true
// Explanation: Any triplet where i < j < k is valid.

// Example:
// Input: nums = [5,4,3,2,1]
// Ouput: false

// Example:
// Input: nums = [2,1,5,0,4,6]
// Output: true
// Explanation: The triplet (3,4,5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.

public class IncreasingTriplet{
	public static boolean solution(int[] nums){
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		
		for (int i = 0; i < nums.length; i++){
			if (nums[i] <= first) first = nums[i];

			else if (nums[i] <= second) second = nums[i];

			else return true;
		}
		return false;
	}
	public static void main(String[] args){
		int[] nums = {1,2,3,4,5};
		System.out.println(solution(nums));
	}
}
