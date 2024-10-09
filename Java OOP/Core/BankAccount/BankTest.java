import static java.lang.System.out;

public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
        BankAccount account1 = new BankAccount(1000.00, 500.00);
        BankAccount account2 = new BankAccount(1500.00, 1000.00);
        BankAccount account3 = new BankAccount(2000.00, 1500.00);
        out.println(BankAccount.getAccountNumber());
        // Deposit Test
        account1.deposit(200, "checking");
        System.out.println(account1.getCheckingBalance());
        System.out.println(account1.getBalance());
        System.out.println("Number of Bank Accounts: " + BankAccount.getAccounts());
        account1.withdraw(2000, "checking");
        System.out.println(account1.getCheckingBalance());
                
        // - deposit some money into each bank account's checking or savings account and display the balance each time

        // - each deposit should increase the amount of totalMoney
        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        // Static Test (print the number of bank accounts and the totalMoney)
    }
}

