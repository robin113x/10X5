package Array;

public class Q3_MaxSumSubArray {
   public static int maxSubArray(int[]arr){
       int sum=0,max=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
           sum+=arr[i];
           max=Math.max(max,sum);
           if (sum<0){
               sum=0;
           }
       }
       return max;
   }
    public static void main(String[] args) {
        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("Maximum contiguous sum is " + maxSubArray(a));

    }
}
