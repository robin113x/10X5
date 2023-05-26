package Searching;

public class Q8_SearchSortedRotaed {
    public static int search(int[]arr,int x){
        int low=0,high=arr.length-1;
        while (low<=high){
            int mid= low+(high-low)/2;
            if (arr[mid]==x)return mid;
            if (arr[mid]>arr[low]){
                if (x>arr[low]&& x<arr[mid])
                    high=mid-1;
                else
                    low=mid+1;
            }else {
                if (arr[mid]<x && arr[high]>x){
                    low=mid+1;
                }else high=mid-1;
            }
        }
      return -1;
    }
    public static void main(String[] args) {
        int[]arr = {5,6,7,8,9,10,1,2,3,4};
        System.out.println(search(arr,7));
    }
}
