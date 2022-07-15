package practiseCoding;

public class BuyAndSellStocks2 {
    class Solution {
        public int maxProfit(int[] prices) {
            int min = prices[0], max = prices[0], profit = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] < prices[i-1]) {
                    profit += max - min;
                    min = prices[i];
                }max = prices[i];
            }return profit + max - min;
        }
    }}
