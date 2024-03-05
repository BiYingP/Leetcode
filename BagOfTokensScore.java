// Bag of Tokens
// Start with an initial power of power, an intinal score of 0, and a bag of tokens given as an iteger array tokens, where each tokens[i] donates the value of token.

// The goal is to maximize the total score by strategically playing these tokens. In one move, you can play an unplayed token in one of the two ways (but not both for the same token):

// Face-up: if you current power is at least tokens[i], you may play token i, losing tokens[i] power and losing 1 score

// Face-down: if your current score is at least 1, you may play token i, gaining token[i] power and losing 1 score.

// Return the maximum possible score you can achieve after playing any number of tokens.

// Example:
// Input: tokens = [100], power = 50
// Output: 0

// Explanation: Since your score is 0 initially, you can not play the token face-down. You also can not play it face-up since your power 50 is less than tokens[0](100).

// Example:
// Input: tokens = [200, 100], power = 150
// Output: 1

// Explanation: Play token 1 (100) face-up, reducing your power to 50 and increasing your score to 1.

// There is no need to play token 0, since you can not play it face-up to add to your score. The maximum score achievable is 1.

import java.util.Arrays;
public class BagOfTokensScore{
	public static int bagOfTokensScore(int[] tokens, int power){
		int max = 0, score = 0;
		int l = 0;
		int r = tokens.length-1;
	
		// sort the tokens array
		Arrays.sort(tokens);

		while (l <= r){
			if (power >= tokens[l]){
				power -= tokens[l];
				score += 1;
				max = Math.max(max, score);
				l++;
			}
			else if (score > 0){
				power += tokens[r];
				score -= 1;
				r--;
			}
			else{
				break;
			}
		}
		return max;	
	}
	public static void main(String[] args){
		int[] tokens = {200, 100};
		int power = 150;
		System.out.println(bagOfTokensScore(tokens, power));
	}
}
