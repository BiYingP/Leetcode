// Dota2 Senate

// In the world of Dota2, there are two parties: the Radiant and the Dire.

// The Dota2senate consist of senators coming from two parties. Now the Senate wants to decide on a change in the Dota2 game. The voting for this change is a round-based procedure. In each round, each senator can exercise one of two rights:

// Ban one senator's right: A senator can make another senator lose all his rights in this and all the following rounds.
// Annouce the victory: If this senator found the senators who still have rights to vote are all from the same party, he can annouce the victory and decide on the change in the game.

// Given a string senate representing each senator's party belonging. The character "R" and "D" represent the Radiant party and Dire party. Then if there are n senators, the size of the given string will be n.

// The round-based procedure starts from the first senator to the last senator in the given order. This procedure will last until the end of voting. All the senators who have lost their rights will be skipped during the procedure. 

// Suppose every senator is smart enough and will play the best strategy for his own party. Predict which party will finally announce the victory and change the Dota2 game. The output should be "Radiant" or "Dire".

// Example:

// Input: senate = "RDD"
// Output: "Dire"

// Explanaton:

// The first senator comes from Radiant and he can just ban the next senator's right in round1.
// The second senator can't exercise any rights anymore since his right has been banned.
// The third senator comes from Dire and he can ban the first senator's right in round 1.
// In round 2, the third senator can just announce the victory since he is the only guy in the senate who can vote.
import java.util.*;

public class PredictPartyVictory{
	public static String solution1(String senate){
		Queue<Integer> r = new LinkedList();
		Queue<Integer> d = new LinkedList();

		for (int i = 0; i < senate.length(); i++){
			if (senate.charAt(i) == 'R'){
				r.add(i);
			}
			else{
				d.add(i);
			}
		}

		while (!r.isEmpty() && !d.isEmpty()){
			int indexR = r.poll();
			int indexD = d.poll();

			if (indexR < indexD){
				r.add(indexR + senate.length());
			}
			else{
				d.add(indexD + senate.length());
			}
		}
		return !r.isEmpty() ? "Radiant" : "Dire";
	}

	public static String solution2(String senate){
		int count = 0;

		for (int i = 0; i < senate.length(); i++){
			if (senate.charAt(i) == 'R'){
				if (count < 0){
					senate += 'D';
				}
				count++;
			}
			else{
				if (count > 0){
					senate += 'R';
				}
				count--;
			}
		}
		return count > 0 ? "Radiant" : "Dire";
	}	
	public static void main(String[] args){
		String senate = "RDD";
		System.out.println(solution1(senate));
		System.out.println(solution2(senate));
	
	}
}
