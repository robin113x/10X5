package Searching;

public class Q7_SearchINinfinite {
    public static int search(int[]arr,int x){
        if (arr[0]==x) return 0;
        int i=1;
        while (arr[i]<x){
            if (arr[i]==x)return i;
            i=i*2;
        }if (arr[i]==x) return i;
       return binarySearch(arr,(i/2)+1,i,x);
    }

    private static int binarySearch(int[] arr, int low, int high, int x) {
        while (low<=high){
            int mid=low+(high-low)/2;
            if (arr[mid]==x)return mid;
            else if(arr[mid]>x) high=mid-1;
            else low=mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
