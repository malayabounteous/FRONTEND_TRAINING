package AssignmentDay5;

class Box {
private double width;
private double height;
private double depth;


public double getWidth() {
    return width;
}

public void setWidth(double width) {
    this.width = width;
}

public double getHeight() {
    return height;
}

public void setHeight(double height) {
    this.height = height;
}

public double getDepth() {
    return depth;
}

public void setDepth(double depth) {
    this.depth = depth;
}


}


public class ReferenceTrap {
    
    public static void main(String[] args) {
        
        Box b1=new Box();
        b1.setDepth(10);
        b1.setHeight(12);
        b1.setWidth(23);
        Box b2=b1;
        b2.setDepth(15);
        System.out.println(b1.getDepth());

    }
}
