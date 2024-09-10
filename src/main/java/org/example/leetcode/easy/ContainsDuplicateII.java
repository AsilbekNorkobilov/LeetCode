package org.example.leetcode.easy;

import java.util.HashMap;
import java.util.Map;


public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        int k=3;
        boolean res=false;
        Map<Integer,Integer> counter=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (counter.containsKey(nums[i])){
                if (i-counter.get(nums[i])<=k){
                    res=true;
                }
            }
            counter.put(nums[i],i);
        }
        System.out.println(k);
        System.out.println(res);
    }
}
