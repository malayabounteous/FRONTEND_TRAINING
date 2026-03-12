import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year;
        System.out.println("Eneter the year ");
        year=sc.nextInt();
        if(year%4==0)
        {
            if(year%100==0)
            {
                System.out.println(year+" is not a leap year");
                return;
            }
            else{
                System.out.println(year+" is leap year");
                return;
            }
        }
        System.out.println(year+" is not a leap year");

    }
}