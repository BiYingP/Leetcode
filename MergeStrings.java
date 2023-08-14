// Merge Strings Alternately

// Given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. if a string is longer than the other, append the additional letters onto the end of mergered string.

// Return the merged string.

// Example:
// Input: word1 = "abc", word2 = "pqr"
// Output: "apbqcr"
// Explantion: The merged string will be merged as
// word1: a b c
// word2:  p q r
// merged: apbqcr


public class  MergerStrings{
	public static String solution(String word1, String word2){
		StringBuilder sb = new StringBuilder();

		int i = 0;
		while(i < word1.length() && i < word2.length()){
			sb.append(word1.charAt(i));
			sb.append(word2.charAt(i));
			i++;
		}
		while(i < word1.length()){
			sb.append(word1.charAt(i));
			i++;
		}
		while(i < word2.length()){
			sb.append(word2.charAt(i));
			i++;
		}
		return sb.toString();

	}
	public static void main(String[] args){
		String word1 = "abc";
		String word2 = "pqr";

		System.out.println(solution(word1, word2));
	}	
}
