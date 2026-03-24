package Assignment2_DSA;

public class MatrixMultiplication {
    public static void main(String[] args) {
        
        int[][] A={{1,2,3},{4,5,6}};
        int[][] B={{1,2},{3,4},{5,6}};

        int n1=A.length;
        int m1=A[0].length;
        int n2=B.length;
        int m2=B[0].length;
        int[][]mul=new int[n1][m2];
        if(m1!=n2)
        {
            System.out.println("matrix multriplication can not be poosible ");
            return;
        }
         
        for(int i=0;i<n1;++i)
        {
            for(int j=0;j<m2;++j)
            {
                int total=0;
                for(int k=0;k<m1;++k)
                {
                    total+=(A[i][k]*B[k][j]);

                }
                 mul[i][j]=total;
            }
        }


        for(int i=0;i<n1;++i)
        {
            for(int j=0;j<m2;++j)
            {
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }

    }
}
