package com.ayushsingh.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static int[] rotateArrayExtraSpace(int[] A, int B){
        int[] res = new int[A.length];
        for(int i = 0 ; i < A.length ; i++){
            res[(i + B) % A.length] = A[i];
        }
        return res;
    }

    public static int[] rotateArrayConstantSpace(int[] A, int B){
        int[] res = new int[A.length];
        for(int i = 0 ; i < A.length ; i++){
            res[(i + B) % A.length] = A[i];
        }
        return res;
    }

    public static ArrayList<Integer> rotateArrayConstantSpace(ArrayList<Integer> A, int B){
        if(B > A.size()) B %= A.size();
        reverse(A, 0, A.size() - 1);
        reverse(A, 0, B - 1);
        reverse(A, B, A.size() - 1);
        return A;
    }

    public static void reverse(int[] A, int S, int E){
        while(S < E){
            A[S] = A[S] ^ A[E];
            A[E] = A[S] ^ A[E];
            A[S] = A[S] ^ A[E];
            S++;
            E--;
        }
    }

    public static void reverse(ArrayList<Integer> A, int S, int E){
        while(S < E){
            A.set(S, A.get(S) ^ A.get(E));
            A.set(E, A.get(S) ^ A.get(E));
            A.set(S, A.get(S) ^ A.get(E));
            S++;
            E--;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), i = 0;
        int[] arr = new int[n];
        while(i < n){
            arr[i] = scn.nextInt();
            i++;
        }
        int r = scn.nextInt();
        for(int a : rotateArrayConstantSpace(arr, r)){
            System.out.print(a + " ");
        }
    }
}
