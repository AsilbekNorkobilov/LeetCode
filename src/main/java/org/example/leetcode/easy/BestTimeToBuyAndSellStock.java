package org.example.leetcode.easy;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices={2,1,4};
        int profit=0;
        int min=Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < min) {
                min = price;
            } else if (price - min > profit) {
                profit = price - min;
            }
        }
        System.out.println(profit);
    }
}
