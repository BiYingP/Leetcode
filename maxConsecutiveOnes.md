# Max Consecutive Ones

Given a binary array nums, return the maximum number of consecutive 1's in the array.

Example

Input: nums = [1,1,0,1,1,1]

Output: 3

Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.


    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count = 0, max = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
		if (max < count){
		     max = count;
		}
               // max = Math.max(count, max);
            } else {
                count = 0;
            }
        }
        return max;
    }


Time Complexity: O(n) n = length of input array
Space Complexiy: O(1)


