package Assignment2_DSA;

import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args) {
        
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

        int n=matrix.length;
        int m=matrix[0].length;
        int top=0,left=0,right=m-1,down=n-1;

        List<Integer>l=new ArrayList<>();
        int dir=0;
        while(top<=down && left<=right)
        {
            int i=left;
            while(i<=right)
            {
                l.add(matrix[top][i]);
                i++;
            }
            top++;
            i=top;
            while(i<=down)
            {
                l.add(matrix[i][right]);
                i++;
            }
            right--;
            i=right;
            while(i>=left)
            {
                l.add(matrix[down][i]);
                i--;
            }
            down--;
            i=down;
            while(i>=top)
            {
                l.add(matrix[i][left]);
                i--;
            }
            left++;
        }

        for(Integer i:l)
        {
            System.out.print(i +" ");
        }


    }
    
}
