import java.util.Scanner;

public class Fobonacci {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int cnt=0;
        int prev1=0;
        int prev2=1;
        System.out.print(prev1+"  "+prev2+"  ");
        while(cnt<n)
        {
            int x=prev1+prev2;
           System.out.print(x+"  ");
           prev1=prev2;
           prev2=x;
           cnt++;
        }
    }
}
