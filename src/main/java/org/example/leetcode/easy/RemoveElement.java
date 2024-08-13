package org.example.leetcode.easy;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums={3,2,2,3};
        int val=3;
        int[] temp= Arrays.copyOf(nums,nums.length);
        int j=0;
        System.out.println(Arrays.toString(temp));
        for (int i : temp) {
            if (i!=val){
                nums[j++]=i;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
