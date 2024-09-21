package org.example.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        boolean res=false;
        Map<Integer,Integer> counter=new HashMap<>();
        for (int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
            if (counter.get(num) == 2) {
                res = true;
            }
        }
        System.out.println(res);

    }
}
