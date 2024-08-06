package org.example.leetcode.easy;

import java.util.Arrays;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int sum=0;
        int len = nums.length;
        int[] res=new int[len];
        for (int i = 0; i < len; i++) {
            sum+=nums[i];
        }
        res[len-1]=sum;
        for (int i = 0; i < len-1; i++) {
            res[len-2-i]=sum-nums[len-1-i];
            sum-=nums[len-1-i];
        }
        System.out.println(Arrays.toString(res));

    }
}
