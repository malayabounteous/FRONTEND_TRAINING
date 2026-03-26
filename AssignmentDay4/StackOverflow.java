package AssignmentDay4;

public class StackOverflow {

    private void print(int n)
    {
        System.out.println(n);
        print(n+1);
    }
    public static void main(String[] args) {
        
        StackOverflow bj=new StackOverflow();
        bj.print(0);
    }
    
}
