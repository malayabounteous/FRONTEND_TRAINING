package MISC;
class X{

    public void show()
    {
        System.out.println("Hello from X     show");
    }
    public void display()
    {
        show();
        System.out.println("Hello from X display");
    }
}
class D1 extends X{
     public void show(){
        System.out.println("Hello from D show");
     }
    public void display()
    {
        super.display();
        System.out.println("Hello from D display");
    }
}
public class QN8 {
    
    public static void main(String[] args) {
        // X obj1=new X();
        // obj1.display();

        X obj2=new D1();
        obj2.display();
    }
}
