package MISC;

class StatBlock{
    static{
        System.out.println("Hello from static block");//will print only once when the class is loaded
    }
    // static{
    //     System.out.println("Hello from static block2");//will print only once when the class is loaded
    // }
}
public class QN4 {
    public static void main(String[] args) {
        //System.out.println("Hello from main");
        StatBlock obj1=new StatBlock();

        StatBlock obj2=new StatBlock();
    }
}
