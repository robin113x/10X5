package Array;

import java.util.Arrays;

public class Q19_Prefix_MaxSubArraySum {
    public static void MaxSumSub(int[]nums){
        int []prefix=new int[nums.length];
        prefix[0]=nums[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i]=prefix[i-1]+nums[i];
        }
        System.out.println(Arrays.toString(prefix));
    }
    public static void main(String[] args) {
        int[]nums={1,-2,6,-1,3};
        MaxSumSub(nums);
    }
}
