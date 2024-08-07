package org.example.leetcode.easy;

import java.util.Arrays;

public class LeftAndRightSumDifferences {
    public static void main(String[] args) {
        int[] nums={10,4,8,3};
        int len = nums.length;
        int[] left=new int[len];
        int[] right=new int[len];
        int[] res=new int[len];
        int sum=0;
        for (int i = 0; i < len; i++) {
            sum+=nums[i];
        }
        int temp=sum;
        for (int i = 0; i < len; i++) {
            right[i]=sum-nums[i];
            sum-=nums[i];
            left[len-1-i]=temp-nums[len-1-i];
            temp-=nums[len-1-i];
        }
        for (int i = 0; i < len; i++) {
            res[i]=Math.abs(left[i]-right[i]);
        }
        System.out.println(Arrays.toString(right));
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(res));
    }
}
