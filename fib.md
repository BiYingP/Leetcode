# Fibonacci Number

The Fibonacci number, denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1

F(n) = F(n-1) + F(n-2), for n > 1.

Given n, calculate F(n).


### Example 

Input: n = 2

Output: 1

Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

### Dynamic Programming Approach

    public int fib(int n) {
        
        // dynamic programming
        if (n == 0 || n == 1) return n;
        
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        
        for (int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

### Recursive Approach

	public int fib(int n){
		if (n == 0 || n == 1) return n;
		return fib(n-1) + fib(n-2);
	}

### Iterative Approach

	public int fib(int n){
		int f0 = 0;
		int f1 = 1;
		int fn = 0;
		
		if (n == 0 || n == 1) return n;

		for (int i = 2; i <= n; i++){
			fn = f0 + f1;
			f0 = f1;
			f1 = fn;
		}
		return fn;
	}

Time Complexity: O(n) Space Complexity: O(1)
