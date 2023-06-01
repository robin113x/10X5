import java.util.*;
class Q4_RotateMat{

	/*Anti-Clock Wise Rotation(Swapping colums)
	Clock-wise Rotation(Swapping Rows)
	*/
	public static void sol(int[][]mat){
		int n = mat.length;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				swap(mat,i,j);
			}
		}
		disp(mat);
		
		//swapping Col ---> Anti-Clock Wise 
		for(int i=0;i<n;i++){
			int low=0,high=n-1;
			while(low<=high){
				int temp = mat[low][i];
				mat[low][i]=mat[high][i];
				mat[high][i]=temp;
				low++;
				high--;
			}
		}
		disp(mat);				

	}


	public static void sol2(int[][]mat){
		int n = mat.length;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				swap(mat,i,j);
			}
		}
		disp(mat);
		
		//swapping Rows ---> Clock Wise 
		for(int i=0;i<n;i++){
			int low=0,high=n-1;
			while(low<=high){
				int temp = mat[i][low];
				mat[i][low]=mat[i][high];
				mat[i][high]=temp;
				low++;
				high--;
			}
		}
		disp(mat);				

	}


	private static void swap(int[][]mat,int i,int j){
		int temp = mat[i][j];
		mat[i][j]=mat[j][i];
		mat[j][i]=temp;
	}

	private static void disp(int[][]mat){
		System.out.println("**********************");
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat.length;j++){
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("**********************");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][]mat = new int[n][n];	
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				mat[i][j]=sc.nextInt();
			}
		}
		//disp(mat);
		//***********CODE******************
		sol(mat);



	}
}