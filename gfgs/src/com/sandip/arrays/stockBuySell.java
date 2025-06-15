package com.sandip.arrays;

//find the max Profit of Stock Price Buy and Sell
public class stockBuySell {
    public static void main(String[] args) {
        int[] price = {1, 5, 3, 8, 12};
//        maxProfit(price, 0, 4);
//        System.out.println(maxProfit(price, 0, 5));
        System.out.println(maxProfitMethod2(price));
    }

    static int maxProfit(int[] price, int start, int end) {
        if (end <= start) {
            return 0;
        }
        int profit = 0;
        for (int i = start; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (price[j] > price[i]) {
                    int curr_profit = price[j] - price[i] + maxProfit(price, start, i - 1) + maxProfit(price, j + 1, end);
                    profit = Math.max(profit, curr_profit);
                }

            }
        }
        return profit;
    }

    static int maxProfitMethod2(int[] price) {
        int profit = 0;
        for (int i = 1; i < price.length; i++) {
            if (price[i] > price[i - 1]) {
                profit = profit + price[i] - price[i - 1];

            }
        }
        return profit;
    }
}
