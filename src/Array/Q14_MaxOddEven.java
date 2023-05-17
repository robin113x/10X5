package Array;

public class Q14_MaxOddEven {
    public static int maxCount(int[]arr){
        int longest=1;
        int count=1;
        for (int i = 0; i < arr.length-1; i++) {
            if ((arr[i]+arr[i+1])%2==1)count++;
            else {
                longest=Math.max(count,longest);
                count=1;
            }
        }
        longest=Math.max(longest,count);
        if (longest==1)return 0;
        return longest;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 3, 7, 2, 9, 4 };
        System.out.println(maxCount(arr));
    }
}
