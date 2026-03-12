import java.util.Scanner;

public class PasswordPrompt {
    public static void main(String[] args) {
        
        String password="Malaya";
        Scanner sc=new Scanner(System.in);
         String guess="";
         boolean correct=false;
        do{
            System.out.println("Guess the password ");
           guess=sc.next();
           if(guess.equals(password))
           {
            System.out.println("Access Granted");
            break;
           }
        }
        while(!correct);
        
        sc.close();
    }
}
