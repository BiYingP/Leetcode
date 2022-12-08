# Reverse Words in a String III #

Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

### Example 1: ###

***Input:*** s = "Let's take LeetCode contest"

***Output:*** "s'teL ekat edoCteeL tsetnoc"


### Two Pointer Approach ###

	public String reverseWords(String s){
		char[] c = s.toCharArray();

		int l = 0; // left pointer
		int r = 0; // right pointer
		while (r < c.length){
			if (c[r] == ' '){
				reverse(c, l, r-1);
				// update left pointer
				l = r + 1;
			}
			r++;
		}
		reverse(c, l, c.length-1);
		return new String(c);
	}

	public void reverse(char[] c, int l, int r){
		while(l <= r){
			int temp = c[l];
			c[l] = c[r];
			c[r] = temp;
			l++;
			r--;
		}
	}

Time Complexity: O(n) Space Complexity: O(1)


