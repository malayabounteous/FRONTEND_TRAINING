package StreamAssignment;
import java.util.List;

 class Order {

    private int orderId;
    private String customerName;
    private List<String> items;
    private double amount;
    private String category;

    public Order() {
    }

    public Order(int orderId, String customerName, List<String> items, double amount, String category) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.items = items;
        this.amount = amount;
        this.category = category;
    }


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}