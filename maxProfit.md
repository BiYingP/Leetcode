# Best Time to Buy and Sell Stock

You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.


### Example:

**Input:** prices = [7,1,5,3,6,4]

**Output:** 5

**Explanation:** Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.


    public int maxProfit(int[] prices) {
        int profit = 0;
        int min_price = Integer.MAX_VALUE;
        // System.out.print(min_price);
        for (int i = 0; i < prices.length; i++){
            if(prices[i] < min_price){
                 min_price = prices[i]; 
            }else if(prices[i] - min_price > profit){
                 profit = prices[i] - min_price;
            }
            
           
        }
        return profit;
    }

Two Pointer Approach

	public int maxProfit(int[] prices){
		int profit = 0;
		int max_profit = 0;
		int left = 0; // left pointer
		int right = 0; // right pointer

		while (right < prices.length){
			if (prices[right] > prices[left]){
				profit = prices[right] - prices[left];
				max_profit = Math.max(max_profit, profit);
			}
			else{
				left = right;
			}
			right++;
		}
		return max_profit;
	}

