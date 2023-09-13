// Kids with the Greatest Number of Candies

// There are n kids with candies. Given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

// Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

// Note that multiple kids can have the greatest number of candies.

// Example:
// Input: candies = [2,3,5,1,3], extraCandies = 3
// Output: [true, true, true, false, true]
// Explanation: if you give all extraCandies to 
// kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids
// kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids
// kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids
// kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids
// kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids

// Example:
// Input: candies = [12,1,12], extraCandies = 10
// Output: [true,false,true]

import java.util.*;
public class KidsWithCandies{
	public static List<Boolean> solution(int[] candies, int extraCandies){
		List<Boolean> res = new ArrayList<Boolean>();
		// find the kid with the greatest candies
		int max = candies[0];
		for (int i = 0; i < candies.length; i++){
		if(candies[i] > max){
				max = candies[i];
			}
		}

		for (int i = 0; i < candies.length; i++){
			if(candies[i] + extraCandies >= max){
				res.add(true);
			}else{
				res.add(false);
			}
		}
		return res;	
	}

	public static void main(String[] arg){
		int[] candies = {2,3,5,1,3};
		int extraCandies = 3;
		System.out.println(solution(candies, extraCandies));
	}
}

