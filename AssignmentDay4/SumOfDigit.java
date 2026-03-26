package AssignmentDay4;

public class SumOfDigit {
    
    private int  sum(int n)
    {
        if(n==0)return 0;
        int ans=0;
        ans+=n%10+sum(n/10);
        return ans;

    }
    public static void main(String[] args) {
        
        SumOfDigit obj=new SumOfDigit();

        int ans=obj.sum(1234);
        System.out.println(ans);
    }
}
