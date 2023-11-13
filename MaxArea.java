// Container with Most Water

// Given an integer array heigh of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i,0) and (i,height[i]).

// Find two lines that together with the x-axis form a container, such that the container contains the most water.

// Return the maximum amount of water a container can store.

// Example:
// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
// Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water the container can contain is 49.

public class MaxArea{
	public static int maxArea(int[] height){
		int l = 0;
		int r = height.length-1;
		int max = 0;

		while(l < r){
			int w = r - l;
			int h = Math.min(height[l], height[r]);
			int area = w * h;
			max = Math.max(max, area);

			if (height[l] < height[r]){
				l++;
			}else{
				r--;
			}
		}
		return max;
	}
	public static void main(String[] args){
		int[] height = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));
	}
}
