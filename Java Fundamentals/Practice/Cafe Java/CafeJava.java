public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripcoffe = 4;
        double latte = 4.5;
        double cappuccino = 5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Noah";
        String customer4 = "Jimmy";
    
        // Order completions (add yours below)
        boolean isReadyOrder = true;
    

        if(isReadyOrder){
            System.out.println(customer1 +readyMessage);
        }else{
            System.out.println(customer1 + pendingMessage);
        }
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        if(isReadyOrder){
            System.out.println(customer3 + readyMessage );
            System.out.println( displayTotalMessage + (cappuccino));
        }else{
            System.out.println(customer3 + pendingMessage);
        }
        if(isReadyOrder){
            System.out.println(customer2 + readyMessage );
            System.out.println( displayTotalMessage + (2 * latte));
        }else{
            System.out.println(customer2 + pendingMessage);
        }
        if(isReadyOrder){
            System.out.println(customer4 + readyMessage );
            System.out.println( displayTotalMessage + (latte - dripcoffe));
        }else{
            System.out.println(customer4 + pendingMessage);
        }
        
    }
}
