# Birnary Search

Given an array of integers nums which is sorted in ascending orderm and an integer target, write a function to search target in nums. if target exits, then return its index. Otherwise, return -1.

Example:

Input: nums = [-1,0,3,5,9,12], target = 9

Output: 4

Explanation: 9 exists in nums and its index is 4.


    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        
        while (left <= right){
            int pivot = left + (right - left)/2;
            if (nums[pivot] == target){
                return pivot;
                
            }
            if (nums[pivot] > target){
                right = pivot - 1;
            }
            else{
                left = pivot + 1;
            }
        }

        return -1;
    }


Time Complexity is *O(log n)* and Space Complexity is *O(log n)*.

To find the target in a group, the worst case scenario is go through every single element *(O(n))*. When elements are sorted, the search time can bring down to *O(log n)* by using Binary Search.
