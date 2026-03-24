package StreamAssignment;

import java.util.*;

public class Qn2 {
    public static void main(String[] args) {

        List<String> logs = new ArrayList<>();
        logs.add("error_404");
        logs.add("error_500");
        logs.add("");
        logs.add("warning_disk");
        logs.add("");
        logs.add("error_timeout");
        logs.add(null);
        logs.add("info_shutdown");
        logs.add(null);
        logs.add("403");
        
        //qn1
        List<String>result=logs.stream().filter(s->{
            if(s==null)return false;
            if(s=="")return false;
            return true;
        }).toList();
        System.out.println(result);
        
        //qn2
        
        logs.stream().map(e->{

            try{
                return Integer.parseInt(e);
            }
            catch(Exception f){

            }
            return null;
        }).filter(i->i!=null).forEach(System.out::print);

    }
}
