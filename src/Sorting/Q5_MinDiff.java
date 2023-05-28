package Sorting;

import java.util.Arrays;

public class Q5_MinDiff {
    public static int sol(int[]arr){
        int res=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            res=Math.min(res,arr[i+1]-arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[]arr = {1, 5, 3, 19, 18, 25};
        System.out.println(sol(arr));
    }

}
