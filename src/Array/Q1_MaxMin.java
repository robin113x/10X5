package Array;

public class Q1_MaxMin {
    public static int[] maxMin(int[]arr){
        int max=arr[0],min=arr[0];
        for(int i=1;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            min=Math.min(min,arr[i]);
        }
        return new int[]{max,min};
    }
    public static void main(String[] args) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int[]res = maxMin(arr);
        for(int i:res){
            System.out.println(i);
        }
    }
}
