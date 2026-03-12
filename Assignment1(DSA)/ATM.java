import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int balance=10000;
        while(true)
        {
           
            System.out.println("1.CheckBalance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.EXIT");
            boolean exitstatus=false;
             int c=sc.nextInt();
            switch (c) {
                case 1:
                    System.out.println("your balce is ="+balance);
                    break;
                case 2:
                    System.out.println("enter the amount to deposit");
                    int amount=sc.nextInt();
                    balance+=amount;
                    System.out.println("Your balance is ="+balance);
                    break;
                case 3:
                    System.out.println("enter the amount to withdraw");
                    int amount1=sc.nextInt();
                    balance-=amount1;
                    System.out.println("Your balance is ="+balance);
                    break;
                case 4:
                    exitstatus=true;
                    break;
                default:
                    System.out.println("enter the valid option");
            }
            if(exitstatus)
                break;
        }

    }
}
