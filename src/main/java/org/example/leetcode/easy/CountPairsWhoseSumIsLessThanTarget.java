package org.example.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class CountPairsWhoseSumIsLessThanTarget {

    public static void main(String[] args) {
        int target=2;
        List<Integer> nums=new ArrayList<>(List.of(-1,1,2,3,1));
        int res=0;
        for (int i = 0; i < nums.size()-1; i++) {
            for (int j = i+1; j < nums.size(); j++) {
                if (nums.get(i)+nums.get(j)<target){
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
