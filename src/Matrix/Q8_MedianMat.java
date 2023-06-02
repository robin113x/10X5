import java.util.*;
class Q8_MedianMat{

	public static int median(int[][]mat){
		int row=mat.length,col=mat[0].length;
		int max = mat[0][col-1];
		int min = mat[0][0];
		for(int i=1;i<row;i++){
			max = Math.max(max,mat[i][col-1]);
			min = Math.min(min,mat[i][0]);
		}
		int diserdPost = (row*col+1)/2;
		while(min<max){
			int count=0;
			int mid = min+(max-min)/2;
			for(int i=0;i<row;i++){
				count+=bSearch(mat[i],mid);
			}
			if(count<diserdPost)min=mid+1;
			else max=mid;
		}
		return min;
	}
	private static int bSearch(int[]arr,int x){
		int low=0,high=arr.length-1;
		while(low<=high){
			int mid=low+(high-low)/2;
			if(arr[mid]<=x)low=mid+1;
			else high=mid-1;
		}return low;
	}
	


	//**************************************************
	private static void disp(int[][]mat){
		System.out.println("***Display*****");
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[i].length;j++){
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("**********************");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][]mat = new int[row][col];	
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				mat[i][j]=sc.nextInt();
			}
		}
		disp(mat);
		//***********CODE******************
		System.out.println(median(mat));


	}
}