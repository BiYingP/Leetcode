// Greatest Common Divisor of Strings

// For two strings s and t, we say "t divides s" if and only if s = t+...+t (i.e., t is concatenated with itself one or more times).

// Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.


// Example 1:
// Input: str1 = "ABCABC", str2 = "ABC"
// Output: "ABC"

public class GCDOfStrings{
	public static String solution(String str1, String str2){
		if ((str1+str2).equals(str2+str1)){
			return str1.substring(0, gcd(str1.length(), str2.length()));
		} 
		return "";
	}	
	public static int gcd(int a, int b){
		return b == 0 ? a : gcd(b, a%b);
	}

	public static void main (String[] arg){
		String str1 = "ABCABC";
		String str2 = "ABC";

		System.out.println(solution(str1, str2));
	}
}

