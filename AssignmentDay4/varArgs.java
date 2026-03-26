package AssignmentDay4;

public class varArgs {
    
    double calculate(double ...numbers)
    {
        double sum=0;
        for(double d:numbers)
        {
            sum+=d;
        }
        return sum/numbers.length;
    }
    public static void main(String[] args) {
        varArgs obj=new varArgs();
        System.out.println(obj.calculate(1,2,3,4));
        System.out.println(obj.calculate(12,3));
    }
}
