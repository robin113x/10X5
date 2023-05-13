package Array;

public class Q6_SearchInRoatedArray {
    public static int search(int[]arr,int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x)return i;
        }return -1;
    }

    public static int bestSol(int[]arr,int x){
        int low=0,high=arr.length-1;
        while (low<=high){
            int mid = low+(high-low)/2;
            if (arr[mid]==x)return mid;

            if (arr[mid]>=arr[low]){
                if (x>=arr[low] && x<arr[mid]){
                    high=mid-1;
                }else {
                    low=mid+1;
                }
            }
            else{
                if(x>arr[mid] && x<=arr[high]){
                    low=mid+1;
                }else {
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr = {4,5,6,7,0,1,2};
        System.out.println(bestSol(arr,0));
    }
}
