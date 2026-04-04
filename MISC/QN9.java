package MISC;
class P1{
    public int x=10;
    P1 get()
    {
        return this;
    }
}
class C11 extends P1{
    public int x=20;
    C11 get()
    {
        return this;
    }
}
public class QN9 {
    public static void main(String[] args) {
        
        P1 obj1=new C11();
        System.out.println(obj1.get().x);//print 10 because reference variable is of type P1 and it will access x from class P1, if we want to access x from class C11 then we have to type cast it to C11 like ((C11)obj1).x which will print 20
        System.out.println(((C11)obj1).x);//print 20 because we are type casting it to C11 and it will access x from class C11
    }
}
