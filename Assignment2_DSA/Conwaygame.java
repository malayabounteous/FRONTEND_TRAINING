package Assignment2_DSA;

public class Conwaygame {
    public static void main(String[] args) {
        
        int[][]state={{0,1,0,1,0},
                      {1,0,1,0,1},
                      {1,0,0,0,0},
                      {1,1,1,0,1}};
       int[]r={-1,-1,-1,0,0,1,1,1};
       int[]c={-1,0,1,-1,1,-1,0,1};
        
       int n=state.length;
       int m=state[0].length;
       int[][]nextState=new int[n][m];
       for(int i=0;i<n;++i)
       {
        for(int j=0;j<m;++j)
        {
            int cntDead=0;
            int cntAlive=0;

            for(int k=0;k<8;++k)
            {
                int row=r[k]+i;
                int col=c[k]+j;
                if(row>=0 && row<n && col>=0 && col<m )
                {
                    if(state[row][col]==0)
                        cntDead++;
                    else
                        cntAlive++;
                }
               
            }
            if(state[i][j]==1 && cntAlive<2)
                 nextState[i][j]=0;
            else if(state[i][j]==1 && (cntAlive==2 || cntAlive==3))
                nextState[i][j]=1;
            else if(state[i][j]==1 && cntAlive>3)
                nextState[i][j]=0;
            else if(state[i][j]==0 && cntAlive==3)
                nextState[i][j]=1;

        }
       }

       for(int i=0;i<n;++i)
       {
        for(int j=0;j<m;++j)
        {
            System.out.print(nextState[i][j]+" ");
        }
        System.out.println();
       }



    }
}
