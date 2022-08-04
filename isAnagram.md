Valid Anagram

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false



    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        int count [] = new int[26];
        for (int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        
        for (int c : count){
            if(c != 0) return false;
        }
        
//         char char_s[]=s.toCharArray();
//         char char_t[]=t.toCharArray();
//         Arrays.sort(char_s);
//         Arrays.sort(char_t);
        
//         for (int i = 0; i<char_s.length; i++){
//             if(char_s[i] != char_t[i]) return false;
//         }
    
        return true;
    }
