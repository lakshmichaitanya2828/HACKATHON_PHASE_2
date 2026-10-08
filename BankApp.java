import java.util.Scanner;
class BankAccount { 
    private String accountNumber; 
    private String accountHolderName; 
    private double balance; 

    public BankAccount(String accountNumber, String accountHolderName, double balance) { 
        this.accountNumber = accountNumber; 
        this.accountHolderName = accountHolderName; 
        this.balance = balance; 
    } 

    public void deposit(double amount) { 
        if (amount > 0) { 
            balance += amount; 
            System.out.println("Deposited: " + amount); 
        } else { 
            System.out.println("Invalid deposit amount."); 
        } 
    } 

    public void withdraw(double amount) { 
        if (amount > 0 && amount <= balance) { 
            balance -= amount; 
            System.out.println("Withdrawn: " + amount); 
        } else if (amount > balance) { 
            System.out.println("Insufficient balance."); 
        } else { 
            System.out.println("Invalid withdrawal amount."); 
        } 
    } 

    public double checkBalance() { 
        return balance; 
    } 

    public void displayAccount() { 
        System.out.println("Account Number: " + accountNumber); 
        System.out.println("Account Holder Name: " + accountHolderName); 
        System.out.println("Balance: " + balance); 
    } 
} 

public class BankApp { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter Account Number: "); 
        String accNum = sc.nextLine(); 
        
        System.out.print("Enter Account Holder Name: "); 
        String accHolder = sc.nextLine(); 
        
        System.out.print("Enter Initial Balance: "); 
        double initialBalance = sc.nextDouble(); 
        
        BankAccount account = new BankAccount(accNum, accHolder, initialBalance); 
        
        System.out.print("Enter Deposit Amount: "); 
        double depositAmt = sc.nextDouble(); 
        account.deposit(depositAmt); 
        
        System.out.print("Enter Withdrawal Amount: "); 
        double withdrawAmt = sc.nextDouble(); 
        account.withdraw(withdrawAmt); 
        
        System.out.println("\n--- Final Account Details ---"); 
        account.displayAccount(); 
        
        sc.close(); 
    } 
}
