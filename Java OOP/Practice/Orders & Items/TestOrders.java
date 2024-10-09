import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 5.99;
        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 3.99;
        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 2.99;
        Item item4 = new Item();
        item4.name = "cappuccino";
        item4.price = 4.99;
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.name = "Cindhuri";
        order1.total = 0.0;
        order1.ready = false;
        order1.items = new ArrayList<Item>();
        Order order2 = new Order();
        order2.name = "Jimmy";
        order2.total = 0.0;
        order2.ready = false;
        order2.items = new ArrayList<Item>();
        Order order3 = new Order();
        order3.name = "Noah";
        order3.total = 0.0;
        order3.ready = false;
        order3.items = new ArrayList<Item>();
        Order order4 = new Order();
        order4.name = "Sam";
        order4.total = 0.0;
        order4.ready = false;
        order4.items = new ArrayList<Item>();
        // Application Simulations
        order1.items.add(item1);
        order1.total += item1.price;
        order1.ready = true;
        order2.items.add(item2);
        order2.total += item2.price;
        order2.items.add(item3);
        order2.total += item3.price;
        order2.ready = true;
        order3.items.add(item4);
        order3.total += item4.price;
        order3.ready = true;
        order4.items.add(item1);
        order4.total += item1.price;
        order4.items.add(item3);
        order4.total += item3.price;
        order4.ready = true;

        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);
    }
}
