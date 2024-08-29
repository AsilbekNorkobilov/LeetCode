package org.example.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public static void main(String[] args) {
        int numRows=3;
        List<Integer> lastRow=new ArrayList<>();
        for (int i = 0; i < numRows+1; i++) {
            List<Integer> row=new ArrayList<>();
            row.add(1);
            if (row.size()==i+1){
                lastRow= new ArrayList<>(row);
                continue;
            }
            for (int j = 0; j < lastRow.size()-1; j++) {
                row.add(lastRow.get(j)+lastRow.get(j+1));
            }
            row.add(1);
            lastRow=new ArrayList<>(row);
        }
        System.out.println(lastRow);
    }
}
