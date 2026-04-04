package AssignmentDay5;

class MenuItem{
    private String name;
    private double price;

    public MenuItem(String name,double price)
    {
        this.name=name;
        this.price=price;
    }
     
    public String getName()
    {
        return this.name;
    }
    public double getPrice()
    {
        return this.price;
    }
}

class Order{
    private MenuItem[] items;
    private int itemCount;
     public Order()
     {
        this.itemCount=0;
        this.items=new MenuItem[10] ;
     } 

    public String addMenuItem(MenuItem item)
    {
        if(itemCount==10)
            return "menu is full";
        items[itemCount]= item;
        itemCount++;
        return "Item added";
    }
    public double calcTotal()
    {
        double total=0;

        for(int i=0;i<itemCount;i++)
        {
            total+=items[i].getPrice();
        }
        return total;
    }
}


public class CofeeShopOrderSystem {
    
    public static void main(String[] args) {
        
        MenuItem item1=new MenuItem("icecream",50);
        MenuItem item2=new MenuItem("Dosa",80);
        MenuItem item3=new MenuItem("Choco",30);
        Order o1=new Order();
        o1.addMenuItem(item1);
        o1.addMenuItem(item2);
        o1.addMenuItem(item3);

        System.out.println(o1.calcTotal());
    }
}
