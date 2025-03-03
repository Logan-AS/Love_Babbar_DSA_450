package com.ayushsingh.dsa.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAllSubarrays {
    public static Long subarraySum(ArrayList<Integer> A) {
        long res = 0L;
        for(int i = 0 ; i < A.size() ; i++){
            res += ((long) (i + 1) * (A.size() - i)) * A.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        while(n-- > 0){
            arr.add(scn.nextInt());
        }
        System.out.print(subarraySum(arr));
    }
}
