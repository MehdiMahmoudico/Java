import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready; 
    private ArrayList<Item>items;

    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<>();
    }
    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isReady() {
        return ready;
    }
    public void setReady(boolean ready) {
        this.ready = ready;
    }
    public ArrayList<Item> getItems() {
        return items;
    }
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    public void addItem(Item item) {
        items.add(item);
    }
    public String getStatusMessage(){
        if(ready)
            return "Order is ready";
        else
            return "Thank you for waiting. Your order will be ready soon.";
    }
    public double getOrderTotal(){
        double total = 0.0;
        for(Item item : items){
            total += item.getPrice();
        }
        return total;   
    }
    public static void main(String[] args) {
        Order order1 = new Order("Cindhuri");
        Item item1 = new Item("capuccino", 2.5);
        Item item2 = new Item("drip coffee", 1.5);
        order1.addItem(item1);
        order1.addItem(item2);
        order1.setReady(true);
        System.out.println(order1.getStatusMessage());
        System.out.println(order1.getOrderTotal());
    }
}