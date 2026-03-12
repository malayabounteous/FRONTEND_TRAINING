package Assignment2_DSA;
import java.util.*;
import java.util.Scanner;

public class _3SUM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        int i=0;
        while(i<n)
        {
           arr[i++]=sc.nextInt();
        }
        Arrays.sort(arr);
        List<ArrayList<Integer>>ans=new ArrayList<>();
        for(int j=0;j<n;++j)
        {
            for(int k=j+1;k<n-1;++k)
            {
                int left=k+1;
                int right=n-1;
                while(left<=right)
                {
                    int mid=(left+right)/2;
                    int sum=arr[j]+arr[k]+arr[mid];
                     if(sum==0)
                     {
                        ArrayList<Integer>l=new ArrayList<>();
                        l.add(arr[j]);
                        l.add(arr[k]);
                        l.add(arr[mid]);
                        if(!ans.contains(l))
                        ans.add(l);
                     }
                    if(sum>0)
                    {
                        right=mid-1;
                    }
                    else
                    {
                        left=mid+1;
                    }
                }
            }
        }

        for(ArrayList<Integer> l:ans)
        {
          System.out.println(l);
        }
    }
}
