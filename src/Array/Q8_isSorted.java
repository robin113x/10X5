package Array;

public class Q8_isSorted {
    public static boolean issorted(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j])return false;
            }
        }
        return true;
    }
    public static boolean best(int[]arr){
        for (int i = 1; i<arr.length; i++) {
            if (arr[i]<arr[i-1]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9,10,4};
        System.out.println(issorted(arr));
        System.out.println(best(arr));
    }
}
