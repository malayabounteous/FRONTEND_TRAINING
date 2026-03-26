package AssignmentDay4;

class Geometry{

    public double calculateArea(double radius)
    {
        return Math.PI*radius*radius;
    }
    public int calculateArea(int l,int b)
    {
        return l*b;
    }
    public double calculateArea(double base,double height,boolean isTriangle)
    {
        if(isTriangle)
            return 0.5*base*height;
        return 0.0;
    }
}


public class OverLoadGeometry {
    public static void main(String[] args) {
        
        Geometry obj=new Geometry();

        System.out.println(obj.calculateArea(5.6));
        System.out.println(obj.calculateArea(5,8));
        System.out.println(obj.calculateArea(12,34,true));
    }
}
