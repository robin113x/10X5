package Array;

import java.util.Arrays;

public class Q5_ChoclateDis {
    public static int minDiff(int[]arr,int m){
        int minDiff = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i+m-1 <arr.length; i++) {
            int diff = arr[i+m-1]-arr[i];
            minDiff=Math.min(diff,minDiff);
        }return minDiff;
    }
    public static void main(String[] args) {
        int arr[] = { 12, 4,  7,  9,  2,  23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50 };

        int m = 7; // Number of students
        System.out.println(minDiff(arr,m));

    }
}
