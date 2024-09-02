package org.example.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums={4,2,1,1,2};
        int res=0;
        Map<Integer,Integer> counter=new HashMap<>();
        for (int num : nums) {
            counter.put(num,counter.getOrDefault(num,0)+1);
        }
        for (Integer i : counter.keySet()) {
            if (counter.get(i)==1){
                res=i;
            }
        }
        System.out.println(res);

    }
}
