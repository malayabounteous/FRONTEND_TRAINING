package MISC;

class C1{

    public C1()
    {
        display();
        System.out.println("constructor from c1");
    }
    public void display()
    {
        System.out.println("Hello from c1");
    }
}
class C2 extends C1{
    int x=10;
    public C2()
    {
        //display();
        System.out.println("constructor from c2");
    }
    public void display()
    {
        System.out.println("Hello from c2 "+x);
    }
}


public class QN1 {
    
    public static void main(String[] args) {
        C1 obj1=new C2();
        obj1.display();
    }

}
