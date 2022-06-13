class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 2)
            return 0;
        int l = 0, r = 1, max = 0;
        while (r < prices.length) {
            int profit = prices[r] - prices[l];
            if (profit > 0) {
                if (profit > max)
                    max = profit;
            } else {
                l = r;
            }
            r++;
        }
        return max;
    }
}