package Searching;
/*
RObin H00d
 */
public class Q12_AllocateMinPg {
    public static int sol(int []arr,int k){
        int n=arr.length;
        if (k>n)return -1;
        int sum = sumAll(arr);
        int maxPg = findMxPg(arr);
        int low=maxPg,high=sum;
        int res=0;
        while (low<=high){
            int mid = low+(high-low)/2;
            if (isValid(arr,k,mid)){
                res=mid;
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return res;
    }

    private static boolean isValid(int[]arr,int k,int mxPg){
        int student=1;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if (sum>mxPg){
                student++;
                sum=arr[i];
            }if (student>k)return false;
        }return true;
    }

    private static int sumAll(int[]arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }return sum;
    }
    private static int findMxPg(int[]arr){
        int maxPg = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxPg = Math.max(maxPg,arr[i]);
        }return maxPg;
    }
    public static void main(String[] args) {
        int arr[] = { 12, 34, 67, 90 }; // Number of pages in books
        int k = 2;
        System.out.println(sol(arr,k));
    }
}
