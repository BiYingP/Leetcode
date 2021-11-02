Jumping On the Clouds (Souce: HackerRank)

In the game, the player will get an array of clouds numbered 0 if they are safe or 1 if they must be avoided

Example

Input

C = [0,0,1,0,0,1, 0]

Output

4

Explanation

The player must avoid c[2] and c[5]. The game can be won with minimum of 4 jumps


    public static int jumpingOnClouds(List<Integer> c) {
    // Write your code here
    int num_jumps = 0;
    int i = 0;
    while(i < c.size()-1){
        if (i+2 < c.size() && c.get(i+2) == 0){
            i+=2;
            num_jumps++;
        }
        else{
            i++;
            num_jumps++;
        }
    }
    return num_jumps;
    }
}
