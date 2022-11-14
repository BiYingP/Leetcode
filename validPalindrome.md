# Valid Palindrome

Given a string s, return true if it is a plalindrome, or false otherwise.

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.


***Example 1:***

**Input:** s = "A man, a plan, a canal: Panama"

**Output:** true

**Explanation:** "amanaplanacanalpanama" is a palindrome.

***Example 2:***

**Input:** s = "race a car"

**Output:** false

**Explanation:** "raceacar" is not a palindrome.


	public boolean isPalindrome(String s){
		int l = 0; // left pointer
		int r = s.length()-1; // right pointer
		s = s.toLowerCase();

		while(l < r){
			if (!Character.isLetterOrDigit(s.charAt(l)) l++;
			else if (!Character.isLetterOrDigit(s.charAt(r)) r--;
			else if (s.charAt(l++) != s.charAt(r--)) return false;

		}
		return true;
	}

