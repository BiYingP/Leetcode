// Maximum Number of Vowels in a Substring of Given Length

// Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

// Vowel letters in English are 'a', 'e', 'i','o', and 'u'


// Example:
// Input: s = "abciiidef", k = 3
// Output: 3
// Explanation: The substring "iii" contains 3 vowel letters.


public class MaxVowels{
	public static boolean isVowels(char c){
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}
	public static int solution1(String s, int k){
		int max = 0;
		int count = 0;

		// Count number of vowels in first window
		for (int i = 0; i < k; i++){
			if (isVowels(s.charAt(i))) count++;
		}
		// update max
		max = count; 
		
		// Sliding window and update the max
		for (int i = k; i < s.length(); i++){
			if (isVowels(s.charAt(i))) count++;
			if (isVowels(s.charAt(i-k))) count--;
			max = Math.max(max, count);
		}
		return max;
	}
	
	public static int solution2(String s, int k){
		int max = 0;
		int count = 0;
		
		for (int i = 0; i < s.length(); i++){
			if (isVowels(s.charAt(i))) count++;
			if (i >= k && isVowels(s.charAt(i-k))) count--;
			max = Math.max(max, count);
		}
		return max;
	}	

	public static void main (String[] args){
		String s = "abciiidef";
		int k = 3;
		System.out.println(solution1(s,k));
		System.out.println(solution2(s,k));
	}
}


