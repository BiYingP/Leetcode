# Ransom Note

Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

### Example: ###

**Input:** ransomNote = "a", magazine = "b"

**Output:** false

**Input:** ransomNote = "aa", magazine = "aab"

**Output:** true



**Array Approach**

	public boolean canConstruct(String ransomNote, String magazine){
		int[] count = new int[26];

		for (char c : magazine.toCharArray()){
			count[c - 'a']++;
		}
		
		for (char c : ransomNote.toCharArray()){
			if (count[c - 'a'] == 0){
				return false;
			}
			count[c - 'a]--;
		}
		return true;
	}

Time Complexity: O(n + m), where n is size of ransomNote, m is size of magazine.
Space Complexity: O(1).

**HashMap Approach**

	public boolean canConstruct(String ransomNote, String magazine){
		// using hashmap
		HashMap<Character, Integer> map = new HashMap();

		for (char c : magazine.toCharArray()){
			if (!map.containsKey(c)){
				map.put(c, 1);
			}else{
				map.put(c, map.get(c) + 1);
			}
		}
		for (char c : ransomNote.toCharArray()){
			if (!map.containsKey(c) || map.get(c) == 0){
				return false;
			}else{
				map.put(c, map.get(c) - 1);
			}
		}
		return true;
	}

Time Complexity: O(n+m) Space Complexity: O(n);
