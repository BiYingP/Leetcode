Climbing Stairs

You are climbing a staircase. It takes n steps to reach the top. Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 

Input: n = 2

Output: 2

Explanation: There are two ways to climb to the top.

1. 1 step + 1 step

2. 2 steps


Example

Input: n = 3

Output: 3

Explanation: There are three ways to climb to the top.

1. 1 step + 1 step + 1 step

2. 1 step + 2 steps

3. 2 steps + 1 step


    public int climbStairs(int n) {
        
//         int one_step = 1, two_step = 2;
//         for (int i = 3; i <= n; i++ ){
//             int tmp = two_step;
//             two_step = one_step + two_step;
//             one_step = tmp;
        // return two_step;

        // int one_step = 1, two_step = 1;
        // for (int i = 0; i < n-1; i++){
        //     int temp = one_step;
        //     one_step = one_step + two_step;
        //     two_step = temp;
        // }
        // return one_step;
        
        // Dynamic Programming
        if (n == 1) return 1;
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        
        for (int i = 2; i <= n; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
