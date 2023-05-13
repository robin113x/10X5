package Array;

import java.util.Arrays;

public class Q4_ContainDublicates {
    public static boolean conainDublicats(int[]arr){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j])return true;
            }
        }
        return false;
    }

    public static boolean bestSol(int[]arr){
        Arrays.sort(arr);
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]==arr[i+1])return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[]a={1,1,1,3,3,4,3,2,4,2};
        int[]b={1,2,3,4,5,6,7};
        System.out.println(conainDublicats(b));
        System.out.println(bestSol(a));
        System.out.println(bestSol(b));
    }
}
