// Valid Word

// Given a string word. Return true if word is valid, otherwise, return false

// A word is considered valid if:
// It contains a minimum of 3 characters
// It conatins digits(0-9), and English letters (uppercase and lowercase)
// It includes at least one vowel
// It includes at least one consonant


// Example:
// Input: word = "234Adas"
// OUtput: true

public class ValidWord{
	public static boolean isValid(String word){
		if (word.length() < 3) return false;

		boolean isVowel = false;
		boolean isConsonant = false;
		for (int i = 0; i < word.length(); i++){

			char c = word.charAt(i);
			if (c == '@' || c == '#' || c == '$') return false;
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
				isVowel = true;
			}
			if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z'){
				isConsonant = true;
			}
		}
		return isVowel && isConsonant;
		
	}
	public static void main(String[] args){
		String word = "234Adas";

		System.out.println(isValid(word));			
	}
}
