package MISC;
import java.util.*;
import java.util.stream.Collectors;

class Emp{
    int id;
     String name;
     double salary;
     public Emp(int id,String name,double salary)
     {
        this.id=id;
        this.name=name;
        this.salary=salary;
     }
}
public class QN13 {
    
    public static void main(String[] args) {
        
        List<Emp> emplist=new ArrayList<>();
        emplist.add( new Emp(1,"malaya",500000));   
        emplist.add( new Emp(2,"Sahu",400000));
        emplist.add( new Emp(3,"chandan",300000));
        emplist.add( new Emp(4,"suman",200000));


        Map<Integer,Emp> map=emplist.stream().collect(Collectors.toMap(e->e.id,e->e));
        
        for(Map.Entry<Integer,Emp> entry:map.entrySet())
        {
            System.out.println("ID: "+entry.getKey()+" Name: "+entry.getValue().name+" Salary: "+entry.getValue().salary);
        }


    }
}
