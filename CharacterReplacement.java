// Longest Repeating Character Replacement

// Given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.

// Return the length of the longest substring containing the same letter you can get after performing the above operations.

// Example 1:
// Input: s = "ABAB", k = 2
// Output: 4
// Explanation: Replace the two 'A's with two 'B's or vice versa.

public class CharacterReplacement{
	public static int characterReplacement(String s, int k){
		// window start
		int start = 0;
		// window end
		int end = 0;
		int[] count = new int[26];
		int max_count = 0;
		int max_length = 0;

		while(end < s.length()){
			// count char of string
			count[s.charAt(end) - 'A']++;
			// get max count of char
			max_count = Math.max(max_count, count[s.charAt(end) - 'A']);

			while(end - start + 1 - max_count > k){
				count[s.charAt(start) - 'A']--;
				start++;
			}
			// get max length of repeating char
			max_length = Math.max(max_length, end - start + 1);
			end++;
		}
		return max_length;
	}
	public static void main(String[] args){
		String s = "ABAB";
		int k = 2;

		System.out.println(characterReplacement(s, k));
	}
} 
