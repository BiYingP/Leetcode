// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, j != k, and nums[i] + nums[j] + nums[k] == 0

import java.util.*;

public class ThreeSum{

	public static List<List<Integer>> threeSum (int[] nums){
		Arrays.sort(nums);
		HashSet<List<Integer>> set = new HashSet();

		for (int i = 0; i < nums.length-2; i++){
			int j = i + 1;
			int k = nums.length - 1;

			while(j < k){
				int sum = nums[i] + nums[j] + nums[k];

				if(sum == 0){
					set.add(Arrays.asList(nums[i], nums[j],nums[k]));
				j++;
				k--;
				}
				if(sum < 0) j++;
				if(sum > 0) k--;

			}
		}

		return new ArrayList<>(set);
	}

	public static void main(String []args){
	//	ThreeSum res = new ThreeSum();
		int[] nums = {-1,0,1,2,-1,-4};

	//	System.out.println(res.threeSum(nums));
		System.out.println(threeSum(nums));

	}


}
