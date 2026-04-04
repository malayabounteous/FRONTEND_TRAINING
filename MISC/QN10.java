package MISC;
abstract class Vehicle{

   public  Vehicle()
  {
    System.out.println("Vehicle constructor");
  }

   public void start()
  {
    System.out.println("Vehicle started");
  }
  static void print()
  {
    System.out.println("Hello from static method");
  }
  
}

class Car extends Vehicle{
    public Car()
    {
        System.out.println("Car constructor");
    }
    static void print()
    {
        System.out.println("Hello from Car static method");
    }
}


public class QN10 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        Vehicle.print();
        car.print();//we can call static method using object reference but it is not recommended, it will call the static method of Vehicle class
    }
}
