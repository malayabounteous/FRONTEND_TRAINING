package AssignmentDay4;

public class GeneratePowerSet {
    
    public void generate(String s,String sub,int i)
    {
        if(i==s.length()){
            System.out.println(sub);
            return;
        }
        generate(s, sub, i+1);
        generate(s, sub+s.charAt(i), i+1);
        

    }
    public static void main(String[] args) {
        GeneratePowerSet obj=new GeneratePowerSet();

        obj.generate("abc", "", 0);
    }
}
