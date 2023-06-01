import java.util.*;
class syntax{
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
		disp(mat);

	}
}