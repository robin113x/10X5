import java.util.*;
class syntax{




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



	}
}