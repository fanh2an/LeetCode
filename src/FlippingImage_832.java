public class FlippingImage_832 {
    public int[][] flipAndInvertImage(int[][] A) {
        int n = A.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=(n-1)/2;j++)
            {
                int temp = A[i][j];
                A[i][j]= A[i][n-1-j];
                A[i][n-1-j] = temp;

            }

            for(int j=0;j<n;j++)
                A[i][j]= 1-A[i][j];
        }
        return A;
    }
}
