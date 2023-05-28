package Sorting;
public class Q1_CountInversion {
    public static int sol(int[]arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j])count++;
            }
        }
        return count;
    }

    public static int sol(int[]arr,int low,int high){
        int res=0;
        if (low<high){
            int mid = low+(high-low)/2;
            res+=sol(arr,low,mid);
            res+=sol(arr,mid+1,high);
            res+=CountAndInverse(arr,low,mid,high);
        }return res;
    }

    public static int CountAndInverse(int[]arr,int low,int mid,int high){
        int res=0;
        int n=mid-low+1,m=high-mid;
        int[]left = new int[n];
        int[]right = new int[m];
        for (int i = 0; i < n; i++) {
            left[i]=arr[low+i];
        }
        for (int i = 0; i < m; i++) {
            right[i]=arr[mid+1+i];
        }

        int i=0,j=0,k=low;
        while (i<n && j<m){
            if (left[i]<=right[j]){
                arr[k++]=left[i++];
            }else {
                arr[k++]=right[j++];
                res=res+(n-1);
            }
        }
        while (i<n){
            arr[k++]=left[i++];
        }
        while (j<m){
            arr[k++]=right[j++];
        }
        return res;
    }

    public static void main(String[] args) {
        int[]arr = {2,4,1,3,5};
        System.out.println(sol(arr));
        System.out.println("*********************");
        System.out.println(sol(arr,0, arr.length-1));
    }
}
