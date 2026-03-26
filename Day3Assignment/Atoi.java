package Day3Assignment;

public class Atoi {

    private int atoi(String s)
    {
        int n=s.length();
        int ans=0;
        int i=0;
        while(i<n && s.charAt(i)==' ')
            i++;
        boolean neg=false;
        if(s.charAt(i)=='-')
            neg=true;
        i++;
        while(i<n && Character.isDigit( s.charAt(i)))
        {
           int t=s.charAt(i)-'0';
           ans=ans*10+t;
           i++;
        }
        if(neg)
            ans*=-1;
        return ans;
    }
    public static void main(String[] args) {
        
        String s="   -88392a67";
        Atoi obj=new Atoi();
      System.out.println(obj.atoi(s));
    }
    
}
