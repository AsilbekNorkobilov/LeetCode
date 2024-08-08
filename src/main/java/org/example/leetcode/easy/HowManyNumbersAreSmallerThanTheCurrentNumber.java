package org.example.leetcode.easy;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        int[] nums={8,1,2,2,3};
        int[] res=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count=0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i]>nums[j]){
                    count++;
                }
            }
            res[i]=count;
        }
        System.out.println(Arrays.toString(res));
    }
}
