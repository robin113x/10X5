import java.util.*;
class Q7_SearchMatrix{

	public static boolean Search(int[][]mat,int x){
		int row=mat.length,col=mat[0].length;
		int i=0,j=col-1;
		while( i<row && j>=0 ){
			if(mat[i][j]==x) return true;
			else if(mat[i][j]>x) j--;
			else i++;
		}
		return false;
	}


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

		int val = sc.nextInt();

		disp(mat);
		//***********CODE******************

		System.out.println(Search(mat,val));

	}
}