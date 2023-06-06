// Matrix Diagonal Sum

// Given a square matrix mat, return the sum of the matrix diagonals.

// Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

// Example:
// Input: mat = [[1,2,3],
//		 [4,5,6],
//		 [7,8,9]]

// Output: 25
// Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
// Notice that element mat[1][1] = 5 is counted only once.

public class DiagonalSum{

	// Time Complexity: O(n^2) Space Complexity: O(1)
	public static int solution1(int[][] mat){
		
		int res = 0;
		for (int i = 0; i < mat.length; i++){
			for (int j = 0; j < mat.length; j++){
				if (i == j || j == mat.length-1-i){
					res += mat[i][j];
				}
			}
		}
		return res;
		
	}
	
	// Time Complexity: O(n) Space Complexity: O(1)
	public static int solution2(int[][] mat){
		int res = 0;
		for (int i = 0; i < mat.length; i++){
			res += mat[i][i];
			res += mat[i][mat.length-1-i];
		}
		if (mat.length % 2 != 0){
			return res = res - mat[mat.length / 2][mat.length / 2];
		}
		return res;
	}
	
	// Time Complexity: O(n) Space Complexity: O(1)
	public static int solution3(int[][] mat){
		int res = 0;
		int l = 0;
		int r = mat.length-1;

		for (int i = 0; i < mat.length; i++){
			if(l == r){
				res += mat[i][l];
			} 
			else{
				res += mat[i][l] + mat[i][r];
			}
			l++;
			r--;
		}
		return res;
	}
	public static void main(String[] args){
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};

		System.out.println(solution1(mat));
		System.out.println(solution2(mat));
		System.out.println(solution3(mat));
	}
}
