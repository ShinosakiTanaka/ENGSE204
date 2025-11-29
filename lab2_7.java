package lab2_7;

import java.util.Scanner;

class BankAccount {
    private String ownerName;
    private double balance;

    public BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class lab2_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double initial = sc.nextDouble();
        double amount1 = sc.nextDouble();
        double amount2 = sc.nextDouble();

        BankAccount acc = new BankAccount(name, initial);

        acc.withdraw(amount1); 
        acc.withdraw(amount2);

        acc.displayBalance();

        sc.close();
    }
}
