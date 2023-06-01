import java.util.*;
class Q5_Boundary{
	public static void sol(int[][]mat){
		int row=mat.length;
		int col = mat[0].length;
		if(row==1){
			for(int i=0;i<col;i++){
				System.out.print(mat[row-1][i]+" ");
			}
		}
		else if(col==1){
			for(int i=0;i<row;i++){
				System.out.print(mat[i][col-1]+" ");
			}
		}
		else{
			int srow=0,erow =row-1, scol=0,ecol=col-1; 
			for(int i=0;i<=ecol;i++){
				System.out.print(mat[srow][i]+" ");
			}
			srow++;
			for(int i=srow;i<=erow;i++) {
				System.out.print(mat[i][ecol]+" ");
			}
			ecol--;
			for(int i=ecol;i>=scol;i--){
				System.out.print(mat[erow][i]+" ");
			}
			erow--;
			for(int i=erow;i>=srow;i--){
				System.out.print(mat[i][scol]+" ");
			}
		}
	}


	private static void disp(int[][]mat){
		System.out.println("******DISPLAY*****");
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
		sol(mat);


	}
}