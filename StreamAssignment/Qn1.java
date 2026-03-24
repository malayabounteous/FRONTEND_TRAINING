package StreamAssignment;
import java.util.*;
import java.util.stream.Collectors;
public class Qn1 {

    public static void main(String[] args) {
        Order o1 = new Order(1, "Alice", Arrays.asList("Item1", "Item2"), 250.5, "Electronics");
        Order o2 = new Order(2, "Alice", Arrays.asList("Item3", "Item4"), 150.0, "Clothing");
        Order o3 = new Order(3, "Charlie", Arrays.asList("Item5"), 300.0, "Groceries");
        Order o4 = new Order(4, "David", Arrays.asList("Item6", "Item7"), 450.75, "Electronics");
        Order o5 = new Order(5, "Eve", Arrays.asList("Item8"), 99.99, "Books");
        Order o6 = new Order(6, "Frank", Arrays.asList("Item9", "Item10"), 600.0, "Furniture");
        Order o7 = new Order(7, "Grace", Arrays.asList("Item11"), 120.25, "Clothing");
        Order o8 = new Order(8, "Hannah", Arrays.asList("Item12", "Item13"), 75.5, "Groceries");
        Order o9 = new Order(9, "Ivy", Arrays.asList("Item14"), 220.0, "Books");
        Order o10 = new Order(10, "Jack", Arrays.asList("Item15", "Item16"), 800.0, "Electronics");
        List<Order>orders=Arrays.asList(o1,o2,o3,o4,o5,o6,o7,o8,o9,o10);


        //Qn1-sum of all amounts

        double totalAmount=orders.stream().map(Order::getAmount).reduce(0.0,Double::sum);
        System.out.println("Total amont is ="+totalAmount);

        //Qn2-Single list of itesm

        List<String> allItems=orders.stream().map(Order::getItems).toList().stream().flatMap(items->items.stream()).distinct().toList();

        System.out.println(allItems);
       

        //Qn3
        Map<String,Double>mpp=orders.stream().collect(Collectors.toMap(Order::getCustomerName, Order::getAmount,Double::sum));
        System.out.println(mpp);

        //qn4

        Optional<Map.Entry<String,Double>>result=orders.stream().collect(Collectors.groupingBy(Order::getCategory,Collectors.summingDouble(Order::getAmount))).entrySet().stream().max(Map.Entry.comparingByValue());
        System.out.println("categoty="+result.get().getKey());
        System.out.println("amount="+result.get().getValue());

        //qn5



    }
    
}
