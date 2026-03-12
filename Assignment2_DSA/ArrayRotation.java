package Assignment2_DSA;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[]arr=new int[n];
        int i=0;
        while(i<n)
        {
           arr[i++]=sc.nextInt();
        }
        i=0;
        int j=n-1;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        i=0;
        j=k-1;
         while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        i=k;
        j=n-1;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        for(int el:arr)
        {
            System.out.print(el+" ");
        }


    }
}
