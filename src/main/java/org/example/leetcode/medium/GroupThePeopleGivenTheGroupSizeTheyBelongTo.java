package org.example.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupThePeopleGivenTheGroupSizeTheyBelongTo {
    public static void main(String[] args) {
        int[] groupSizes={3,3,3,3,3,1,3};
        List<List<Integer>> res=new ArrayList<>();
        HashMap<Integer,List<Integer>> hmap=new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            if (!hmap.containsKey(groupSizes[i])){
                hmap.put(groupSizes[i],new ArrayList<>());
            }
            List<Integer> intList=hmap.get(groupSizes[i]);
            intList.add(i);
            if (intList.size()==groupSizes[i]){
                res.add(intList);
                hmap.remove(groupSizes[i]);
            }
        }
        System.out.println(res);
    }
}
