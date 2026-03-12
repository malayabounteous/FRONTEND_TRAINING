package Assignment2_DSA;

import java.util.Scanner;

public class BinarySerachRotated {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int[]arr=new int[n];
        int i=0;
        while(i<n)
        {
           arr[i++]=sc.nextInt();
        }
        int left=0;
        int right=n-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(target==arr[mid])
            {
                System.out.println("element found at index "+mid);
                return;

            }
            if(arr[left]<=arr[mid])
            {
                if(target<arr[left])
                {
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
            else{
                if(target>arr[right])
                {
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }

            }
             
        }
         System.out.println("element not found");
    }
}
