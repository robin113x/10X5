package Searching;
public class Q11_MedianSortedArr {
    public static double sol(int[]arr1,int[]arr2){
        int n=arr1.length,m=arr2.length;
        int[]temp = new int[n+m];
        int i,j,k;
        i=j=k=0;
        while (i<n && j<m){
            if (arr1[i]<arr2[j]){
                temp[k]=arr1[i];
                i++;
                k++;
            }else {
                temp[k]=arr2[j];
                j++;
                k++;
            }
        }
        while (i<n){
            temp[k]=arr1[i];
            i++;
            k++;
        }
        while (j<m){
            temp[k]=arr2[j];
            j++;
            k++;
        }
        if ((m+n)%2!=0)
            return (double)temp[(m+n)/2];
        else
            return (double) (temp[(m+n)/2]+temp[((m+n)/2)-1])/2;
    }

    public static double sol2(int[]arr1,int[]arr2){
        if (arr1.length>arr2.length){
            return sol2(arr2,arr1);
        }
        int lenA = arr1.length;
        int lenB = arr2.length;
        int low=0,high=lenA;
        while (low<=high){
            int PartA = (low+high)/2;
            int PartB = ((lenA+lenB+1)/2 )-PartA;

            int maxLeftA = PartA==0?Integer.MIN_VALUE:arr1[PartA-1];
            int minRightA = PartA==lenA?Integer.MAX_VALUE:arr1[PartA];

            int maxLeftB = PartB==0?Integer.MIN_VALUE:arr2[PartB-1];
            int minRightB = PartB==lenB?Integer.MAX_VALUE:arr2[PartB];

            if (maxLeftA<=minRightB && minRightA>=maxLeftB){
                if ((lenA+lenB)%2==0)
                    return (double) (Math.max(maxLeftB,maxLeftA)+Math.min(minRightA,minRightB))/2;
                else
                    return (double) Math.max(maxLeftB,maxLeftA);
            } else if (maxLeftA>minRightB) {
                high=PartA-1;
            }else {
                low=PartA+1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[]arr1={1,3,5,7,9};
        int[]arr2={2,4,6,8,10};
        System.out.println(sol(arr1,arr2));
    }
}
