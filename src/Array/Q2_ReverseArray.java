package Array;

import java.util.Arrays;

public class Q2_ReverseArray {
    public static void reverse(int[]arr){
        int temp[] = new int[arr.length];
        int j=0;
        for(int i= arr.length-1;i>=0;i--){
            temp[j]=arr[i];
            j++;
        }

        for(int i=0;i< arr.length;i++){
            arr[i]=temp[i];
        }
    }

    public static void BestSol(int[]arr){
        int low=0,high=arr.length-1;
        while (low<high){
            swap(arr,low,high);
            low++;
            high--;
        }
    }
    private static void swap(int[]arr,int low,int high){
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Best Solution***");
        BestSol(arr);
        System.out.println(Arrays.toString(arr));
    }
}
