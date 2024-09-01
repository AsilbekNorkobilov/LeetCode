package org.example.leetcode.easy;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        int res=0;
        for (int i = 0; i < prices.length-1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if (prices[j]-prices[i]>res){
                    res=prices[j]-prices[i];
                }
            }
        }
        System.out.println(res);
    }
}
