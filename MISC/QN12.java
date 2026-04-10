package MISC;
class C13{
    
    public void method1()
    {
        System.out.println("Hello from method1");
    }
   // abstract void method2();
}
class D13 extends C13{
    int x=10;
    public void method1()
    {
        System.out.println("Hello from overridden method1");
    }
}
public class QN12 {
    public static void main(String[] args) {
        C13 obj1=new D13();
        obj1.method1();
        System.out.println(obj1.x);
    }
    
}
