import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;++i)
        {
            int space=n-i-1;
            int star=2*i+1;
            for(int j=0;j<space/2;++j)
                System.out.print(" ");
            for(int j=0;j<star;++j)
            {
                System.out.print('*');
            }
            for(int j=0;j<space/2;++j)
                System.out.print(" ");
            System.out.println();
        }
    }
}
