package Assignment2_DSA;

public class Minesweeper {
    public static void main(String[] args) {

        char[][] mine = {{ 'M', 'E', 'E', 'M', 'M' },
                        { 'E', 'E', 'M', 'E', 'E' },
                        { 'E', 'M', 'M', 'M', 'M' },
                        { 'M', 'E', 'M', 'M', 'E' }};


                        int n=mine.length;
                        int m=mine[0].length;
       int[][]cnt=new int[n][m];
       int[]r={-1,-1,-1,0,0,1,1,1};
       int[]c={-1,0,1,-1,1,-1,0,1};

       // (0,0)->(0,-1),(0,1),(-1,0),(1,0),(-1,-1),(-1,1),(1,-1),(1,1);
       for(int i=0;i<n;++i)
       {
        for(int j=0;j<m;++j)
        {
            if(mine[i][j]=='M')
                continue;

            int cur=0;
            for(int k=0;k<8;++k)
            {

                int row=r[k]+i;
                int col=c[k]+j;
                if(row>=0 && row<n && col>=0 && col<m && mine[row][col]=='M')
                cur++;
            }
            cnt[i][j]=cur;

        }
       }

 for(int i=0;i<n;++i)
       {
        for(int j=0;j<m;++j)
        {
         System.out.print(cnt[i][j]+" ");
        }
        System.out.println();
       }
       
    }
}
