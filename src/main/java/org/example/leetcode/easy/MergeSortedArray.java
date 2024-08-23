package org.example.leetcode.easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};

        int m=3;
        int n=3;
        int j=0;
        int len = nums1.length;
        for (int i = m; i < len; i++) {
            if (j<n){
                nums1[i]=nums2[j++];
            }
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
