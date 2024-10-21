package _02_SDE_sheet.day1_arrays;

public class StockBuyandSell {
    public int maxProfit(int[] prices) {
        int buyprice = prices[0];
        int profit = 0;
        int max_profit = 0;
        for(int i=1; i<prices.length; i++) {
            if(prices[i] < buyprice) {
                buyprice = prices[i];
            }
            else {
                profit = prices[i] - buyprice;
                max_profit = Math.max(profit , max_profit);
            }
        }
        return max_profit;
    }
}
