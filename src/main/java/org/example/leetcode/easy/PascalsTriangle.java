package org.example.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int numsRows=5;
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> lastRow=new ArrayList<>();
        for (int i = 0; i < numsRows; i++) {
            List<Integer> row=new ArrayList<>();
            row.add(1);
            if (row.size()==i+1){
                lastRow= new ArrayList<>(row);
                res.add(row);
                continue;
            }
            for (int j = 0; j < lastRow.size()-1; j++) {
                row.add(lastRow.get(j)+lastRow.get(j+1));
            }
            row.add(1);
            lastRow=new ArrayList<>(row);
            res.add(row);
        }
        System.out.println(res);
    }
}
