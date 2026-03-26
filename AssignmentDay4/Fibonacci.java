package AssignmentDay4;

public class Fibonacci {
    
    private int find(int n){
        if(n==0 || n==1)
            return n;
        return find(n-1)+find(n-2);
    }

    public static void main(String[] args) {
        
        Fibonacci obj=new Fibonacci();

        System.out.println(obj.find(10));
    }
}
