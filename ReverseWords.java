// Reverse Words in a String

// Give an input string s, reverse the order of the words

// A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

// Return a string of the words in reverse order concatenated by a single space.

// Note that s may contain leading or trailing spaces or muliple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

// Example 1: 
// Input: s = "the sky if blue"
// Output: "blue is sky the"

public class ReverseWords{
	public static String Solution(String s){

		StringBuilder res = new StringBuilder();

		int i = s.length()-1; 
		char[] c = s.toCharArray();

		while(i >= 0){
			// skip the leading space
			while (i >= 0 && c[i] == ' ') i--;
			int j = i;

			while (i >= 0 && c[i] != ' ') i--;
			int k = i + 1;

			while (k <= j) res.append(c[k++]);
		//	res.append(' ');

			// skip the trailing space
			while (i >= 0 && c[i] == ' ') i--;
			if (i >= 0) res.append(' ');			
		}

	
		return res.toString();	
	}
	public static void main (String[] args){
		String s = "the sky is blue";
		System.out.println(Solution(s));
	}
}
