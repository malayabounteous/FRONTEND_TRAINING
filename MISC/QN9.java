package MISC;
class P1{
     int x=10;
    P1 get()
    {
        return this;
    }
}
class C11 extends P1{
     int x=20;
    C11 get()
    {
        return this;
    }
}
public class QN9 {
    public static void main(String[] args) {
        
        P1 obj1=new C11();
        System.out.println(obj1.get().x);
        System.out.println(((C11)obj1).x);
    }
}
