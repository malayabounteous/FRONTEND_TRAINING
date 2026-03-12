package Assignment2_DSA;

import java.util.Scanner;

public class Kadanes {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        int i=0;
        while(i<n)
        {
           arr[i++]=sc.nextInt();
        }
        int maxsum=0;
        int sum=0;
        for(int j=0;j<n;++j)
        {
           sum+=arr[j];
           maxsum=Math.max(maxsum,sum);
           if(sum<0)
            sum=0;

        }
        System.out.println("Max sum is="+maxsum);
    }
    
}
