package Searching;

public class Q3_LastOcc {
    public static int lastOcc(int[]arr,int x){
        int low=0,high= arr.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if (arr[mid]>x)high=mid-1;
            else if(arr[mid]<x)low=mid+1;
            else{
                if (mid==arr.length-1 || arr[mid]!=arr[mid+1])return mid;
                else low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr={2,3,3,3,4,5,6,7,8,9};
        System.out.println(lastOcc(arr,2));
    }
}
