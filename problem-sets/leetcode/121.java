class Solution {
    public int maxProfit(int[] prices) {
        int i = 0, j = 0, profit = 0;
        // Sliding Window
        while (j < prices.length) {
            if (prices[j] < prices[i]) i = j++;
            else {
                profit = Math.max(profit, prices[j] - prices[i]);
                j++;
            }
        }
        return profit;
    }
}