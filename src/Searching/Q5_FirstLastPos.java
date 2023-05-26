package Searching;

public class Q5_FirstLastPos {
    public static int[] searchRange(int[]arr,int x){
        int low=0,high= arr.length-1;
        int fistocc = firstOcc(arr,x,low,high);
        if (fistocc==-1)return new int[]{-1,-1};
        int lastocc= lastOcc(arr,x,low,high);
        return new int[]{fistocc,lastocc};
    }
    private static int firstOcc(int[]arr,int x,int low,int high){
        if (low>high)return -1;
        int mid=low+(high-low)/2;
        if (arr[mid]>x)return firstOcc(arr,x,low,mid-1);
        else if(arr[mid]<x)return firstOcc(arr,x,mid+1,high);
        else {
            if (mid==0|| arr[mid]!=arr[mid-1])return mid;
            else return firstOcc(arr,x,low,mid-1);
        }
    }
    private static int lastOcc(int[]arr,int x,int low,int high){
        if (low>high)return -1;
        int mid=low+(high-low)/2;
        if (arr[mid]>x)return lastOcc(arr,x,low,mid-1);
        else if(arr[mid]<x)return lastOcc(arr,x,mid+1,high);
        else {
            if (mid==arr.length-1|| arr[mid]!=arr[mid+1])return mid;
            else return lastOcc(arr,x,mid+1,high);
        }
    }
    public static void main(String[] args) {
        int[]arr = {1,2,2,2,3,4,5,6,7,8,9};
        int[]arr2=searchRange(arr,2);
        for(int x : arr2)
            System.out.print(x+" ");
    }
}
