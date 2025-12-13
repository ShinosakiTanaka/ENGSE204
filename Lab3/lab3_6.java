import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            balance = initialBalance;
        } else {
            balance = 0;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

public class lab3_6 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        double INITIAL_BALANCE = SC.nextDouble();
        double DEPOSIT_AMOUNT = SC.nextDouble();
        double WITHDRAW_AMOUNT = SC.nextDouble();

        BankAccount ACCOUNT = new BankAccount(INITIAL_BALANCE);
        ACCOUNT.deposit(DEPOSIT_AMOUNT);
        ACCOUNT.withdraw(WITHDRAW_AMOUNT);

        System.out.println("Final Balance: " + ACCOUNT.getBalance());
    }
}
