package Sorting;
import java.util.Arrays;
public class Q3_ChocolateDis {
    public static int sol(int []arr,int m){
        int n = arr.length;
        if (m>n)return -1;
        int res = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < n-m; i++) {
            res = Math.min(res,arr[i+m-1]-arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[]arr = {7, 3, 2, 4, 9, 12, 56};
        int m=3;
        System.out.println(sol(arr,m));
    }
}
