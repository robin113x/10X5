package Array;

public class Q16_MajorityElement {
    public static int nSol(int[]arr){
        int res=0;
        int idx=-1;
        for (int i = 0; i <arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    count++;

                }
            }
            if (count>res){
                res=count;
                idx=i;
            }
        }
        System.out.println(idx);
        if (res>(arr.length)/2) return arr[idx];
        else
            return -1;
    }
    public static void main(String[] args) {
        int A[]={3, 3, 4};
        System.out.println(nSol(A));

    }
}
