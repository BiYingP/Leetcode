# Running Sum of 1d Array

Given an array nums. A running sum of an array defined as runningSum[i] = sum(nums[0]...nums[i].

Return the runing sum of nums.

Example:

Input: nums = [1,2,3,4]

Output: [1,3,6,10]

Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].


    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
         
            sum += nums[i];
            res[i] = sum;
        }
        return res;
    }
