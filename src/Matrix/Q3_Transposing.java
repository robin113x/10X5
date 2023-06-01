//package Matrix;

public class Q3_Transposing {
    public static void transpose(int[][]mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void bestSol(int[][]mat){
        printMat(mat);
        int n = mat.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                swap(mat,i,j);
            }
        }
        printMat(mat);
   }

   private static void swap(int[][]mat,int i,int j){
    int temp = mat[i][j];
    mat[i][j] = mat[j][i];
    mat[j][i]=temp;
   }
        
   public static void printMat(int[][]mat){
        System.out.println("*********");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j]+" ");}
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int[][]mat = {{1,2,3},{4,5,6},{7,8,9}};
        //printMat(mat);
        //transpose(mat);
        bestSol(mat);
    }
}
