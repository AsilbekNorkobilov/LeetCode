package org.example.leetcode.medium;

public class MinimumAmountOfTimeToCollectGarbage {
    public static void main(String[] args) {
        String[] garbage = {"G","P","GP","GG"};
        int[] travel = {2,4,3};
        int res = 0;
        int lastG=0;
        int lastM=0;
        int lastP=0;
        for (int i = 0; i < garbage.length; i++) {
            res+=garbage[i].length();
        }
        for (int i = garbage.length-1; i >=0; i--) {
            if (garbage[i].contains("G")){
                lastG=i;
                break;
            }
        }
        for (int i = garbage.length-1; i >0; i--) {
            if (garbage[i].contains("P")){
                lastP=i;
                break;
            }
        }
        for (int i = garbage.length-1; i >0; i--) {
            if (garbage[i].contains("M")){
                lastM=i;
                break;
            }
        }
        for (int i = 1; i < garbage.length; i++) {
            if (i<=lastG){
                res+=travel[i-1];
            }
            if (i<=lastP){
                res+=travel[i-1];
            }
            if (i<=lastM){
                res+=travel[i-1];
            }
        }
        System.out.println(res);
    }
}
