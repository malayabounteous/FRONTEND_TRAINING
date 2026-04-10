package Miscell;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

class Car implements Comparable<Car>{
    public String name;
    public int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Car o) {
        return this.price - o.price;
    }
}

public  class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("Car A", 20000);
        Car car2 = new Car("Car B", 15000);
        Car car3 = new Car("Car C", 25000);
         
        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        Collections.sort(cars);

            for (Car car : cars) {
                System.out.println(car.name + ": " + car.price);
            }

           List<Integer> numbers = new ArrayList<>(10);

           System.out.println(numbers.size());
            
    }
}
