# Climbing Stairs

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

### Iteractive Approach

	public int climbStairs(int n){
		int oneStep = 1;
		int twoStep = 2;
		int res = 0;

		if (n == 1 || n == 2) return n;

		for (int i = 3; i <= n; i++){
			res = oneStep + twoStep;
			oneStep = twoStep;
			twoStep = res;
		}
		return res;
	}

Time Complexity: O(n) Space Complexity: O(1)

### Dynamic Progamming Approach

    public int climbStairs(int n) {
        
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

Time Complexity: O(n) Space Complexity: O(n)

