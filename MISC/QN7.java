package MISC;
class A{
   // Integer x=10;

    public void display()
    {
        System.out.println("Hello from A "+x);
    }
}
class B extends A{
    Integer x=20;
    public void display()
    {
        System.out.println("Hello from B "+x);
    }
    public void display2()
    {
        System.out.println("Hello from B "+x);
    }
}

public class QN7 {
    public static void main(String[] args) {
        
        A obj1=new B();
        obj1.display();
        ((B)obj1).display2();
        System.out.println(obj1.x);
    }
}
