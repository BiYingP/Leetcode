# Flood Fill

An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.

You are also given three integers, sr, sc, and color. You should perform a flood fill on the image starting from the pixel image[sr][sc].

To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connectd 4-directionally to those pixels (also with the same color), and so on. Replace the color of all the aforementioned pixels with color.

Return the modified image after performing the flood fill.

Example


![title](image/image.png)


Input: image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, color = 2

Output: [[2,2,2],[2,2,0],[2,0,1]]

Explanation: From the center of the image with position (sr, sc) = (1,1)(i.e, the red pixel), all pixels connected by a path of the same color as the starting pixel (i.e, the blue pixels) are colored with the new color. 

Note: the bottom corner is not colored 2, because it is not 4-directionally connected to the starting pixel.


    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) {
            return image;
        }
        dfs(image, sr, sc, image[sr][sc], color);
        
        return image;
    }
    public void dfs(int[][] image, int sr, int sc, int color, int newColor){
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != color){
            return;
        }
        
        image[sr][sc] = newColor;

        dfs(image, sr+1, sc, color, newColor);
        dfs(image, sr-1, sc, color, newColor);
        dfs(image, sr, sc+1, color, newColor);
        dfs(image, sr, sc-1, color, newColor);
        
//         int[][] d = {{1,0}, {-1,0}, {0,1},{0,-1}};
        
//         for (int i = 0; i < 4; i++){
//             dfs(image, sr+d[i][0], sc+d[i][1], color, newColor);
//         }
    }
