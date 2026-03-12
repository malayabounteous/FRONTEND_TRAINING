package Assignment2_DSA;

import java.util.Scanner;

public class TrappingRainWater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        int i=0;
        while(i<n)
        {
           arr[i++]=sc.nextInt();
        }
        
        int trap=0;
        int maxi=arr[0];
        int temp=0;
        for(int j=1;j<n;++j)
        {
           if(maxi>arr[j])
           {
            temp+=(maxi-arr[j]);
           }
           else{
             trap+=temp;
             temp=0;
             maxi=arr[j];
           }

        }
        temp=0;
        maxi=arr[n-1];
        for(int j=n-2;j>=0;--j)
        {
           if(maxi>arr[j])
           {
            temp+=(maxi-arr[j]);
           }
           else{
             trap+=temp;
             temp=0;
             maxi=arr[j];
           }

        }
        System.out.println("trap water ="+trap);


    }
}
