class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = 0;
        int sell = 0;
        int profit = 0;

        for(int i = 0; i < prices.length - 1; i++){
            if(prices[i] < prices[i + 1]){
                buyPrice = prices[i];
                sell = prices[i + 1];
                profit = profit + (sell - buyPrice);
            }
        }
        
        return profit;
    }
}