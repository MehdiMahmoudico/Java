import java.util.Random;

public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances
    private static String accountNumber;
    public static String getAccountNumber() {
        return accountNumber;
    }


    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    // CONSTRUCTOR
    public BankAccount(double initialCheckingBalance, double initialSavingsBalance) {
        this.accountNumber = randMachine();
        checkingBalance = initialCheckingBalance;
        savingsBalance = initialSavingsBalance;
        accounts++;
        totalMoney += (initialCheckingBalance + initialSavingsBalance);
    }
    // Be sure to increment the number of accounts
    

    // GETTERS
    public double getCheckingBalance() {
        return checkingBalance;
    }
    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }
    public double getSavingsBalance() {
        return savingsBalance;
    }
    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
    public static int getAccounts() {
        return accounts;
    }
    public static void setAccounts(int accounts) {
        BankAccount.accounts = accounts;
    }
    public static double getTotalMoney() {
        return totalMoney;
    }
    public static void setTotalMoney(double totalMoney) {
        BankAccount.totalMoney = totalMoney;
    }
    // for checking, savings, accounts, and totalMoney
    
    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
    public void  deposit(double amount, String accountType){
        if(accountType.equals("checking")){
            checkingBalance += amount;
        } else if(accountType.equals("savings")){
            savingsBalance += amount;
        }
        totalMoney += amount;
    }
    public void withdraw(double amount, String accountType){
        if(accountType.equals("checking")){
            if(checkingBalance >= amount){
                checkingBalance -= amount;
            } else{
                System.out.println("Insufficient funds in checking account");
            }
        } else if(accountType.equals("savings")){
            if(savingsBalance >= amount){
                savingsBalance -= amount;
            } else{
                System.out.println("Insufficient funds in savings account");
            }
        }
        totalMoney -= amount;
    }
    public double getBalance() {
        return checkingBalance + savingsBalance;
    }

    
    private String randMachine(){
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 10; i++){
            sb.append(rand.nextInt(10));
        }
        return sb.toString();
    }
    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    // getBalance
    // - display total balance for checking and savings of a particular bank account
}
