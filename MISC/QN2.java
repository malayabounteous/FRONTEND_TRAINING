package MISC;

public class QN2 {
    public static void main(String[] args) {
        
        String s1="Hello";
        System.out.println(s1);
        s1.concat(" world");//s1 is immutable
        System.out.println(s1);

        Integer a=456;// check with a=12(-128,127)
        Integer b=456;// check with b=12(-128,127)
        System.out.println(a==b);
    }
}
