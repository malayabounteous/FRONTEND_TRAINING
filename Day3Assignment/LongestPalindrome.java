package Day3Assignment;

public class LongestPalindrome {
    private   String findLongest(String s,int i,int j)
    {
          int n=s.length();
          
          while(i>=0 && j<n && s.charAt(i)==s.charAt(j))
          {
             i--;
             j++;
          }

          return s.substring(i+1,j);
    }
    
    private String answer(String s)
    {
        int n=s.length();
        String longest="";
        for(int i=0;i<n;++i)
        {
            String t1=findLongest(s,i,i);
            String t2=findLongest(s, i, i+1);

            if(t1.length()>longest.length())
                longest=t1;
            if(t2.length()>longest.length())
                longest=t2;
        }
        return longest;

    }
    public static void main(String[] args) {
        
        String s="hkjamalalamjksmjkdjjjalkl";
        
        LongestPalindrome obj=new LongestPalindrome();

        String ans=obj.answer(s);
        System.out.println(ans);
        

    }
    
}
