package org.example.leetcode.easy;

import java.util.Arrays;

public class MaximumProductDifferenceBetweenTwoPairs {
    public static void main(String[] args) {
        int[] nums={4,2,5,9,7,4,8};
        Arrays.sort(nums);
        int w=nums[0];
        int x=nums[1];
        int y=nums[nums.length-1];
        int z=nums[nums.length-2];
        System.out.println(y*z-w*x);
    }
}
