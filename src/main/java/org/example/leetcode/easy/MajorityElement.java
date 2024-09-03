package org.example.leetcode.easy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums={3,2,3};
        int currentValue=0;
        int res=0;
        Map<Integer,Integer> counter=new HashMap<>();
        for (int num : nums) {
            counter.put(num,counter.getOrDefault(num,0)+1);
        }
        for (Integer key : counter.keySet()) {
            if (counter.get(key)>currentValue){
                currentValue=counter.get(key);
                res=key;
            }
        }
        System.out.println(res);
    }
}
