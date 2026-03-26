package Day3Assignment;

import java.util.Stack;

public class ValidParenthesis {

    private boolean answer(String s)
    {
        Stack<Character>st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;++i)
        {
            if(s.charAt(i)=='('|| s.charAt(i)=='{'||s.charAt(i)=='[')
                st.push(s.charAt(i));
            else{
                
                 if(s.charAt(i)==')' && st.peek()!='(')
                    return false;
                else if(s.charAt(i)=='}'&& st.peek()!='{')
                    return false;
                else if(s.charAt(i)==']' && st.peek()!='[')
                    return false;
                st.pop();
            }
        }
        if(!st.empty())return false;
        return true;
    }
    public static void main(String[] args) {
        
        String s="(({})){}[[]]";
       ValidParenthesis obj=new ValidParenthesis();

       System.out.println(obj.answer(s));
       
    }
}
