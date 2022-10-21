Isomorphic Strings

Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

Example 1:

Input: s = "egg", t = "add"

Output: true

Example 2:

Input: s = "foo", t = "bar"

Output: false

Example 3:

Input: s = "paper", t = "title"

Output: true


    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                if (map.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                } 
            }
            else {
                if (map.containsValue(t.charAt(i))){
                    return false; 
                } 
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
