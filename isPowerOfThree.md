# Power of Three

Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3^x.

Example:

Input: n = 27

Output: true

Explanation: 27 = 3^3

### Iterative Approach

	public boolean isPowerOfThree(int n){

		if (n == 0) return false;

		while (n != 1){
			if (n % 3 != 0) return false;
			n = n / 3;
		}
		return true;

	}

### Recursive Approach

	public boolean isPowerOfThree(int n){
		if (n == 0) return false;
		if (n == 1) return true;

		if (n % 3 != 0) return false;

		return isPowerOfThree(n / 3);
	}
