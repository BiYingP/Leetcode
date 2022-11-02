# Number of Islands

Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

Example:

Input: grid = [

  ["1","1","1","1","0"],

  ["1","1","0","1","0"],

  ["1","1","0","0","0"],

  ["0","0","0","0","0"]

]

Output: 1


Example 2:

Input: grid = [

  ["1","1","0","0","0"],
 
  ["1","1","0","0","0"],
 
  ["0","0","1","0","0"],
 
  ["0","0","0","1","1"]

]


    public int numIslands(char[][] grid) {
        int count = 0;
        for (int r = 0; r < grid.length; r++){
            for (int c = 0; c < grid[r].length; c++){
                if (grid[r][c] == '1'){
                    dfs(grid, r, c);
                    count+=1;
                }
            }
        }
        return count;
    }
    public void dfs(char[][] grid, int r, int c){
        if(r < 0 || c < 0 || r >= grid.length || c >= grid[r].length || grid[r][c] == '0'){
            return;
        }
        grid[r][c] = '0';
        dfs(grid, r+1, c);
        dfs(grid, r-1, c);
        dfs(grid, r, c+1);
        dfs(grid, r, c-1);
    }	
