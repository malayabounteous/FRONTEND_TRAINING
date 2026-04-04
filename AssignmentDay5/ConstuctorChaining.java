package AssignmentDay5;

class Employee{
    private int id;
    private String name;
    private String  department;
    private double salary;


    public Employee(int id,String name,String department,double salary)
    {
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
    public Employee(int id,String name)
    {
        this(id,name,"unassigned",0.0);
    }
    
    public String toString()
    {
        return "Id="+this.id+" name="+this.name+" dept="+this.department+" salary ="+this.salary;
    }
}
 



public class ConstuctorChaining {
    
    public static void main(String[] args) {
        
        Employee e1=new Employee(123, "chandan sahu");
        
        System.out.println(e1.toString());

    }
}
