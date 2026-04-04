package AssignmentDay5;

class CarBlueprint {
    private String make;
    private String model;
    private int year;
    private double speed;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
@Override
public String toString() {
return "Car Name"+this.make+" model-"+this.model+" year"+this.year+" speed"+this.speed;
}
}

public class Car {

    public static void main(String[] args) {

        CarBlueprint car1 = new CarBlueprint();
        CarBlueprint car2 = new CarBlueprint();

        car1.setMake("Mahindra");
        car1.setModel("1234");
        car1.setSpeed(50.00);
        car1.setYear(2020);
        car2.setMake("maruti");
        car2.setModel("2341");
        car2.setYear(2022);
        car2.setSpeed(100);

        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }
}
