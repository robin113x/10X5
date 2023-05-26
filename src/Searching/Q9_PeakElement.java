package Searching;

public class Q9_PeakElement {
    public static int peak(int[]arr){
        int low=0,high=arr.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if (mid!=0 || mid!=arr.length-1){
                if (arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1])
                    return mid;
                else if (arr[mid+1]>arr[mid]) {
                    low=mid+1;
                }else high=mid-1;
            } else if (mid==0 ) {
                if (arr[mid]>arr[mid+1])return mid;
                else return mid+1;
            }
            else if (mid==arr.length-1){
                if (arr[mid]>arr[mid-1])return mid;
                else return mid-1;
            }
        }return -1;
    }
    public static void main(String[] args) {
       int[]arr={0,1,0 };
        System.out.println(peak(arr));
    }
}
