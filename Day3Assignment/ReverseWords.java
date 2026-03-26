package Day3Assignment;

public class ReverseWords {


    private String answer(String s)
    {
         s=s.strip();
         int n=s.length();
         StringBuilder sb=new StringBuilder();
         int i=n-1;
         while(i>=0)
         {
            
            while(i>=0 && s.charAt(i)==' ')
                i--;
            int t=i;
            while(i>=0 && s.charAt(i)!=' ')
                i--;
            if(i+1<=t){
            sb.append(s.substring(i+1,t+1));
            sb.append(" ");
            }
         }

         return sb.toString();

    }
    public static void main(String[] args) {
        ReverseWords obj=new ReverseWords();
        String s="malaya sahu chnadan kumar prabir sahu ";
        
        System.out.println(obj.answer(s));

    }
}
