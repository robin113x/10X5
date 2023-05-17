package Array;

public class Q13_MaxOnes {
    public static int maxOnes(int[]arr){
        int count=0;
        int maxCount=0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]==arr[i+1]&&arr[i]==1)count++;
            else{
                maxCount=Math.max(count,maxCount);
                count=0;
            }
        }
        return Math.max(count,maxCount);
    }
    public static void main(String[] args) {

    }
}
