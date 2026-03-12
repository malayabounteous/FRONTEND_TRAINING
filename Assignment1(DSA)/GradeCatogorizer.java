import java.util.Scanner;

public class GradeCatogorizer {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter youe peracentage result");
        int percentage=sc.nextInt();
        if(percentage<0 ||percentage>100)
        {
            System.out.println("INvalid percentage");
        }
        else if(percentage>=90)
        {
            System.out.println("Grade is A");
        }
        else if(percentage>=80)
        {
            System.out.println("Grade is B");
        }
        else if(percentage>=70)
        {
            System.out.println("Grade is C");
        }
        else if(percentage>=60)
        {
            System.out.println("Grade is D");
        }
        else
        {
            System.out.println("Grade is F");
        }
    }
}
