package com.company;

import java.util.ArrayList;

public class Main {
    public static final void swap (int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 7, 7, 6, 7, 8, 8, 7, 7, 7, 0};
        int iter = nums.length - 1;
        int i = 0;
        while (i < iter) {
            //System.out.print(i + " ");
            //System.out.print(iter + "    ");
            if (nums[i] == 7) {
                swap(nums, i, iter);
                while (nums[iter] == 7) {
                    iter -= 1;
                }
            }
            i += 1;

        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 7) {
                System.out.print(nums[j]);
            }
        }
    }
}
