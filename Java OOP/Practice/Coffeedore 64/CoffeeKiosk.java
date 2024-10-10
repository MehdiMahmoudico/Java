import java.util.ArrayList;

public class CoffeeKiosk {
    ArrayList<Item> menu ;
    ArrayList<Order> orders;
    public CoffeeKiosk(){
        menu = new ArrayList<Item>();
        orders = new ArrayList<Order>();
    }
    public void addMenuItem(String name, double price){
        Item item = new Item(name, price);
        int index = menu.size();
        item.setIndex(index);
        menu.add(item);
    }
    public void displayMenu(){
        for(Item item : menu){
            System.out.println(item.getIndex() + " " + item.getName() + " $" + item.getPrice());
        }
    }
    public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    
    	// Your code:
        Order order = new Order(name);
        displayMenu();
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        // Create a new order with the given input string
        // Show the user the menu, so they can choose items to add.
        
    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            try{
                int index = Integer.parseInt(itemNumber);
                if(index < 0 || index >= menu.size()){
                    System.out.println("Invalid menu item index. Please try again.");
                } else {
                    Item item = menu.get(index);
                    order.addItem(item);
                    System.out.println("Item added: " + item.getName() + ", Price: $" + item.getPrice());
                }
            // Get the item object from the menu, and add the item to the order
            // Ask them to enter a new item index or q again, and take their input
        }
        catch(NumberFormatException e){
                System.out.println("Invalid menu item index. Please try again.");
            }
        // After you have collected their order, print the order details 
        
    }

}}
