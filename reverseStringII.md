# Reverse String II

Given a string s and an integer K, reverse the first k characters for every 2k characters counting from the start of the string.


### Example:

***Input:*** s = "abcdefg", k = 2

***Output:*** "bacdfeg"

### Two Pointing Approach

	public String reverseString(String s){
		char[] c = s.toCharArray();

		for (int i = 0; i < c.length; i+=2*k){
			int l = i;
			int r = Math.min(i+k-1, c.length-1);
			// reverse 
			while(l < r){
				char temp = c[l];
				c[l] = c[r];
				c[r] = temp;
				l++;
				r--; 
			}
		} 
		return new String(c);
	}

Time Complexity: O(n) Space Complexity: O(1)


