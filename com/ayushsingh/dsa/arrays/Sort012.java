package com.ayushsingh.dsa.arrays;

import java.util.Arrays;

public class Sort012 {

    static class IdxPair{
        int i;
        int j;

        public IdxPair(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    private static void sort012(int[] arr) {
        IdxPair pair = new IdxPair(0, 0);
        placePointer(arr, pair, 0);
        placeNum(arr, pair, 0);
        pair.j = pair.i;
        placePointer(arr, pair, 1);
        placeNum(arr, pair, 1);
    }

    private static void placeNum(int[] arr, IdxPair pair, int num) {
        while(pair.j < arr.length){
            if(arr[pair.j] == num){
                arr[pair.j] = arr[pair.i];
                arr[pair.i] = num;
                pair.i++;
                if(pair.j == pair.i) placePointer(arr, pair, num);
                continue;
            }
            pair.j++;
        }
    }

    private static void placePointer(int[] arr, IdxPair pair, int num) {
        while(pair.j < arr.length){
            if(arr[pair.j] == num){
                pair.j++;
                continue;
            }
            pair.i = pair.j;
            pair.j++;
            return;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2, 0, 0, 0, 0, 1, 2, 1, 1, 1, 1, 0, 0, 1, 2};
        sort012(arr);
        for(int i : arr) System.out.print(i + " ");
    }
}
