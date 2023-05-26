package Searching;

public class Q6_SqRoot {
    public static int sqRoot(int x){
        int i=1;
        while (i*i<=x){
            i++;
        }return -1;
    }
    public static int SqRoot(int x){
        int low=1,high=x,ans=-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if (mid*mid==x)return mid;
            else if(mid*mid>x)high=mid-1;
            else {
                low=mid+1;
                ans=mid;
            }
        }return ans;
    }
    public static void main(String[] args) {

    }
}
