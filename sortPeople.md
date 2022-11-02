# Sort the People

Given an array of strings names, and array heights that consist of distinct positive integers. Both arrays are of length n.

For each index i, names[i] and heights[i] denote the name and height of the ith person.

Return names sorted in descending order by the people's heights.


Example:

Input: names=["Mary","John","Emma"], heights=[180,165,170]

Output: ["Mary","Emma","John"]

Explanation: Mary is the tallest, followd by Emma and John.


    public String[] sortPeople(String[] names, int[] heights) {
        
        HashMap<Integer, String> map = new HashMap();
        for (int i = 0; i < heights.length; i++){
            map.put(heights[i], names[i]);
        }
        // System.out.println(map);
        Arrays.sort(heights);
        
        int i = names.length-1;
        for (int j : heights){
            names[i--] = map.get(j);
        }
        return names;
    }
