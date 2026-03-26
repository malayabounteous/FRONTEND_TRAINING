package AssignmentDay4;
import java.util.*;
public class RatInMaze {

    private boolean solve(int[][]maze,int x,int y,int[][]grid)
    {
         if(x<0 || x>=maze.length || y<0 || y>=maze[0].length || maze[x][y]==1)
         {
            return false;
         }
         grid[x][y]=1;
         if(x==maze.length-1 && y==maze.length-1 && maze[x][y]==0)
            return true;
         int[][] dir={{0,1},{1,0},{0,-1},{-1,0}};
          
         for(int i=0;i<4;++i)
         {
            int row=x+dir[i][0];
            int col=y+dir[i][1];
            if(solve(maze,row,col,grid))
                return true;
         }
         grid[x][y]=0;

         return false;
    }
    
    public static void main(String[] args) {
        RatInMaze obj=new RatInMaze();
        int[][]maze={{0,0,1,0},
                     {1,0,1,0},
                     {0,0,1,1},
                     {1,0,0,0}};
        int m=maze.length;
        int n=maze[0].length;
        int[][]grid=new int[m][n];
        obj.solve(maze,0,0,grid);

        for(int i=0;i<m;++i)
        {
             for(int j=0;j<n;++j)
             {
                System.out.print(grid[i][j]+" ");
             }
             System.out.println();
        }

    }
}
