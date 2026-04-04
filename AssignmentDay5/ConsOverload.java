package AssignmentDay5;

import java.nio.ReadOnlyBufferException;

class Rectangle{
    private double length;
    private double width;

    public Rectangle(){}
    public Rectangle(double width)
    {
        this.length=width;
        this.width=width;
    }
    public Rectangle(double length,double width)
    {
        this.length=length;
        this.width=width;
    }
}
public class ConsOverload {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle(10);
        Rectangle r3=new Rectangle(10,20);
    }
}
