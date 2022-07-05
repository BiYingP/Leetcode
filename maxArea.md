Containter With Most Water

You are given an integer array height of length n. There are n vertical lines draw sunch that two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a contioner, such that the container contains the most water.

Return the maximum amount of water a container can store.

Input: height = [1,8,6,2,5,4,8,3,7]

Output: 49

Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water can contain is 49.


    public int maxArea(int[] height) {
        int max = 0, l = 0, r = height.length - 1;
        
        while (l < r){
            int area = Math.min(height[l], height[r]) * (r - l);
            max = Math.max(max, area);
            if (height[l] < height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
