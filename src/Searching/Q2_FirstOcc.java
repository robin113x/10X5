package Searching;

public class Q2_FirstOcc {
    public static int firstOcc(int[]arr,int x){
        int low=0,high= arr.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>x)high=mid-1;
            else if (arr[mid]<x) low=mid+1;
            else {
                if (mid==0 || arr[mid]!=arr[mid-1])return mid;
                else high=mid-1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr = { 2,3,4,4,4,5,6,7,8,9};
        System.out.println(firstOcc(arr,19));
    }
}
