package MISC;
class C{

    public void add(Integer a,Integer b)
    {
        System.out.println("Integer addition: "+(a+b));
    }
    public  void add(int a,int b)
    {
        System.out.println("int addition: "+(a+b));
    }
     public  void add(int a,Integer b)
    {
        System.out.println("int addition: "+(a+b));
    }
    
}
public class QN5 {
    public static void main(String[] args) {
        C obj=new C();
        //obj.add(10, 20);
        obj.add(Integer.valueOf(10), Integer.valueOf(20));
        obj.add(10, Integer.valueOf(20));
    }
    
}
