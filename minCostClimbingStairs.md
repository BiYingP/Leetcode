Min Cost Climbing Stairs

You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.

You can either start from the step with index 0, or step with index 1. Return the min cost to reach the top of the stair.

Example

Input: cost = [10,15,20]

Output: 15

Explanation: You will start at index 1. Pay 15 and climb two steps to reach the top. The total cost is 15.



    public int minCostClimbingStairs(int[] cost) {
        // for (int i = 2; i < cost.length; i++){
        //     cost[i] += Math.min(cost[i-1], cost[i-2]);
        // }
        // return Math.min(cost[cost.length-1], cost[cost.length-2]);
        
        int[] dp = new int[cost.length+1];
        dp[0] = 0;
        dp[1] = 0;
        
        for (int i = 2; i <= cost.length; i++){
            dp[i] =  Math.min(dp[i-1]+cost[i-1], dp[i-2]+cost[i-2]);
        }
        return dp[cost.length];
    }
