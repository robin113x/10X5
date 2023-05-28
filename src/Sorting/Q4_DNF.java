package Sorting;

import java.util.Arrays;

public class Q4_DNF {
    public static void sol(int[]arr){
        int low=0,mid=0,high= arr.length-1;
        while (mid<=high){
            if (arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if (arr[mid]==1){
                mid++;
            }else {
                swap(arr,mid,high);
                high--;
            }
        }
    }
    private static void swap(int[]arr,int low,int high){
        int temp = arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
    }
    public static void main(String[] args) {
        int[]arr = {1,0,2,1,0,2,2,0,0,0,1,1,0,2,1,1,0,0,2};
        System.out.println(Arrays.toString(arr));
        sol(arr);
        System.out.println(Arrays.toString(arr));
    }
}
