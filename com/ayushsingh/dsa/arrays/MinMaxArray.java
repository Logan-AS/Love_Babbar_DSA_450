package com.ayushsingh.dsa.arrays;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        minMaxArr(arr);
    }

    private static void minMaxArr(int[] arr) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i : arr){
            if(i < min) min = i;
            if(max < i) max = i;
        }
        System.out.println("Min: " + min + " Max: " + max);
    }
}
