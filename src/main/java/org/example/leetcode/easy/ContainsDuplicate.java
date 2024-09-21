package org.example.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        boolean res=false;
        Map<Integer,Integer> counter=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            counter.put(nums[i],counter.getOrDefault(nums[i],0)+1);
            if (counter.get(nums[i])==2){
                res=true;
            }
        }
        System.out.println(res);

    }
}
