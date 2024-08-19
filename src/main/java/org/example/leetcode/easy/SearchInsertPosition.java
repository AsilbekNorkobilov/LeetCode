package org.example.leetcode.easy;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums={1};
        int target=0;
        int res=nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target){
                res=i;
                break;
            } else if (nums[i] > target) {
                res=i;
                break;
            }
        }
        System.out.println(res);
    }
}
