// Equal Row and Column Pairs

// Given a 0-indexed nxn integer matrix grid, return the number of pairs(ri,cj) such that row ri and column cj are equal.

// A row and column pair is considered equal if they contain the same elements in the same order.

// Example:
// 3 2 1
// 1 7 6
// 2 7 7

// Input: grid = [[3,2,1],[1,7,6],[2,7,7]]
// Output: 1
// Explanation: there is 1 equal row and column pair:
// 		(row 2, column 1): [2,7,7]

import java.util.*;
public class EqualPairs{
	public static int equalPairs(int[][] grid){
		int count = 0;
		HashMap<List<Integer>, Integer> map = new HashMap<>();

		// get row of grid, put them in the hashmap as lists
		for (int r = 0; r < grid.length; r++){
			List<Integer> l = new ArrayList<>();
			for (int c = 0; c < grid.length; c++){
				l.add(grid[r][c]);
			}
			map.put(l, map.getOrDefault(l,0) + 1);
		}

		// get column of grid
		for (int r = 0; r < grid.length; r++){
			List<Integer> l = new ArrayList<>();
			for (int c = 0; c < grid.length; c++){
				l.add(grid[c][r]);
			}
			// check the hashmap 
                        if (map.containsKey(l)){
                                 count += map.get(l);
                        }

		}
		return count;
	}
	public static void main (String[] args){	
		int[][] grid = {{3,2,1},{1,7,6},{2,7,7}};
		System.out.println(equalPairs(grid));

	}
}
