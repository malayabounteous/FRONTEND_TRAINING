import java.util.Scanner;

public class VowelSwitch {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        char  ch=sc.next().charAt(0);

        switch(ch){
            case 'A':
            case 'a':
                System.out.println("VOWEL A");
                break;
            case 'E':
            case 'e':
                System.out.println("VOWEL E");    
                break;
            case 'I':
            case 'i':
                System.out.println("VOWEL I");
                break;
            case 'O':
            case 'o':
                System.out.println("VOWEL O");  
                break;
            case 'U':
            case 'u':
                System.out.println("VOWEL U");
                break; 
            default:
                System.out.println("its s consonant");    
              
              
        }


    }
}
