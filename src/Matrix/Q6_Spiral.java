import java.util.*;
class Q6_Spiral{
	public static List<Integer> sol(int[][]mat){	
		List<Integer>li = new ArrayList<Integer>();					
		int row=mat.length,col=mat[0].length;
		int srow=0,erow=row-1,scol=0,ecol=col-1;
		while(srow<=erow && scol<=ecol){
			for(int i=scol;i<=ecol;i++){
				System.out.print(mat[srow][i]+" ");
				li.add(mat[srow][i]);
			}srow++;
			for(int i=srow;i<=erow;i++){
				System.out.print(mat[i][ecol]+" ");
				li.add(mat[i][ecol]);
			}ecol--;
			if(srow<=erow){
				for(int i=ecol;i>=scol;i--){
					System.out.print(mat[erow][i]+" ");
					li.add(mat[erow][i]);
				}erow--;
			}
			if(scol<=ecol){
				for(int i=erow;i>=srow;i--){
					System.out.print(mat[i][scol]+" ");
					li.add(mat[i][scol]);
				}scol++;
			}
		}
		return li;
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
		List<Integer>li = sol(mat);
		System.out.println("#################");
		for(int x:li){
			System.out.print(x+" ");
		}

	}
}