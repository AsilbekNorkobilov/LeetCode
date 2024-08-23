package org.example.leetcode.easy;

import java.util.Arrays;

public class RemoveOneElementToMakeTheArrayStrictlyIncreasing {
    public static void main(String[] args) {
        int[] nums={2,3,1,2};
        int[] newArr=new int[nums.length-1];
        for (int i = 0; i < nums.length; i++) {
            int k=0;
            int counter=0;
            for (int j = 0; j < nums.length; j++) {
                if (i==j){
                    continue;
                }
                newArr[k++]=nums[j];
            }
            for (int q = 0; q < newArr.length-1; q++) {
                if(newArr[q]<newArr[q+1]){
                    counter++;
                }
            }
            if (counter==newArr.length-1){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }

}
