package com.ayushsingh.dsa.arrays;

public class MoveNegativeOneSide {

    static class IdxPair{
        int i;
        int j;

        public IdxPair(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    private static void moveNegativeOneSide(int[] arr) {
        Sort012.IdxPair pair = new Sort012.IdxPair(0, 0);
        placePointer(arr, pair, 0);
        placeNum(arr, pair, 0);
    }

    private static void placeNum(int[] arr, Sort012.IdxPair pair, int num) {
        while(pair.j < arr.length){
            if(arr[pair.j] < num){
                arr[pair.j] += arr[pair.i];
                arr[pair.i] = arr[pair.j] - arr[pair.i];
                arr[pair.j] -= arr[pair.i];
                pair.i++;
                if(pair.j == pair.i) placePointer(arr, pair, num);
                continue;
            }
            pair.j++;
        }
    }

    private static void placePointer(int[] arr, Sort012.IdxPair pair, int num) {
        while(pair.j < arr.length){
            if(arr[pair.j] < num){
                pair.j++;
                continue;
            }
            pair.i = pair.j;
            pair.j++;
            return;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2 ,-1, 3, -5, 6, -8, 9, -11, -13, -6};
        moveNegativeOneSide(arr);
        for(int i : arr) System.out.print(i + " ");
    }

}
