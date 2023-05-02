// Sign of the Product of an Array
// Given an integer array nums. Let product be the product of all values in the array nums. return the function 1 if positive, -1 if negative, 0 if equal to 0

public class ArraySign{
	public static int solution1(int[] nums){
		int product = 1;
		for (int num : nums){
			if (num == 0 ) return 0;
			product *= num > 0 ? 1 : -1;
		}
		return product;
	}
	public static int solution2(int[] nums){
		int count = 0;
		for (int num : nums){
			if (num == 0) return 0;
			if (num < 0) count++;
		}
		return count % 2 == 0 ? 1 : -1;
	}
	public static void main(String[] args){
		int[] nums = {-1,-2,-3,-4,3,2,1};
		System.out.println(solution1(nums));
		System.out.println(solution2(nums));

	}
}
