package Matrix;

public class Q1_Passing {
    public static void print(int[][]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][]arr = {{1,2,3,4},{5,6,7,8},{9,6,3,2}};
        print(arr);
    }
}
