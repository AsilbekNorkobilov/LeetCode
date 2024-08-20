package org.example.leetcode.easy;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits={1,9,9};
        boolean all9=true;
        int len = digits.length;
        for (int digit : digits) {
            if (digit != 9) {
                all9 = false;
                break;
            }
        }
        if (all9){
            int[] res=new int[digits.length+1];
            res[0]=1;
            System.out.println(Arrays.toString(res));
            return;
        }
        for (int i = len-1; i >=0; i--) {
            if (digits[i]!=9){
                digits[i]++;
                System.out.println(Arrays.toString(digits));
                return;
            } else if (digits[i]==9) {
                digits[i]=0;
            }
        }
    }
}
