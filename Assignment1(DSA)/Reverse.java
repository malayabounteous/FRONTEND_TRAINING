import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int org=n;
        while(n>0)
        {
            int rem=n%10;
            rev=rev*10 +rem;
            n/=10;
        }
        if(rev==org)
        System.out.println("number is palindrome");
        else
            System.out.println("number is not palindrome");
    }
}
