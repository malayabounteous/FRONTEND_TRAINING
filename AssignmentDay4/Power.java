package AssignmentDay4;

public class Power {

    private int calculate(int x,int n)
    {
        if(n==0)return 1;

        int ans=0;
        if(n%2==0)
            ans=calculate(x, n/2)*calculate(x, n/2);
        else
            ans=x*calculate(x, n/2)*calculate(x, n/2);

        return ans;
    }
    public static void main(String[] args) {
        
        Power obj=new Power();
        System.out.println(obj.calculate(4, 5));
    }
}
