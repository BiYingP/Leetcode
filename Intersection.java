// Intersection of Two Arrays

// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

// Example:
// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Ouput: [2]

import java.util.*;
public class Intersection{
	public static int[] solution(int[] nums1, int[] nums2){
		HashSet<Integer> set = new HashSet();
		for (int num : nums1){
			set.add(num);
		}

		HashSet<Integer> intersection = new HashSet();
		for (int num : nums2){
			if (set.contains(num)){
				intersection.add(num);
			}
		}

		int[] res = new int[intersection.size()];
		int i = 0;
		for (int num : intersection){
			res[i++] = num;
		}
		return res;
	}
	public static void main (String[] args){
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};

		System.out.println(Arrays.toString(solution(nums1, nums2))); 
	}
}







