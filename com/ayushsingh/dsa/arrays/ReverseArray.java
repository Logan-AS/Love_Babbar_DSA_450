package com.ayushsingh.dsa.arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};
        reverseArr(arr);
        for(int a : arr) System.out.println(a);
    }

    private static void reverseArr(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] += arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i] - arr[arr.length - i - 1];
            arr[i] -= arr[arr.length - i - 1];
        }
    }
}
