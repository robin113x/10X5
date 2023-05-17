package Array;

public class Q15_MaximumCircularsumsubarray {
    public static int maxCsum(int[]arr){
        if (arr.length==0)return 0;
        int maxSum=kadanes(arr);
        int totalSum=0;
        for (int i = 0; i < arr.length; i++) {
            totalSum+=arr[i];
            arr[i]=arr[i]*(-1);
        }
        int minSum=kadanes(arr);
        if (totalSum+minSum==0)return maxSum;
        return Math.max(maxSum,totalSum+minSum);

    }
    private static int kadanes(int[]arr){
        int sum=arr[0],maxSum=arr[0];
        for (int i=1;i<arr.length;i++){
            sum+=arr[i];
            if (sum<arr[i]){
                sum=arr[i];
            }
            maxSum=Math.max(sum,maxSum);
        }return maxSum;
    }
    public static void main(String[] args) {
        int[]a = {5,-1,5};
        System.out.println(maxCsum(a));
    }
}
