package Sorting;

import java.util.Arrays;

public class Q6_MaxGuest {
    public static int maxGuest(int[]arr,int []dept){
        int n = arr.length;
        Arrays.sort(arr);
        Arrays.sort(dept);
       int i=1,j=0,res=1,curr=1;
       while (i<n && j<n){
           if (arr[i]<=dept[j]){
               curr++;
               i++;
           }else {
               curr--;
               j++;
           }
           res = Math.max(res,curr);
       }
           return res;
    }
    public static void main(String[] args) {
        int arr[] = { 900, 600, 700};
        int dep[] = { 1000, 800, 730};
        System.out.println(maxGuest(arr,dep));
    }
}

