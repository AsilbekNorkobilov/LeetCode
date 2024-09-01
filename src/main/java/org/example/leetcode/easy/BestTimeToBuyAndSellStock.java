package org.example.leetcode.easy;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices={2,1,4};
        int profit=0;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i]<min){
                min=prices[i];
            }else if (prices[i]-min>profit){
                profit=prices[i]-min;
            }
        }
        System.out.println(profit);
    }
}
