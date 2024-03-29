# Happy Number

Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

- Starting with any positive integer, replace the number by the sum of the squares of its digits.

- Repeat the process until the number equals 1, or it loops endlessly in a cycle which does not include 1.

- Those numbers for which this process ends in 1 are happy.

Return true if n is a happy number, and false if not.

### Example:

Input: n = 19

Output: true

Explanation:

1^2 + 9^2 = 82

8^2 + 2^2 = 68

6^2 + 8^2 = 100

1^2 + 0^2 + 0^2 = 1



	public boolean isHappy(int n){
		while (n != 1){
			if ( n == 4) return false;
			int sum = 0;
			while (n > 0){
				sum += (n%10) * (n%10);
				n /= 10;
			}
			n = sum;
		}
		return true;
	}

Time Complexity: O(n) Space Complexity: O(1)

### Two Pointer Approach

	public boolean isHappy(int n){
		int slow = n;
		int fast = n;

		do{
			slow = square(slow);
			fast = square(square(slow));
		} while (slow != fast);
		
		if (slow == 1) return true;
		return false;
	}

	public int square(int n){
		int sum = 0;
		while (n > 0){
			sum += (n%10) * (n%10);
			n /= 10;
		}
		return sum;
	}

Time Complexity: O(n) Space Complexity: O(1)


