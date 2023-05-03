// Find the Difference of Two Arrays
// Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
// answer[0] is a list of all distinct integers in nums1 which are not present in nums2
// answer[1] is a list of all distinct integers in nums2 which are not present in nums1

// Example:
// Input: nums1 = [1,2,3], nums2 = [2,4,6]
// Output: [[1,3],[4,6]]

import java.util.*;

public class FindDifference{
	public static List<List<Integer>> solution(int[] nums1, int[] nums2){
		HashSet<Integer> set1 = new HashSet();
		HashSet<Integer> set2 = new HashSet();
		
		List<List<Integer>> res = new ArrayList();
		
		for (int num : nums1){
			set1.add(num);
		}
		for (int num: nums2){
			set2.add(num);
			if(set1.contains(num)){
				set1.remove(num);
			}
		}
		for (int num : nums1){
			if(set2.contains(num)){
				set2.remove(num);
			}
		}

		res.add(new ArrayList<>(set1));
		res.add(new ArrayList<>(set2));
		return res;
	}
	public static void main(String[] args){
		int[] nums1 = {1,2,3};
		int[] nums2 = {2,4,6};

		System.out.println(solution(nums1, nums2));
	}
}


