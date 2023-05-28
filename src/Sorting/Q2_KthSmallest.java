package Sorting;

import java.util.Arrays;

public class Q2_KthSmallest {
    public static int kthsmallest(int[]arr,int k){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr[arr.length-1-k+1];
    }
    public static void main(String[] args) {
        int[]arr = {2,5,9,7,1,5,6,3};
        System.out.println(kthsmallest(arr,3));
    }
}
