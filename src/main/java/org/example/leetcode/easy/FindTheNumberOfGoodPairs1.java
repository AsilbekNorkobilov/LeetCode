package org.example.leetcode.easy;

public class FindTheNumberOfGoodPairs1 {
    public static void main(String[] args) {
        int[] nums1={5,18};
        int[] nums2={6,9};
        int k=2;
        int res=0;
        for (int value : nums1) {
            for (int i : nums2) {
                if (value % (i * k) == 0 && value >= i * k) {
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
