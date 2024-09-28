// Word Pattern

// Given an patten and a string s, find if s follows the same pattern.

// A full math, such that there is a bijection bewteen a letter in pattern and a non-empty word in s.

// Each letter in patten maps to exactly one unique word in s.
// Each unique word in s maps to exactly one letter in pattern.
// No two letters map to the same word, and no two words map to the same letter.

// Example:
// Input: pattern = "abba", s = "dog cat cat dog"
// Output: true
// Explanation:
// The bijection can beestablished as:
// 'a' maps to "dog"
// 'b' maps to "cat"

import java.util.*;
public class WordPattern{
	public static boolean wordPattern(String pattern, String s){
		String[] words = s.split(" ");
		if (words.length != pattern.length()) return false;
		
		HashMap<String, Character> map = new HashMap<>();
		for (int i = 0; i < pattern.length(); i++){
			if (map.containsKey(words[i])){
				if (map.get(words[i]) != pattern.charAt(i)) return false;
			}else{
				if (map.containsValue(words[i])) return false;
				map.put(words[i], pattern.charAt(i));
			}
		}
		return true;
	}
	public static void main(String[] args){
		String pattern = "abba";
		String s = "dog cat cat dog";

		System.out.println(wordPattern(pattern, s));
	}
}
