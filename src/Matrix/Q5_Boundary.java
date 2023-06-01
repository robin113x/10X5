import java.util.*;
class Q5_Boundary{
	public static void sol(int[][]mat){
		int row=mat.length;
		int col = mat[0].length;
		System.out.println(row+" "+col);
	}


	private static void disp(int[][]mat){
		System.out.println("**********************");
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
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][]mat = new int[n][m];	
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				mat[i][j]=sc.nextInt();
			}
		}
		disp(mat);
		//***********CODE******************



	}
}