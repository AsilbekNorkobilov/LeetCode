package org.example.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class ConvertAnArrayIntoA2DArrayWithConditions {
    public static void main(String[] args) {
        int[] nums={1,3,4,1,2,3,1};
        List<List<Integer>> res=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> intList=new ArrayList<>();
            for (int j=0; j<nums.length; j++) {
                if (!(nums[j]==-1||intList.contains(nums[j]))){
                    intList.add(nums[j]);
                    nums[j]=-1;
                }
            }
            if (!intList.isEmpty()){
                res.add(intList);
            }
        }
        System.out.println(res);
    }
}
