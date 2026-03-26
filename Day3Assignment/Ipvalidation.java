package Day3Assignment;

public class Ipvalidation {
    public static void main(String[] args) {
        
        String regex="^(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}$";

        String ip="123.34.56.78";

        if(ip.matches(regex))
        {
            System.out.println(ip+" is valid");
        }
        else{
            System.out.println(ip+" is not valid");
        }



    }
}
