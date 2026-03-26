package AssignmentDay4;

public class Palindrome {

    private boolean isPalindrome(String s,int start,int end)
    {
        if(start>end)return true;
        if(s.charAt(start)!=s.charAt(end))
            return false;
        return isPalindrome(s, start+1, end-1);
    }
    public static void main(String[] args) {
        Palindrome obj=new Palindrome();
        String s="malam";
        System.out.println(obj.isPalindrome(s, 0, s.length()-1));
    }
}
