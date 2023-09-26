// Reverse Vowels of a String

// Given a string s, reverse only all the vowels in the string and return it

// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

// Example:
// Input: s = "hello"
// Output: "holle"

public class ReverseVowels{
	public static String solution(String s){
		int l = 0; // left pointer
		int r = s.length() - 1; // right pointer
		char[] c = s.toCharArray();

		while(l < r){
			if (isVowel(c[l]) && isVowel(c[r])){
				char tmp = c[l];
				c[l] = c[r];
				c[r] = tmp;
				l++;
				r--;
			}
			if (!isVowel(c[l])) l++;
			if (!isVowel(c[r])) r--;
		}
		return new String(c);
	}
	public static boolean isVowel(char c){
		return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'; 
	}
	public static void main (String[] arg){

		String s = "hello";
		System.out.println(solution(s));

	}
}
