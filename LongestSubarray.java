// Longest Subarray of 1's After Deleting One Element

// Given a binary array nums, you should delete one element from it.

// Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.

// Example:
// Input: nums = [1,1,0,1]
// Output: 3
// Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's

// Example:
// Input: nums = [1,1,1]
// Output: 2
// Explanation: You must delete one element.

public class LongestSubarray{
	public static int longestSubarray(int[] nums){
		int start = 0;
		int end = 0;
		int zero = 0;
		int max_length = 0;

		while(end < nums.length){
			// count zeros
			if (nums[end] == 0){
				zero++;
			}
			// if more than one zero remove from the window
			while(zero > 1){
				if (nums[start] == 0){
					zero--;
				}
				start++;
			}
			max_length = Math.max(max_length, end - start + 1 - zero);
			end++;
		}
		if (max_length == nums.length) return nums.length - 1;
		return max_length;
	}
	public static void main(String[] args){
		int[] nums = {1,1,0,1};
		System.out.println(longestSubarray(nums));
	}
}
