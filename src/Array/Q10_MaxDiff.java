package Array;

public class Q10_MaxDiff {
    public static int naiveSol(int[]arr){
        int maxdiff=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                maxdiff=Math.max(maxdiff,arr[j]-arr[i]);
            }
        }
        return maxdiff;
    }
    public static int bestSol(int[]arr){
        int res=arr[1]-arr[0],minEle=arr[0];

        for (int i = 1; i < arr.length; i++) {
            res = Math.max(arr[i]-minEle,res);
            minEle=Math.min(arr[i],minEle);
        }
        
        return res;
    }
    public static void main(String[] args) {
       int[]arr = {2,3,10,6,4,8,6,11};
       int[]arr2={30,10,8,2};
        System.out.println(naiveSol(arr2));
        System.out.println(bestSol(arr2));
    }
}
