package Array;

public class Q10_MaxDiff {
    public static int naiveSol(int[]arr){
        int maxdiff=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                maxdiff=Math.max(maxdiff,arr[j]-arr[i]);
            }
        }
        return maxdiff;
    }
    public static void main(String[] args) {
       int[]arr = {2,3,10,6,4,8,6,11};
        System.out.println(naiveSol(arr));
    }
}
