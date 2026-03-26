package AssignmentDay4;

public class TowerOfHanoi {
    private void solve(int n,char s,char a,char d)
    {
        if(n==1)
        {
            System.out.println("move disk 1 from "+ s +" to "+d);
            return;
        }
        solve(n-1,s,d,a);
        System.out.println("move disk"+ n +" from "+ s+" to "+d);

        solve(n-1,a,s,d);
    }


    public static void main(String[] args) {
        
        TowerOfHanoi obj=new TowerOfHanoi();
        obj.solve(3, 'S', 'A', 'D');
    }
    
}
