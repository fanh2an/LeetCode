public class TransposeMatrix_867 {

    public int[][] transpose(int[][] A) {
        if(A==null)
            return A;
        int m = A.length;
        int n = A[0].length;

        int [][]B = new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                B[i][j]=A[j][i];
        return B;
    }
}
