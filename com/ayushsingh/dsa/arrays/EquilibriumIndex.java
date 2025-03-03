package com.ayushsingh.dsa.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class EquilibriumIndex {
    public static int equilibriumIndex(int[] A){
        int[] pf = new int[A.length];
        pf[0] = A[0];
        for(int i = 1 ; i < A.length ; i++){
            pf[i] = pf[i - 1] + A[i];
        }
        int eqIdx = -1;
        for(int i = 0 ; i < pf.length ; i++){
            int lSum, rSum;
            if(i == 0) lSum = 0;
            else lSum = pf[i - 1];
            if(i == A.length - 1) rSum = 0;
            else rSum = pf[A.length - 1] - pf[i];
            if(rSum == lSum && eqIdx == -1) eqIdx = i;
        }
        return eqIdx;
    }

    public int solve(ArrayList<Integer> A) {
        int[] pf = new int[A.size()];
        pf[0] = A.get(0);
        for(int i = 1 ; i < A.size() ; i++){
            pf[i] = pf[i - 1] + A.get(i);
        }
        for(int i = 0 ; i < pf.length ; i++){
            int l,r;
            l = (i == 0) ? 0 : pf[i - 1];
            r = (i == pf.length - 1) ? 0 : pf[pf.length - 1] - pf[i];
            if(l == r) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), i = 0;
        int[] arr = new int[n];
        while(i < n){
            arr[i] = scn.nextInt();
            i++;
        }
        System.out.println(equilibriumIndex(arr));
    }
}
