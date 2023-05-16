package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q9_moveZeroLast {
    public static void NaiveSol(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0) {
                for (int j = i+1; j < arr.length; j++) {
                        if (arr[j]!=0)
                            swap(arr,i,j);
                }
            }
        }
    }

    public static void moveEnd(int[]arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                swap(arr,i,count);
                count++;
            }
        }
    }
    private static void swap(int[] a,int l,int h){
        int temp=a[l];
        a[l]=a[h];
        a[h]=temp;
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,0,4,5,0,7,0,8};
        System.out.println(Arrays.toString(arr));
       // NaiveSol(arr);
        moveEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
