package cafe;

import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menu) {
        System.out.println("Menu\n");
        for (String item : menu) {
            System.out.println(item);
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.printf("Hello, %s!\n", username);
        System.out.printf("There are %d people in front of you.\n", customers.size());
        customers.add(username);
        System.out.println(customers);
    }

    public double getOrderTotal(double[] prices) {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }
}