# Valid Palindrome II

Given a string s, return true if the s can be palindrome after deleting at most one character from it.

***Example:***

**Input:** s = "abca"
**Output:** true

**Explanation:** Delete the character 'c'.


	public boolean validPalindrome(String s){
		int l = 0; // left pointer
		int r = s.length()-1; // right pointer
		
		while(l < r){
			if(s.charAt(l) != s.charAt(r)){
				return isPalindrome(s, l+1, r) || isPalindrome(s, l, r-1);
			}
			l++;
			r--; 
		}
		return true;
	}

	public boolean isPalindrome(String s, int l, int r){
		while(l < r){
			if(s.charAt(l++) != s.charAt(r--){
				return false;
			}
		}
		return true;
	}

Time Complexity: O(n) Space Complexity: O(1)
