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
        //calling after constructor will call the display method of C1 class because during the construction of C1 object, the display method of C1 class is called and at that time the object is not yet fully constructed as a C2 object, so it will call the display method of C1 class which will print "Hello from c1" and then it will print "constructor from c1" and then it will print "constructor from c2" and then it will call the display method of C2 class which will print "Hello from c2 10"
        obj1.display();
    }

}
