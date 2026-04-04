package MISC;
interface I1 {
    void method1();
    int x=10;//public static final by default
    default void method2()
    {
        System.out.println("Hello from default method");
    }
}

class C12 implements I1{
    public void method1()
    {
        System.out.println("Hello from method1");
    }
    public void method2()//override default method
    {
        System.out.println("Hello from overridden default method");
    }

}

public class QN11 {
    public static void main(String[] args) {
        I1 obj1=new C12();
        obj1.method1();
        obj1.method2();
        System.out.println(obj1.x);
    }
}
