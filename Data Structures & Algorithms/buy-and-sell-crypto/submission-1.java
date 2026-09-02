class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int maxProfit = 0;

        for (int r = 1; r < prices.length; r++){
            if (prices[l] < prices[r]) {
                int currProfit = prices[r] - prices[l];
                if (currProfit > maxProfit) {
                    maxProfit = currProfit;
                }
            } else {
                l = r;
            }
        }

        
        return maxProfit;
    }
}
