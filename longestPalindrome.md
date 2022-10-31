Longest Palindrome

Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example "Aa" is not considered a palindrome here.


Example:

Input: s = "abccccdd"

Output: 7

Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.


    public int longestPalindrome(String s) {
        int[] count = new int[128];
        
        for (char c: s.toCharArray()){
            count[c]++;
        }

        int len = 0;
        for (int n : count){
            len += n / 2 * 2;
            
            if(len % 2 == 0 && n % 2 == 1){
                len++;
            }
        }
        return len;
    }
