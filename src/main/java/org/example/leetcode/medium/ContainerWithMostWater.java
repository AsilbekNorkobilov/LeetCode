package org.example.leetcode.medium;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        int res=0;
        int l=0;
        int r=height.length-1;
        while(r>l){
            int maxHeight=Math.min(height[r],height[l]);
            int maxLen=r-l;
            res=Math.max(res,maxHeight*maxLen);
            if (height[r]>height[l]){
                l++;
            }else{
                r--;
            }
        }
        System.out.println(res);
    }
}
