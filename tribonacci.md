# N-th Tribonacci Number

The Tribonacci sequence Tn is defined as follows:

T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 +Tn+2 for n >= 0.

Given n, return the value of Tn.

### Example:

***Input:*** n = 4

***Output:*** 4

***Explanation:*** 

T3 = 0 + 1 + 1 = 2

T4 = 1 + 1 + 2 = 4


### Iterative Approach

	public int tribonacci(int n){
		int t0 = 0;
		int t1 = 1;
		int t2 = 1;
		int tn = 0;

		for (n == 0) return 0;
		for (n == 1 || n == 2) return 1;

		for (int i = 3; i <= n; i++){
			tn = t0 + t1 + t2;
			t0 = t1;
			t1 = t2;
			t2 = tn;
		}
		return tn;
	}

Time Complexity: O(n) Space Complexity: O(1)

### Dynamic Programming Approach

	public int tribonacci(int n){
		int[] dp = new int[n+3];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 1;

		for (int i = 3; i <= n; i++){
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		}		
		return dp[n];
	}

Time Complexity: O(n) Space Complexity: O(n)


