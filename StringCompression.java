// String Compression

// Given an array of characters chars, compress it using the following algorithm:

// Begin with an empty string s. For each group of consecutive repeating charactes in chars:

// - If the group's length is 1, append the character to s.
// - Otherwise, append the character followed by the group's length.

// The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.

// After you are done modifying the input array, return the new length of the array.

// You must write an algorithm that uses only constant extra space.

// Example 1:

// Input: chars = ['a','a','b','b','c','c','c']
// Output: 6
// Explanation: The groups are 'aa','bb', and 'ccc'. This compresses to "a2b2c3".

public class StringCompression{

	public static int solution(char[] chars){
		int index = 0;
		int count = 0;
		
		for (int i = 0; i < chars.length; i++){
			count++;

			if (i+1 == chars.length || chars[i] != chars[i+1]){
				chars[index++] = chars[i];

				if (count > 1){
					for (char c : Integer.toString(count).toCharArray()){
						chars[index++] = c;
					}
				}
				count = 0;
			}
		}

		
		return index;
	}
	public static void main (String[] args){
		char[] chars = {'a','a','b','b','c','c','c'};

		System.out.println(solution(chars));
	}
}
