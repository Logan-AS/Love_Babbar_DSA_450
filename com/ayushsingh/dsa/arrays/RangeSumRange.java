package com.ayushsingh.dsa.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class RangeSumRange {
    public static long[] rangeSumRange(int[] A, int[][] B){
        int[] pf = new int[A.length];
        pf[0] = A[0];
        for(int i = 1 ; i < A.length ; i++){
            pf[i] = pf[i - 1] + A[i];
            System.out.print(pf[i] + " ");
        }
        System.out.println();
        long[] res = new long[B.length];
        int i = 0;
        for(int[] query : B){
            int l = query[0], r = query[1];
            res[i] = pf[r] - (l == 0 ? 0 : pf[l - 1]);
            System.out.println("l: " + (l == 0 ? 0 : pf[l - 1]) + " r: " + pf[r]);
            i++;
        }
        return res;
    }

    public static ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Long> res = new ArrayList<>();
        long[] pf = new long[A.size()];
        pf[0] = A.get(0);
        for(int i = 1 ; i < A.size() ; i++){
            pf[i] = pf[i - 1] + A.get(i);
        }
        for(ArrayList<Integer> query : B){
            int L = query.get(0), R = query.get(1);
            if(L == 0) res.add(pf[R]);
            else res.add(pf[R] - pf[L - 1]);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), i = 0;
        int[] arr = new int[n];
        while(i < n){
            arr[i] = scn.nextInt();
            i++;
        }
        int qSize = scn.nextInt();
        int[][] queries = new int[qSize][2];
        i = 0;
        while(i < qSize){
            queries[i][0] = scn.nextInt();
            queries[i][1] = scn.nextInt();
            i++;
        }
        for(long a : rangeSumRange(arr, queries)){
            System.out.print(a + " ");
        }
    }
}
