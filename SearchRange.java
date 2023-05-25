// Find First and Last Position of Element in Sorted Array

// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1,-1].

// Must writing an algorithm with O(log n) runtime complexity.

// Example:
// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]

// Implement Binary Search Steps

// - find mid index: mid = left + (right - left) / 2
// - if nums[mid] == target, return mid 
// - if nums[mid] < target, repeat left = mid + 1
// - if nums[mid] > target, repeat right = mid - 1

import java.util.Arrays;

public class SearchRange{

	public static int[] solution(int[] nums, int target){
		int[] res = new int[2];
		res[0] = findStartingIndex(nums, target);
		res[1] = findEndingIndex(nums, target);
		return res;	
	}

	public static int findStartingIndex(int[] nums, int target){
		int index = -1;
		// binary search
		int l = 0; 
		int r = nums.length-1;

		while (l <= r){
			// find midpoint
			int mid = l + (r - l) / 2;

			if (nums[mid] == target) index = mid;

			if (nums[mid] >= target){
				r = mid - 1;
			}else{
				l = mid + 1;
			}
		}

		return index;
	}

	public static int findEndingIndex(int[] nums, int target){
		int index = -1;

		// binary search
		int l = 0;
		int r = nums.length-1;

		while (l <= r){
			// find midpoint
			int mid = l + (r - l) / 2;

			if (nums[mid] == target) index = mid;

			if (nums[mid] <= target){
				l = mid + 1;
			}else{
				r = mid - 1;
			}
		}
		return index;
	}

	public static void main(String[] args){
		int[] nums = {5,7,7,8,8,10};
		int target = 8;
		System.out.println(Arrays.toString(solution(nums, target)));
	}
}
