# Contains Duplicate

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every elements is distinct.

Example 1:

Input: nums = [1,2,3,1]

Output: true

Example 2:

Input: nums = [1,2,3,4]

Output: false


    public boolean containsDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // for (int i = 0; i < nums.length-1; i++) {
        //     if (nums[i] == nums[i+1]) return true;  
        // }
        // return false;
        Set <Integer> set = new HashSet<>();
        
        for (int num : nums){
            // set.add(num);
            
            if (!set.add(num)){
                return true;
            }
        }
        return false;
        }
