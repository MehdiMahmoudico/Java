package cafe;

import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {
        CafeUtil appTest = new CafeUtil();
        
        // Test getStreakGoal
        int result = appTest.getStreakGoal(10);
        System.out.printf("The streak goal for 10 weeks should be %d\n", result);
        
        // Test getOrderTotal
        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %.2f \n\n", appTest.getOrderTotal(lineItems));
        
        // Test displayMenu
        System.out.println("----- Display Menu Test-----");
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        appTest.displayMenu(menu);
    
        // Test addCustomer
        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        appTest.addCustomer(customers);
    }
}