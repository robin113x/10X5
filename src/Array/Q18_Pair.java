package Array;

public class Q18_Pair {
    public static void Pairs(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (i!=j)
                    System.out.print(" ("+arr[i]+","+arr[j]+") ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[]arr = {2,4,6,8,10};
        Pairs(arr);
    }
}
/*
Total no of Pairs = n(n-1)/2 --> n=no of elements
 */
