package Day3Assignment;

public class StrictPasswordValidator {
    public static void main(String[] args) {
        
        String regex="^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@%$&#]).{8,}$";
        String passwword="Malaya@2004";
        if(passwword.matches(regex))
        {
            System.out.println(passwword+" is valid");
        }
        else{
            System.out.println(passwword+" is not valid");
        }

    }
    
}
