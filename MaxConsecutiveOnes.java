// Max Consecutive Ones

// Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

// Example:
// Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
// Output: 6

// Explanation: [1,1,1,0,0,1,1,1,1,1,1]


public class MaxConsecutiveOnes{
	public static int longestOnes(int[] nums, int k){
		int l = 0;
		int r = 0;

		while (r < nums.length){
			if (nums[r] == 0) k--;
			if (k < 0){
				if (nums[l] == 0) k++;
				l++;
			}
			r++;
		}
		return r - l;
	}
	public static void main(String[] args){
		int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
		int k = 2;

		System.out.println(longestOnes(nums, k));
	}
	
}
