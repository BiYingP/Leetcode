// Can Place Flowers

// You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots

// Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed whithout violating the no-adjacent-flowers rule and false otherwise.

// Example
// Input: flowerbed = [1,0,0,0,1], n = 1
// Output: true

// Example
// Input: flowerbed = [1,0,0,0,1], n = 2
// Output: false


public class CanPlaceFlowers{
	public static boolean solution(int[] flowerbed, int n){
		for (int i = 0; i < flowerbed.length && n > 0; i++){
			if (flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length-1 || flowerbed[i+1] == 0)){
				i++; // increment i after each time a place for a flower is found
				n--;
			}
		}
		return n == 0;
	}
	public static void main(String[] arg){
		int[] flowerbed = {1,0,0,0,1};
		int n = 1;
		System.out.println(solution(flowerbed, n));
	}

}
