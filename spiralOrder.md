# Spiral Matrix

Given an m x n matrix, return all elements of the matrix in spiral order.


Example:

![image](image/image15)


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]

Output: [1,2,3,6,9,8,7,4,5]


	public List<Integer> spiralOrder(int[][] matrix){
		int left = 0;
		int right = matrix[0].length - 1;
		int top = 0;
		int bottom = matrix.length - 1;

		List<Integer> res = new ArrayList();

		while (left <= right && top <= bottom){
			// left to right
			for (int i = left; i <= right; i++){
				res.add(matrix[top][i];
			}
			top++;

			// top to bottom
			for (int i = top; i <= bottom; i++){
				res.add(matrix[i][right];
			}
			right--;

			// right to left
			if (top <= bottom){
				for (int i = right; i >= left; i--){
					res.add(matrix[bottom][i];
				}
				bottom--;
			}
			// bottom to top
			if (left <= right){
				for (int i = bottom; i >= top; i--){
					res.add(matrix[i][left];
				}
				left++;
			}
		}
		return res;
	} 
       
Time Complexity: O(m*n) Space Complexity: O(1) 
