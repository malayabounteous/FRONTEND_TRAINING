package Day3Assignment;

public class RunLengthEncoding {

    String answer(String s)
    {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        int left=0;
        for(int i=1;i<n;++i)
        {
            if(s.charAt(i-1)!=s.charAt(i))
            {
               sb.append(s.charAt(i-1));
               sb.append(i-left);
               left=i;
            }
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        
        String s="mammmsjfjjfhelllsst";
        RunLengthEncoding obj=new RunLengthEncoding();

        String answer=obj.answer(s);
       System.out.println(answer);


    }
}
