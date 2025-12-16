package org.striver.step3.lec1;

public class BuySellStock {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
        int profit = 0, min = prices[0];
        for(int i=1;i<prices.length;i++){
            int cost = prices[i] - min;
            profit = Math.max(profit,cost);
            min = Math.min(min,prices[i]);
        }
        return profit;
    }
}
