package Assignment2_DSA;
import java.util.Scanner;

public class DutchFlag {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt0=0,cnt1=0,cnt2=0;
        int k=n;

        while(k>0)
        {
          int t=sc.nextInt();
          if(t==0)cnt0++;
          else if(t==1)cnt1++;
          else if(t==2)cnt2++;
          k--;
        }
        int[]arr=new int[n];
        int i=0;
        while(i<n && cnt0>0)
        {
          arr[i++]=0;
          cnt0--;
        }
        while(i<n && cnt1>0)
        {
          arr[i++]=1;
          cnt1--;
        }
        while(i<n && cnt2>0)
        {
          arr[i++]=2;
          cnt2--;
        }
        for(int l=0;l<n;++l)
        {
            System.out.print(arr[l]+" ");
        }
        sc.close();
    }
}
