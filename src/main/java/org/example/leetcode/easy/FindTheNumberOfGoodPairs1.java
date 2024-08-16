package org.example.leetcode.easy;

public class FindTheNumberOfGoodPairs1 {
    public static void main(String[] args) {
        int[] nums1={5,18};
        int[] nums2={6,9};
        int k=2;
        int res=0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i]%(nums2[j]*k)==0&&nums1[i]>=nums2[j]*k){
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
