package AssignmentDay4;

public class CallStackPrinter {
    
    private void countDown(int n)
    {
        if(n==0)return;

        System.out.print(n+" ");
        countDown(n-1);
    }
    private void countUp(int n)
    {
        if(n==0)return;
        countUp(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        
        CallStackPrinter obj=new CallStackPrinter();
        obj.countDown(10);
        System.out.println();
        obj.countUp(10);
    }
}
