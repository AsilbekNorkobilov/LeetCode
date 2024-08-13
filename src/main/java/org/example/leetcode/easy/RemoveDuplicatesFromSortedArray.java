package org.example.leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int[] res=new int[nums[nums.length-1]-nums[0]+1];
        HashSet<Integer> set=new HashSet<>();
        int j=0;
        for (int num : nums) {
            if (!set.contains(num)) {
                res[j++] = num;
                set.add(num);
            }
        }
        nums=res;
        System.out.println(Arrays.toString(nums));
        return nums.length;
    }
}
