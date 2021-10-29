Repeated Substring Pattern
Given a string s, check if it can be constucted by taking a substring of it and appending multiple copies of the substring together

Example 1:

Input: s = "abab"
Output: true
Explanation: It is the substring "ab" twice.

Example 2:

Input: s = "aba"
Output: false

public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for (int i = len/2; i >= 1; i--){
            if (len%i == 0){
                String substring = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                // number of repeated len/i
                for (int j = 0; j < len/i; j++){
                    sb.append(substring);
                    
                }
                if (sb.toString().equals(s))
                    return true;
            }
        }
        return false;
    }


