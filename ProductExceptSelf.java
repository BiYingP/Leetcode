// Product of Array Except Self

// Given an integer array nums, return an array answer such that anser[i] is equal to the product of all the elements of nums except nums[i].

// The product of any prefix or suffix of nums is guaranteed to fit in 32-bit integer.

// You must write an alogorithm that runs in O(n) time and without using the division operation.

// Example 1:
// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]

import java.util.*;
public class ProductExceptSelf{

	public static int[] solution(int[] nums){
		// prefix product
		int prefixPro = 1;
		// postfix product
		int postfixPro = 1;

		int[] res = new int[nums.length];
		for (int i = 0; i < nums.length; i++){
			res[i] = prefixPro;
			prefixPro *= nums[i];
		}

		for (int i = nums.length-1; i >= 0; i--){
			res[i] *= postfixPro;
			postfixPro *= nums[i];
		}
		return res;
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int[] nums = new int[4];
		
		for (int i = 0; i < nums.length; i++){
			nums[i] = s.nextInt();
		}
	//	int[] nums = {1,2,3,4};
		System.out.println(Arrays.toString(solution(nums)));
	}
}
